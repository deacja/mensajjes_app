/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deimer.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author deime
 */
public class Inicio {


    public static void main(String[] args){
        //System.out.println("Funcionando");
        Conexion conexion = new Conexion();

        try(Connection cnx = conexion.get_connection()){
            
        } catch (Exception e){
            System.out.println(e);
            
        }
    
    }

}
