package br.senai.controller;

import br.senai.model.Cliente;
import br.senai.service.ClienteService;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }

    public String save(String nome, String telefone, String email) {
        if (nome == null || nome.isBlank()) return "O nome deve ser preenchido.";
        if (telefone == null || telefone.isBlank()) return "O telefone deve ser preenchido.";
        if (email == null || email.isBlank()) return "O endereço deve ser preenchido.";

        if (telefone.length() > 15) return "Telefone inválido.";

        try {
            Cliente cliente = new Cliente(nome, telefone, email);

            int idCliente = clienteService.save(cliente);

            return "Cliente salvo com ID: " + idCliente;
        }
        catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    public String deleteById(String idClienteString) {
        if (idClienteString == null || idClienteString.isBlank()) return "O ID deve ser preenchido.";

        try {
            int idCliente = Integer.parseInt(idClienteString);

            if (clienteService.deleteById(idCliente))
                return "Cliente deletado.";

            return "Cliente não encontrado.";
        }
        catch (NumberFormatException e) {
            return "Digite um número válido.";
        }
        catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    public Cliente findById(String idClienteString) {
        if (idClienteString == null || idClienteString.isBlank())
            return null;

        try {
            int idCliente = Integer.parseInt(idClienteString);

            return clienteService.findById(idCliente);
        }
        catch (RuntimeException e) {
            return null;
        }
    }

    public String update(
            String idClienteString, String nome, String telefone, String email
    ) {
        if (telefone.length() > 15) return "Telefone inválido.";

        try {
            Cliente cliente = findById(idClienteString);

            cliente.setNome(nome);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);

            cliente = clienteService.update(cliente);

            return String.format("""
                    
                    === Novos dados ===:
                    Nome: %s
                    Telefone: %s
                    Email: %s""",
                    cliente.getNome(), cliente.getTelefone(), cliente.getEmail());
        }
        catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    public String getAll() {
        try {
            List<Cliente> listaClientes = clienteService.getAll();

            if (listaClientes.isEmpty()) return "Não existem clientes cadastrados.";

            String listaClientesString = listaClientes
                    .stream().map(Cliente::toString)
                    .collect(Collectors.joining("\n"));

            return listaClientesString;
        }
        catch (RuntimeException e) {
            return e.getMessage();
        }
    }
}
