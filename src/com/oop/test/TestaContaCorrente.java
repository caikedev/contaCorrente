package com.oop.test;
import java.util.Scanner;

import com.oop.domain.ContaCorrente;

public class TestaContaCorrente {
    private void showMenu(){
        System.out.println("\n\n");
        System.out.println("+----------------------------------------+");
        System.out.println("|          Selecione uma Op��o           |");
        System.out.println("+----------------------------------------+");
        System.out.println("|                                        |");
        System.out.println("|   1 - Sacar                            |");
        System.out.println("|   2 - Depositar                        |");
        System.out.println("|   3 - Imprimir dados da Conta          |");
        System.out.println("|   4 - Exibir op��es                    |");
        System.out.println("|   0 - Sair                             |");
        System.out.println("|                                        |");
        System.out.println("| OBS: Os testes s�o realizados com uma  |");
        System.out.println("|      conta exclusiva para testes       |");
        System.out.println("+----------------------------------------+");
    }
 
    private void showSacar(ContaCorrente c, TestaContaCorrente m, Scanner r){
        System.out.print("Sacar: ");
        double valor = r.nextDouble();
        

        if(valor != 0){

            if (c.sacar(valor) == 1)
                System.out.println("Saque realizado com sucesso!");
            else
                System.out.println("O saque n�o foi realizado. Verifique o saldo da conta!");
        } else {
            System.out.println("Voc� deve informar um valor maior do que 0");
            m.showSacar(c, m, r);
        }
                
    }

    private void showDepositar(ContaCorrente c, Scanner r){
        
        //Scanner r = new Scanner(System.in);

        System.out.print("Depositar: ");
        c.depositar(r.nextDouble());
    }

    private void showImprimir(ContaCorrente c){

        c.imprimir();
    }
    public static void main(String[] args) {
        
        TestaContaCorrente m = new TestaContaCorrente();
        Scanner r = new Scanner(System.in);
        ContaCorrente c = new ContaCorrente();
        short option;

        do{
            m.showMenu();

            System.out.print("Digite o n�mero da op��o e tecle [Enter]: ");
            option = r.nextShort();

            switch(option) {
                case 1:
                    m.showSacar(c, m, r);
                break;
                case 2:
                    m.showDepositar(c, r);
                break;
                case 3:
                    c.imprimir();
                break;
                case 4:
                    m.showMenu();
                break;
                default:
                    m.showMenu();
                break;
            }
        } while(option != 0);
    }
}
