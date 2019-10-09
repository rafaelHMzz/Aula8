package dao;

import java.util.List;

import entity.Brinquedo;

public interface BrinquedoDAO {
	
	void adicionar(Brinquedo b) throws DAOException;

	List<Brinquedo> pesquisar(String nome) throws DAOException;

	void removerPorId(long id) throws DAOException;

}