public class MAIN {
    public static void main(String[] args)
    {
        GRAPH_MATRIX graph_matrix = new GRAPH_MATRIX(10);
        graph_matrix.KnotenEinfuegen("A");
        graph_matrix.KnotenEinfuegen("B");
        graph_matrix.Ausgeben();
        graph_matrix.KanteEinfuegen("A","B",50);
        graph_matrix.KanteEinfuegen("A","A",50);
        graph_matrix.Ausgeben();
        graph_matrix.KnotenBezeichnerGeben(1);
        graph_matrix.KanteGewichtGeben("A", "B");
    }
}
