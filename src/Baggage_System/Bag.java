package Baggage_System;

public class Bag {

	private RequestInfo requestinfo; //識別番号

	private State state;  //荷物状態

	private Man receiptman;  //受取人

	private Man requestman;  //依頼人

	public Bag(RequestInfo requestinfo, State state, Man receiptman, Man requestman){
		this.requestinfo = requestinfo;
		this.state = state;
		this.receiptman = receiptman;
		this.requestman = requestman;
//		上田の馬鹿
//		上田のあほ
	}
	
	
	//NIMOTSU_識別番号_依頼人名前_依頼人電話番号_依頼人番地x_y_受取人名前_受取人電話番号_受取人番地x_y_住所間違い_不在_新鮮
	@Override
	public String toString() {
		return "NIMOTSU"+"_"+this.requestinfo.getJudgenumber()+"_"+this.requestman.getName()+"_"+this.requestman.getNumber()+"_"+this.requestman.getAdress().getX()+"_"+this.requestman.getAdress().getY()+"_"
				+this.receiptman.getName()+"_"+this.receiptman.getNumber()+"_"+this.receiptman.getAdress().getX()+"_"+this.receiptman.getAdress().getY()+"_"+this.state.getMiss()+"_"+this.state.getAbsence()+"_"+this.state.getFresh();

	}
}
