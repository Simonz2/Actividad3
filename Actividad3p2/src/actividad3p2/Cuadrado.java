package actividad3p2;

public class Cuadrado {
    double lado;//atributo que define el lado del cuadrado

    //constructor de la clase cuadrado
    Cuadrado(double lado){
        this.lado=lado;
    }
    
    double calculararea(){
        //metodo para clacular el area del cuadrado
        return Math.pow(lado,2);
    }

    double calcularperimetro(){
        //metodo para calcular el perimetro del cuadrado
        return 4*lado;
    }

}
