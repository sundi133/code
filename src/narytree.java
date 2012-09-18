
public class narytree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *Call ReverseTTree(root,null).
ReverseTTree(Node node,Node parent){
List list= new List();
int n=node.child.length;
int i=0;
if(n==0){
node.next=parent
node.prev=null;
list.add(node)
return list;
}
while( i<=n){
List li2 = ReverseTTree(node.child[i],node)
for(int j=0;j<li2.size();j++){
Node node1=(Node) li2.get(i);
node1.next=node;
node1.prev=null;
list.add(node1);
}
i++;
}
return list;
} 
		 * */
		 
		
		/*int n = 0;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n&(n-1);
		}
		System.out.println(count);*/

		 int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		 int max= minjumps(arr);
		 System.out.println(max);
	}

	private static int minjumps(int[] arr) {
		int[] dp= new int[arr.length];
		dp[0]=0;
		int MAX=arr.length+1;
		for(int k=0;k<arr.length;k++){
			dp[k]=0;
		}
		
		for(int k=1;k<arr.length;k++){
			int min=MAX;
			for(int k1=0;k1<k;k1++){
				//System.out.println(k+" "+k1+" " +arr[k1] + " "+ dp[k1]);
				if(k-k1<=arr[k1]){
					if(min>dp[k1] + 1){
						min=dp[k1] + 1;
					//	System.out.println(min);
					}
				}
				
			}
			dp[k]=min;
			}
		for(int k=0;k<arr.length;k++){
			//System.out.print(" " +dp[k]);
		}
		return dp[arr.length-1];
		
	}
		

}


