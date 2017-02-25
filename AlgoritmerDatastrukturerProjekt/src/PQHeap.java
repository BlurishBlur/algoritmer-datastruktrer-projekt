import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niels Heltner (nhelt15) & Antonio Lascari (anlas15)
 */
public class PQHeap implements PQ { // det er den her klasse vi rent faktisk skal implementere
    
    private Element[] arrayHeap;//vi skal bestemme os for om vi vil bruge et array eller arraylist
    private List<Element> listHeap;
    
    public PQHeap(int maxElements) {
        arrayHeap = new Element[maxElements];
        listHeap = new ArrayList<>(maxElements);
    }

    @Override
    public Element extractMin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void insert(Element element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
