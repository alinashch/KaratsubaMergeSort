package com.company;

import java.math.BigInteger;

public class Karatsuba {
    public static BigInteger Karatsuba(BigInteger x, BigInteger y,int n){
        if(n<=2){
            return x.multiply(y);
        }
        if(n%2==1){
            n++;
        }
            BigInteger pow = BigInteger.valueOf((long) Math.pow(10, n / 2));
            BigInteger b = x.mod(pow);
            BigInteger a = x.divide(pow);
            BigInteger c = y.divide(pow);
            BigInteger d = y.mod(pow);

            BigInteger ac = Karatsuba(a, c, n / 2);
            BigInteger bd = Karatsuba(b, d, n / 2);
            BigInteger p = a.add(b);
            BigInteger q = c.add(d);
            BigInteger pq = Karatsuba(p, q, n / 2);
            BigInteger abcd = pq.subtract(ac).subtract(bd);

            BigInteger first = BigInteger.valueOf((long) Math.pow(10, n));
            first = first.multiply(ac);
            BigInteger second = BigInteger.valueOf((long) Math.pow(10, n / 2));
            second = second.multiply(abcd);
            return first.add(second).add(bd);

    }
}
