/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author jorge
 */
public class Constantes {

    static final Double E = Math.pow(10, 18);
    static final Double P = Math.pow(10, 15);
    static final Double T = Math.pow(10, 12);
    static final Double G = Math.pow(10, 9);
    static final Double M = Math.pow(10, 6);
    static final Double k = Math.pow(10, 3);
    static final Double h = Math.pow(10, 2);
    static final Double da = Math.pow(10, 1);
    static final Double d = Math.pow(10, -1);
    static final Double c = Math.pow(10, -2);
    static final Double m = Math.pow(10, -3);
    static final Double µ = Math.pow(10, -6);
    static final Double n = Math.pow(10, -9);
    static final Double p = Math.pow(10, -12);
    static final Double f = Math.pow(10, -15);
    static final Double a = Math.pow(10, -18);

    public Double convercionCarga(double medida, String prefijo) {
        double carga = 0.0;
        if (prefijo.equals("E")) {
            carga = medida * Math.pow(10, 18);
        } else if (prefijo.equals("P")) {
            carga = medida * Math.pow(10, 15);
        } else if (prefijo.equals("T")) {
            carga = medida * Math.pow(10, 12);
        } else if (prefijo.equals("G")) {
            carga = medida * Math.pow(10, 9);
        } else if (prefijo.equals("M")) {
            carga = medida * Math.pow(10, 6);
        } else if (prefijo.equals("k")) {
            carga = medida * Math.pow(10, 3);
        } else if (prefijo.equals("h")) {
            carga = medida * Math.pow(10, 2);
        } else if (prefijo.equals("da")) {
            carga = medida * Math.pow(10, 1);
        } else if (prefijo.equals("d")) {
            carga = medida * Math.pow(10, -1);
        } else if (prefijo.equals("c")) {
            carga = medida * Math.pow(10, -2);
        } else if (prefijo.equals("m")) {
            carga = medida * Math.pow(10, -3);
        } else if (prefijo.equals("µ")) {
            carga = medida * Math.pow(10, -6);
        } else if (prefijo.equals("n")) {
            carga = medida * Math.pow(10, -9);
        } else if (prefijo.equals("p")) {
            carga = medida * Math.pow(10, -12);
        } else if (prefijo.equals("f")) {
            carga = medida * Math.pow(10, -15);
        } else if (prefijo.equals("a")) {
            carga = medida * Math.pow(10, -18);
        } else {
            carga = medida;
        }
        return carga;
    }

    public String prefijos2(Double number) {
        double resultado = 0.0;
        String result = null;
        if (number / 1E18 >= 1) {
            resultado = number / 1E18;
            result = format(resultado) + "E";

        } else if (number / 1E15 >= 1 ) {
            resultado = number / 1E15;
            result = format(resultado) + "P";

        } else if (number / 1E12 >= 1 ) {
            resultado = number / 1E12;
            result = format(resultado) + "T";

        } else if (number / 1E9 >= 1 ) {
            resultado = number / 1E9;
            result = format(resultado) + "G";

        } else if (number / 1E6 >= 1 ) {
            resultado = number / 1E6;
            result = format(resultado) + "M";

        } else if (number / 1E3 >= 1 ) {
            resultado = number / 1E3;
            result = format(resultado) + "k";

        } else if (number / 1E2 >= 1 ) {
            resultado = number / 1E2;
            result = format(resultado) + "h";

        } else if (number / 1E1 >= 1 ) {
            resultado = number / 1E1;
            result = format(resultado) + "da";
        }else if (number / 1E-1 < 1 ) {
            resultado = number / 1E-1;
            result = format(resultado) + "d";
        }else if (number / 1E-2 < 1) {
            resultado = number / 1E-2;
            result = format(resultado) + "c";
        }else if (number / 1E-3 < 1) {
            resultado = number / 1E-3;
            result = format(resultado) + "m";
        }else if (number / 1E-6 < 1) {
            resultado = number / 1E-6;
            result = format(resultado) + "µ";
        }else if (number / 1E-9 < 1) {
            resultado = number / 1E-9;
            result = format(resultado) + "n";
        }else if (number / 1E-12 < 1) {
            resultado = number / 1E-12;
            result = format(resultado) + "p";
        }else if (number / 1E-15 < 1) {
            resultado = number / 1E-6;
            result = format(resultado) + "f";
        }else if (number / 1E-18 < 1) {
            resultado = number / 1E-18;
            result = format(resultado) + "a";
        }
        return result;

    }

    public Double convercionLongitud(double medida, String prefijo) {
        double metro = 0.0;
        if (prefijo.equals("mm")) {
            metro = medida * Math.pow(10, -3);
        } else if (prefijo.equals("cm")) {
            metro = medida * Math.pow(10, -2);
        } else {
            metro = medida;
        }
        return metro;
    }

    public String format(Double number) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", decimalFormatSymbols);

        String regreso = decimalFormat.format(number).toString();

        return regreso;
    }
}
