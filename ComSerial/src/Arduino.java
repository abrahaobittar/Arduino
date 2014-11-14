
import javax.swing.JButton;

/**
 *
 * @author Abrahão
 */
public class Arduino {
    private Controle arduino;
    
    public Arduino() {
        arduino = new Controle("COM4",9600);
    }
    
    public void comunicacaoArduino(JButton botao) {
        if("Ligar".equals(botao.getActionCommand())) {
            arduino.enviaDados('A');
            System.out.println(botao.getText());
        } else if("Desligar".equals(botao.getActionCommand())) {
            arduino.enviaDados('B');
            System.out.println(botao.getText());
        } else {
            arduino.desligar();
            System.out.println(botao.getText());
        }
    }
}
