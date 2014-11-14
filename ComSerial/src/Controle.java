import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Abrahão
 */
public class Controle {

    private OutputStream serialOut;
    private int taxa;
    private String portaCOM;

    Controle(String serial, int velocidade) {
        this.taxa = velocidade;
        this.portaCOM = serial;
        this.inicializar();
    }

    private void inicializar() {
        try {
            CommPortIdentifier portId = null;

            try {
                portId = CommPortIdentifier.getPortIdentifier(this.portaCOM);
            } catch (NoSuchPortException ob) {
                JOptionPane.showMessageDialog(null, "Porta Serial nao encontrada", "Atencao",
                        JOptionPane.ERROR_MESSAGE);
            }

            SerialPort port = (SerialPort) portId.open("Comunicacao serial", this.taxa);
            serialOut = port.getOutputStream();
            port.setSerialPortParams(this.taxa,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void desligar() {
        try {
            serialOut.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel fechar porta serial", "Atencao",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void enviaDados(char opcao) {
        try {
            serialOut.write(opcao);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel enviar a informacao", "Atencao",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
} //fim classe
