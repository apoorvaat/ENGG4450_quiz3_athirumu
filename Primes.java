package org.example;

import java.util.HashMap;
import java.util.Map;

public class Primes {

    // Returns the prime factorization of a positive integer as a map of prime factors and their counts.
    public static final Map<Long, Long> getPrimeFactorization(long number) {
        Map<Long, Long> map = new HashMap<>();
        long n = number;

        for (long i = 2; i * i <= number; i++) {
            long count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                map.put(i, count);
            }
        }
        if (n > 1) {
            map.put(n, 1L); // The remaining number is a prime factor
        }
        return map;
    }

    // Checks if a number is prime using a simple algorithm.
    public static final boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Generates primes up to a given limit using the Sieve of Eratosthenes.
    public static final boolean[] sieveOfEratosthenes(int limit) {
        if (limit < 2) {
            return new boolean[0]; // No primes less than 2
        }

        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}
