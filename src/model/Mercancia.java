package model;

public class Mercancia{

	private Contenedora cont1;
	private Contenedora cont2;
	private Contenedora cont3;

	public Mercancia(Contenedora cont1, Contenedora cont2, Contenedora cont3){
		this.cont1 = cont1;
		this.cont2 = cont2;
		this.cont3 = cont3;
	}

	public Contenedora getCont1(){
		return cont1;
	}

	public Contenedora getCont2(){
		return cont2;
	}

	public Contenedora getCont3(){
		return cont3;
	}

	public String volumenTotal(){

		double vol1 = cont1.getAncho()*cont1.getAlto()*cont1.getLargo();
		double vol2 = cont2.getAncho()*cont2.getAlto()*cont2.getLargo();
		double vol3 = cont3.getAncho()*cont3.getAlto()*cont3.getLargo();

		double volumenTotal = vol1 + vol2 + vol3;

	return "El volumen total de la mercancia es de: "+volumenTotal;
	}

	public String promedioVolumen(){

		double vol1 = cont1.getAncho()*cont1.getAlto()*cont1.getLargo();
		double vol2 = cont2.getAncho()*cont2.getAlto()*cont2.getLargo();
		double vol3 = cont3.getAncho()*cont3.getAlto()*cont3.getLargo();

		double promedioVolumen = (vol1 + vol2 + vol3)/3;
	return "El promedio del volumen de las tres contenedoras es de: "+promedioVolumen;
	}
}