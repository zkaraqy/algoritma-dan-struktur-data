package binaryTree;

class NodeTree {
    int key;
    NodeTree left, right;

    public NodeTree(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTree {

    NodeTree root;

    public void traverseTree(NodeTree node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(" " + node.key);
            traverseTree(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

//        tree.root = new NodeTree(1);
//        tree.root.left = new NodeTree(2);
//        tree.root.right = new NodeTree(3);
//        tree.root.left.left = new NodeTree(4);
//        tree.root.right.right = new NodeTree(9);
        tree.root = new NodeTree(1);

        tree.root.left = new NodeTree(2);
        tree.root.left.left = new NodeTree(4);
        tree.root.left.right = new NodeTree(5);
        tree.root.left.left.left = new NodeTree(8);
        tree.root.left.left.right = new NodeTree(9);
        tree.root.left.right.left = new NodeTree(10);
        tree.root.left.right.right = new NodeTree(11);

        tree.root.right = new NodeTree(3);
        tree.root.right.left = new NodeTree(6);
        tree.root.right.right = new NodeTree(7);
        tree.root.right.left.right = new NodeTree(13);
        tree.root.right.right.left = new NodeTree(14);

        System.out.print("\n Binary Tree: ");
        tree.traverseTree(tree.root);
        System.out.println("");
    }

}
