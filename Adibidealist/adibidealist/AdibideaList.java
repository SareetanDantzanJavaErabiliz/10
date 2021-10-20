
package adibidealist;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

public class AdibideaList {

    public static void main( String[ ] parametroak ) {
	
	// Karaktere-kateak gordetzen dituen dantza izeneko zerrenda bat sortu        
        List <String> dantza = new ArrayList<> ( );
        
        // Dantzen izenak zerrendan sartu. Posiblea da izenak errepikatzea.
	dantza.add( "Banako" );
        dantza.add( "Godalet dantza" );
        dantza.add( "Larrain dantza" );
        dantza.add( "Banako" );
        
	// Zerrendaren edukia bistaratu
        for ( String ikuskizuna : dantza ) {
            System.out.println( ikuskizuna );
        }    
    }
}
