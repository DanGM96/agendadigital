package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.PrestadorServico;

public interface PrestadorServicoDAO {

	/**
	 * 
	 * @param prestadorServico
	 * @return
	 */
	PrestadorServico create(PrestadorServico prestadorServico);

	/**
	 * 
	 * @return
	 */
	List<PrestadorServico> read();

	/**
	 * 
	 * @param prestadorServico
	 * @return
	 */
	PrestadorServico update(PrestadorServico prestadorServico);

	/**
	 * 
	 * @param id
	 */
	void delete(Integer id);

}
