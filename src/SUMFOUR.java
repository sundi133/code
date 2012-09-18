import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;


public class SUMFOUR {

	private static int globalCnt=0;
	private static HashMap  hMap1 = new HashMap();
	private static HashMap  hMap2 = new HashMap();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int lines= in.nextInt();
		int[] a= new int[lines];
		int[] b= new int[lines];
		int[] c= new int[lines];
		int[] d= new int[lines];
		
		int cnt=-1;
		while(cnt++!=lines-1){
			a[cnt]=in.nextInt();
			b[cnt]=in.nextInt();
			c[cnt]=in.nextInt();
			d[cnt]=in.nextInt();
			
		}
		int i=0;
		int[] matrix1 = new int[lines*lines];
		int[] matrix2 = new int[lines*lines];
		for(int k=0;k<lines;k++){
			for(int j=0;j<lines;j++){
				matrix1[i]=a[k] + b[j];
				if(hMap1.get(matrix1[i])!=null){
					hMap1.put(matrix1[i], hMap1.get(matrix1[i]) + "-" +k +","+ j);
				}else{
					hMap1.put(matrix1[i], k +","+ j);	
				}
				
				i++;
			}

		}
		i=0;
		
		for(int k=0;k<lines;k++){
			for(int j=0;j<lines;j++){
				matrix2[i]=c[k] + d[j];
				//hMap2.put(matrix2[i], k +","+ j);
				if(hMap2.get(matrix2[i])!=null){
					hMap2.put(matrix2[i], hMap2.get(matrix2[i]) + "-" +k +","+ j);
				}else{
					hMap2.put(matrix2[i], k +","+ j);	
				}
				i++;
			}

		}
		
		Arrays.sort(matrix1);
		Arrays.sort(matrix2);
		

		findsum(matrix1,matrix2);
		
		System.out.println(globalCnt);
	}

	private static void findsum(int[] matrix1, int[] matrix2) {
		
		for(int k=0;k<matrix1.length;k++){
			int val = matrix1[k];
			//String index = hMap1.get(key)
			int lo=0;
			int hi=matrix2.length-1;
			while(lo<=hi){
				
				int mid= (lo+hi)/2;
				
				//System.out.println(lo + "; " +hi + ", " +matrix2[mid] + val );
				if(matrix2[mid] + val > 0){
					hi=mid-1;
				}else if((matrix2[mid] + val < 0)){
					lo=mid+1;
				}else if((matrix2[mid] + val == 0)){
					
					globalCnt++;
					break;
				}
			}
		}
		
	}

}
