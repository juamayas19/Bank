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
public class Banque {
    private String code;
    private ArrayList<Compte> cuentas= new ArrayList<Compte>();
    private ArrayList<Type> tipos=new ArrayList<Type>();
    public Banque(String code, ArrayList<Compte> cuentas, ArrayList<Type> tipos) {
        this.code = code;
        this.cuentas=cuentas;
        this.tipos=tipos;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Compte> getCuentas() {
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println("Cuenta número: " + cuentas.get(i).getNumero());
            System.out.println("Propietario: " + cuentas.get(i).getPropietario());
            System.out.println("Creada el: " + cuentas.get(i).getFechacreacion());
            System.out.println("Saldo disponible: " + cuentas.get(i).getSaldo());
            System.out.println(cuentas.get(i).getMovimientos());
        }
        return null;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCuentas(ArrayList<Compte> cuentas) {
        this.cuentas = cuentas;
    }
    
    }
