package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entity.PrestadorServico;

public interface PrestadorServicoBusiness {

	/**
	 * 
	 * @param prestadorServico
	 * @return
	 * @throws BusinessException
	 */
	PrestadorServico create(PrestadorServico prestadorServico) throws BusinessException;

	/**
	 * 
	 * @return
	 * @throws BusinessException
	 */
	List<PrestadorServico> read() throws BusinessException;

	/**
	 * 
	 * @param prestadorServico
	 * @return
	 * @throws BusinessException
	 */
	PrestadorServico update(PrestadorServico prestadorServico) throws BusinessException;

	/**
	 * 
	 * @param id
	 * @throws BusinessException
	 */
	void delete(Integer id) throws BusinessException;

}
