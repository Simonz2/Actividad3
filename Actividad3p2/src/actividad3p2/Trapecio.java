package actividad3p2;

public class Trapecio {
    double basemenor;//atributo que define la base menor del trapecio
    double basemayor;//atributo que define la base mayor del trapecio
    double altura;//atributo que define la altura del trapecio

    //constructor de la clase trapecio
    Trapecio(double basemenor,double basemayor,double altura){
        this.basemenor=basemenor;
        this.basemayor=basemayor;
        this.altura=altura;
    }

    //metodo para calcular y devolver el area del trapecio
    double calculararea(){
        return ((basemayor+basemenor)*altura/2);
    }

    double calcularperimetro(){
        return basemayor+basemenor+2*calcularhipotenusa();
    }
    
    private double calcularhipotenusa(){
        return Math.sqrt(Math.pow((basemayor-basemenor)/2,2)+Math.pow(altura,2));
    }
}
