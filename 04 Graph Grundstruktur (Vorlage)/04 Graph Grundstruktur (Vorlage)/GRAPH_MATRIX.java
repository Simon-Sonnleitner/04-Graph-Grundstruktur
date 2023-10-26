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

    public void Ausgeben()
    {
        //Kopfzeile
        System.out.printf("%-8s" , "");
        for (int i = 0; i < anzahlKnoten; i++) {
            System.out.printf("%-8s" , knoten[i].BezeichnungGeben());
        }
        System.out.println();

        //Matrix mit linkem Rand
        for (int i = 0; i < anzahlKnoten; i++) {
            System.out.printf("%-8s" , knoten[i].BezeichnungGeben());
            for (int j = 0; j < anzahlKnoten; j++) {
                if (matrix[i][j] != -1)
                {
                    System.out.printf("%-8s" , matrix[i][j]);
                }
                else
                {
                    System.out.printf("%-8s" , "");
                }
            }
            System.out.println();
        }
    }

    public int KnotenNummer(String bezeichner);
    {
        for (int i = 0; i < anzahlKnoten; i++) {
            if (matrix[i] == bezeichner)
            {

            }
        }

        return;
    }


}
