public class GrafosNoDirigido {
    public static void main(String[] args) {
        int[][] grafoND1 = {
            {0, 1, 2, 3, 4, 5},
            {1, 0, 1, 1, 0, 0},
            {2, 1, 1, 1, 1, 1},
            {3, 1, 1, 0, 1, 0},
            {4, 0, 1, 1, 0, 1},
            {5, 0, 1, 0, 1, 0}
        };
        int[][] grafoND2 = {
            {0, 1, 2, 3, 4, 5},
            {1, 0, 1, 1, 0, 1},
            {2, 1, 0, 1, 1, 0},
            {3, 1, 1, 0, 1, 1},
            {4, 0, 1, 1, 0, 1},
            {5, 1, 0, 1, 0, 0}
        };
        int[][] grafoND3 = {
            {0, 1, 2, 3, 4, 5},
            {1, 0, 1, 0, 0, 1},
            {2, 1, 0, 1, 1, 0},
            {3, 0, 1, 1, 1, 0},
            {4, 0, 1, 1, 0, 1},
            {5, 1, 0, 0, 1, 0}
        };
        int[][] grafoND4 = {
            {0, 1, 2, 3, 4,5},
            {1, 1, 1, 1, 0, 0},
            {2, 1, 0, 1, 0, 1},
            {3, 1, 1, 0, 1, 0},
            {4, 0, 0, 1, 0, 1},
            {5, 0, 1, 0, 1, 1},
        };
        int[][] grafoND5 = {
            {0, 1, 2, 3, 4,5},
            {1, 0, 1, 1, 1, 0},
            {2, 1, 1, 0, 0, 0},
            {3, 1, 0, 0, 1, 1},
            {4, 1, 0, 1, 0, 1},
            {5, 0, 0, 1, 1, 0},
        };

        System.out.println("Grafo No Dirigido 1:\n");
        printGrafoTabla(grafoND1);
        printGrafo1X1(grafoND1);
        System.out.println("\n\nGrafo No Dirigido 2:\n");
        printGrafoTabla(grafoND2);
        printGrafo1X1(grafoND2);
        System.out.println("\n\nGrafo No Dirigido 3:\n");
        printGrafoTabla(grafoND3);
        printGrafo1X1(grafoND3);
        System.out.println("\n\nGrafo No Dirigido 4:\n");
        printGrafoTabla(grafoND4);
        printGrafo1X1(grafoND4);
        System.out.println("\n\nGrafo No Dirigido 5:\n");
        printGrafoTabla(grafoND5);
        printGrafo1X1(grafoND5);

}
public static void printGrafoTabla(int[][] grafo) {
    for (int i = 0; i < grafo.length; i++) {
        for (int j = 0; j < grafo[i].length; j++) {
            System.out.print(grafo[i][j] + " ");
        }
        System.out.print("\n");
    }
    System.out.print("\n");
}
public static void printGrafo1X1(int[][] grafo) {
    for (int i = 0; i < grafo.length; i++) {
        for (int j = 0; j < grafo[i].length; j++) {
            System.out.print("[" + i + "][" + j + "] = " + grafo[i][j] + " ");
        }
        System.out.print("\n");
    }
}
}