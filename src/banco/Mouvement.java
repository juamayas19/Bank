/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Juan Camilo
 */
public class Mouvement {
    private String date;
    private double saldo;
    private double cantidad;
    private Type type;

    public Mouvement(String date, double saldorecibido, double saldoenviado, Type tipo) {
        this.date = date;
        this.saldo = saldorecibido;
        this.cantidad = saldoenviado;
        this.type=tipo;
    }

    public String getDate() {
        return date;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public Type getType() {
        return type;
    }
    
    
}
