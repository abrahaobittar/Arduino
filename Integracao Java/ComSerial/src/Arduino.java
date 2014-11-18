
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author Abrahão
 */
public class Arduino {
    private Controle arduino;
    private String porta;
    
    public Arduino() {
        arduino = new Controle(this.porta, 9600);
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
    
    public void setPortaSerial(String portaSerial) { 
       this.porta = portaSerial;
       System.out.println(this.porta);
       arduino.inicializar();
    }
}
