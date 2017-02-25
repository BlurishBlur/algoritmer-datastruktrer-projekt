import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niels Heltner (nhelt15) & Antonio Lascari (anlas15)
 */
public class PQHeap implements PQ { // det er den her klasse vi rent faktisk skal implementere
    
    private Element[] arrayHeap;//vi skal bestemme os for om vi vil bruge et array eller arraylist
    private List<Element> listHeap;
    private int size;
    
    public PQHeap(int maxElements) {
        arrayHeap = new Element[maxElements];
        listHeap = new ArrayList<>(maxElements);
        size = 0;
    }

    @Override
    public Element extractMin() {
        Element min = arrayHeap[0];
        arrayHeap[0] = arrayHeap[arrayHeap.length - 1];
        minHeapify(0);
        return min;
    }

    @Override
    public void insert(Element element) {
        arrayHeap[++size] = element;
        int currentIndex = size;
        while(currentIndex > 0 && arrayHeap[getParentIndex(currentIndex)].getKey() > arrayHeap[currentIndex].getKey()) {
            //mangler lige det sidste pseudo kode
        }
    }
    
    private void minHeapify(int index) {
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);
        int minIndex;
        if((leftChildIndex >= arrayHeap.length - 1) && 
                (arrayHeap[leftChildIndex].getKey() < arrayHeap[index].getKey())) {
            minIndex = leftChildIndex;
        }
        else {
            minIndex = index;
        }
        if((rightChildIndex >= arrayHeap.length - 1) && 
                (arrayHeap[rightChildIndex].getKey() < arrayHeap[minIndex].getKey())) {
            minIndex = rightChildIndex;
        }
        if(minIndex != index) {
            Element temp = arrayHeap[minIndex];
            arrayHeap[minIndex] = arrayHeap[index];
            arrayHeap[index] = temp;
            minHeapify(minIndex);
        }
    }
    
    /**
     * 
     * @param childIndex the index of the child, whose parent's index needs to be found
     * @return the index of the parent, who has a child with the given index
     */
    private int getParentIndex(int childIndex) {
        return childIndex / 2;
    }
    
    /**
     * 
     * @param parentIndex the index of the parent, whose left child's index needs to be found
     * @return the index of the left child of the parent
     */
    private int getLeftChildIndex(int parentIndex) {
        return parentIndex * 2;
    }
    
    /**
     * 
     * @param parentIndex the index of the parent, whose right child's index needs to be found
     * @return the index of the right child of the parent
     */
    private int getRightChildIndex(int parentIndex) {
        return (parentIndex * 2) + 1;
    }
    
}
