package br.senai.DAO;

import br.senai.model.Cliente;
import br.senai.persistence.CustomPersistenceUnitInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.List;

public class ClienteDAO {
    private static final EntityManagerFactory MANAGER_FACTORY;

    static {
        CustomPersistenceUnitInfo persistenceUnitInfo = new CustomPersistenceUnitInfo();

        MANAGER_FACTORY = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(persistenceUnitInfo, persistenceUnitInfo.getProperties());
    }

    public int save(Cliente cliente) {
        EntityManager manager = MANAGER_FACTORY.createEntityManager();

        try {
            manager.getTransaction().begin();

            manager.persist(cliente);

            manager.getTransaction().commit();

            return cliente.getId();
        }
        catch (Exception e) {
            throw new RuntimeException("Falha ao salvar cliente.", e);
        }
        finally {
            if (manager != null && manager.isOpen()) manager.close();
        }
    }

    public boolean deleteById(int idCliente) {
        EntityManager manager = MANAGER_FACTORY.createEntityManager();

        try {
            manager.getTransaction().begin();

            Cliente cliente = manager.find(Cliente.class, idCliente);
            if (cliente == null) return false;

            manager.remove(cliente);

            manager.getTransaction().commit();
            return true;
        }
        catch (Exception e) {
            throw new RuntimeException("Falha ao deletar cliente.", e);
        }
        finally {
            if (manager != null && manager.isOpen()) manager.close();
        }
    }

    public Cliente findClienteById(int idCliente) {
        EntityManager manager = MANAGER_FACTORY.createEntityManager();

        try {
            manager.getTransaction().begin();

            return manager.find(Cliente.class, idCliente);
        }
        catch (Exception e) {
            throw new RuntimeException("Falha ao encontrar cliente.");
        }
        finally {
            if (manager != null && manager.isOpen()) manager.close();
        }
    }

    public Cliente update(Cliente cliente) {
        EntityManager manager = MANAGER_FACTORY.createEntityManager();

        try {
            manager.getTransaction().begin();

            manager.merge(cliente);

            manager.getTransaction().commit();

            return cliente;
        }
        catch (Exception e) {
            throw new RuntimeException("Falha ao editar cliente.", e);
        }
        finally {
            if (manager != null && manager.isOpen()) manager.close();
        }
    }

    public List<Cliente> getAll() {
        EntityManager manager = MANAGER_FACTORY.createEntityManager();

        try {
            manager.getTransaction().begin();

            CriteriaQuery<Cliente> criteriaQuery = manager.getCriteriaBuilder().createQuery(Cliente.class);
            criteriaQuery.from(Cliente.class);

            List<Cliente> listaClientes = manager.createQuery(criteriaQuery).getResultList();

            return listaClientes;
        }
        catch (Exception e) {
            throw new RuntimeException("Falha ao buscar clientes.", e);
        }
        finally {
            if (manager != null && manager.isOpen()) manager.close();
        }
    }
}
