package org.iesvdm.Ejer1234;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class PagoAmortizable {
    public static void main(String[] args) {
        BigDecimal monto = new BigDecimal ( 200000 );
        BigDecimal tasa = new BigDecimal ( "0.0041666666667" );
        BigDecimal mensual = monto.multiply ( tasa ).setScale ( 2, RoundingMode.HALF_EVEN );
        BigDecimal porcentaje = new BigDecimal ( "5.00" );
        BigDecimal unoMasRPow = BigDecimal.ONE.divide ( BigDecimal.ONE.add ( tasa ), MathContext.DECIMAL128 ).pow ( 360 );
        BigDecimal pago = mensual.divide ( BigDecimal.ONE.subtract ( unoMasRPow ),  MathContext.DECIMAL128);
        BigDecimal pagoRound = pago.setScale ( 2, RoundingMode.HALF_EVEN );
        BigDecimal interes = monto.multiply ( tasa ).setScale ( 2, RoundingMode.HALF_EVEN );
        BigDecimal principal = pagoRound.subtract ( interes );
        monto = monto.subtract ( principal );
        int cont = 1;
        System.out.println ("Préstamo: " + monto + " €");
        System.out.println ("Tasa de interés anual: " + porcentaje + "%");
        System.out.println ("Pago mensual: " + pagoRound + "€");
        System.out.println ("\nEsquema de amortización\n-----------------------");
        System.out.println ("Mes Pago\tPrincipal\tInterés\tBalance");
        System.out.println (cont + "\t" + pagoRound + "\t" + principal + "\t" + interes + "\t" + monto );
        while(monto.compareTo ( BigDecimal.ZERO )>=0)
        {
                interes = monto.multiply ( tasa ).setScale ( 2, RoundingMode.HALF_EVEN );
                principal = pagoRound.subtract ( interes );
                monto = monto.subtract ( principal );
            cont++;
            System.out.println (cont + "\t" + pagoRound + "\t" + principal + "\t" + interes + "\t" + monto );
        }






    }
}
