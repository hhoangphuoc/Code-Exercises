package round666Div1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
//		int T = fs.nextInt();
//		for (int tt = 0; tt <= T; tt++) {
			int n = fs.nextInt();
			int[] arr = fs.readArray(n);
			
			out.println(1+" "+1);
	        out.println(-arr[0]);
	        arr[0] = 0;
	        if(n>1){
	            out.println(2+" " + n);
	            for(int i=1;i<n;i++)
	                out.print((long)(n-1) * arr[i]+" ");
	            out.println();
	            out.println("1 "+n);
	            for(int i=0;i<n;i++)
	                out.print( - (long) n * arr[i]+" ");
	        }else {
	            out.println(1+" "+1);
	            out.println(0);
	            out.println(1+" "+1);
	            out.println(0);
	        }
	        out.close();
		}
//
//	}

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
