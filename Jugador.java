package examen2programacion;

import java.util.ArrayList;

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
	public Jugador() {
		super();
		this.nombre = "";
		this.dorsal = 0;
		this.potenciaDisparo = 0;
		this.calidadPorteria = 0;
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
	public int habilidadDisparo(ArrayList<Jugador> jugadores, int jugador) {
		int habilidadDisparo=0;
		habilidadDisparo=jugadores.get(jugador).getPotenciaDisparo()*(int) Math.round(Math.random() * 10);
		return habilidadDisparo;
	}
	public int habilidadPorteria(ArrayList<Jugador> jugadores, int jugador) {
		int habilidadPorteria=0;
		habilidadPorteria=jugadores.get(jugador).getCalidadPorteria()*(int) Math.round(Math.random() * 10);
		return habilidadPorteria;
	}
	public void jugar(ArrayList<Jugador> jugadores, int [] orden) {
		int[] habilidadPorteria= new int[jugadores.size()];
		int[] habilidadDisparo= new int[jugadores.size()];
		for(int i = 0; i<jugadores.size();i++) {
			habilidadPorteria[i]=habilidadPorteria(jugadores,orden[i]);
			habilidadDisparo[i]=habilidadDisparo(jugadores,orden[i]);
		}
	}
}
