/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deimer.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author deime
 */
public class MensajesService {
    
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        //leemos el mensaje
        System.out.println("Escribe tu Mensaje");
        String mensaje = sc.nextLine();
        //leemos el autor del mensaje
        System.out.println("Tu nombre");
        String nombre = sc.nextLine();
        //creamos un objeto de tipo mensajes y le asignamos nombre y autor
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        //enviamos el objeto al DAO
        MensajesDAO.crearMensajeDB(registro);        
    }
    
    public static void listarMensajes(){
        
    }
    
    public static void borrarMensaje(){
        
    }
    
    public static void editarMensaje(){
        
    }
    
}
