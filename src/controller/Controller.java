package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.View;


public class Controller implements ActionListener {

	private View view;
	private Model model;

	public Controller(Model model, View view) {

		this.model = model;
		this.view = view;

		this.view.getBtn_reset().addActionListener(this);
		this.view.getBtn_tap().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().toString().contains("ICO_Tap"))
			tapped();
		else
			reset();

	}

	private void tapped() {

		if(model.isTap_Pressed() == true) {

			model.setEndTime(System.currentTimeMillis());
			long elapsed = model.getEndTime() - model.getStartTime();
			model.addNbTaps(1);

			model.setIns_bpm(60000 / elapsed);

			model.addTotalBpm(model.getIns_bpm());
			model.setAvg_bpm(model.getTotalBpm() / model.getNbTaps());

			model.setStartTime(System.currentTimeMillis());

			view.updateGUI();

		} else {

			model.setStartTime(System.currentTimeMillis());
			model.setTap_Pressed(true);

		}

	}

	private void reset() {

		model.resetNbTaps();
		model.resetTotalBpm();
		model.setTap_Pressed(false);
		model.setStartTime(0);
		model.setEndTime(0);
		model.setAvg_bpm(0);
		model.setIns_bpm(0);

		view.updateGUI();
	}
}
