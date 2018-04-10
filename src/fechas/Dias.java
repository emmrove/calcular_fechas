/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author emmrove
 */
public class Dias {

    Map<Integer, Integer> meses = new TreeMap<>();

    public Dias() {
        meses.put(1, 31);
        meses.put(2, 28);
        meses.put(3, 31);
        meses.put(4, 30);
        meses.put(5, 31);
        meses.put(6, 30);
        meses.put(7, 31);
        meses.put(8, 31);
        meses.put(9, 30);
        meses.put(10, 31);
        meses.put(11, 30);
        meses.put(12, 31);
    }
    
    public Integer dias_del_mes(Integer d){
        return meses.get(d);
    }

    public void num_dias(Fecha fe1, Fecha fe2) {

        if ((fe2.getAnio().getNumero() - fe1.getAnio().getNumero()) == 0) {
            Integer total = 0;
            if (fe2.getMes().getNumero() - fe1.getMes().getNumero() == 0) {
                total = fe2.getDia().getNumero() - fe1.getDia().getNumero();

            } else {
                Integer dias_por_mes = 0;
                Integer dias_por_finalizar = meses.get(fe1.getMes().getNumero()) - fe1.getDia().getNumero();
                System.out.println("dias por terminar:" + dias_por_finalizar);
                //System.out.println(fe1.getMes().getNumero()+1);
                //System.out.println(fe2.getMes().getNumero());

                for (int i = fe1.getMes().getNumero() + 1; i < fe2.getMes().getNumero(); i++) {
                    dias_por_mes += meses.get(i);
                    System.out.println("Mes num: " + dias_por_mes);
                }

                total = dias_por_finalizar + dias_por_mes + fe2.getDia().getNumero();
            }

            System.out.println("Total dias: " + total);
        } else {
            Integer tot = 0;
            Integer dias_por_mes = 0;
            Integer dias_por_anio = fe2.getAnio().getNumero() - fe1.getAnio().getNumero();
            Integer dias_por_finalizar = meses.get(fe2.getMes().getNumero()) - fe1.getDia().getNumero();
            if (fe2.getMes().getNumero() - fe1.getMes().getNumero() == 0 && fe2.getDia().getNumero() - fe1.getDia().getNumero() == 0) {
                tot = dias_por_anio * 365;
            } else {
                for (int i = fe1.getMes().getNumero(); i < fe2.getMes().getNumero(); i++) {
                    dias_por_mes += meses.get(i);
                    System.out.println("Mes num: " + dias_por_mes);
                }

                tot = dias_por_anio * 365 + dias_por_finalizar + dias_por_mes + fe2.getDia().getNumero();
            }

            System.out.println("Total dias:" + (tot));
        }

    }

}
