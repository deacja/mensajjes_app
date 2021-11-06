/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deimer.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author deime
 */
public class Inicio {


    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do {
            //Mostramos Menú
            System.out.println("---------------");
            System.out.println("Aplicacion de Mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir ");
            System.out.println("---------------");
            //Leemos la opcion del usuario 
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    
                    break;
            }
        } while(opcion != 5);
        
        
        
    
    }

}
