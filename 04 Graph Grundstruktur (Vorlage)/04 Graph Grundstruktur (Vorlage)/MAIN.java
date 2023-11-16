public class MAIN {
    public static void main(String[] args)
    {
        GRAPH_MATRIX graph_matrix = new GRAPH_MATRIX(10);
        graph_matrix.KnotenEinfuegen("A");
        graph_matrix.KnotenEinfuegen("B");
        graph_matrix.KnotenEinfuegen("A");
        graph_matrix.Ausgeben();
    }
}
