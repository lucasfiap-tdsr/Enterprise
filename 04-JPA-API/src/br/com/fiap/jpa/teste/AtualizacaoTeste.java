package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Bebida;

public class AtualizacaoTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica =
			Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = fabrica.createEntityManager();
		
		Bebida bebida = em.find(Bebida.class, 1);
		
		bebida.setNome("Morango");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}
}
