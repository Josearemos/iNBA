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

//CREACION DE OBJETO EQUIPO PARA GUARDAR LOS DATOS DE LOS EQUIPOS
public class Equipo {
   private String Nombre;
   private String Ciudad;
   private String Cancha;
   private String Propietarios;
   private int titulosnba;
   private int titulosconferencia;
   private int titulosdivision;
   private int presenciasplayoff;
   private int id;
   
   
   public Equipo(String Nombre, String Ciudad, String Cancha, String Propietarios, int titulosnba, int titulosconferencia, int titulosdivision, int presenciasplayoff, int id){
     this.Nombre=Nombre;
     this.Ciudad=Ciudad;
     this.Cancha=Cancha;
     this.Propietarios=Propietarios;
     this.titulosnba=titulosnba;
     this.titulosconferencia=titulosconferencia;
     this.titulosdivision=titulosdivision;
     this.presenciasplayoff=presenciasplayoff;
     this.id=id;
     
   }
   
   public Equipo(){
       
   }

    Equipo(String Nombre, String Ciudad, String Cancha, String Propietarios,int titulosnba, int titulosconferencia, int titulosdivision, int presenciasplayoff) {
     this.Nombre=Nombre;
     this.Ciudad=Ciudad;
     this.Cancha=Cancha;
     this.Propietarios=Propietarios;
     this.titulosnba=titulosnba;
     this.titulosconferencia=titulosconferencia;
     this.titulosdivision=titulosdivision;
     this.presenciasplayoff=presenciasplayoff;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCancha() {
        return Cancha;
    }

    public void setCancha(String Cancha) {
        this.Cancha = Cancha;
    }

    public String getPropietarios() {
        return Propietarios;
    }

    public void setPropietarios(String Propietarios) {
        this.Propietarios = Propietarios;
    }

    public int getTitulosnba() {
        return titulosnba;
    }

    public void setTitulosnba(int titulosnba) {
        this.titulosnba = titulosnba;
    }

    public int getTitulosconferencia() {
        return titulosconferencia;
    }

    public void setTitulosconferencia(int titulosconferencia) {
        this.titulosconferencia = titulosconferencia;
    }

    public int getTitulosdivision() {
        return titulosdivision;
    }

    public void setTitulosdivision(int titulosdivision) {
        this.titulosdivision = titulosdivision;
    }

    public int getPresenciasplayoff() {
        return presenciasplayoff;
    }

    public void setPresenciasplayoff(int presenciasplayoff) {
        this.presenciasplayoff = presenciasplayoff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
}
