/**
 * Klasse GRAPH_MATRIX
 * Klasse für einen ungerichteten, gewichteten Graphen
 * Als Datenstruktur wird eine Adjazenzmatrix verwendet
 * 
 */

public class GRAPH_MATRIX
{
    // aktuelle Knotenanzahl
    private int anzahlKnoten;

    // Feld der Knoten des Graphen
    private KNOTEN[] knoten;   

    // 2-dim Feld der Adjazenzmatrix
    private int[][] matrix;

    /**
     * Konstruktor für Objekte der Klasse GRAPH_MATRIX
     * Die maximale Anzahl der Knoten wird dabei festgelegt
     *      
     * @param   maximaleKnoten   Anzahl der maximal möglichen Knoten
     * 
     */
    public GRAPH_MATRIX(int maximaleKnoten)
    {
        anzahlKnoten = 0;
        knoten = new KNOTEN[maximaleKnoten];
        matrix = new int[maximaleKnoten][maximaleKnoten];
    }

}
