
package co.edu.ims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conjuntos {


    public static void main(String[] args) {
       Set<String> conjunto = new HashSet<>();
       String actor1 = "Chespirito";
       String actor2 = "Audrey Tatoo";
       String actor3 = "Megan Fox";
       String actor4 = "Arnol Scharzenegger";
       
       conjunto.add(actor1);
       conjunto.add(actor2);
       conjunto.add(actor3);
       conjunto.add(actor4);
       conjunto.add(actor2);
       conjunto.add(actor3);
       
      
       System.out.println(conjunto);
        System.out.println("Tamaño: "+conjunto.size());
    
    }
    
}

