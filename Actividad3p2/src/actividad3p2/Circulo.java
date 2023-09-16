package actividad3p2;

public class Circulo {
    double radio;//atributo de radio del circulo

    Circulo(double radio){//constructor de la clase circulo
        this.radio=radio;
    }

    double calculararea(){//metodo para calcular el area
        // y devolver el area
        return Math.PI*Math.pow(radio,2);
    }
    
    double calcularperimetro(){//metodo para calcular el perimetro
        //y devolver el perimetro
        return Math.PI*2*radio;
    }
}
