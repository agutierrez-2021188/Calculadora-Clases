/*
    Nombre: Alessandro Emanuel Gutiérrez Boc
    Código Técnico: IN5AV
    Carné: 2021-188
    Fecha de Creación: 16/03/2022
    Fecha de Modificación:
 */
package org.alessandrogutierrez.system;
import org.alessandrogutierrez.bean.Salir;
import javax.swing.JOptionPane;
import org.alessandrogutierrez.bean.Division;
import org.alessandrogutierrez.bean.Multiplicacion;
import org.alessandrogutierrez.bean.Resta;
import org.alessandrogutierrez.bean.Suma;

public class Principal {

    public static void main(String[] args) {
    
        int opcion=0;
        JOptionPane.showMessageDialog(null, "Alessandro Emanuel Gutiérrez Boc","Programador",JOptionPane.WARNING_MESSAGE );
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "MENU PRINCIPAL\n"
            + "1 --- Suma\n" 
            + "2 --- Resta\n"
            + "3 --- Multiplicacion\n"
            + "4 --- Division\n"
            + "5 --- Salir\n"
            + "ELIJA SU OPCION : ") );  
            
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "1 --- Suma");
                    Suma suma = new Suma (0,0);
                    suma.setNum1(Double.parseDouble (JOptionPane.showInputDialog(null,"Ingrese el primer valor: ")));
                    suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor : ")));
                    JOptionPane.showMessageDialog(null,"La suma es: "+ String.valueOf(suma.sumatoria(suma.getNum1(), suma.getNum2())));
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, "2 --- Resta");
                    Resta resta = new Resta (0,0);
                    resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor :")));
                    resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor :")));
                    JOptionPane.showMessageDialog(null, "La resta es: "+ String.valueOf(resta.restando(resta.getNum1(), resta.getNum2())));
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "3 --- Multiplicacion");
                    Multiplicacion multiplicar = new Multiplicacion (0,0);
                    multiplicar.setValor1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor :")));
                    multiplicar.setValor2(Double.parseDouble (JOptionPane.showInputDialog(null,"Ingrese el segundo valor :")));
                    JOptionPane.showMessageDialog(null,"La multiplicacion es: "+String.valueOf(multiplicar.multiplicando
                        (multiplicar.getValor1(),multiplicar.getValor2())));
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "4 --- Division");
                    Division division = new Division (0,0);
                    division.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor :")));
                    division.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor :")));
                    if (division.getNum2() != 0)
                        JOptionPane.showMessageDialog(null,"El resultado de la division es: " +String.valueOf
                            (division.dividiendo(division.getNum1(), division.getNum2())));
                    else 
                         JOptionPane.showMessageDialog(null,"¡¡ ERROR !!\n"
                            + "El segundo valor no puede ser 0");
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo . . . .");
                    opcion = 5;
                    Salir salida = new Salir ();
                    salida.saliendo();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida\n");
                    JOptionPane.showMessageDialog(null, "Por favor, elige otra opción . . . ");
                    break;    

            }
            
        } while (opcion != 5);
    }
    
}
