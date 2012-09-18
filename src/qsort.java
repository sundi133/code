
public class qsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void sort(int low, int high)
	   {
     if (low >= high) return;
      int p = partition(low, high);
      	sort(low, p);
      	sort(p + 1, high);
	 }
	
	 
	    private int partition(int low, int high)
	    {
	       // First element
	       int pivot = a[low];
	 
	       // Middle element
	       //int middle = (low + high) / 2;
	       //int pivot = a[middle];
	 
	       int i = low - 1;
	       int j = high + 1;
	       while (i < j)
	       {
	          i++; while (a[i] < pivot) i++;
	          j--; while (a[j] > pivot) j--;
	          if (i < j) swap(i, j);
	       }
	       return j;
	 }
	 
}
