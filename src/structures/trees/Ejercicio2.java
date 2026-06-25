package structures.trees;

import structures.node.Node;

public class Ejercicio2 {
    public void invertTree(Node<Integer> root) {
        invertTreeRecursivo(root);
        ordenHorizontal(root);
    }
    private Node<Integer> invertTreeRecursivo(Node<Integer> actual){
        if(actual == null){
            return null;
        }
        Node<Integer> aux = actual.getLeft();
        actual.setLeft(invertTreeRecursivo(actual.getRight()));
        actual.setRight(invertTreeRecursivo(aux));
        return actual;
    }

    public void ordenHorizontal(Node<Integer> root){
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
