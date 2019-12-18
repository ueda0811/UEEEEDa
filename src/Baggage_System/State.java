package Baggage_System;

public class State {

	private boolean miss;

	private boolean absence;

	private boolean fresh;

	public State(boolean miss, boolean absence, boolean fresh){
		this.miss = miss;
		this.absence = absence;
		this.fresh = fresh;
	}
	
	public boolean getMiss() {
		return miss;
	}

	public boolean getAbsence() {
		return absence;
	}

	public boolean getFresh() {
		return fresh;
	}



}
