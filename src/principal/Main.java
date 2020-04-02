package principal;
/**
 * Importacion de la clase Circulo
 */
import metodos.Circulo;

/**
 * Programa principal que utiliza metodos auxiliares para el objeto circulo de la clase Circulo
 * @version 1.0
 * @author morillo
 */
public class Main {

    /**
     * Entrada a la funcion principal del proyecto<br>
     * Esta funcion sigue este orden:<br>
     * 1.LLamamos al contructor vacio para crear el objeto <br>
     * 2.Asignamos valores utilizando los setter de los atributos<br>
     * 3.Visualizamos en consola cada uno de los atributos del objeto llamando a los getter<br>
     * 4.Visualizamos el perimetro del circulo llamando al metodo perimetroCirculo()<br>
     * 5.Visualizamos el area del circulo llamando al metodo areCirculo()<br>
     * 6.Movemos el circulo a otras coordenadas y visualizamos esas coordenadas llamando de nuevo a los getter<br>
     * 7.Pasamos el tamaño del circulo a otra escala y visualizamos la medida nueva del radio con el getter del mismo<br>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo=new Circulo();

        circulo.setCentrox(5);
        circulo.setCentroy(10);
        circulo.setRadio(7);

        System.out.print("Coordenada X: ");
        System.out.println(circulo.getCentrox());
        System.out.print("Coordenada Y: ");
        System.out.println(circulo.getCentroy());
        System.out.print("Tamaño Radio: ");
        System.out.println(circulo.getRadio());

        System.out.print("Perimetro: ");
        System.out.println(circulo.perimetroCirculo());

        System.out.print("Area: ");
        System.out.println(circulo.areCirculo());

        circulo.moverCirculo(9, 4);

        System.out.println("Nuevas Coordenadas");
        System.out.print("Coordenada X: ");
        System.out.println(circulo.getCentrox());
        System.out.print("Coordenada Y: ");
        System.out.println(circulo.getCentroy());

        circulo.escalaCirculo(1.5);
        System.out.print("Tamaño radio del circulo a escala 1.5: ");
        System.out.println(circulo.getRadio());
        
        
    }
    
}
