package round771;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class C {
    public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int T = fs.nextInt();
		for (int tt=0; tt< T; tt++) {
			int n = fs.nextInt();
			int[] p = new int[n];
			
			for (int i =0; i <n; i++) {
				p[i] = fs.nextInt();
			}
			int ans = 0;
			int mx = 0;
			for (int i = 0; i<n; i++) {
				mx = Math.max(mx, p[i]);
				if(mx == i + 1) {
					ans += 1;
				}
			}
			System.out.println(ans);
 		}
	}
 
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
