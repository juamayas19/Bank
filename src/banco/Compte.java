/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import java.util.ArrayList;
/**
 *
 * @author Juan Camilo
 */
public class Compte {
    private int numero;
    private double saldo;
    private String fechacreacion;
    private String propietario;
    private ArrayList<Mouvement> movimiento= new ArrayList<Mouvement>();

    public Compte(int numero, double saldo, String fechacreacion, String propietario) {
        this.numero = numero;
        this.saldo = saldo;
        this.fechacreacion = fechacreacion;
        this.propietario = propietario;
    }
    public Mouvement getMovimientos(){
        System.out.println("MOVIMIENTOS DE LA CUENTA:");
        for (int i = 0; i < movimiento.size(); i++) {
        System.out.println("El movimiento fue realizado el " + movimiento.get(i).getDate());
        System.out.println("Fue un movimiento de tipo: " + movimiento.get(i).getType().getCode());
        System.out.println("Tenía un saldo de " + movimiento.get(i).getSaldo());
        System.out.println("Movió un saldo de " + movimiento.get(i).getCantidad());        
        }
        return null;
    }
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void Transaccion(double monto, Type tipo,Compte cuenta2, String date) {
        double saldo= this.saldo;
        double saldo2= cuenta2.saldo;
        this.saldo = this.saldo-monto;
        cuenta2.saldo = cuenta2.saldo + monto;
        this.movimiento.add(new Mouvement(date, saldo, -1*(monto), tipo));
        cuenta2.movimiento.add(new Mouvement(date, saldo2, monto, tipo));
     }
    public void Ingresardinero(double monto, Type tipo,Compte cuenta2, String date) {
        double saldo=this.saldo;
        this.saldo = this.saldo+monto;
        this.movimiento.add(new Mouvement(date,saldo, monto, tipo));
     }
    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
