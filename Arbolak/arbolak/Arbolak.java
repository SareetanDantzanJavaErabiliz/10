
package arbolak;
import java.util.TreeSet;
import java.util.Iterator;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class Arbolak {

    public static void main( String[ ] parametroak ) {
        
        TreeSet <String> dantza = new TreeSet<>( );  
        
        //dantzak sartu zerrendan
        dantza.add ("Banako");
        dantza.add ("Larrain dantza");
        dantza.add ("Godalet dantza");
        dantza.add ("Banako");
        dantza.add ("Axuri Beltza");
        
        // Iteratzailea sortu ordena naturalean osagaiak bistaratzeko
        Iterator <String> itr = dantza.iterator( ); 
  
        System.out.println( "Dantza zerrenda ordena alfabetikoan: " );   
        while ( itr.hasNext( ) ) { 
            System.out.println( itr.next( ) ); 
        }
        
        //osagai zehatz bat aurkitu eta atzekoa eta aurrekoa bistaratu
        System.out.println( "\nBanako dantzaren atzekoa eta aurrekoa:" );        
        System.out.println( dantza.higher( "Banako" ) );
        System.out.println( dantza.lower( "Banako" ) );
        
        //Iteratzaile berri bat sortu osagaiak beheranzko ordenan bistaratzeko
        Iterator <String> itrKontrakoa = dantza.descendingIterator( );
        
        System.out.println( "\nZerrenda beheranzko ordenan" );
        while ( itrKontrakoa.hasNext( ) ) { 
            System.out.println( itrKontrakoa.next( ) ); 
        }
  
    } 
    
}
