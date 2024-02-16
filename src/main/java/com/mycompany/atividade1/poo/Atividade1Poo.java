/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1.poo;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Atividade1Poo {

    public static void main(String[] args) {
        String nome;
        int faltas, num_vendas;
        double salario, desconto, bonus;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        nome = scan.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        salario = scan.nextDouble();
        System.out.print("Digite a quantidade de faltas do funcionário: ");
        faltas = scan.nextInt();
        System.out.print("Digite quantos produtos o funcionário vendeu: ");
        num_vendas = scan.nextInt();
        
        if(faltas > 5){
            desconto = (15 * salario)/100;
            salario -= desconto;
        }
        else{
            desconto = 0.00;
        }
        
        if(num_vendas > 20){
            bonus = 13 * num_vendas;
        }
        else{
            bonus = 10 * num_vendas;
        }
        salario += bonus;
        
        System.out.println("Nome do Funcionário: "+nome);
        System.out.println("Desconto por Faltas: R$"+desconto);
        System.out.println("Bonus Recebido: R$"+bonus);
        System.out.println("Salario Final: R$"+salario);
    }
}
