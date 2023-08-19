
package transCauca_S.A;

import javax.swing.JOptionPane;

public class Tiquete {
    //declaracion de atributos
    double valorTiquete, total;
    String ciudadOrigen, ciudadDestino, Datos2;
    int numeroTiquete;
    
    //creacion del metodo constructor

    public Tiquete(double valorTiquete, String ciudadOrigen, String ciudadDestino, int numeroTiquete) {
        this.valorTiquete = valorTiquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.numeroTiquete = numeroTiquete;
    }
    
    public String mostrarDatos2(double valorTiquete,String ciudadOrigen, String CiudadDestino,int numeroTiquete){
        Datos2 = "EL VALOR DEL TIQUETE ES DE:"+valorTiquete+"\nLA CIUDAD DE ORIGEN ES: "+ciudadOrigen+"\nLA CIUDAD DESTINO ES: "
                +ciudadDestino+"\nEL NUMERO DE TIQUETES ES: "+numeroTiquete;
        return Datos2;
    }
    
    public double Calcular(int numeroTiquetes, double valorTiquete){
        total = numeroTiquetes * valorTiquete;
        return total;
    }
    
    public double Descuento(int numeroTiquetel){
        if(numeroTiquete > 5){
            JOptionPane.showMessageDialog(null, "EL NUMERO DE TIQUETES ES MAYOR A 5, POR TANTO"
                    + "SE LE APLICARA UN DESCUENTO DEL 15% AL VALOR A CANCELAR");
            total = total * 0.85;
            JOptionPane.showMessageDialog(null, "EL VALOR A CANCELAR ES DE: "+total);
        }else{
            JOptionPane.showMessageDialog(null, "NO HAY DESCUENTO");
            JOptionPane.showMessageDialog(null, "EL VALOR A CANCELAR ES DE: "+total);
        }
        return total;
    }
    
    
    
}
