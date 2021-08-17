package com.syntax.class11;

public class Area {
	int length;
	int width;
	
	void setDim(int length, int breadth) {
		this.length = length;
		this.width = breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area1 = new Area();
		area1.setDim(20, 30);
		System.out.print(area1.length);
		Area area2 = new Area();
	}

}
