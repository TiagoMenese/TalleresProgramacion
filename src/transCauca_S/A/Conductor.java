
package transCauca_S.A;

import javax.swing.JOptionPane;

public class Conductor {
    //declaracion de atributos
    int Cedula, Xp;
    String nombreCond, apellidoCond, Datos1, Estado;
    
    //creacion del metodo constructor de la clase constructor

    public Conductor(int Cedula, int Xp, String nombreCond, String apellidoCond) {
        this.Cedula = Cedula;
        this.Xp = Xp;
        this.nombreCond = nombreCond;
        this.apellidoCond = apellidoCond;
    }
    
    //creacion de la funcion con retorno
    public String mostrarDatos1(int Cedula, int Xp, String nombreCond, String apellidoCond){
        Datos1 = "EL NUMERO DE CEDULA DEL CONDUCTOR ES: "+Cedula+ " "+"\nEL NOMBRE DEL CONDUCTOR ES: " + nombreCond
                +"\nEL APELLIDO DEL CONDUCTOR ES: "+apellidoCond+ " " +"\nLA EXPERIENCIA ES DE: " +Xp+" AÑOS";
        return Datos1;
    }
    
    public String mostrarEstado(int Xp){
        if(Xp > 30){
            JOptionPane.showMessageDialog(null, "EL CONDUCTOR ESTA PROXIMO A PENSIONARSE");
        }else{
            JOptionPane.showMessageDialog(null, "EL CONDUCTOR ESTA ACTIVO");
        }
        return Estado;
    }
    
    
}
