package tf.pc2.view;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import tf.pc2.persistencia.ConnectionFactory;
import tf.pc2.model.*;
import tf.pc2.controller.*;

public class Teste {
	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
		if(con != null){
			System.out.println("É DENTRO");
			ConnectionFactory.close(con);
		}
		Cliente clint = new Cliente();
		
		ClienteController controller = new ClienteController();
		
		clint.setCodCliente(11111);
		clint.setNomeCliente("Maria da Silva");
		clint.setRgCliente(694213);
		clint.setEnderecoCliente("123 vila sesamo");
		clint.setBairroCliente("11111");
		clint.setCidadeCliente("cidade de deus");
		clint.setEstadoCliente("DF");
		clint.setCepCliente(12345678);
		clint.setNascimentoCliente(LocalDate.of(2001,9,11));
		System.out.println(controller.inserir(clint));
		
		clint.setCodCliente(33333);
		clint.setNomeCliente("Fulano Ciclano");
		clint.setRgCliente(123456);
		clint.setEnderecoCliente("rua dos tolos numero 0");
		clint.setBairroCliente("da turma");
		clint.setCidadeCliente("cidade dos homens");
		clint.setEstadoCliente("gasoso");
		clint.setCepCliente(87654321);
		clint.setNascimentoCliente(LocalDate.of(2000, 1, 1));
		System.out.println(controller.inserir(clint));
		
		List<Cliente> lista = controller .listarTodos();
		
		if(lista != null){
			for(Cliente e : lista){
			System.out.println("COD: "+e.getCodCliente());
			System.out.println("Nome: "+e.getNomeCliente());
			System.out.println("RG: "+e.getRgCliente());
			System.out.println("ENDERECO: "+e.getEnderecoCliente());
			System.out.println("BAIRRO: "+e.getBairroCliente());
			System.out.println("CIDADE: "+e.getCidadeCliente());
			System.out.println("ESTADO: "+e.getEstadoCliente());
			System.out.println("CEP: "+e.getCepCliente());
			System.out.println("DATA DE NASCIMENTO: "+e.getNascimentoCliente());
			}
		}
		
		Cliente emp = new Cliente();
		emp = controller.pesquisarPorCodCliente(11111);
		if (emp != null) {
			System.out.println("CPF: "+emp.getCodCliente());
			System.out.println("Nome: "+emp.getNomeCliente());
			System.out.println("Idade: "+emp.getRgCliente());
			System.out.println("Salário: "+emp.getEnderecoCliente());
			System.out.println("CPF: "+emp.getBairroCliente());
			System.out.println("Nome: "+emp.getCidadeCliente());
			System.out.println("Idade: "+emp.getEstadoCliente());
			System.out.println("Salário: "+emp.getCepCliente());
			System.out.println("Salário: "+emp.getNascimentoCliente());
			}
		/*
		Chale cha = new Chale();
		
		ChaleController controller = new ChaleController();
		
		cha.setCodChale(69);
		cha.setLocalizacao("aqui do outro outro lado");
		cha.setCapacidade(3000);
		cha.setValorAltaEstacao(900.00);
		cha.setValorBaixaEstacao(690.00);
		System.out.println(controller.inserir(cha));
		
		cha.setCodChale(15);
		cha.setLocalizacao("este atributo foi alterado");
		cha.setCapacidade(8);
		cha.setValorAltaEstacao(900.00);
		cha.setValorBaixaEstacao(690.00);
		System.out.println(controller.alterar(cha));
		
		cha.setCodChale(69);
		System.out.println(controller.excluir(cha));
		
		List<Chale> lista = controller .listarTodos();
		
		if(lista != null){
			for(Chale e : lista){
			System.out.println("COD: "+e.getCodChale());
			System.out.println("Localizacao: "+e.getLocalizacao());
			System.out.println("CapacidaDE: "+e.getCapacidade());
			System.out.println("Valor Alta: "+e.getValorAltaEstacao());
			System.out.println("Valor Baixa: "+e.getValorBaixaEstacao());
		
			cha = controller.pesquisarPorCodChale(15);
			if (cha != null) {
				System.out.println("COD: "+cha.getCodChale());
				System.out.println("Localizacao: "+cha.getLocalizacao());
				System.out.println("CapacidaDE: "+cha.getCapacidade());
				System.out.println("Valor Alta: "+cha.getValorAltaEstacao());
				System.out.println("Valor Baixa: "+cha.getValorBaixaEstacao());
			
				}
			}
		}*/
	}
}