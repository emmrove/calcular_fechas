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
public class AgregarDiasaFecha {

    private int anio;
    private int mes;
    private int dia;
    private Integer masdias = 0;
    private Dias d = new Dias();
    private Fecha salida;

    public AgregarDiasaFecha(Fecha f, Integer d) {
        this.anio = f.getAnio().getNumero();
        this.mes = f.getMes().getNumero();
        this.dia = f.getDia().getNumero();
        this.masdias = d;
    }

    /*
    if (dia <= d.dias_del_mes(mes)) {
                dia++;
            } else {
                if (mes <= 12) {
                    dia = 1;
                    mes++;
                } else {
                    anio++;
                    mes = 1;
                    dia =1;
                }
            }
     */
    public Fecha agregaDias() {
        while (masdias >= 365) {
            anio++;
            masdias -= 365;
        }
        while (masdias > 0) {
            if (dia < d.dias_del_mes(mes)) {
                dia++;
            } else {
                mes++;
                dia = 1;
            }
            masdias--;
        }
        salida = new Fecha(new NumeroEntero(anio), new NumeroEntero(mes), new NumeroEntero(dia));
        return salida;
    }
}
