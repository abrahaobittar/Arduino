
import gnu.io.*;
import java.util.Enumeration;

/**
 *
 * @author Abrahão
 * Detectar porta serial
 */
public class DetectaPorta {
    CommPortIdentifier portas;
    Enumeration porta;

    
    public String acharPorta() {
        this.porta = CommPortIdentifier.getPortIdentifiers();
        
        while(porta.hasMoreElements()) {
            this.portas = (CommPortIdentifier) porta.nextElement();
        }
        return portas.getName();
    }
}
