package org.iesvdm.Ejer1234;

import java.math.BigDecimal;

public class InteresCompuesto {
    public static void main(String[] args){
        BigDecimal monto = new BigDecimal ( "1000" );
        BigDecimal tasa = new BigDecimal ( "0.05" );
        BigDecimal anos = new BigDecimal ( "5" );
        tasa = tasa.add ( BigDecimal.ONE);
        tasa = tasa.pow ( 5 );
        monto = (monto.multiply ( tasa ));
        System.out.println (monto);
    }
}
