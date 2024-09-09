package tf.pc2.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import tf.pc2.model.Hospedagem;

public class HospedagemDAOImp implements HospedagemDAO{

	@Override
	public String inserir(Hospedagem emp) {
		String sql = "insert into Hospedagem(codHospedagem,codChale,codCliente,estado, dataInicio, dataFim,qtdPessoas,desconto,valorFinal)values (?,?,?,?,?,?,?,?,?)";
		Connection con = ConnectionFactory.getConnection();
		try{
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, emp.getCodHospedagem());
		pst.setInt(2, emp.getCodChale());
		pst.setInt(3, emp.getCodCliente());
		pst.setString(4, emp.getEstado());
		pst.setObject(5, emp.getDataInicio());
		pst.setObject(6, emp.getDataFim());
		pst.setInt(7, emp.getQtdPessoas());
		pst.setDouble(8, emp.getDesconto());
		pst.setDouble(9, emp.getValorFinal());
		int res = pst.executeUpdate();
		if(res > 0){
			return "Inserido com sucesso.";
			}else{
			return "Erro ao inserir.";
			}
			}catch(SQLException e){
			return e.getMessage();
			}finally {
			ConnectionFactory.close(con);
			}
		}

	@Override
	public String alterar(Hospedagem emp) {
		String sql = "update Hospedagem set codChale=?,codCliente=?,estado=?, dataInicio=?, dataFim=?,qtdPessoas=?,desconto=?,valorFinal=? where codHospedagem=?";
		Connection con = ConnectionFactory.getConnection();
		try{
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, emp.getCodChale());
		pst.setInt(2, emp.getCodCliente());
		pst.setString(3, emp.getEstado());
		pst.setObject(4, emp.getDataInicio());
		pst.setObject(5, emp.getDataFim());
		pst.setInt(6, emp.getQtdPessoas());
		pst.setDouble(7, emp.getDesconto());
		pst.setDouble(8, emp.getValorFinal());
		pst.setInt(9, emp.getCodHospedagem());
		int res = pst.executeUpdate();
		if(res > 0){
			return "Alterado com sucesso.";
		}else{
			return "Erro ao alterar.";
		}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}

	@Override
	public String excluir(Hospedagem emp) {
		String sql = "delete from Hospedagem where codHospedagem=?";
		Connection con = ConnectionFactory.getConnection();
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, emp.getCodHospedagem());
			int res = pst.executeUpdate();
			if(res > 0){
				return "Excluído com sucesso.";
			}else{
				return "Erro ao excluir.";
			}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}

	@Override
	public List<Hospedagem> listarTodos() {
		String sql = "select * from Hospedagem";
		Connection con = ConnectionFactory.getConnection();
		List<Hospedagem> lista = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Hospedagem ep = new Hospedagem();
					ep.setCodHospedagem(rs.getInt(1));
					ep.setCodChale(rs.getInt(2));
					ep.setCodCliente(rs.getInt(3));
					ep.setEstado(rs.getString(4));
					ep.setDataInicio(rs.getObject(5,LocalDate.class));
					ep.setDataFim(rs.getObject(6,LocalDate.class));
					ep.setQtdPessoas(rs.getInt(7));
					ep.setDesconto(rs.getDouble(8));
					ep.setValorFinal(rs.getDouble(9));
					lista.add(ep);
				}
				return lista;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		} finally {
			ConnectionFactory.close(con);
		}
	}

	@Override
	public Hospedagem pesquisarPorCodHospedagem(int codHospedagem) {
		String sql = "select * from Hospedagem where codHospedagem=?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, codHospedagem);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Hospedagem ep = new Hospedagem();
				ep.setCodHospedagem(rs.getInt(1));
				ep.setCodChale(rs.getInt(2));
				ep.setCodCliente(rs.getInt(3));
				ep.setEstado(rs.getString(4));
				ep.setDataInicio(rs.getObject(5,LocalDate.class));
				ep.setDataFim(rs.getObject(6,LocalDate.class));
				ep.setQtdPessoas(rs.getInt(7));
				ep.setDesconto(rs.getDouble(8));
				ep.setValorFinal(rs.getDouble(9));
				return ep;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		} finally {
			ConnectionFactory.close(con);
		}
	}

}
