package FACT;

import Model.member;
import Model.message;
import Model.porder;

public class factModel {
	private member m;
	private porder p;
	private message ms;
	public member getM() {
		return m;
	}
	public void setM(member m) {
		this.m = m;
	}
	public porder getP() {
		return p;
	}
	public void setP(porder p) {
		this.p = p;
	}
	public message getMs() {
		return ms;
	}
	public void setMs(message ms) {
		this.ms = ms;
	}
}
