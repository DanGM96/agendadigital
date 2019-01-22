package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.TipoServico;

public interface TipoServicoDAO {

	/**
	 * Metodo responsavel por persistir o objeto {@link TipoServico} na base de
	 * dados.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 */

	TipoServico create(TipoServico tipoServico);

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objetos
	 * {@link TipoServico}.
	 * 
	 * @return Lista de {@link TipoServico}.
	 */
	List<TipoServico> read();

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objetos
	 * {@link TipoServico}, cujo seu nome ossua parte do parametro Nome.
	 * 
	 * @param nome Parte do nome a ser buscado.
	 * @return Lista de {@link TipoServico}.
	 */
	List<TipoServico> readByName(String nome);

	/**
	 * Metodo responsavel por persistir (atualizar) na base de dados o bojeto
	 * {@link TipoServico}.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 */
	TipoServico update(TipoServico tipoServico);

	/**
	 * Metodo responsavel por excluir da base de dados o objeto {@link TipoServico}
	 * referente ao id informado.
	 * 
	 * @param id
	 */
	void delete(Integer id);
}
