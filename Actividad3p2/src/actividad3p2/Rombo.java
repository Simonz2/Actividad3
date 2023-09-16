package actividad3p2;

public class Rombo {
    double diagonalmenor;//atributo que define la diagonal menor del rombo
    double diagonalmayor;//atributo que define la diagonal mayor del rombo

    //constructor de la clase Rombo
    Rombo(double diagonalmayor,double diagonalmenor){
        this.diagonalmayor=diagonalmayor;
        this.diagonalmenor=diagonalmenor;
    }

    //metodo para calcular y devolver el area
    double calculararea(){
        return diagonalmenor*diagonalmayor/2;
    }

    //metodo para calcular el perimetro de un rombo
    double calcularperimetro(){
        return 4*calcularlado();
    }

    private double calcularlado(){
        return Math.sqrt(Math.pow(diagonalmenor/2,2)+Math.pow(diagonalmayor/2,2));
    }
}
