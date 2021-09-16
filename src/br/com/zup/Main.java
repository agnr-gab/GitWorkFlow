package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Crie um programa para gerenciar uma lista de funcionários de uma empresa, cada funcionário tem nome, telefone, email e CPF. No final do programa deve ser exibida a lista de funcionários cadastrados.
	 */
        //HashMap listaFuncionários
        Map<String, String> listaFuncionarios = new HashMap<String, String>();
        //Inicio do Scanner
        Scanner leitorFuncionarios = new Scanner(System.in);

        //Variáveis
        String nome = "Maria Ferraz da Silva Souza";
        String telefone = "55+61+999-999-999";
        String email = "email@email.com.br";
        String cpf = "761.350.300-35";
        // Mensagens para o usuário
        System.out.println("-----Sistema de Cadastro de Funcionários-----");
        while (true) {
            //Menu de opções
            System.out.println("Para ---cadastrar--- funcionário, DIGITE 1.");
            System.out.println("Para ---verificar--- funcionários cadastrados, DIGITE 2.");
            System.out.println("Para ---encerrar--- o programa, DIGITE 3.");
            int opcaoEscolhida = leitorFuncionarios.nextInt(); //opção escolhida pelo usuário
            leitorFuncionarios.nextLine(); //limpar o buffer
            // Condições do programa
            // Exibirá formulário de cadastro dos funcionários (opção 1)
            if (opcaoEscolhida == 1) {
                System.out.println("Insira o nome do funcionario:");
                nome = leitorFuncionarios.nextLine();
                System.out.println("Insira o telefone do funcionario:");
                telefone = leitorFuncionarios.nextLine();
                System.out.println("Insira o e-mail do funcionario:");
                email = leitorFuncionarios.nextLine();
                System.out.println("Insira o CPF do funcionario:");
                cpf = leitorFuncionarios.nextLine();
                listaFuncionarios.put(cpf, nome + telefone + email + "\n");
                System.out.println("Cadastro realizado com sucesso!!!");
            }
            //Exibirá a lista dos funcionários previamente cadastrados (opção 2)
            if (opcaoEscolhida == 2) {
                System.out.println("Lista de funcionários já cadastrados: ");
                listaFuncionarios.put(cpf, " | " + "Nome: " + nome + " | " + "Telefone: " + telefone + " | " + "E-mail: " + email + "\n");
                System.out.println(listaFuncionarios);
                System.out.print("\n"); //saltar uma linha
            }
            //Exibirá mensagem de erro caso o usuário digite uma opção inválida de menu
            if (opcaoEscolhida > 3 || opcaoEscolhida < 1) {
                System.out.println("Opção de entrada inválida. Verifique novamente!");//finaliza o programa
            }
            //Programa é finalizado quando usuário digita a opção 3
            if (opcaoEscolhida == 3) {
                break;
            }
        }
    }
}
