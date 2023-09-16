package actividad3p2;

public class TrianguloRectangulo {
    double base;//atributo que define la base del triangulo
    double altura;//atributo que define la altura del triangulo

    //constructor de la clase TrianguloRectangulo
    TrianguloRectangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    }

    //metodo que calcula el area del triangulo
    double calculararea(){
        return (base*altura/2);
    }

    //metodo que calcula el perimetro
    double calcularperimetro(){
        return (base+altura+calcularhipotenusa());
    }

    //metodo que calcula la hipotenusa
    double calcularhipotenusa(){
        return Math.pow(base*base+altura*altura,0.5);
    }
    
    String determinartipo(){
        if((base==altura) && (base==calcularhipotenusa())){
            return ("Es un triangulo equilatero");
            //todos los lados iguales
        }
        else if((base!=altura)&&(base!=calcularhipotenusa())&&
        (altura!=calcularhipotenusa())){
            return("Es un triangulo escaleno");
            //todos los lados son diferentes
        }
        else{
            return ("Es un triangulo isosceles");
            //dos lados iguales
        }
    }
    
}
