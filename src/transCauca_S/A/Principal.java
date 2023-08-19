package transCauca_S.A;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
        //declaracion de variables
        int codigoBus,modeloBus, op, Cedula, Xp, numeroTiquete;
        String marcaBus, placaBus, nombreCond, apellidoCond, ciudadOrigen, ciudadDestino ;
        double valorTiquete, total;
        //creacion del menu
        JOptionPane.showMessageDialog(null, "BIENVENIDO A TransCauca S.A.\n"
                + "--------MENU DE OPCIONES--------");
        op = Integer.parseInt(JOptionPane.showInputDialog("1) REGISTRAR BUSES\n"
                + "2) REGISTRAR CONDUCTORES\n3) REGISTRAR TIQUETES\n4) AUTORES"));
        
        
        //creacion del switch
        switch(op){
            case 1:
                codigoBus = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL CODIGO DEL BUS"));
                modeloBus = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL MODELO DEL BUS"));
                marcaBus= JOptionPane.showInputDialog("INGRESE LA MARCA DEL BUS");
                placaBus = JOptionPane.showInputDialog("INGRESE LA PLACA DEL BUS");
                marcaBus.toUpperCase();
                marcaBus.toUpperCase();
                
                //creacion del obj de la clase bus
                Bus obj1 = new Bus(codigoBus, modeloBus, marcaBus, placaBus);
                //invocaion del metodo imprimir de la clase bus
                JOptionPane.showMessageDialog(null, obj1.mostrarDatos(codigoBus, modeloBus, marcaBus, placaBus));
                break;
            case 2:
                Cedula = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU NUMERO DE CEDULA"));
                nombreCond = JOptionPane.showInputDialog("INGRESE SU NOMBRE");
                nombreCond.toUpperCase();
                apellidoCond = JOptionPane.showInputDialog("INGRESE SU APELLIDO");
                apellidoCond.toUpperCase();
                Xp = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SUS AÑOS DE EXPERIENCIA"));
                
                //creacion del objeto de la clase conductor
                Conductor obj2 = new Conductor(Cedula, Xp, nombreCond, apellidoCond);
                
                //invocacion del metodo imprimir de la clase conductor
                JOptionPane.showMessageDialog(null,obj2.mostrarDatos1(Cedula, Xp, nombreCond, apellidoCond));
                obj2.mostrarEstado(Xp);
                break;
            case 3:
                //lectura de datos
                ciudadOrigen = JOptionPane.showInputDialog("INGRESE LA CIUDAD DE ORIGEN");
                ciudadDestino = JOptionPane.showInputDialog("INGRESE LA CIUDAD DESTINO");
                valorTiquete = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL TIQUETE"));
                numeroTiquete = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE TIQUETES"));
                ciudadOrigen.toUpperCase();
                ciudadDestino.toUpperCase();
                //creacion del objeto de la clase tiquete
                Tiquete obj3 = new Tiquete(valorTiquete, ciudadOrigen, ciudadDestino, numeroTiquete);
                
                //invocacion de los metodos de la clase tiquete
                JOptionPane.showMessageDialog(null,obj3.mostrarDatos2(valorTiquete, ciudadOrigen, ciudadDestino, numeroTiquete));
                obj3.Calcular(numeroTiquete, valorTiquete);
                obj3.Descuento(numeroTiquete);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "LOS INTEGRANTES QUE REALIZARON EL TALLER SON:\n"
                        + "SANTIAGO MENESES\nPETER STEVEN FERNANDEZ LLANTEN");
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                break;
        }
 
    }
}
