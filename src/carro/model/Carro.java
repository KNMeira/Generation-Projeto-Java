package carro.model;

public abstract class Carro {
	
	protected String modeloCarro, placaCarro;
	protected int idCarro, anoCarro;
	protected float precoCarro;
	
	public Carro(String modeloCarro, String placaCarro, int idCarro, int anoCarro, float precoCarro) {
		this.modeloCarro = modeloCarro;
		this.placaCarro = placaCarro;
		this.idCarro = idCarro;
		this.anoCarro = anoCarro;
		this.precoCarro = precoCarro;
		
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public int getAnoCarro() {
		return anoCarro;
	}

	public void setAnoCarro(int anoCarro) {
		this.anoCarro = anoCarro;
	}

	public float getPrecoCarro() {
		return precoCarro;
	}

	public void setPrecoCarro(float precoCarro) {
		this.precoCarro = precoCarro;
	}

}
