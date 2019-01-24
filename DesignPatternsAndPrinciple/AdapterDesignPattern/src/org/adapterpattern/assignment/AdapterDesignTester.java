package org.adapterpattern.assignment;

public class AdapterDesignTester {
	
	public static void main(String[] args) {
		Marker m=new MarkerAdapter();
		WhiteBoard wb=new WhiteBoard();
		wb.setMarker(m);
		wb.fillWhiteBoard("Filling the white board");
	}
	
}
