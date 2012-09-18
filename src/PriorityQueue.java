import java.util.NoSuchElementException;



public class PriorityQueue{

    private Comparable[] heap;
    private int size;

    
    
    public PriorityQueue() {
        heap = new Comparable[1];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(Comparable item) {
    	
        if (size == heap.length) {
            Comparable[] newHeap = new Comparable[2 * heap.length];
            System.arraycopy(heap, 0, newHeap, 0, heap.length);
            heap = newHeap;
        }
        int parent, child = size++;
        while (child > 0 && heap[parent = (child - 1) / 2].compareTo(item) > 0) {
            heap[child] = heap[parent];
            child = parent;
        }
        heap[child] = item;
    }
  
    public Comparable remove() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Comparable result = heap[0];
        Comparable item = heap[--size];
        int child, parent = 0; 
        while ((child = (2 * parent) + 1) < size) {
            if (child + 1 < size && heap[child].compareTo(heap[child + 1]) > 0) {
                ++child;
            }
            if (item.compareTo(heap[child]) > 0) {
                heap[parent] = heap[child];
                parent = child;
            } else {
                break;
            }
        }
        heap[parent] = item;
        return result;
    }
    public void displayAll(){
    	
    	for(int k=0;k<heap.length;k++)
    		System.out.println(heap[k]);
    }
    
    public static void main(String[] args) {
    	PriorityQueue p = new PriorityQueue();
    	
    	for(int i=0;i<20;i++){
    		int t = (int)(Math.random()*100);
    		p.add(t);
    		
    	}
    	
    	int k = 5;
    	p.displayAll();
    	System.out.println();
    	while(k--!=0){
    	int num = (Integer) p.remove();
    	System.out.println(num);
    	}
    }

}