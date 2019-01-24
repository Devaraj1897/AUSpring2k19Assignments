package org.adapterpattern.assignment;

public class WhiteBoard {
	
	private Marker marker;

	public Marker getMarker() {
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}
	
	public void fillWhiteBoard(String str) {
		marker.mark(str);
	}

}
