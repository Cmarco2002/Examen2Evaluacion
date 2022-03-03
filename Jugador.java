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
	/**
	 * Pre:---
	 * Post: Se calcula la habilidad de disparo.
	 */
	public int habilidadDisparo(ArrayList<Jugador> jugadores, int jugador) {
		int habilidadDisparo=0;
		habilidadDisparo=jugadores.get(jugador).getPotenciaDisparo()*(int) Math.round(Math.random() * 10);
		return habilidadDisparo;
	}
	/**
	 * Pre:---
	 * Post: Se calcula la habilidad de portero.
	 */
	public int habilidadPorteria(ArrayList<Jugador> jugadores, int jugador) {
		int habilidadPorteria=0;
		habilidadPorteria=jugadores.get(jugador).getCalidadPorteria()*(int) Math.round(Math.random() * 10);
		return habilidadPorteria;
	}
	/**
	 * Pre:---
	 * Post: Se calcula si ha sido gol.
	 */
	public boolean haSidoGol(int jugador, int portero) {
		boolean gol=false;
		if(jugador>portero) {
			gol=true;
		}
		return gol;
	}
	/**
	 * Pre:---
	 * Post: Se juega al juego.
	 */
	public void jugar(ArrayList<Jugador> jugadores, int [] orden) {
		int[] habilidadPorteria= new int[jugadores.size()];
		int[] habilidadDisparo= new int[jugadores.size()];
		boolean gol =false;
		int contador=0;
		for(int i = 0; i<jugadores.size();i++) {
			habilidadPorteria[i]=habilidadPorteria(jugadores,orden[i]);
			habilidadDisparo[i]=habilidadDisparo(jugadores,orden[i]);
		}
		while(contador==jugadores.size()-1) {
			for(int i = 0; i<jugadores.size();i++) {
				for(int j = 1; j<jugadores.size();j++) {
					if(jugadores.get(i).getVidas()==0 || orden[i]==orden[j]) {
						i++;
					}else {
						if(jugadores.get(j).getVidas()==0) {
							j++;
						}else {
							System.out.println("Jugador "+orden[i]+" en la porteria");
							System.out.println("Jugador "+orden[j]+" a chutar");
							gol=haSidoGol(habilidadDisparo[i],habilidadPorteria[j]);
							if(gol==true) {
								System.out.println("Gooooool del jugador numero "+orden[j]);
								jugadores.get(i).setVidas(-1);
							}else {
								System.out.println("Vaya el jugador numero "+orden[j]+" ha fallado");
							}
							for(int z=0;z<jugadores.size();z++) {
								if(jugadores.get(z).getVidas()==0) {
									contador++;
								}
							}
						}
					}
				}
			}
		}
		for(int i=0;i<jugadores.size()-1;i++) {
			if(jugadores.get(i).getVidas()>0) {
				System.out.println("El ganador es el jugador: "+jugadores.get(i));
			}
		}
	}
}
