package br.senai;

import br.senai.controller.ClienteController;
import br.senai.model.Cliente;

import java.util.Scanner;

public class Main {
    final private static Scanner scan = new Scanner(System.in);
    final private static ClienteController clienteController = new ClienteController();

    public static void main(String[] args) {
        int opcao = 0;
        do {
            mostrarMenu();

            opcao = scan.nextInt();
            scan.nextLine();

            escolheOpcao(opcao);
        } while (opcao != 0);

        scan.close();
    }

    private static void mostrarMenu() {
        System.out.print("""
                
                ========== Menu ==========
                0. Encerrar programa
                1. Salvar cliente
                2. Deletar cliente
                3. Editar cliente
                4. Listar clientes
                Opção:\s""");
    }

    private static void escolheOpcao(int opcao) {
        switch (opcao) {
            case 0:
                System.out.println();
                break;

            case 1:
                saveCliente();
                break;

            case 2:
                deleteClienteById();
                break;

            case 3:
                updateCliente();
                break;

            case 4:
                getClientes();
                break;

            default:
                System.out.println("\nOpção inválida.");
                break;
        }
    }

    private static void saveCliente() {
        System.out.println("\n========== Salvar cliente ==========");

        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Telefone: ");
        String telefone = scan.nextLine();

        System.out.print("Email: ");
        String email = scan.nextLine();

        System.out.println("\n" + clienteController.save(nome, telefone, email));
    }

    private static void deleteClienteById() {
        System.out.println("\n========== Deletar cliente pelo ID ==========");

        System.out.print("ID cliente: ");
        String idClienteString = scan.nextLine();

        System.out.println("\n" + clienteController.deleteById(idClienteString));
    }

    private static void updateCliente() {
        System.out.println("\n========== Editar cliente ==========");

        System.out.print("ID cliente para editar: ");
        String idClienteString = scan.nextLine();

        Cliente cliente = clienteController.findById(idClienteString);
        if (cliente == null) {
            System.out.println("\nCliente não encontrado.");
            return;
        }
        System.out.println("\n=== Dados salvos ===");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());

        System.out.println("\n=== Editar dados ===");
        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Telefone: ");
        String telefone = scan.nextLine();

        System.out.print("Email: ");
        String email = scan.nextLine();

        System.out.println(clienteController.update(idClienteString, nome, telefone, email));
    }

    private static void getClientes() {
        System.out.println("\n========== Lista de clientes ==========");

        System.out.println("\n" + clienteController.getAll());
    }
}
