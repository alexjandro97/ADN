package adn;

/**
 *
 * @author alexj
 */
public class ADN {

    static String ADN1 = "ACGT";
    static String ADN2 = "TGCA";
    int mutaciones = 0;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comprobarADN(ADN1, ADN2);
    }
    
    private static int comprobarADN(String ADN1, String ADN2) {
        //if para ver si 
        if (ADN1.length() == ADN2.length()) {
            for (int i = 0; i < ADN1.length(); i++) {
                if (((ADN1.substring(i).equals("A")) && (ADN2.substring(i).equals("T")))
                        || ((ADN1.substring(i).equals("C")) && (ADN2.substring(i).equals("G")))) {

                } else if (((ADN2.substring(i).equals("A")) && (ADN1.substring(i).equals("T")))
                        || ((ADN2.substring(i).equals("C")) && (ADN1.substring(i).equals("G")))) {

                }
            }
        } else {
            System.out.println("Error al comparar cadenas de ADN");
        }
