package tf.pc2.persistencia;

import java.util.List;
import tf.pc2.model.Hospedagem;

public interface HospedagemDAO {
	public String inserir(Hospedagem emp);
	public String alterar(Hospedagem emp);
	public String excluir(Hospedagem emp);
	public List<Hospedagem> listarTodos();
	public Hospedagem pesquisarPorCodHospedagem(int codHospedagem);
}
