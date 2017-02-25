import java.util.Scanner;

/**
 *
 * @author Niels Heltner (nhelt15) & Antonio Lascari (anlas15)
 */
public class Heapsort {
    
    public static void main(String[] args) {
        PQ pq = new PQHeap(1000);
        int n = 0;
        int i;
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            i = in.nextInt();
            n++;
            pq.insert(new Element(i, null));
        }
        while(n > 0) {
            System.out.println(pq.extractMin().getKey());
            n--;
        }
    }
    
}
