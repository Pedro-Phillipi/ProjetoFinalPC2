package tf.pc2.persistencia;

import java.util.*;
import tf.pc2.model.*;

public interface ChaleDAO {
	public String inserir(Chale cha);
	public String alterar(Chale cha);
	public String excluir(Chale cha);
	public List<Chale> listarTodos();
	public Chale pesquisaPorCodChale (int codChale);
}
