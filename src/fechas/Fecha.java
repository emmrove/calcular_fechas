/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.Comparator;

/**
 *
 * @author emmrove
 */
public class Fecha implements Comparator<Fecha> {

    private final NumeroEntero año;
    private final NumeroEntero mes;
    private final NumeroEntero dia;
    NumeroEntero result;

    public Fecha(NumeroEntero año, NumeroEntero mes, NumeroEntero dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;

    }

    public NumeroEntero getAnio() {
        return año;
    }

    public NumeroEntero getMes() {
        return mes;

    }

    public NumeroEntero getDia() {
        return dia;
    }

    @Override
    public String toString() {
        String representacion = "";
        representacion += "" + this.año;
        representacion += "/" + this.mes;
        representacion += "/" + this.dia;
        return representacion;
    }

    @Override
    public int compare(Fecha o1, Fecha o2) {
        // TODO Auto-generated method stub

        return o1.getDia().getNumero() - o2.getDia().getNumero();
    }

}
