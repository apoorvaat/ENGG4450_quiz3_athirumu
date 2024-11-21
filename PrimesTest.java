package org.example;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesTest {

    @Test
    void testGetPrimeFactorization() {
        assertEquals(Map.of(2L, 2L, 3L, 1L), Primes.getPrimeFactorization(12));
        assertEquals(Map.of(5L, 1L, 7L, 1L), Primes.getPrimeFactorization(35));
        assertEquals(Map.of(2L, 1L), Primes.getPrimeFactorization(2));
        assertEquals(Map.of(13L, 1L), Primes.getPrimeFactorization(13));
    }

    @Test
    void testIsPrime() {
        assertTrue(Primes.isPrime(2));
        assertTrue(Primes.isPrime(3));
        assertTrue(Primes.isPrime(17));
        assertFalse(Primes.isPrime(4));
        assertFalse(Primes.isPrime(100));
        assertFalse(Primes.isPrime(1));
        assertFalse(Primes.isPrime(0));
        assertFalse(Primes.isPrime(-7));
    }

    @Test
    void testSieveOfEratosthenes() {
        boolean[] primesUpTo10 = Primes.sieveOfEratosthenes(10);
        assertArrayEquals(new boolean[]{false, false, true, true, false, true, false, true, false, false, false}, primesUpTo10);

        boolean[] primesUpTo1 = Primes.sieveOfEratosthenes(1);
        assertArrayEquals(new boolean[]{}, primesUpTo1);

        boolean[] primesUpTo2 = Primes.sieveOfEratosthenes(2);
        assertArrayEquals(new boolean[]{false, false, true}, primesUpTo2);
    }
}
