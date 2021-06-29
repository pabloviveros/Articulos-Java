package poorespuesta1u6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PooRespuesta1U6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int precio;
        int cantart;
        String texto;
        int total;
        
        cantart=Integer.parseInt(JOptionPane.showInputDialog("1.Ingrese la cantidad de articulos "));
        precio=Integer.parseInt(JOptionPane.showInputDialog("2.Ingrese el precio unitario "));        
        texto = JOptionPane.showInputDialog (null, "¿Desea agregar mas articulos?\n1.Si\n2.No ",
"showInputDialog",JOptionPane.INFORMATION_MESSAGE);
        
        while("s".equals(texto)||"S".equals(texto)){
        cantart=Integer.parseInt(JOptionPane.showInputDialog("1.Ingrese la cantidad de articulos "));
        precio=Integer.parseInt(JOptionPane.showInputDialog("2.Ingrese el precio unitario "));        
        texto = JOptionPane.showInputDialog (null, "¿Desea agregar mas articulos?\n1.Si\n2.No ",
"showInputDialog",JOptionPane.INFORMATION_MESSAGE);
        } if (texto.equals("N")||texto.equals("n")){
            
        System.out.println("El precio de "+cantart+" articulos es "+precio+" pesos la unidad");
            total=cantart*precio;
            System.out.println("El precio total es "+total);
            JOptionPane.showMessageDialog(null,"El precio total es "+total);
        }
        
        
    }
    
}
