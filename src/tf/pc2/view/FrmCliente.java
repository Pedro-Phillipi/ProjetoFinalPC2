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

import tf.pc2.controller.ClienteController;
import tf.pc2.model.Cliente;
import tf.pc2.util.Util;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class FrmCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblConsulta;
	private JTextField txtCodCliente;
	private JTextField txtNomeCliente;
	private JTextField txtRgCliente;
	private JTextField txtEnderecoCliente;
	private JTextField txtBairroCliente;
	private JTextField txtCidadeCliente;
	private JTextField txtEstadoCliente;
	private JTextField txtCepCliente;
	private JLabel lblMensagem;
	private JFormattedTextField txtNascimentoCliente;
	private MaskFormatter mascaraData = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCliente frame = new FrmCliente();
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
	public FrmCliente() {
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
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
							.addGap(12))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
							.addGap(22))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("codCliente");
		
		txtCodCliente = new JTextField();
		txtCodCliente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("nomeCliente");
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("rgCliente");
		
		txtRgCliente = new JTextField();
		txtRgCliente.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("enderecoCliente");
		
		txtEnderecoCliente = new JTextField();
		txtEnderecoCliente.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("bairroCliente");
		
		txtBairroCliente = new JTextField();
		txtBairroCliente.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("cidadeCliente");
		
		txtCidadeCliente = new JTextField();
		txtCidadeCliente.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("estadoCliente");
		
		txtEstadoCliente = new JTextField();
		txtEstadoCliente.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("cepCliente");
		
		txtCepCliente = new JTextField();
		txtCepCliente.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("nascimentoCliente");
		
		lblMensagem = new JLabel("Mensagem:");
		lblMensagem.setForeground(Color.BLUE);
		lblMensagem.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		try {
			mascaraData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			System.err.println(e.getMessage());
			}
		
		txtNascimentoCliente = new JFormattedTextField(mascaraData);
		
		JLabel lblNewLabel_9 = new JLabel("dd/mm/aaaaa");
		lblNewLabel_9.setForeground(Color.RED);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtCodCliente, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtNomeCliente))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtRgCliente)))
									.addGap(10)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4)
												.addComponent(lblNewLabel_5))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(txtCidadeCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtBairroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_6)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtEstadoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtEnderecoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCepCliente)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNascimentoCliente, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_9))
						.addComponent(lblMensagem))
					.addContainerGap(353, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtCodCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtBairroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8)
						.addComponent(txtNascimentoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(txtNomeCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(txtRgCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(txtEnderecoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5)
								.addComponent(txtCidadeCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_6)
								.addComponent(txtEstadoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_7)
								.addComponent(txtCepCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(lblMensagem)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cliente clint = new Cliente();
				ClienteController ec = new ClienteController();
				clint.setCodCliente(Integer.parseInt(txtCodCliente.getText()));
				clint.setNomeCliente(txtNomeCliente.getText());
				clint.setRgCliente(Integer.parseInt(txtRgCliente.getText()));
				clint.setEnderecoCliente(txtEnderecoCliente.getText());
				clint.setBairroCliente(txtBairroCliente.getText());
				clint.setCidadeCliente(txtCidadeCliente.getText());
				clint.setEstadoCliente(txtEstadoCliente.getText());
				clint.setCepCliente(Integer.parseInt(txtCepCliente.getText()));
				int[] dataFormatada = Util.formatarDataDeGuiParaLocalDate(txtNascimentoCliente.getText());
				clint.setNascimentoCliente(LocalDate.of(dataFormatada[2], dataFormatada[1],dataFormatada[0]));
				lblMensagem.setText(ec.inserir(clint));/*Veja Nota 1*/
			}
		});
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cliente clint = new Cliente();
				ClienteController ec = new ClienteController();
				clint.setCodCliente(Integer.parseInt(txtCodCliente.getText()));
				clint.setNomeCliente(txtNomeCliente.getText());
				clint.setRgCliente(Integer.parseInt(txtRgCliente.getText()));
				clint.setEnderecoCliente(txtEnderecoCliente.getText());
				clint.setBairroCliente(txtBairroCliente.getText());
				clint.setCidadeCliente(txtCidadeCliente.getText());
				clint.setEstadoCliente(txtEstadoCliente.getText());
				clint.setCepCliente(Integer.parseInt(txtCepCliente.getText()));
				int[] dataFormatada =Util.formatarDataDeGuiParaLocalDate(txtNascimentoCliente.getText());
				clint.setNascimentoCliente(LocalDate.of(dataFormatada[2], dataFormatada[1],dataFormatada[0]));
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
				Cliente emp = new Cliente();
				ClienteController ec = new ClienteController();
				emp.setCodCliente(Integer.parseInt(txtCodCliente.getText()));
				Object[] opcoes = { "Sim", "Não" };
				int i = JOptionPane.showOptionDialog(null,
				"Deseja excluir esse Cliente: "+txtCodCliente.getText()+"?","Exclusão",
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
				List<Cliente> listaEmp = new ArrayList();
				ClienteController ec = new ClienteController();
				listaEmp = ec.listarTodos();
				DefaultTableModel tbm =(DefaultTableModel)tblConsulta.getModel();
				for(int i = tbm.getRowCount()-1; i >= 0; i--){
				tbm.removeRow(i);
				}
				int i = 0;
				for(Cliente ep : listaEmp){
				tbm.addRow(new String[1]);
				tblConsulta.setValueAt(ep.getCodCliente(), i, 0);
				tblConsulta.setValueAt(ep.getNomeCliente(), i, 1);
				tblConsulta.setValueAt(ep.getRgCliente(), i, 2);
				tblConsulta.setValueAt(ep.getEnderecoCliente(), i, 3);
				tblConsulta.setValueAt(ep.getBairroCliente(), i, 4);
				tblConsulta.setValueAt(ep.getCidadeCliente(), i, 5);
				tblConsulta.setValueAt(ep.getEstadoCliente(), i, 6);
				tblConsulta.setValueAt(ep.getCepCliente(), i, 7);
				tblConsulta.setValueAt(Util.formatarDataDeLocalDateParaGui(ep.getNascimentoCliente()), i, 8);
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
				FrmCliente.this.dispose();
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCodCliente.setText("");
				txtNomeCliente.setText("");
				txtRgCliente.setText("");
				txtEnderecoCliente.setText("");
				txtBairroCliente.setText("");
				txtCidadeCliente.setText("");
				txtEstadoCliente.setText("");
				txtCepCliente.setText("");
				txtNascimentoCliente.setText("");
				
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
				String codCliente = tblConsulta.getValueAt(linha, 0).toString();
				String nomeCliente = tblConsulta.getValueAt(linha, 1).toString();
				String rgCliente = tblConsulta.getValueAt(linha, 2).toString();
				String enderecoCliente = tblConsulta.getValueAt(linha, 3).toString();
				String bairroCliente = tblConsulta.getValueAt(linha, 4).toString();
				String cidadeCliente = tblConsulta.getValueAt(linha, 5).toString();
				String estadoCliente = tblConsulta.getValueAt(linha, 6).toString();
				String cepCliente = tblConsulta.getValueAt(linha, 7).toString();
				String nascimentoCliente = tblConsulta.getValueAt(linha, 8).toString();
				txtCodCliente.setText(codCliente);
				txtNomeCliente.setText(nomeCliente);
				txtRgCliente.setText(rgCliente);
				txtEnderecoCliente.setText(enderecoCliente);
				txtBairroCliente.setText(bairroCliente);
				txtCidadeCliente.setText(cidadeCliente);
				txtEstadoCliente.setText(estadoCliente);
				txtCepCliente.setText(cepCliente);
				txtNascimentoCliente.setText(nascimentoCliente);
			}
		});
		tblConsulta.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"codcliente", "nomeCliente", "rgCliente", "enderecoCliente", "bairroCliente", "cidadeCliente", "estadoCliente", "cepCliente", "nascimentoCliente"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class, String.class, String.class, String.class, Integer.class, Object.class
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
