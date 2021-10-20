
package hashtaulak;
import java.util. HashMap;
import java.util.Map;
import java.util.Map.Entry;


/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class HashTaulak {
    
    public static void main( String[ ] parametroak ) {
        Map<String, Integer> jokalaria = new HashMap<>( );
        jokalaria.put( "Aduriz", 20 );
        jokalaria.put( "Illarramendi", 4 );
        jokalaria.put( "Oier", 6 );
        jokalaria.put( "Arbilla", 23 );
        jokalaria.put( "Agirregabiria", 21 );
        
        // Aduriz gakoari dagokion balioa bistaratu
        System.out.println( jokalaria.get( "Aduriz" ) );
        
        // Gako guztiak bistaratu
        for ( String futbolaria : jokalaria.keySet( ) ) {
            System.out.println( futbolaria );
        }
        
        // Balio guztiak bistaratu
        for ( Integer dorsala : jokalaria.values( ) ) {
            System.out.println( dorsala );
        }
        
        // gako/balio pare guztiak bistaratu
        for ( Entry <String, Integer> datua : jokalaria.entrySet( ) ) {
            System.out.println( datua.getKey( ) + ": " + datua.getValue( ) );
        }
        
    }
    
}
