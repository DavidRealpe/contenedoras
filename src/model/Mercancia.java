package model;

public class Mercancia{

	public final static int MAX = 3;

	private double volumenTotal;

	private Contenedora[] cont;

	public Mercancia(double volumenTotal){
		this.volumenTotal = volumenTotal;
		cont = new Contenedora[MAX];
	}

	public double volumenTotal(){

		double volTotal = 0.0;

		for(int i=0; i<MAX ; i++){
		volTotal += cont[i].getAncho()*cont[i].getAlto()*cont[i].getLargo();
		}
	return volTotal;
	}
}