package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.Cidade;
import br.com.iftm.entity.TipoServico;
import br.com.iftm.enums.Estado;

public interface CidadeDAO {

	/**
	 * Metodo responsavel por persistir o objeto {@link TipoServico} na base de
	 * dados.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 */
	Cidade create(Cidade cidade);

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objetos
	 * {@link Cidade}.
	 * 
	 * @return Lista de {@link TipoServico}.
	 */
	List<Cidade> read();

	/**
	 * 
	 * @param estado
	 * @return
	 */
	List<Cidade> readByEstado(Estado estado);

	/**
	 * Metodo responsavel por persistir (atualizar) na base de dados o bojeto
	 * {@link Cidade}.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 */
	Cidade update(Cidade cidade);

	/**
	 * Metodo responsavel por excluir da base de dados o objeto {@link TipoServico}
	 * referente ao id informado.
	 * 
	 * @param id
	 */
	void delete(Integer id);

}
