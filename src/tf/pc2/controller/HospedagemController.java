package tf.pc2.controller;

import java.util.List;

import tf.pc2.model.Hospedagem;
import tf.pc2.persistencia.HospedagemDAOImp;

public class HospedagemController {
	public String inserir(Hospedagem emp){
		HospedagemDAOImp dao = new HospedagemDAOImp();
		return dao.inserir(emp);
	}
	
	public String alterar(Hospedagem emp) {
		HospedagemDAOImp dao = new HospedagemDAOImp();
		return dao.alterar(emp);
	}
	
	public String excluir(Hospedagem emp){
		HospedagemDAOImp dao = new HospedagemDAOImp();
		return dao.excluir(emp);
	}
	
	public List<Hospedagem> listarTodos(){
		HospedagemDAOImp dao = new HospedagemDAOImp();
		return dao.listarTodos();
	}
	
	public Hospedagem pesquisarPorCodHospedagem(int codHospedagem){
		HospedagemDAOImp dao = new HospedagemDAOImp();
		return dao.pesquisarPorCodHospedagem(codHospedagem);
	}
}