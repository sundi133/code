import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class printwriter implements Runnable {
 
	public static void main(String[] args) {
		(new Thread(new printwriter())).start();
	}
 
	BufferedReader in;
	PrintWriter out;
	StringTokenizer st;
 
	String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String r = in.readLine();
			if (r == null) return null;
			st = new StringTokenizer(r);
		}
		return st.nextToken();
	}
 
	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
 
	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}
 
	
 
	long modd = 1000000007;		
	long[][][] d, s;
	
	long rek(int i, int j, int v) {
		int l = i + j;
		if (s[i][j][v] != -1) return s[i][j][v];
		int l1 = l / 2;
		int l2 = l - l1;
		s[i][j][v] = 0;
		for (int a1 = Math.max(0, i - l2); a1 <= i && a1 <= l1; a1++) {
			int a2 = i - a1;
			int e1 = l1 - a1, e2 = l2 - a2;
			if (v >= i)
				s[i][j][v] = (s[i][j][v] + rek(a1, e1, v - i) * rek(a2, e2, v - i)) % modd;
		}
		return s[i][j][v];
	}
	
	void solve() throws Exception {
		
		for (int t = nextInt(); t > 0; t--) {
			//int a = nextInt();
			//int e = nextInt();
			//int v = nextInt();
			//out.println((rek(a, e, v) - ((v == 0)? 0 : rek(a, e, v - 1)) + modd) % modd);
			int n= nextInt();
			if(n==0){
				out.println("0");
			}
			else{
				int res=(2*(n-1)+1)*(2*(n-1)+1) + n-1;
				out.println(res);
			}
		}
		
	}
 
	public void run() {
		Locale.setDefault(Locale.UK);
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
//			in = new BufferedReader(new FileReader("input.txt"));
//			out = new PrintWriter("output.txt");
			solve();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			out.flush();
		}
	}
 
}