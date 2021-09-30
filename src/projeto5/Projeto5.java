package projeto5;

import java.util.Scanner;


public class Projeto5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JogoMatemático m1 = new JogoMatemático();
        int count = 0, pontos = 0;
        
        System.out.println("---J-O-G-O--M-A-T-E-M-Á-T-I-C-O---");
        System.out.println("Você só pode errar 3 vezes, resolva os problemas de matemática básica:");
        while(count < 3){
            m1.sortearCalculo();
            System.out.println("Quanto é " + m1.getCalculo() + "?");
            int resposta = Integer.parseInt(input.nextLine());
            
            if(m1.checarResposta(resposta)){
                System.out.println("Acertou");
                pontos++;
            }else{
                System.out.println("Errou, a resposta era: " + m1.getResposta());
                count++;
            }
            
            if(count == 3){
                System.out.println("Você acertou " + pontos + " questões");
            }
            
        }
     
    }

}
