public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        // Inserciones
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Recorrido In-Order:");
        tree.inOrder(tree.root);

        System.out.println("\nBuscar 40: " + tree.search(40));
        System.out.println("Eliminar 30");
        tree.delete(30);

        System.out.println("Recorrido In-Order después de eliminar:");
        tree.inOrder(tree.root);
    }
}
