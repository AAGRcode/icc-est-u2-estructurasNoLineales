package structures.trees;

import structures.node.Node;

public class Ejercicio4 {
    public int maxDepth(Node root){
        return maxDepthRecursivo(root);
    }

    private int maxDepthRecursivo(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepthRecursivo(root.getLeft());
        int rightDepth = maxDepthRecursivo(root.getRight());

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public void mostrarMaxDepth(Node root) {
        System.out.println("Profundidad máxima del árbol: " + maxDepth(root));
        System.out.println("Representación horizontal del árbol:");
        ordenHorizontalRecursivo(root, 0);
    }

    private void ordenHorizontalRecursivo(Node<Integer> actual, int nivel) {
        if(actual == null){
            return;
        }
        
        ordenHorizontalRecursivo(actual.getRight(), nivel + 1);
        for(int i = 0; i < nivel; i++){
            System.out.print("    ");
            }
        System.out.println(actual.getValue());
        ordenHorizontalRecursivo(actual.getLeft(), nivel + 1);
        
    }
}
