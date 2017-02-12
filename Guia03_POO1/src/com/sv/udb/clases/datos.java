/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author DanielWilfredo
 */
public class datos {
    
    private String mont;
    private String nomb;
    private String tipo;

   public datos(String mont , String tipo, String nomb) {
        this.mont = mont;
        this.tipo = tipo;
        this.nomb = nomb;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    public String getMont() {
        return mont;
    }

    public void setMont(String mont) {
        this.mont = mont;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
    
    
}
