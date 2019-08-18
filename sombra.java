import java.util.Scanner;

/**
 * Programa para area sombreada de circulo
 * 
 * @author Carlos Alvarez 
 * @version 20190817
 */
public class sombra
{
    public static void main(String[] args)
    {
        double r, l1cu, l2cu;
        double asom;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Por favor, ingrese el radio (r) del circulo");
        r = Teclado.nextDouble();
        
        l1cu = r*2;
        l2cu = l1cu;
        asom = ((l1cu*l2cu)-(Math.PI*Math.pow(r,2)))/2;
        
        System.out.println("el area sombreada es " + asom);
    }
}
