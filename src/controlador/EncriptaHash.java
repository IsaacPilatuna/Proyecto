package controlador;

import java.util.Hashtable;
import javax.swing.JOptionPane;


public class EncriptaHash {


    
    public  String encriptar(String texto){
        String textoSalida="";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isAlphabetic(c)&&c!=('á')&&c!=('é')&&c!=('í')&&c!=('ó')&&c!=('ú')) {
               textoSalida=textoSalida+String.format("%03d",(int)c%59+1);
               
            }else{
               if(c==' '){
                   textoSalida=textoSalida+"EeE";
               }else{
                   textoSalida=textoSalida+"@"+i%2+c;
               }
            }
            
        }
        return textoSalida;
      
    }
    
    public  String desEncriptar(String texto, Hashtable<String,Integer> tabla){
        String textoSalida="";
        for (int i = 0; i < texto.length(); i++) {
            String subCadena = texto.substring(i, i+3);
            Character c = subCadena.charAt(0);
            switch (c){
                case '@':
                    textoSalida+=subCadena.charAt(2);
                    break;
                case 'E':
                    textoSalida+=" ";
                    break;
                default:
                    char valor= (char) ((int) tabla.get(subCadena));
                    textoSalida+=valor;
           }
            i+=2;
        }
        return textoSalida;
    }
    
    
     public  Hashtable<String,Integer> crearHashTable(Hashtable<String,Integer> tabla){
           
         for (int i = 65; i < 91; i++) {
            tabla.put(String.format("%03d",i%59+1), i);
        }
        for (int i = 97; i < 123; i++) {
            tabla.put(String.format("%03d",i%59+1), i);
        }
        return tabla;
       } 
    
    
    
    
}