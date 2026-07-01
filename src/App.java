import java.util.HashSet;
import java.util.List;
import java.util.Set;

import collections.Maps;
import collections.Sets;
import models.Contacto;
import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        // runBinaryTree();
        // runEjercicios();
        // runSets();
        runMaps();
    }

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Ejercicio4 ejercicio4 = new Ejercicio4();

        System.out.println("Ejercicio 1: Arbol vacio");
        ejercicio1.insert(new int[]{});

        System.out.println("Ejercicio 1: Un solo nodo");
        ejercicio1.insert(new int[]{5});

        System.out.println("Ejercicio 1: Varios niveles");
        ejercicio1.insert(new int[]{5, 3, 7, 2, 4, 6, 8});

        System.out.println("Ejercicio 1: Solo hacia la derecha");
        ejercicio1.insert(new int[]{1, 2, 3, 4});
        System.out.println();

        System.out.println("Ejercicio 2: Arbol vacio");
        ejercicio2.invertTree(null);

        System.out.println("Ejercicio 2: Un solo nodo");
        BinaryTree<Integer> arbolDosUno = new BinaryTree<>();
        arbolDosUno.add(5);
        ejercicio2.invertTree(arbolDosUno.getRoot());

        System.out.println("Ejercicio 2: Varios niveles");
        BinaryTree<Integer> arbolDosDos = new BinaryTree<>();
        for (int numero : new int[]{5, 3, 7, 2, 4, 6, 8}) {
            arbolDosDos.add(numero);
        }
        ejercicio2.invertTree(arbolDosDos.getRoot());

        System.out.println("Ejercicio 2: Solo hacia la derecha");
        BinaryTree<Integer> arbolDosTres = new BinaryTree<>();
        for (int numero : new int[]{1, 2, 3, 4}) {
            arbolDosTres.add(numero);
        }
        ejercicio2.invertTree(arbolDosTres.getRoot());
        System.out.println();

        System.out.println("Ejercicio 3: Arbol vacio");
        ejercicio3.mostrarLevels(null);

        System.out.println("Ejercicio 3: Un solo nodo");
        BinaryTree<Integer> arbolTresUno = new BinaryTree<>();
        arbolTresUno.add(5);
        ejercicio3.mostrarLevels(arbolTresUno.getRoot());

        System.out.println("Ejercicio 3: Varios niveles");
        BinaryTree<Integer> arbolTresDos = new BinaryTree<>();
        for (int numero : new int[]{4, 2, 7, 1, 3, 6, 9}) {
            arbolTresDos.add(numero);
        }
        ejercicio3.mostrarLevels(arbolTresDos.getRoot());

        System.out.println("Ejercicio 3: Solo hacia la derecha");
        BinaryTree<Integer> arbolTresTres = new BinaryTree<>();
        for (int numero : new int[]{1, 2, 3, 4}) {
            arbolTresTres.add(numero);
        }
        ejercicio3.mostrarLevels(arbolTresTres.getRoot());
        System.out.println();

        System.out.println("Ejercicio 4: Arbol vacio");
        ejercicio4.mostrarMaxDepth(null);

        System.out.println("Ejercicio 4: Un solo nodo");
        BinaryTree<Integer> arbolCuatroUno = new BinaryTree<>();
        arbolCuatroUno.add(5);
        ejercicio4.mostrarMaxDepth(arbolCuatroUno.getRoot());

        System.out.println("Ejercicio 4: Varios niveles");
        BinaryTree<Integer> arbolCuatroDos = new BinaryTree<>();
        for (int numero : new int[]{5, 3, 7, 2, 4, 6, 8}) {
            arbolCuatroDos.add(numero);
        }
        ejercicio4.mostrarMaxDepth(arbolCuatroDos.getRoot());

        System.out.println("Ejercicio 4: Solo hacia la derecha");
        BinaryTree<Integer> arbolCuatroTres = new BinaryTree<>();
        for (int numero : new int[]{1, 2, 3, 4}) {
            arbolCuatroTres.add(numero);
        }
        ejercicio4.mostrarMaxDepth(arbolCuatroTres.getRoot());
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
    
    private static void runSets(){
        Sets sets = new Sets();

        // Implementacion --> HashSet hashcode
        System.out.println("Implementacion HashSet");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size = " + hashSet.size());
        System.out.println(hashSet.contains("F"));

        // Implementacion --> LinkedHashSet hashcode
        System.out.println("Implementacion LinkedHashSet");
        Set<String> lSet = sets.construirLinkedHashSet();
        System.out.println(lSet);
        System.out.println("Size = " + lSet.size());
        System.out.println(lSet.contains("F"));

        // Implementacion --> TreeSet hashcode
        System.out.println("Implementacion TreeSet");
        Set<String> tSet = sets.construirTreeSet();
        System.out.println(tSet);
        System.out.println("Size = " + tSet.size());
        System.out.println(tSet.contains("F"));

        // Implementacion --> Hash Contacto Set
        System.out.println("Implementacion Hash Contacto Set");
        Set<Contacto> hCSet = sets.construirHashSetContacto();
        System.out.println(hCSet);
        System.out.println("Size = " + hCSet.size());

        // Implementacion --> Tree Contacto Set hashcode
        System.out.println("Implementacion Tree Contacto Set");
        Set<Contacto> tCSet = sets.construirTreeSetContacto();
        System.out.println(tCSet);
        System.out.println("Size = " + tCSet.size());

    }

    private static void runMaps() {
        Maps maps = new Maps();
        maps.construirHashMap();
        maps.construirLinkedHashMap();
        maps.construirTreeMap();
    }

    
}
