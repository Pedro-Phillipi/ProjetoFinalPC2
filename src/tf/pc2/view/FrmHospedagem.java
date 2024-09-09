package tf.pc2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import tf.pc2.controller.HospedagemController;
import tf.pc2.model.Hospedagem;
import tf.pc2.util.Util;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.text.ParseException;

public class FrmHospedagem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblConsulta;
	private JTextField txtCodHospedagem;
	private JTextField txtCodChale;
	private JTextField txtCodCliente;
	private JTextField txtEstado;
	private JTextField txtQtdPessoas;
	private JTextField txtDesconto;
	private JTextField txtValorFinal;
	private JLabel lblMensagem;
	private JFormattedTextField txtDataInicio;
	private JFormattedTextField txtDataFim;
	private MaskFormatter mascaraData = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmHospedagem frame = new FrmHospedagem();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmHospedagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
							.addGap(12))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
							.addGap(22))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("codHospedagem");
		
		txtCodHospedagem = new JTextField();
		txtCodHospedagem.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("codChale");
		
		txtCodChale = new JTextField();
		txtCodChale.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("codCliente");
		
		txtCodCliente = new JTextField();
		txtCodCliente.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("estado");
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("dataInicio");
		
		JLabel lblNewLabel_5 = new JLabel("dataFim");
		
		JLabel lblNewLabel_6 = new JLabel("qtdPessoas");
		
		txtQtdPessoas = new JTextField();
		txtQtdPessoas.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("desconto");
		
		txtDesconto = new JTextField();
		txtDesconto.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("valorFinal");
		
		txtValorFinal = new JTextField();
		txtValorFinal.setColumns(10);
		
		lblMensagem = new JLabel("Mensagem:");
		lblMensagem.setForeground(Color.BLUE);
		lblMensagem.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		try {
			mascaraData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			System.err.println(e.getMessage());
			}
		
		
		 txtDataInicio = new JFormattedTextField(mascaraData);
		
	    txtDataFim = new JFormattedTextField(mascaraData);
		
		JLabel lblNewLabel_9 = new JLabel("dd/mm/aaaa");
		lblNewLabel_9.setForeground(Color.RED);
		
		JLabel lblNewLabel_9_1 = new JLabel("dd/mm/aaaa");
		lblNewLabel_9_1.setForeground(Color.RED);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtEstado))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCodHospedagem, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCodChale))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCodCliente)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDesconto))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_6)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtQtdPessoas))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_5)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtDataFim, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtDataInicio, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
							.addComponent(lblNewLabel_8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtValorFinal, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(134))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_9_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_9))
							.addGap(549))))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addComponent(lblMensagem)
					.addContainerGap(914, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtCodHospedagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtDataInicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1)
										.addComponent(txtCodChale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2)
										.addComponent(txtCodCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3)
										.addComponent(txtEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_5)
										.addComponent(txtDataFim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_9_1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_6)
										.addComponent(txtQtdPessoas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_7)
										.addComponent(txtDesconto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
							.addComponent(lblMensagem)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(62)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtValorFinal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_8))
							.addGap(43))))
		);
		panel.setLayout(gl_panel);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hospedagem clint = new Hospedagem();
				HospedagemController ec = new HospedagemController();
				clint.setCodHospedagem(Integer.parseInt(txtCodHospedagem.getText()));
				clint.setCodChale(Integer.parseInt(txtCodChale.getText()));
				clint.setCodCliente(Integer.parseInt(txtCodCliente.getText()));
				clint.setEstado(txtEstado.getText());
				int[] dataFormatada =Util.formatarDataDeGuiParaLocalDate(txtDataInicio.getText());
				clint.setDataInicio(LocalDate.of(dataFormatada[2], dataFormatada[1],dataFormatada[0]));
				dataFormatada =Util.formatarDataDeGuiParaLocalDate(txtDataFim.getText());
				clint.setDataFim(LocalDate.of(dataFormatada[2], dataFormatada[1],dataFormatada[0]));
				clint.setQtdPessoas(Integer.parseInt(txtCodHospedagem.getText()));
				clint.setDesconto(Double.parseDouble(txtDesconto.getText()));
				clint.setValorFinal(Double.parseDouble(txtValorFinal.getText()));
				lblMensagem.setText(ec.inserir(clint));/*Veja Nota 1*/
			}
		});
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hospedagem clint = new Hospedagem();
				HospedagemController ec = new HospedagemController();
				clint.setCodHospedagem(Integer.parseInt(txtCodHospedagem.getText()));
				clint.setCodChale(Integer.parseInt(txtCodChale.getText()));
				clint.setCodCliente(Integer.parseInt(txtCodCliente.getText()));
				clint.setEstado(txtEstado.getText());
				int[] dataFormatada =Util.formatarDataDeGuiParaLocalDate(txtDataInicio.getText());
				clint.setDataInicio(LocalDate.of(dataFormatada[2], dataFormatada[1],dataFormatada[0]));
				dataFormatada =Util.formatarDataDeGuiParaLocalDate(txtDataFim.getText());
				clint.setDataFim(LocalDate.of(dataFormatada[2], dataFormatada[1],dataFormatada[0]));
				clint.setQtdPessoas(Integer.parseInt(txtCodHospedagem.getText()));
				clint.setDesconto(Double.parseDouble(txtDesconto.getText()));
				clint.setValorFinal(Double.parseDouble(txtValorFinal.getText()));
				lblMensagem.setText(ec.alterar(clint));
			}
		});
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hospedagem emp = new Hospedagem();
				HospedagemController ec = new HospedagemController();
				emp.setCodHospedagem(Integer.parseInt(txtCodHospedagem.getText()));
				Object[] opcoes = { "Sim", "Não" };
				int i = JOptionPane.showOptionDialog(null,
				"Deseja excluir esse Hospedagem: "+txtCodHospedagem.getText()+"?","Exclusão",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,
				opcoes, opcoes[0]);
				if(JOptionPane.YES_OPTION == i){
				lblMensagem.setText(ec.excluir(emp));
				}
			}
		});
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<Hospedagem> listaEmp = new ArrayList();
				HospedagemController ec = new HospedagemController();
				listaEmp = ec.listarTodos();
				DefaultTableModel tbm =(DefaultTableModel)tblConsulta.getModel();
				for(int i = tbm.getRowCount()-1; i >= 0; i--){
				tbm.removeRow(i);
				}
				int i = 0;
				for(Hospedagem ep : listaEmp){
				tbm.addRow(new String[1]);
				tblConsulta.setValueAt(ep.getCodHospedagem(), i, 0);
				tblConsulta.setValueAt(ep.getCodChale(), i, 1);
				tblConsulta.setValueAt(ep.getCodCliente(), i, 2);
				tblConsulta.setValueAt(ep.getEstado(), i, 3);
				tblConsulta.setValueAt(Util.formatarDataDeLocalDateParaGui(ep.getDataInicio()), i, 4);
				tblConsulta.setValueAt(Util.formatarDataDeLocalDateParaGui(ep.getDataFim()), i, 5);
				tblConsulta.setValueAt(ep.getQtdPessoas(), i, 6);
				tblConsulta.setValueAt(ep.getDesconto(), i, 7);
				tblConsulta.setValueAt(ep.getValorFinal(), i, 8);
				i++;
				}
			}
		});
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrmHospedagem.this.dispose();
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCodHospedagem.setText("");
				txtCodChale.setText("");
				txtCodCliente.setText("");
				txtEstado.setText("");
				txtDataInicio.setText("");
				txtDataFim.setText("");
				txtQtdPessoas.setText("");
				txtDesconto.setText("");
				txtValorFinal.setText("");
				
				DefaultTableModel tbm = (DefaultTableModel)tblConsulta.getModel();
				for(int i = tbm.getRowCount()-1; i >= 0; i--){
					tbm.removeRow(i);
					}
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(btnInserir, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAlterar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExcluir)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLimpar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSair)
					.addContainerGap(536, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnInserir)
						.addComponent(btnAlterar)
						.addComponent(btnExcluir)
						.addComponent(btnPesquisar)
						.addComponent(btnLimpar)
						.addComponent(btnSair))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tblConsulta = new JTable();
		tblConsulta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer linha = tblConsulta.getSelectedRow();
				String codHospegdagem = tblConsulta.getValueAt(linha, 0).toString();
				String codChale = tblConsulta.getValueAt(linha, 1).toString();
				String codCliente = tblConsulta.getValueAt(linha, 2).toString();
				String estado = tblConsulta.getValueAt(linha, 3).toString();
				String dataInicio = tblConsulta.getValueAt(linha, 4).toString();
				String dataFim = tblConsulta.getValueAt(linha, 5).toString();
				String qtdPessoas = tblConsulta.getValueAt(linha, 6).toString();
				String desconto = tblConsulta.getValueAt(linha, 7).toString();
				String valorFinal = tblConsulta.getValueAt(linha, 8).toString();
				txtCodHospedagem.setText(codHospegdagem);
				txtCodChale.setText(codChale);
				txtCodCliente.setText(codCliente);
				txtEstado.setText(estado);
				txtDataInicio.setText(dataInicio);
				txtDataFim.setText(dataFim);
				txtQtdPessoas.setText(qtdPessoas);
				txtDesconto.setText(desconto);
				txtValorFinal.setText(valorFinal);
			}
		});
		tblConsulta.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"codHospedagem", "codChale", "codCliente", "estado", "DataInicio", "dataFim", "qtdPessoas", "desconto", "valorFinal"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class, String.class, Object.class, Object.class, Integer.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblConsulta.getColumnModel().getColumn(0).setResizable(false);
		tblConsulta.getColumnModel().getColumn(1).setResizable(false);
		tblConsulta.getColumnModel().getColumn(2).setResizable(false);
		tblConsulta.getColumnModel().getColumn(3).setResizable(false);
		tblConsulta.getColumnModel().getColumn(4).setResizable(false);
		tblConsulta.getColumnModel().getColumn(5).setResizable(false);
		tblConsulta.getColumnModel().getColumn(6).setResizable(false);
		tblConsulta.getColumnModel().getColumn(7).setResizable(false);
		tblConsulta.getColumnModel().getColumn(8).setResizable(false);
		scrollPane.setViewportView(tblConsulta);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
