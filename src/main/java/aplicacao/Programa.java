package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		//Instanciando o Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//Instanciando o Entity Manager 
		EntityManager em = emf.createEntityManager();
		//Declarando a transação e abrindo ela
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		//Dando commit na transação
		em.getTransaction().commit();
		System.out.println("Pronto!");
		//Fechando em e emf
		em.close();
		emf.close();
	}
}
