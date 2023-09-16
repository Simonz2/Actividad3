package actividad3p2;

public class Rectangulo {
    double base; //atributo que define la base del rectangulo
    double altura;//atributo que define la altura del rectangulo

    //constructor de la clase Rectangulo
    Rectangulo(double base, double altura){
        //parametros que definen la base y la altura 
        this.base=base;
        this.altura=altura;
    }

    //metodo que calcula y 
    //devuelve el area del rectangulo
    double calculararea(){
        return base*altura;
    }

    double calcularperimetro(){
        return (2*base)+(2*altura);
    }
    
}
