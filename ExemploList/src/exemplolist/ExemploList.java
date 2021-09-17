
package exemplolist;
import java.util.ArrayList;
import java.util.List;




public class ExemploList {
    public static void main(String[] args) {
       List nomes = new ArrayList();
       nomes.add("Salazar");
       nomes.add("Arina");
       nomes.add("Jack");
       nomes.add("Grinderwald");
       nomes.add("Dante");
       
       for(int cont = 0; cont < nomes.size();cont++){
       String nome = (String) nomes.get(cont);
       System.out.println(nome);
       
       
       }
       
       
    }
    
}
