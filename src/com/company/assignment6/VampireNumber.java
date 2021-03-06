package com.company.assignment6;

public class VampireNumber {

    public static void main(String[] args) {
        long countVamps = 0, start = 10, tens = 10;
    outer:
        for(int numDigits = 2; numDigits <= 18; numDigits += 2) {
            long end = start * 10;
            for (long i = start; i < end; i++) {
                if(countFangs(i, tens) > 0) {
                    if(++countVamps >= 100)
                        break outer;
                }
            }
            start *= 100;
            tens *= 10;
        }
        System.out.println();

        long[] bigs = {16758243290880L, 24959017348659L, 14593825548650L};

        for (long b : bigs)
            countFangs(b, 10000000L);
    }

    private static int countFangs(long n, long tens) {
        int countFangs = 0;

        long lo = Math.max(tens / 10, (n + tens - 2) / (tens - 1));
        long hi = Math.min(n / lo, (long) Math.sqrt(n));

        long nTally = tallyDigits(n);

        for(long a = lo; a <= hi; a++) {
            long b = n / a;

            if (a * b != n)
                continue;

            if (n % 9 != (a + b) % 9)
                continue;

            if (nTally == tallyDigits(a) + tallyDigits(b)) {
                if (countFangs == 0)
                    System.out.printf("%d : ",n);
                System.out.printf("[%d, %d]", a, b);
                System.out.println();
                countFangs++;
            }
        }
        return countFangs;
    }

    private static long tallyDigits(long n) {
        long total = 0;
        while (n > 0) {
            total += 1L << ((n % 10) * 6);
            n /= 10;
        }
        return total;
    }
}
