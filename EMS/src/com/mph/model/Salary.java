package com.mph.model;

public class Salary {
	private int basic;
	private int da;
	private int hra;
	private int pf;
	private int gross;
	private int net;

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(int basic, int da, int hra, int gross, int net) {
		super();
		this.basic = basic;
		this.da = da;
		this.hra = hra;
		
		this.gross = gross;
		this.net = net;
	}

	public Salary(int basic2) {
		// TODO Auto-generated constructor stub
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}
	
	

	public int getPf() {
		return pf;
	}

	public void setPf(int pf) {
		this.pf = pf;
	}

	public int getGross() {
		return gross;
	}

	public void setGross(int basic, int da, int hra) {
		this.gross = basic+da+hra;
	}

	public int getNet() {
		return net;
	}

	public void setNet(int gross,int pf) {
		this.net = gross-pf;
	}

	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", da=" + da + ", hra=" + hra + ", gross=" + gross + ", net=" + net + "]";
	}

}