package structures.trees;

import java.util.ArrayList;
import java.util.List;

import structures.node.Node;

public class Ejercicio3 {
    public List<List<Node>> listlevels(Node root){
        List<List<Node>> niveles = new ArrayList<>();
        listlevelsRecursivo(root, 0, niveles);
        return niveles;
    }

    private void listlevelsRecursivo(Node actual, int level, List<List<Node>> niveles) {
        if (actual == null) {
            return;
        }

        if (niveles.size() <= level) {
            niveles.add(new ArrayList<>());
        }

        niveles.get(level).add(actual);
        listlevelsRecursivo(actual.getLeft(), level + 1, niveles);
        listlevelsRecursivo(actual.getRight(), level + 1, niveles);
    }

    public void mostrarLevels(Node root) {
        System.out.println("Niveles del arbol:");
        ordenHorizontalRecursivo(root, 0);
        System.out.println();
        System.out.println("Niveles del arbol en listas:");
        List<List<Node>> niveles = listlevels(root);
        for(List<Node> nivel: niveles){
            for(int i = 0; i < nivel.size(); i++){
                System.out.print(nivel.get(i).getValue() + " ");
                if (i < nivel.size() - 1){
                    System.out.print(" -> ");
                }
                    
            }
            System.out.println();
        }
        
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
