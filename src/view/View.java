package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Model;

public class View {

	private Model model;
	
	private JFrame frmTaptempo;
	private JButton btn_tap;
	private JButton btn_reset;
	private JLabel lbl_ins;
	private JLabel lbl_avg;
	private JLabel lbl_taps;
	
	private final Icon ICO_TAP = new ImageIcon("D:\\Library\\Desktop\\Stuff\\School Stuff\\New Java Workspace\\TapTempo\\res\\ICO_Tap.png");
	private final Icon ICO_TAP_REV = new ImageIcon("D:\\Library\\Desktop\\Stuff\\School Stuff\\New Java Workspace\\TapTempo\\res\\ICO_Tap_Inv.png");
	private final Icon ICO_RESET = new ImageIcon("D:\\Library\\Desktop\\Stuff\\School Stuff\\New Java Workspace\\TapTempo\\res\\ICO_Reset.png");
	
	public View(Model model) {
		
		this.model = model;
		initialize();
		frmTaptempo.setVisible(true);
	}
	
	
	
	private void initialize() {
		frmTaptempo = new JFrame();
		frmTaptempo.getContentPane().setForeground(Color.BLACK);
		frmTaptempo.getContentPane().setBackground(Color.BLACK);
		frmTaptempo.setTitle("TapTempo");
		frmTaptempo.setResizable(false);
		frmTaptempo.setBounds(100, 100, 400, 500);
		frmTaptempo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTaptempo.getContentPane().setLayout(null);
		
		btn_reset = new JButton("");
		btn_reset.setIcon(ICO_RESET);
		btn_reset.setForeground(Color.BLACK);
		btn_reset.setBackground(Color.BLACK);
		btn_reset.setBounds(332, 10, 55, 55);
		btn_reset.setBorderPainted(false);
		frmTaptempo.getContentPane().add(btn_reset);
		
		btn_tap = new JButton("");
		btn_tap.setPressedIcon(ICO_TAP_REV);
		btn_tap.setIcon(ICO_TAP);
		btn_tap.setForeground(Color.BLACK);
		btn_tap.setBackground(Color.BLACK);
		btn_tap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_tap.setBounds(10, 73, 374, 384);
		btn_tap.setBorderPainted(false);
		frmTaptempo.getContentPane().add(btn_tap);
		
		JLabel txtLbl_instant = new JLabel("Instant");
		txtLbl_instant.setForeground(Color.WHITE);
		txtLbl_instant.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtLbl_instant.setBounds(110, 10, 75, 15);
		frmTaptempo.getContentPane().add(txtLbl_instant);
		
		JLabel txtLbl_average = new JLabel("Average");
		txtLbl_average.setForeground(Color.WHITE);
		txtLbl_average.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtLbl_average.setBounds(210, 10, 75, 15);
		frmTaptempo.getContentPane().add(txtLbl_average);
		
		lbl_ins = new JLabel("000");
		lbl_ins.setForeground(Color.WHITE);
		lbl_ins.setFont(new Font("Consolas", Font.BOLD, 30));
		lbl_ins.setBounds(110, 30, 55, 30);
		frmTaptempo.getContentPane().add(lbl_ins);
		
		lbl_avg = new JLabel("000.0");
		lbl_avg.setForeground(Color.WHITE);
		lbl_avg.setFont(new Font("Consolas", Font.BOLD, 30));
		lbl_avg.setBounds(210, 30, 90, 30);
		frmTaptempo.getContentPane().add(lbl_avg);
		
		JLabel txtLblTaps = new JLabel("Taps");
		txtLblTaps.setForeground(Color.WHITE);
		txtLblTaps.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtLblTaps.setBounds(20, 10, 75, 15);
		frmTaptempo.getContentPane().add(txtLblTaps);
		
		lbl_taps = new JLabel("00");
		lbl_taps.setForeground(Color.WHITE);
		lbl_taps.setFont(new Font("Consolas", Font.BOLD, 30));
		lbl_taps.setBounds(20, 30, 70, 30);
		frmTaptempo.getContentPane().add(lbl_taps);
	}

	public void updateGUI() {
		
		this.lbl_ins.setText(String.format("%.0f", this.model.getIns_bpm()));
		this.lbl_avg.setText(String.format("%.1f", this.model.getAvg_bpm()));
		this.lbl_taps.setText(Integer.toString(this.model.getNbTaps()));
		
	}
	
	
	
	public JFrame getFrame() {
		return frmTaptempo;
	}

	public JButton getBtn_tap() {
		return btn_tap;
	}

	public JButton getBtn_reset() {
		return btn_reset;
	}

	public JLabel getLbl_ins() {
		return lbl_ins;
	}

	public JLabel getLbl_avg() {
		return lbl_avg;
	}
}
