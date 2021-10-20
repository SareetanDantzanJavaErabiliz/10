/*
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 *
*/
package zerrendakateatua;

import java.util.LinkedList; 
import java.util.Iterator;

public class ZerrendaKateatua { 
    public static void main( String[ ] parametroak ) 
    { 
  
        LinkedList <String> dantza = new LinkedList<>();  
        
        // Dantzak sartu zerrenda
        dantza.add( "Banako" );
        dantza.add( "Godalet dantza" );
        dantza.add( "Larrain dantza" );
        dantza.add( "Banako" );

        //Zerreda kateatuetako osagaiak ikusteko iteratzailea sortu
        Iterator <String> itr = dantza.iterator( ); 
  
        System.out.println( "Dantza zerrenda: " ); 
        while ( itr.hasNext( ) ) { 
            System.out.println( itr.next( ) ); 
        }
        
        //dantza berriak zerrendan sartu
        dantza.push( "Eguzki dantza" );        
        dantza.offerLast( "Kaxarranka" );
        
        itr = dantza.iterator( );
        System.out.println( "\nDantza zerrenda berria: " );
        while ( itr.hasNext( ) ) { 
            System.out.println( itr.next( ) ); 
        }
    } 
}
