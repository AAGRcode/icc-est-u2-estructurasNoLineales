package structures.trees;

import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void setRoot(T value){
        Node<T> node = new Node<>(value);
        this.root = node;
    }

    public void add(T value) {
        Node<T> node = new Node<>(value);
        root = addRecursivo(root, node);
    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        if(actual.getValue().compareTo(nodeInsertar.getValue())>0){
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        }else if (actual.getValue().compareTo(nodeInsertar.getValue())<0) {
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public void preOrden(){
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<T> actual) {
        if(actual == null){
            return;
        }
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    public void posOrden(){
        posOrdenRecursivo(root);
    }

    private void posOrdenRecursivo(Node<T> actual) {
        if(actual == null){
            return;
        }
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRight());
        System.out.println(actual);
    }

    public void inOrden(){
        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Node<T> actual) {
        if(actual == null){
            return;
        }
        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrdenRecursivo(actual.getRight());
        
    }
    public void getHeight(){
        getHeightRecursivo(root);
        System.out.println(getHeightRecursivo(root));
    }

    private int getHeightRecursivo(Node<T> actual){
        if(actual == null){
            return 0;
        }
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());    
        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto +1;
    }

    public void getWeight(){
        getWeightRecursivo(root);
        System.out.println(getWeightRecursivo(root));

    }

    private int getWeightRecursivo(Node<T> actual) {
        if(actual == null){
            return 0;
        }
        int heightLeft = getWeightRecursivo(actual.getLeft());
        int heightRight = getWeightRecursivo(actual.getRight());    
        return heightLeft + heightRight +1;
    }
}
