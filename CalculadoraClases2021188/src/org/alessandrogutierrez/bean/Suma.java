package org.alessandrogutierrez.bean;

public class Suma {
    //  1 ) atributos - Caracteristicas que tendra la clase
    private double num1;
    private double num2;
    
    //  2 ) Constructor Nulo
    public Suma (){
        
    }
    // 2 ) Constructor con argumentos
     public Suma (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
     
    // 3 ) Métodos de acceso
    // # --------------- Num 1 ------------------ #
    public double getNum1 (){
        return num1;
    }
    
    public void setNum1 (double num1){
        this.num1 = num1;
    }
    // # --------------- Num 2 ------------------ #
    public double getNum2 () {
        return num2;
    }
    
    public void setNum2 (double num2) {
        this.num2 = num2;
    }
    
    public double sumatoria (double num1, double num2){ //Función
        double result = num1 + num2;
        return result;
    }
    
    
    
}
