package examen2mariorodriguez;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Formulario {
    private static String Nombre, Correo, Carro;
    private static int Edad;

    
        private static ArrayList<String> nombre = new ArrayList<String>();
        private static ArrayList<String> correo = new ArrayList<String>();
        private static ArrayList<String> carro = new ArrayList<String>();
        private static ArrayList<String> edad = new ArrayList<String>();

    public static void setNombre(String vnombre) {
        Formulario.Nombre = vnombre;
    }

    public static void setCorreo(String vcorreo) {
        Formulario.Correo = vcorreo;
    }

    public static void setCarro(String vcarro) {
        Formulario.Carro = vcarro;
    }

    public static void setEdad(float vedad) {
        Formulario.Edad = (int) vedad;
    }
        
        
public static void Edad(){
    int vedad = 0;
    if (vedad < 18 && vedad > 50) {
      JOptionPane.showMessageDialog(null, "EDAD INVALIDA");
    }
}
    
    public static void Codigo(){
        int cont = 0;
        cont = cont + 1;
        
    }
    
    
    
    
    
}
