public class Main {
    public static void main(String[] args) {
        VektetGraf VektetGraf = new VektetGraf(true);
        VektetNode A = new VektetNode(0, "A");
        VektetNode B = new VektetNode(1, "B");
        VektetNode C = new VektetNode(2, "C");
        VektetNode D = new VektetNode(3, "D");
        VektetNode E = new VektetNode(4, "E");
        VektetNode F = new VektetNode(5, "F");

        //A
        VektetGraf.addEdge(A, B, 10);
        VektetGraf.addEdge(A, C, 5);
        VektetGraf.addEdge(A, D, 9999);
        VektetGraf.addEdge(A, E, 3);
        VektetGraf.addEdge(A, F, 12);
        //B
        VektetGraf.addEdge(B, C, 17);
        VektetGraf.addEdge(B, D, 9);
        VektetGraf.addEdge(B, E, 17);
        VektetGraf.addEdge(B, F, 12);
        VektetGraf.addEdge(B, A, 10);
        //C
        VektetGraf.addEdge(C, D, 35);
        VektetGraf.addEdge(C, E, 3);
        VektetGraf.addEdge(C, F, 12);
        VektetGraf.addEdge(C, A, 5);
        VektetGraf.addEdge(C, B, 17);
        //D
        VektetGraf.addEdge(D, E, 9999);
        VektetGraf.addEdge(D, F, 12);
        VektetGraf.addEdge(D, A, 9999);
        VektetGraf.addEdge(D, B, 9);
        VektetGraf.addEdge(D, C, 35);
        //E
        VektetGraf.addEdge(E, F, 12);
        VektetGraf.addEdge(E, A, 3);
        VektetGraf.addEdge(E, B, 17);
        VektetGraf.addEdge(E, C, 3);
        VektetGraf.addEdge(E, D, 9999);
        //F
        VektetGraf.addEdge(F, A, 12);
        VektetGraf.addEdge(F, B, 12);
        VektetGraf.addEdge(F, C, 12);
        VektetGraf.addEdge(F, D, 12);
        VektetGraf.addEdge(F, E, 12);




        VektetGraf.DijkstraShortestPath(D, E);


    }
}