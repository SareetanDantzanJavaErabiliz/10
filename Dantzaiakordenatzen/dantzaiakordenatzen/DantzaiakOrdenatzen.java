
package dantzaiakordenatzen;
import java.util.*;


/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte.UPV/EHU.
 */
public class DantzaiakOrdenatzen {

    public static void main( String[ ] parametroak ) {
        
        List <Dantzariak> dantzaTaldea = new ArrayList<>( );
        
        dantzaTaldea.add( new Dantzariak( 21, "Manex", "Banako" ) );
        dantzaTaldea.add( new Dantzariak( 18, "Txabi", "Godalet Dantza" ) );
        dantzaTaldea.add( new Dantzariak( 19, "Maialen", "Erronkariko ttun-ttuna" ) );
        dantzaTaldea.add( new Dantzariak( 23, "Mari", "Axuri Beltza" ) );
        
        // Horrela dantzariak izenaren arabera ordenatzen dira
        Collections.sort( dantzaTaldea, new IzenaErkatu( ) );
        System.out.println( "Izenaren arabera" );
        for ( Dantzariak amilotxDT : dantzaTaldea ) {
            System.out.println( "\nIzena: " + amilotxDT.getIzena( )+ 
                                "\tAdina: " + amilotxDT.getAdina( )+ 
                                "\tGustuko dantza: "+ 
                                amilotxDT.getGustukoDantza( ) );
        }
        
        // Horrela dantzariak adinaren arabera ordenatzen dira
        Collections.sort (dantzaTaldea, new AdinaErkatu ( ) );     
        System.out.println ("\nAdinaren arabera");
        for ( Dantzariak amilotxDT : dantzaTaldea ) {
            System.out.println( "\nIzena: " + amilotxDT.getIzena( )+ 
                                "\tAdina: " + amilotxDT.getAdina( )+ 
                                "\tGustuko dantza: "+ 
                                amilotxDT.getGustukoDantza( ) );
        
        }
    }
    
}
