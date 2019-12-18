package Baggage_System;

public class Bag {

	private RequestInfo requestinfo; //���ʔԍ�

	private State state;  //�ו����

	private Man receiptman;  //���l

	private Man requestman;  //�˗��l

	public Bag(RequestInfo requestinfo, State state, Man receiptman, Man requestman){
		this.requestinfo = requestinfo;
		this.state = state;
		this.receiptman = receiptman;
		this.requestman = requestman;
//		��c�̔n��
//		��c�̂���
	}
	
	
	//NIMOTSU_���ʔԍ�_�˗��l���O_�˗��l�d�b�ԍ�_�˗��l�Ԓnx_y_���l���O_���l�d�b�ԍ�_���l�Ԓnx_y_�Z���ԈႢ_�s��_�V�N
	@Override
	public String toString() {
		return "NIMOTSU"+"_"+this.requestinfo.getJudgenumber()+"_"+this.requestman.getName()+"_"+this.requestman.getNumber()+"_"+this.requestman.getAdress().getX()+"_"+this.requestman.getAdress().getY()+"_"
				+this.receiptman.getName()+"_"+this.receiptman.getNumber()+"_"+this.receiptman.getAdress().getX()+"_"+this.receiptman.getAdress().getY()+"_"+this.state.getMiss()+"_"+this.state.getAbsence()+"_"+this.state.getFresh();

	}
}
