import java.util.Scanner;

/**
 *
 * @author Niels Heltner (nhelt15) & Antonio Lascari (anlas15)
 */
public class Heapsort {
    
    public static void main(String[] args) {
        PQ pq = new PQHeap(1000);
        int numberOfElements = 0;
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int key = in.nextInt();
            pq.insert(new Element(key, null));
            numberOfElements++;
        }
        while(numberOfElements > 0) {
            System.out.println(pq.extractMin().getKey());
            numberOfElements--;
        }
    }
    
}
