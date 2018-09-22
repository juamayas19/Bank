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
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Type> tipos=new ArrayList<Type>();
        ArrayList<Compte> clientes= new ArrayList<Compte>();
        clientes.add(new Compte(1, 3000000, "3 de Agosto", "José"));
        clientes.add(new Compte(2, 7000000, "6 de Noviembre", "Patricia"));
        tipos.add(new Type("Transaccion"));
        tipos.add(new Type("Meter dinero"));
        Banque banco = new Banque("Banco 1", clientes, tipos);
        clientes.get(0).Ingresardinero(1000, tipos.get(0), clientes.get(1), "02 de Septiembre");
        clientes.get(0).Transaccion(1000, tipos.get(1), clientes.get(1), "21 de Octubre");
        clientes.get(1).Ingresardinero(1000, tipos.get(0), clientes.get(0), "1 de Noviembre");
        clientes.get(1).Transaccion(1000, tipos.get(1), clientes.get(0), "14 de Diciembre");
        banco.getCuentas();
    }
    
}
