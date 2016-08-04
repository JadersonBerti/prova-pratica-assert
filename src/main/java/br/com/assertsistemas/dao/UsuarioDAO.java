package br.com.assertsistemas.dao;

import java.util.List;

import br.com.assertsitemas.entity.Usuario;

public interface UsuarioDAO {

	/**
	 * Persisti usuario
	 * 
	 * @param usuario
	 */
	public void insert(Usuario usuario);

	/**
	 * Atualiza usuario
	 * 
	 * @param usuario
	 */
	public void update(Usuario usuario);
	
	/**
	 * Delete usuario
	 * 
	 * @param usuario
	 */
	public void delete(Usuario usuario);
	
	/**
	 * Busca o usuario pela id
	 * 
	 * @param usuario
	 * @return Usuario
	 */
	public Usuario findById(Long userId);
	
	/**
	 * Faz um LIKE no nome do usuairo do inicio ao fim '%nome%'
	 * 
	 * @param usuario
	 * @return List<Usuario>
	 */
	public List<Usuario> filterUserByNome(String nome);
	
	/**
	 * Consulta todos os usuarios
	 * 
	 * @param usuario
	 * @return List<Usuario>
	 */
	public List<Usuario> findAll();
	
}
