import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
        runEjercicios();
    }

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] {5, 3, 7, 2, 4, 6, 8};
        ejercicio1.insert(numeros);  
        System.out.println();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numerosDos = new int[] {5, 3, 7, 2, 4, 6, 8};
        BinaryTree<Integer> arbolDos = new BinaryTree<>();
        for (int numero : numerosDos) {
            arbolDos.add(numero);
        }
        Node<Integer> root = arbolDos.getRoot();
        ejercicio2.invertTree(root);
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree();
        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);
        // Node<Integer> node1 = new Node<>(50);
        // arbolNumeros.setRoot(node1);
        // Node<Integer> node2 = new Node<>(10);
        // Node<Integer> node3 = new Node<>(30);
        // node1.setRight(node2);
        // node2.setLeft(node3);
        // System.out.println(arbolNumeros.getRoot());
        // System.out.println(arbolNumeros.getRoot().getRight().getLeft());
        System.out.println("Preorder: ");
        arbolNumeros.preOrden();
        System.out.println("Posorder: ");
        arbolNumeros.posOrden();
        System.out.println("Inorder: ");
        arbolNumeros.inOrden();
        System.out.println("Altura: ");
        arbolNumeros.getHeight();
        System.out.println("Peso: ");
        arbolNumeros.getWeight();
    }

    private static void runBinaryTree() {
        BinaryTree<String> arbolStrings = new BinaryTree();
        BinaryTree<Persona> arbolPersonas = new BinaryTree();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
    }
    
}
