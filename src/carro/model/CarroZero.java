package carro.model;

public class CarroZero extends Carro{
	int anosGarantia;

	public CarroZero(String modeloCarro, String placaCarro, int idCarro, int anoCarro, float precoCarro, int anosGarantia) {
		super(modeloCarro, placaCarro, idCarro, anoCarro, precoCarro);
		
		this.anosGarantia = anosGarantia;

	}

	public int getAnosGarantia() {
		return this.anosGarantia;
	}

	public void setPossuiGarantia(int anosGarantia) {
		this.anosGarantia = anosGarantia;
	}

}
