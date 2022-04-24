/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ta2.practicandonodos;

/**
 *
 * @author Administrador
 */
public class PracticandoNodos {

    public static void main(String[] args) {
        
        String persona1 = new String("Ana");
        String persona2 = new String("Juan");
        String persona3 = new String("Maria Rosa");
        String persona4 = new String("Luis");
        
        Nodo n1 = new Nodo(persona1);
        Nodo n2 = new Nodo(persona2);
        Nodo n3 = new Nodo(persona3);
        Nodo n4 = new Nodo(persona4);
        
        n1.setNodoSiguiente(n2);
        n2.setNodoSiguiente(n3);
        n3.setNodoSiguiente(n4);
        
        Nodo aux = n1;
        for(int i=0; i<4;i++){
            String aux2 = (String)aux.getContenido();
            System.out.println(aux2);
            aux = aux.getNodoSiguiente();
        }
                
    }
}
