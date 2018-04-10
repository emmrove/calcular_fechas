/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emmrove
 */
public class Test {

    public static void main(String[] args) {
        NumeroEntero n1 = new NumeroEntero(2016);
        NumeroEntero n2 = new NumeroEntero(4);
        NumeroEntero n3 = new NumeroEntero(5);

        NumeroEntero n4 = new NumeroEntero(2016);
        NumeroEntero n5 = new NumeroEntero(5);
        NumeroEntero n6 = new NumeroEntero(20);

        NumeroEntero n7 = new NumeroEntero(2015);
        NumeroEntero n8 = new NumeroEntero(10);
        NumeroEntero n9 = new NumeroEntero(25);

        Fecha f1 = new Fecha(n1, n2, n3);
        Fecha f2 = new Fecha(n4, n5, n6);
        Fecha f3 = new Fecha(n7, n8, n9);

        List<Fecha> lista = new ArrayList<>();
        lista.add(f3);
        lista.add(f1);
        //lista.add(f2);

         System.out.println("fecha 1: "+f1 + "y fecha 2: " + f2);
         
        int j = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAnio().getNumero().equals(f2.getAnio().getNumero())) {
                //System.out.println(lista.get(i).getAnio());
                System.out.println("comparando años...");
                j++;
            }

        }

        //System.out.println(j);
        Dias d = new Dias();
        d.num_dias(f1, f2);
         
        System.out.println("fecha 3: "+f3);
        AgregarDiasaFecha otrosdias = new AgregarDiasaFecha(f3, 30);
        System.out.println("nueva fecha 3: " + otrosdias.agregaDias());
        
        Fecha f_agregar = new Fecha(new NumeroEntero(2017), new NumeroEntero(1), new NumeroEntero(1));
        System.out.println("se crea nueva fecha: " +f_agregar);
    }

}
