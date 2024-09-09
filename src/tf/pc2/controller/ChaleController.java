package tf.pc2.controller;

import java.util.List;

import tf.pc2.model.Chale;
import tf.pc2.persistencia.ChaleDAOImp;

public class ChaleController {
	public String inserir(Chale emp){
		ChaleDAOImp dao = new ChaleDAOImp();
		return dao.inserir(emp);
	}
	
	public String alterar(Chale emp) {
		ChaleDAOImp dao = new ChaleDAOImp();
		return dao.alterar(emp);
	}
	
	public String excluir(Chale emp){
		ChaleDAOImp dao = new ChaleDAOImp();
		return dao.excluir(emp);
	}
	
	public List<Chale> listarTodos(){
		ChaleDAOImp dao = new ChaleDAOImp();
		return dao.listarTodos();
	}
	
	public Chale pesquisarPorCodChale(int codChale){
		ChaleDAOImp dao = new ChaleDAOImp();
		return dao.pesquisaPorCodChale(codChale);
	}
}
