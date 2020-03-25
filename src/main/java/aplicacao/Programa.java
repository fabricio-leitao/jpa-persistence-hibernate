package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//Instanciando o Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//Instanciando o Entity Manager 
		EntityManager em = emf.createEntityManager();
		
		//buscar um dado no banco de dados
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		System.out.println("Pronto!");
		//Fechando em e emf
		em.close();
		emf.close();
	}
}
