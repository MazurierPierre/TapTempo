package model;

public class Model {

	private float ins_bpm = 0;
	private float avg_bpm = 0;
	
	private long startTime = 0;
	private long endTime = 0;
	
	private int nbTaps = 0;
	private float totalBpm = 0;
	
	private boolean tap_Pressed = false;
	
	public Model() {
		
	}

	public float getIns_bpm() {
		return ins_bpm;
	}

	public void setIns_bpm(float ins_bpm) {
		this.ins_bpm = ins_bpm;
	}

	public float getAvg_bpm() {
		return avg_bpm;
	}

	public void setAvg_bpm(float avg_bpm) {
		this.avg_bpm = avg_bpm;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public int getNbTaps() {
		return nbTaps;
	}

	public void setNbTaps(int nbTaps) {
		this.nbTaps = nbTaps;
	}

	public float getTotalBpm() {
		return totalBpm;
	}

	public void setTotalBpm(float totalBpm) {
		this.totalBpm = totalBpm;
	}

	public boolean isTap_Pressed() {
		return tap_Pressed;
	}

	public void setTap_Pressed(boolean tap_Pressed) {
		this.tap_Pressed = tap_Pressed;
	}

	public void addNbTaps(int i) {
		this.nbTaps += i;
	}

	public void addTotalBpm(float f) {
		this.totalBpm += f;
	}

	public void resetNbTaps() {
		this.nbTaps = 0;
	}

	public void resetTotalBpm() {
			this.totalBpm = 0;
	}

	
}
