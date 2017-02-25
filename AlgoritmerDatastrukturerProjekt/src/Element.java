/**
 *
 * @author Niels Heltner (nhelt15) & Antonio Lascari (anlas15)
 */
public class Element {
    
    private int key;
    private Object data;
    
    public Element(int key, Object data) {
        this.key = key;
        this.data = data;
    }
    
    /**
     * Returns the key of this element. The key functions as a priority number.
     * @return the value of the key field.
     */
    public int getKey() {
        return key;
    }
    
    /**
     * Returns the data of this element.
     * @return the value of the data field.
     */
    public Object getData() {
        return data;
    }
    
}
