/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inbainten1;

/**
 *
 * @author JOSÉ ANTONIO REINA MONTES
 */
//CREACION DE OBJETO JUGADOR PARA GUARDAR LOS DATOS DE LOS EJUGADORES
public class Jugador {
   private String Nombre;
   private int Numero;
   private String Equipo;
   private String Posicion;
   private double Altura;
   private int Edad;
   private double MJ;
   private double PTS;
   private double RB;
   private double AS;
   private double TC;
   private double T3;
   private double TL;
   private int id;

    public Jugador(String Nombre, int Numero, String Equipo, String Posicion, double Altura, int Edad, double MJ, double PTS, double RB, double AS, double TC, double T3, double TL, int id) {
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Equipo = Equipo;
        this.Posicion = Posicion;
        this.Altura = Altura;
        this.Edad = Edad;
        this.MJ = MJ;
        this.PTS = PTS;
        this.RB = RB;
        this.AS = AS;
        this.TC = TC;
        this.T3 = T3;
        this.TL = TL;
        this.id = id;
    }
     Jugador(String Nombre, int Numero, String Equipo, String Posicion, double Altura, int Edad, double MJ, double PTS, double RB, double AS, double TC, double T3, double TL) {
     this.Nombre=Nombre;
     this.Numero=Numero;
     this.Equipo=Equipo;
     this.Posicion=Posicion;
     this.Altura=Altura;
     this.Edad=Edad;
     this.MJ=MJ;
     this.PTS=PTS;
     this.RB=RB;
     this.AS=AS;
     this.TC=TC;
     this.T3=T3;
     this.TL=TL;
    }
    
    
    public Jugador(){
        
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getMJ() {
        return MJ;
    }

    public void setMJ(double MJ) {
        this.MJ = MJ;
    }

    public double getPTS() {
        return PTS;
    }

    public void setPTS(double PTS) {
        this.PTS = PTS;
    }

    public double getRB() {
        return RB;
    }

    public void setRB(double RB) {
        this.RB = RB;
    }

    public double getAS() {
        return AS;
    }

    public void setAS(double AS) {
        this.AS = AS;
    }

    public double getTC() {
        return TC;
    }

    public void setTC(double TC) {
        this.TC = TC;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double T3) {
        this.T3 = T3;
    }

    public double getTL() {
        return TL;
    }

    public void setTL(double TL) {
        this.TL = TL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
}
