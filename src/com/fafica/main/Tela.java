package com.fafica.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.fafica.conectaBD.ConectaBD;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;

public class Tela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//ConectaBD.AbriConexao();
		//ConectaBD.StatusConexao();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1008, 28);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(2, 0, 78, 21);
		panel.add(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnCadastro.add(mntmCliente);
		
		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mnCadastro.add(mntmVendedor);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mnCadastro.add(mntmProduto);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(82, 0, 95, 21);
		panel.add(menuBar_1);
		
		JMenu mnMovimentao = new JMenu("Movimenta\u00E7\u00E3o");
		menuBar_1.add(mnMovimentao);
		
		JMenuItem mntmVenda = new JMenuItem("Venda");
		mnMovimentao.add(mntmVenda);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(178, 0, 97, 21);
		panel.add(menuBar_2);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar_2.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 27, 1008, 186);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	}
}
