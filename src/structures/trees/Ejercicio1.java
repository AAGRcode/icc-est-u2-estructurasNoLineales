package structures.trees;

import structures.node.Node;

public class Ejercicio1 {

    public void insert(int[] numeros){
        //CREAR EL ARBOL DE ENTEROS
        //INSERTAR CADA NUMERO
        //IMPRIMIR EL ARBOL
        BinaryTree<Integer> arbol = new BinaryTree<>();
        for (int numero : numeros) {
            arbol.add(numero);
        }
        arbol.inOrden();
        ordenHorizontal(arbol.getRoot());
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