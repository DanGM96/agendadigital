package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entity.Cidade;
import br.com.iftm.enums.Estado;

public interface CidadeBusiness {

	/**
	 * Metodo responsavel por garantir os parametros obrigatorios, bem como
	 * solicitar a camada de acesso a dados que persista o Objeto {@link Cidade}.
	 * 
	 * @param cidade Objeto a ser persistido.
	 * @return Objeto persistido.
	 * @throws BusinessException
	 */
	Cidade create(Cidade cidade) throws BusinessException;

	/**
	 * Metodo responsavel por recuperar dabase de dados todos os objetos
	 * {@link Cidade}.
	 * 
	 * @return Lista de {@link Cidade}.
	 * @throws BusinessException
	 */
	List<Cidade> read() throws BusinessException;

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objetos
	 * {@link Cidade}, cujo seu nome possua parte do parametro estado.
	 * 
	 * @param estado Parte do nome a ser buscado.
	 * @return Lista de {@link Cidade};
	 * @throws BusinessException
	 */
	List<Cidade> readByEstado(Estado estado) throws BusinessException;

	/**
	 * Metodo responsavel por persistir (atualizar) na base de dados o objeto
	 * {@link Cidade}.
	 * 
	 * @param cidade Objeto a ser persistido.
	 * @return Objeto persistido.
	 * @throws BusinessException
	 */
	Cidade update(Cidade cidade) throws BusinessException;

	/**
	 * Metodo responsavel por excluir da base de dados o objeto {@link Cidade}
	 * referente ao id informado.
	 * 
	 * @param id
	 * @throws BusinessException
	 */
	void delete(Integer id) throws BusinessException;

}
