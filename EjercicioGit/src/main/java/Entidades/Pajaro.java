package Entidades;

public class Pajaro {

	private int envergadura;
	private int largoPico;
	private String color;
	
	public Pajaro() {
		super();
	}
	public Pajaro(int envergadura, int largoPico, String color) {
		super();
		this.envergadura = envergadura;
		this.largoPico = largoPico;
		this.color = color;
	}
	public int getEnvergadura() {
		return envergadura;
	}
	public void setEnvergadura(int envergadura) {
		this.envergadura = envergadura;
	}
	public int getLargoPico() {
		return largoPico;
	}
	public void setLargoPico(int largoPico) {
		this.largoPico = largoPico;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pajaro [envergadura=" + envergadura + ", largoPico=" + largoPico + ", color=" + color + "]";
	}
}
