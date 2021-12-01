/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inbainten1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.println;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSÉ ANTONIO REINA MONTES
 */
public class Conexion {
        // Atributos
    JTable  jTableBulls;
    JLabel jLabelDatosBulls;        
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="r2m9Bq4Gte";
    private static final String pass="yR0g8f86Wf";
    private static final String url="jdbc:mysql://remotemysql.com:3306/r2m9Bq4Gte?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private Statement statement;
    // Constructor
    public Conexion(){
       con(); 
    }
    public Conexion(JTable jTableBulls){
        this.jTableBulls=jTableBulls;
    }
    //CONEXION 
    public void con(){
        con = null;
        try{
            Class.forName (driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion Establecida");
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.err.println("Error en la base de datos: "+e);
        }
    }
    
 //GET DE LA BASE DE DATOS LOS DATOS DE LOS EQUIPOS Y AÑADIRLOS A UNA LISTA
    public  List <Equipo> getDatosEquipos(){
        List <Equipo> equipo = new ArrayList <Equipo>();
        try {
            
            con = (Connection) DriverManager.getConnection(url, user, pass);
            statement = con.createStatement();
            ResultSet  rst = statement.executeQuery("SELECT * FROM equipos;");
            while(rst.next()){
                equipo.add(new Equipo(rst.getString("Nombre"),rst.getString("Ciudad"),rst.getString("Cancha"),rst.getString("Propietario/s"),rst.getInt("Titulos NBA"),rst.getInt("Titulos Conferencia"),rst.getInt("Titulos Division"),rst.getInt("Presencias Playoff")));
            }return equipo;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }return null;
    }
       //GET PARA OBTENER LOS DATOS DE LOS JUGADORES Y METERLOS EN UNA LISTA
        public List <Jugador> getDatosJugadores(){
           List <Jugador> jugador = new ArrayList <Jugador>();
        try {
            
            con = (Connection) DriverManager.getConnection(url, user, pass);
            statement = con.createStatement();
            ResultSet  rst = statement.executeQuery("SELECT * FROM jugadores;");
            
            while(rst.next()){
            jugador.add(new Jugador(rst.getString("Nombre"),rst.getInt("Numero"),rst.getString("Equipo"),rst.getString("Posicion"),rst.getDouble("Altura"),rst.getInt("Edad"),rst.getDouble("MJ"),rst.getDouble("PTS"),rst.getDouble("RB"),rst.getDouble("AS"),rst.getDouble("TC"),rst.getDouble("T3"),rst.getDouble("TL")));
             
            }return jugador;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
       
}
