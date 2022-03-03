package examen2programacion;

public class Jugador {
	private String nombre;
	private int dorsal;
	private int potenciaDisparo;
	private int calidadPorteria;
	private int vidas;
	public Jugador(String nombre, int dorsal, int potenciaDisparo, int calidadPorteria) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.potenciaDisparo = potenciaDisparo;
		this.calidadPorteria = calidadPorteria;
		this.vidas = 2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getPotenciaDisparo() {
		return potenciaDisparo;
	}
	public void setPotenciaDisparo(int potenciaDisparo) {
		this.potenciaDisparo = potenciaDisparo;
	}
	public int getCalidadPorteria() {
		return calidadPorteria;
	}
	public void setCalidadPorteria(int calidadPorteria) {
		this.calidadPorteria = calidadPorteria;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", potenciaDisparo=" + potenciaDisparo
				+ ", calidadPorteria=" + calidadPorteria + ", vidas=" + vidas + "]";
	}
}
