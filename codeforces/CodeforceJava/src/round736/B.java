package round736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;


public class B {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int T = fs.nextInt();
		for (int tt = 0; tt <= T; tt++) {
			int n = fs.nextInt();
			char[] enemy = fs.next().toCharArray();
			char[] gregor = fs.next().toCharArray();
			
			int ans = 0;
			for(int i =0; i < n ; i++) {
				//no enemy -> move forward
				if(enemy[i] != '1' && gregor[i]=='1') {
					ans++;
					gregor[i] = '0';
				}
			}
			for(int i=0; i<n; i++) {
				if(enemy[i] == '1') {
					// pawns move up-left
					if (i > 0 && gregor[i - 1] == '1') {
                        gregor[i - 1] = '0';
                        ans++;
                    //pawns move up-right
                    } else if (i < n - 1 && gregor[i + 1] == '1') {
                        gregor[i + 1] = '0';
                        ans++;
                    }
				}
			}
			System.out.println(ans);
		}

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
