package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Random;

public class Template {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int T = fs.nextInt();
		for (int tt = 0; tt < T; tt++) {
			/*
			 * SOLUTION GOES HERE
			 */
		}

	}
   static long ceil(long a, long b) {
		return (a+b-1)/b;
   }
  
   static long powMod(long base, long exp, long mod) {
	   if (base == 0 || base == 1) return base;
	   if (exp == 0) return 1;
	   if (exp == 1) return base % mod;
	   long R = powMod(base, exp/2, mod) % mod;
	   R *= R;
	   R %= mod;
	   if ((exp & 1) == 1) {
		   return base * R % mod;
	   }
	   else return R % mod;
   }
	static long pow(long base, long exp) {
	   if (base == 0 || base == 1) return base;
	   if (exp == 0) return 1;
	   if (exp == 1) return base;
	   long R = pow(base, exp/2);
	   if ((exp & 1) == 1) {
		   return R * R * base;
	   }
	   else return R * R;
	}

	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i : a)
			l.add(i);
		Collections.sort(l);
		for (int i = 0; i < a.length; i++)
			a[i] = l.get(i);
	}

	static final Random random = new Random();

	static void ruffleSort(int[] a) {
		int n = a.length;// shuffle, then sort
		for (int i = 0; i < n; i++) {
			int oi = random.nextInt(n), temp = a[oi];
			a[oi] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
