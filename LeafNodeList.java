import java.util.ArrayList;

public class LeafNodeList extends ArrayList<Node> {

    public LeafNodeList() {
        super();
    }

    public void printList() {
        for (Node node : this) {
            System.out.println(node + " distance is: " + node.getDistanceFromRoot());
        }
    }
    
    public void storeLeafNodes(Node node) {
        if(node==null) return;

        if (node.getSmaller() == null && node.getLarger() == null) {
            int distance = 0;
            Node parent = node.getParent();
            while(parent != null) {
                ++distance;
                parent = parent.getParent();
            }
            node.setDistanceFromRoot(distance);
            add(node);
        }

        storeLeafNodes(node.getSmaller());
        storeLeafNodes(node.getLarger());
    }

}
