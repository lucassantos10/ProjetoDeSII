/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.psi.biblioteca.model;

import java.util.Date;

/**
 *
 * @author LUCAS
 */
public class Recebimento {
    
    private int id;
    private Date data;
    private double valorRecebido;
    private double cpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getCpa() {
        return cpa;
    }

    public void setCpa(double cpa) {
        this.cpa = cpa;
    }

    @Override
    public String toString() {
        return "Recebimento{" + "id=" + id + ", data=" + data + ", valorRecebido=" + valorRecebido + ", cpa=" + cpa + '}';
    }
    
    
    
}
