/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deimer.mensajes_app;

/**
 *
 * @author deime
 */
public class Conexion {

    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if (conection != null){
            System.out.println("Conexion Exitosa")
            }
        } catch (SQLException e) {
            System.out.println(e)        
        }
        return conection;

    }

}
