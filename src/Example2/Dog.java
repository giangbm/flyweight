package Example2;

/**
 * Extrinsic State
 */
public class Dog {
    private int id;
    private String type;

    public Dog(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }
}
