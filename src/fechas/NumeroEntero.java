/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

/**
 *
 * @author emmrove
 */
public class NumeroEntero {

    private final Integer Numero;

    public NumeroEntero(Integer Numero) {
        this.Numero = Numero;
    }

    public Integer getNumero() {
        return this.Numero;
    }

    @Override
    public String toString() {
        StringBuilder representacion = new StringBuilder();

        representacion.append(this.Numero);

        return representacion.toString();

    }
}
