package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        ContaBancaria conta;
        
        double saldo, valor;

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String opcao = sc.next();

        if (opcao.equals("y") || opcao.equals("Y")) {
            System.out.print("Enter initial deposit value: ");
            saldo = sc.nextDouble();
            conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        } else {
            conta = new ContaBancaria(numeroConta, nomeTitular);
        }
        
        
        do {
            mostrarConta(conta);
            
            System.out.print("\nEnter a deposit value: ");
            valor = sc.nextDouble();
            
            conta.depositarSaldo(valor);
            
            mostrarConta(conta);
            
            System.out.print("\nEnter a withdraw value: ");
            valor = sc.nextDouble();
            
            conta.sacarSaldo(valor);
            
            mostrarConta(conta);
            
            System.out.print("\nDo you wish to continue? ");
            opcao = sc.next();

        } while(opcao.equals("y") || opcao.equals("Y"));
        
        System.out.println("Finished program");
        
        sc.close();
    }
    
    public static void mostrarConta(ContaBancaria conta) {
    	System.out.println(conta);
    }

}