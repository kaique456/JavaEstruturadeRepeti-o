/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caio.alunos
 */
public class Exmplo04 {
    public static void main(String[] args) {
        System.out.println("Exemolo While Com Continue");
        
        int contador = 0;
        
        while (contador < 6){
            contador ++;
            
            if (contador == 3) {
                continue;
            }
            System.out.println("Contador: " + contador);
        }
    }
}
