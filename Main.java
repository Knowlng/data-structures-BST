
public class Main {
    public static void main(String[] args) {
        BST bst = new BST(new CmpBook());
        
        bst.insert(new Book(5,"I"));
        bst.insert(new Book(2,"D"));
        bst.insert(new Book(7,"L"));
        bst.insert(new Book(1,"A"));
        bst.insert(new Book(3,"F"));
        bst.insert(new Book(6,"K"));
        bst.insert(new Book(8,"M"));
        bst.insert(new Book(4,"H"));
        bst.insert(new Book(9,"P"));

        System.out.println("------------------Binary tree-----------------");
        System.out.println("\n");
        bst.printBinaryTree(bst.getRoot(), 0);
        System.out.println("\n");

        bst.storeLeafNodes(bst.getRoot(), 0);

        System.out.println("------------------Leaf Node List-----------------");
        for (Object node : bst.getLeafNodeList()) {
            System.out.println(node + " distance is: " + ((Node) node).getDistanceFromRoot());
        }
        System.out.println();
    }
}