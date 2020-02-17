package capgemini.com;

public enum Month {

	
    JAN(31),FEB(28),MAR(30),APR(31);
	
private int nod;

private Month(int nod) {
	this.nod = nod;
}


public int getNod() {
	return nod;
}
}
