package org.iesvdm.Ejer1234;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args){
        BigInteger n = new BigInteger ( "6" );
        BigInteger a = BigInteger.ONE;
        while(n.compareTo ( BigInteger.ZERO )>0){
            a=a.multiply ( n );
            n=n.subtract ( BigInteger.ONE );
        }
        System.out.println (a);
    }
}
