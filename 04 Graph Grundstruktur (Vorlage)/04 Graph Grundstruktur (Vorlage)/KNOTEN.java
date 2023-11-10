/**
 * Klasse KNOTEN.
 * f�r die Darstellungen eines Graphen mittels Adjazenzmatrix
 * 
 */

public class KNOTEN
{
    private final String bezeichnung;


    /**
     * Konstruktor f�r Objekte der Klasse KNOTEN
     */
    public KNOTEN(String neuerWert)
    {
        bezeichnung = neuerWert;
    }


    /**
     * Gibt den Bezeichner des Knotenobjekts zur�ck
     * 
     * @return  Bezeichner
     * 
     */
    public String BezeichnungGeben()
    {
        return bezeichnung;
    }
    
}