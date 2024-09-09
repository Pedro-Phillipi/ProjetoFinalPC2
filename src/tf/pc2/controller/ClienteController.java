package tf.pc2.controller;

import java.util.List;

import tf.pc2.model.Cliente;
import tf.pc2.persistencia.ClienteDAOImp;

public class ClienteController {
	public String inserir(Cliente emp){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.inserir(emp);
	}
	
	public String alterar(Cliente emp) {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.alterar(emp);
	}
	
	public String excluir(Cliente emp){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.excluir(emp);
	}
	
	public List<Cliente> listarTodos(){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.listarTodos();
	}
	
	public Cliente pesquisarPorCodCliente(int codCliente){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.pesquisarPorCodCliente(codCliente);
	}
}
