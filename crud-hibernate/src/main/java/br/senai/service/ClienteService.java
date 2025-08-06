package br.senai.service;

import br.senai.DAO.ClienteDAO;
import br.senai.model.Cliente;

import java.util.List;

public class ClienteService {
    private final ClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO = new ClienteDAO();
    }

    public int save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    public boolean deleteById(int idCliente) {
        return clienteDAO.deleteById(idCliente);
    }

    public Cliente findById(int idCliente) {
        return clienteDAO.findClienteById(idCliente);
    }

    public Cliente update(Cliente cliente) {
        return clienteDAO.update(cliente);
    }

    public List<Cliente> getAll() {
        return clienteDAO.getAll();
    }
}
