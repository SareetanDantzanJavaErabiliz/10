
package ordenazioa;
import java.util.*;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class Ordenazioa {

    public static void main( String[ ] parametroak ) {
        List <String> dantzak = new ArrayList<>( );
        
        dantzak.add( "Banako" );
        dantzak.add( "Godaleta dantza" );
        dantzak.add( "Erronkariko ttun-ttuna" );
        dantzak.add( "Axuri beltza" );
        
       
        System.out.println ("Ordenatu baino lehen");
        for ( String dantza : dantzak ){
            System.out.println( dantza );
        }
        
        // dantzak arraya ordenatu
        Collections.sort( dantzak );
        
        System.out.println( "\nOrdenatu eta gero" );
        for ( String dantza : dantzak ){
            System.out.print( dantza+". " );
        }
        
        // kontrako ordenan bistaratu nahi badugu, hauxe egin behar da
        Collections.sort( dantzak, Collections.reverseOrder( ) );
        
        System.out.println( "\nKontrako ordenan ordenatu eta gero" );
        for ( String dantza : dantzak ){
            System.out.print( dantza+ ". " );
        }
    }
    
}
