import entities.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.jpa.HibernatePersistenceProvider;
import persistence.CustomPersistenceUnitInfo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory =
//                Persistence.createEntityManagerFactory("my-persistence-unit");

        EntityManagerFactory entityManagerFactory = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(), new HashMap<>());
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            Produto produtoTest = new Produto("Teste Auto Increment");
            entityManager.persist(produtoTest);

            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }
}
