package controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Hashtable;


public class ServerBroadcast {


    private static final int PUERTO = 9001;

    
    private static HashSet<String> nombres = new HashSet<String>();
    public static Hashtable tabla = new Hashtable<String, String>();
    public static EncriptaHash encripta = new EncriptaHash();
    private static HashSet<PrintWriter> salidasYentradas = new HashSet<PrintWriter>();
    
   
    public static void main(String[] args) throws Exception {
        ServerSocket listener = new ServerSocket(PUERTO);
        tabla = encripta.crearHashTable(tabla);
        try {
            while (true) {
                new Handler(listener.accept()).start();
            }
        } finally {
            listener.close();
        }
    }
    
    
    private static class Handler extends Thread {
        private String nombre;
        private Socket socket;
        private BufferedReader entrada;
        private PrintWriter salida;

        
        public Handler(Socket socket) {
            this.socket = socket;
        }
        
        public void run() {
            try {

                
                entrada = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
                salida = new PrintWriter(socket.getOutputStream(), true);

                
                while (true) {
                    salida.println("INGRESARNOMBRE");
                    nombre = entrada.readLine();
                    if (nombre == null) {
                        return;
                    }
                    synchronized (nombres) {
                        if (!nombres.contains(nombre)) {
                            nombres.add(nombre);
                            break;
                        }
                    }
                }

                for (PrintWriter writer : salidasYentradas) {
                                            writer.println("NOMBREACEPTADO "+nombre+" Ha ingresado al chat");
                }
                //salida.println("NOMBREACEPTADO "+nombre+" Ha ingresado al chat");
                
                salidasYentradas.add(salida);
                new Thread() {
                    public void run() {
                        while (true) {
                            try {
                                String usuariosOnline = "ONLINES ";
                                        for (String nom : nombres) {
                                         usuariosOnline+=nom+" ";
                                            
                                        }
                                        for (PrintWriter writer : salidasYentradas) {
                                            writer.println(usuariosOnline);
                                           }
                                        sleep(5000);
                                }catch(Exception e){
                                    
                                }
                              
                            }
                        }
                    
                        
                    }.start();
                
                while (true) {
                    
                    String input = encripta.desEncriptar(entrada.readLine(), tabla);
                    
                    if (input == null) {
                        return;
                    }
                    for (PrintWriter writer : salidasYentradas) {
                        writer.println("MESSAGE " + nombre + " " + input);
                    }
                }
            } catch (IOException e) {
                for (PrintWriter writer : salidasYentradas) {
                        writer.println("OUT " + nombre + " Ha abandonado el chat" );
                    }
            } finally {
                
                if (nombre != null) {
                    nombres.remove(nombre);
                }
                if (salida != null) {
                    salidasYentradas.remove(salida);
                }
                try {
                    socket.close();
                } catch (IOException e) {
                }
            }
        }
    }
}