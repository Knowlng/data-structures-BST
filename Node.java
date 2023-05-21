
public class Node {

    private Object keyValue;
    private Node parent;
    private Node smaller;
    private Node larger;
    private int distanceFromRoot;

    public Node() {}

    public Node(Object keyValue) {
        this.keyValue = keyValue;
    }

    public int getDistanceFromRoot() {
        if (smaller != null || larger != null) throw new UnsupportedOperationException("The distanceFromRoot property is only applicable to leaf nodes.");
        return distanceFromRoot;
    }

    public void setDistanceFromRoot(int distanceFromRoot) {
        this.distanceFromRoot = distanceFromRoot;
    }

    public Object getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(Object keyValue) {
        this.keyValue = keyValue;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getSmaller() {
        return smaller;
    }

    public void setSmaller(Node smaller) {
        this.smaller = smaller;
    }

    public Node getLarger() {
        return larger;
    }

    public void setLarger(Node larger) {
        this.larger = larger;
    }

    @Override
    public String toString() {
        return getKeyValue().toString();
    }
}