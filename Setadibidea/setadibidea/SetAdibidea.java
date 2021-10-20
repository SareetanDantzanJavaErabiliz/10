/*
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
*/
package setadibidea;
import java.util.HashSet;
import java.util.Set;

public class SetAdibidea {

    public static void main( String[ ] parametroak ) {
        
        //zerrenda sortu
        Set <String> dantza = new HashSet( );
        
        //dantzak gehitu zerrendan
        dantza.add( "Banako" );
        dantza.add( "Elziegoko dantzak" );
        dantza.add( "Larrain dantza" );
        dantza.add( "Banako" );
        
        //zerrenda bistaratu
        System.out.println( "Zerrenda:" );
        for ( String ikuskizuna : dantza ) {
            System.out.println( ikuskizuna );
        }
        
        // zerrenda osoa bistaratu
        System.out.println(dantza); 
        
        //Galdetu ea Godalet dantza zerrendan badagoen
        System.out.println( "Zerrendan Godalet dantza badago? " +dantza.contains("Godalet dantza" ) ); 
  
        // Banako dantza zerrendatik kendu
        dantza.remove( "Banako" ); 
        System.out.println( "Zerrenda Banako kendu eta gero:"+dantza ); 

    }
    
}
