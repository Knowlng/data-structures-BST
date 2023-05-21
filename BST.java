import java.util.ArrayList;
import java.util.Comparator;

public class BST {

    private final Comparator cmp;
    private ArrayList<Node> leafNodeList;

    private Node root;

    public BST(Comparator comparator) {
        cmp = comparator;
        leafNodeList = new ArrayList<>();
    }

    public Node getRoot() {
        return root;
    }

    public Node insert(Object keyValue) {
        if(keyValue == null) throw new IllegalArgumentException("ERROR: Key is null.");

        Node parent = null;
        Node node = root;
        int res=0;
        while (node != null) {
            parent = node;
            res = cmp.compare(keyValue, node.getKeyValue());
            //res = ((Comparable)key).compareTo(node.getKey());
            if(res < 0) {
                node = node.getSmaller();
            } else if (res > 0) {
                node = node.getLarger();
            } else {
                System.out.println("ERROR: Duplicate key.");
                return null;
            }
        }
        Node newNode = new Node();
        newNode.setKeyValue(keyValue);
        newNode.setParent(parent);
        if (parent == null) {
            root = newNode;
        } else if (res < 0) {
            parent.setSmaller(newNode);
        } else if (res > 0){
            parent.setLarger(newNode);
        }
        return newNode;
    }

    public static void printBinaryTree(Node node, int level){
        if(node==null) return;
        
        printBinaryTree(node.getLarger(), level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
                System.out.println("|---"+node.getKeyValue());
        } else
            System.out.println(node.getKeyValue());
        printBinaryTree(node.getSmaller(), level+1);
    }

    public void storeLeafNodes(Node node, int distance) {
        if (node == null) return;
        node.setDistanceFromRoot(distance);

        if (node.getSmaller() == null && node.getLarger() == null) {
            node.setDistanceFromRoot(distance);
            leafNodeList.add(node);
        }

        storeLeafNodes(node.getSmaller(), distance + 1);
        storeLeafNodes(node.getLarger(), distance + 1);
    }

    public ArrayList<Node> getLeafNodeList() {
        return leafNodeList;
    }

}
