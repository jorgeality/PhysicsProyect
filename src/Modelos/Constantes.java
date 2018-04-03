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

     public String convercionCarga1(double medida, String prefijo) {
        String carga = "";
        System.out.println("p: "+prefijo+"h");
        if (prefijo.equals("E")) {
            System.out.println("E");
            carga = medida+"E18";
        } else if (prefijo.equals("P")) {
            System.out.println("P");
            carga = medida+"E15";
        } else if (prefijo.equals("T")) {
            System.out.println("T");
            carga = medida+"E12";
        } else if (prefijo.equals("G")) {
            System.out.println("G");
           carga = medida+"E9";
        } else if (prefijo.equals("M")) {
            System.out.println("M");
            carga = medida+"E6";
        } else if (prefijo.equals("k")) {
            System.out.println("k");
            carga = medida+"E3";
        } else if (prefijo.equals("h")) {
            System.out.println("h");
            carga = medida+"E2";
        } else if (prefijo.equals("da")) {
            System.out.println("da");
            carga = medida+"E1";
        } else if (prefijo.equals("d")) {
            System.out.println("d");
            carga = medida+"E-1";
        } else if (prefijo.equals("c")) {
            System.out.println("c");
            carga = medida+"E-2";
        } else if (prefijo.equals("m")) {
            System.out.println("m");
            carga = medida+"E-3";
        } else if (prefijo.equals("µ")) {
            System.out.println("miu");
            carga = medida+"E-6";
        } else if (prefijo.equals("n")) {
            System.out.println("n");
            carga = medida+"E-9";
        } else if (prefijo.equals("p")) {
            System.out.println("p");
            carga = medida+"E-12";
        } else if (prefijo.equals("f")) {
            System.out.println("f");
            carga = medida+"E-15";
        } else if (prefijo.equals("a")) {
            System.out.println("a");
            carga = medida+"E-18";
        } else {
            
            carga = medida+"";
        }
        return carga;
    }

    public String prefijos2(Double number) {
        double resultado = 0.0;
        String result = "";
        if (number / 1E18 >= 1 ) {
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
        }else if (number / 1E-1 >= 1 ) {
            resultado = number / 1E-1;
            result = format(resultado) + "d";
        }else if (number / 1E-2 >= 1) {
            resultado = number / 1E-2;
            result = format(resultado) + "c";
        }else if (number / 1E-3 >= 1) {
            resultado = number / 1E-3;
            result = format(resultado) + "m";
        }else if (number / 1E-6 >= 1) {
            resultado = number / 1E-6;
            result = format(resultado) + "µ";
        }else if (number / 1E-9 >= 1) {
            resultado = number / 1E-9;
            result = format(resultado) + "n";
        }else if (number / 1E-12 >= 1) {
            resultado = number / 1E-12;
            result = format(resultado) + "p";
        }else if (number / 1E-15 >= 1) {
            resultado = number / 1E-15;
            result = format(resultado) + "f";
        }else if (number / 1E-18 >= 1) {
            resultado = number / 1E-18;
            result = format(resultado) + "a";
        }else{
            result = formatExp(number);         
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
        String regreso ="";
        //if(number >=0.01){
            regreso = decimalFormat.format(number).toString();
        /*}else{
        decimalFormat = new DecimalFormat("#,##0.00", decimalFormatSymbols);
        regreso= decimalFormat.format(number).toString();
        }*/
        return regreso;
    }
    public String formatExp(Double number) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        DecimalFormat decimalFormat = new DecimalFormat("0E0", decimalFormatSymbols);
        String regreso ="";
            regreso = decimalFormat.format(number).toString();
        return regreso;
    }
}
