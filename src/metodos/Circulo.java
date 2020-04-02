package metodos;
/**
 *@version 1.0
 * @author morillo
 */
public class Circulo {
/**
 *
 * @param centrox atributo referente a la coordenada x
 * @param centroy atributo referente a la coordenada y
 * @param radio atributo referente a la medida del radio
 */
    private double centrox;
    private double centroy;
    private double radio;
/**
 *
 * Constructor vacio del circulo
 */
    public Circulo() {
    }
/**
 *
 * Constructor con los atributos del circulo
 * @param x valor de la coordenada x
 * @param y valor de la coordenada y
 * @param r tamaño del radio
 */
    public Circulo(double x, double y, double r) {
        centrox = x;
        centroy = y;
        radio = r;
    }
/**
 *
 * Getter de la coordenada x<br>
 * Devuelve el valor del atributo centrox
 * @return centrox
 */
    public double getCentrox() {
        return centrox;
    }
/**
 *
 * Setter de la coordenada x<br>
 * Cambia de valor del atributo centrox
 * @param centrox valor de la coordenada x
 */
    public void setCentrox(double centrox) {
        this.centrox = centrox;
    }
/**
 *
 * Getter de la coordenada y<br>
 * Devuelve el valor del atributo centroy
 * @return centroy
 */
    public double getCentroy() {
        return centroy;
    }
/**
 *
 * Setter de la coordenada y<br>
 * Cambia de valor del atributo centroy
 * @param centroy valor de la coordenada y
 */
    public void setCentroy(double centroy) {
        this.centroy = centroy;
    }
/**
 *
 * Getter del radio<br>
 * Devuelve el valor del atributo radio
 * @return radio
 */
    public double getRadio() {
        return radio;
    }
/**
 *
 * Setter del radio<br>
 * Cambia de valor del atributo radio
 * @param radio valor del radio
 */
    public void setRadio(double radio) {
        this.radio = radio;
    }
/**
 *Metodo que convierte a string los valores del circulo
 * @return super.toString()
 */
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
/**
 *Metodo que devuelve el perimetro del circulo
 * @return perimetro
 */
    public double perimetroCirculo(){
        double perimetro=2*Math.PI*this.radio;
        return perimetro;
    }
/**
 * Metodo que devuelve el area del circulo
 * @return area
 */
    public double areCirculo(){
        double area=Math.PI*this.radio*this.radio;
        return area;
    }
/**
 *Metodo que mueve las coordenadas del centro del circulo en el espacio
 * @param deltax nuevo valor de la coordenada x
 * @param deltay nuevo valor de la coordenada y
 */
    public void moverCirculo(double deltax, double deltay){
        this.centrox=deltax;
        this.centroy=deltay;
    }
/**
 *Metodo que convierte el valor del radio a la escala indicada
 * @param s escala del circulo
 */
    public void escalaCirculo(double s){
        this.radio=radio/s;
    }
}
