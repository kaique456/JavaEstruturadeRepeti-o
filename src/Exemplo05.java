
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caio.alunos
 */
public class Exemplo05 {
    public static void main(String[] args) {
        // 1 Passo Entrada Variaveis
        
        int numerodigitado, contador = 0;
        
        Scanner sc = new Scanner(System.in);
        
      
        System.out.println("Digite O Fim Do Intervalo");
        numerodigitado = sc.nextInt();
        
        // 2 Passo Processamento
        while (contador <= numerodigitado){
            System.out.println("Numero " + contador);
            contador++;
        }
      
        // 3 Passo Saída
        
        
    }
    
}
