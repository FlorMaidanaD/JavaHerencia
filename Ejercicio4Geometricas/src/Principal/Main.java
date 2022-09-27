
package Principal;

import Entidades.Circulo;
import Entidades.Rectangulos;

public class Main {

   
    public static void main(String[] args) {
        Circulo c=new Circulo(3);
        Rectangulos r=new Rectangulos (2,5);
        c.area();
        c.perimetro();
        r.area();
        r.perimetro();       
        
    }
    
}
