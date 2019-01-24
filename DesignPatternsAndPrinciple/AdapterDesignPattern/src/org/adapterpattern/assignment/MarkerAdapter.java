package org.adapterpattern.assignment;

public class MarkerAdapter implements Marker {

	CamilinMarker cm=new CamilinMarker();
	
	@Override
	public void mark(String s) {
		cm.mark(s);
	}
	

}
