package com.test.pract.collection;

public class Value {
	
	int v;
	

	public Value(int v) {
		this.v=v;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Value [v=" + v + "]";
	}

}
