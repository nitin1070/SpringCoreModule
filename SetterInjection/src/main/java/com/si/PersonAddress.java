package com.si;

public class PersonAddress {
	
	@Override
	public String toString() {
		return "PersonAddress [add=" + add + ", HN=" + HN + "]";
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getHN() {
		return HN;
	}
	public void setHN(String hN) {
		HN = hN;
	}
	private String add;
	private String HN;

}
