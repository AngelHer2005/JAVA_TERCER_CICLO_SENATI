
package App_20;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Persona {
    //atributos
    private JTextField nombre;
    private JTextField apellidos;
    private JTextField edad;
    private String tipoTarjeta;

    public Persona(JTextField nombre, JTextField apellidos, JTextField edad, String tipoTarjeta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.tipoTarjeta = tipoTarjeta;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextField getApellidos() {
        return apellidos;
    }

    public void setApellidos(JTextField apellidos) {
        this.apellidos = apellidos;
    }

    public JTextField getEdad() {
        return edad;
    }

    public void setEdad(JTextField edad) {
        this.edad = edad;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
    public String mensaje(String producto, String precio, String tipo){
        String msj = "Hola, señor/a " + nombre.getText() + " " + apellidos.getText() + ".\n"
                + "Usted ha comprado un/a " + producto + " ha " + precio + ", con un método de pago por '" + tipoTarjeta + "' y un tipo de traslado '" + tipo + "'.\n"
                + "¡Qué tenga un buen día!";
        return msj;
    }
    
    public void calcular(String producto, String precio, String tipo){
        boolean validor = false, buc = true;
        try{
            if(!(nombre.getText().isEmpty() || apellidos.getText().isEmpty() || edad.getText().isEmpty()) || (Integer.parseInt(edad.getText()) < 100 && Integer.parseInt(edad.getText()) > 5)){
                if (Integer.parseInt(edad.getText()) < 18 && ("Tarjeta Crédito".equals(tipoTarjeta) || "Tarjeta Débito".equals(tipoTarjeta))) {
                    while (buc) {
                        String pregunta = JOptionPane.showInputDialog( "¿Posees una tarjeta? Un apoderado te envío? (si/no)").toLowerCase();
                        if (null == pregunta) {
                            JOptionPane.showMessageDialog(null, "Ingresa un valor correcto.");
                        }else switch (pregunta) {
                            case "si" -> {
                                validor = !validor;
                                buc = !buc;
                            }
                            case "no" -> buc = !buc;
                            default -> JOptionPane.showMessageDialog(null, "Ingresa un valor correcto.");
                        }
                    }
                }else{
                    validor = !validor;
                }
                if (validor) {
                    JOptionPane.showMessageDialog(null, mensaje(producto, precio, tipo));
                }else{
                    JOptionPane.showMessageDialog(null, "Eres un menor de edad, no puedes ingresar.");
                }
            }else{
                if (Integer.parseInt(edad.getText()) > 100 && Integer.parseInt(edad.getText()) < 5) {
                    JOptionPane.showMessageDialog(null, "Ingresa una edad correcta.");
                }
                JOptionPane.showMessageDialog(null, "Ingresa datos en todos los cuadros");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una edad válida.");
        }
    }
}
