/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reshjed;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Reshjed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> cargos = new HashSet<>();
        
        cargos.add("Gerente");
        cargos.add("Diretor");
        cargos.add("Presidente");
        cargos.add("Secretaria");
        cargos.add("Funcionário");
        cargos.add("Diretor");//repetido!
        
        
        //imprime na tela todos os elementos
        System.out.println(cargos);
        
        
        
        
    }
    
}
