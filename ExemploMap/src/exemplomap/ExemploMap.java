/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aluno
 */
public class ExemploMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ContaCorrente c1 = new ContaCorrente();
      cl.deposita(10000);
      ContaCorrente c2 = new ContaCorrente();
      c2.deposita(3000);
      //cria o mapa
      Map<String,ContaCorrente> mapaDeContas = new HashMap<>();
      
      //adiciona duas chaves e seus respctivos valores
      mapaDeContas.put("diretor",c1);
      mapaDeContas.put("gerente",c2);
      
      //qual a conta do diretor? (sem casting!)
      
      ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
      System.out.println(contaDoDiretor.getSaldo());
      
    }
    
}
