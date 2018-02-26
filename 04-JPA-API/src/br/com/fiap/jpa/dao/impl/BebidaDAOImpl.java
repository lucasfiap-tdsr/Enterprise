package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.BebidaDAO;
import br.com.fiap.jpa.entity.Bebida;

public class BebidaDAOImpl implements BebidaDAO {

	private EntityManager em;
	
	public BebidaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public Bebida cadastrar(Bebida bebida) {
		em.persist(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
		return bebida;
	}

	@Override
	public Bebida atualizar(Bebida bebida) {
		em.merge(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
		return bebida;
	}

	@Override
	public void remover(int codigo) {
		Bebida bebida = buscar(codigo);
		em.remove(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	@Override
	public Bebida buscar(int codigo) {
		return em.find(Bebida.class, codigo);
	}
	
}