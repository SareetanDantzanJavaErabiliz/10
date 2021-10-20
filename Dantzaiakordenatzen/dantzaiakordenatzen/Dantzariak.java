
package dantzaiakordenatzen;

import java.util.Comparator;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class Dantzariak implements Comparable<Dantzariak> {
    private int adina;
    private String izena;
    private String gustukoDantza;
    
    public Dantzariak( ) {
        
    }
        
    public Dantzariak( int adina, String izena, String gustukoDantza ) {
        this.adina = adina;
        this.izena = izena;
        this.gustukoDantza = gustukoDantza;
    }
    
    @Override
    public int compareTo( Dantzariak dantzari ) {
        return adina - dantzari.getAdina( );
    }
    
    public void dantzariaBistaratu( ) {
        System.out.println( getIzena( )+ " dantzariak "+getAdina( )+" urte ditu eta "+getGustukoDantza( )+" du gustukoa");
    }
    
    public int getAdina( ) {
        return( adina );
    }
    
    public void setAdina( int urteak ) {
        this.adina = urteak;
    }
    
    public String getIzena( ) {
        return( izena );
    }
    
    public void setIzena( String izena ) {
        this.izena = izena;
    }
    
    public String getGustukoDantza( ) {
        return( gustukoDantza );
    }
    
    public void setGustukoDantza( String izena ) {
        this.gustukoDantza = izena;
    }    
}

class IzenaErkatu implements Comparator<Dantzariak> 
{ 
    @Override
    public int compare( Dantzariak d1, Dantzariak d2 ) { 
        return d1.getIzena( ).compareTo( d2.getIzena ( ) ); 
    } 
    
}

class AdinaErkatu implements Comparator<Dantzariak> 
{ 
    @Override
    public int compare( Dantzariak d1, Dantzariak d2 ) { 
        return d1.getAdina( ) - d2.getAdina( )   ; 
    } 
}

