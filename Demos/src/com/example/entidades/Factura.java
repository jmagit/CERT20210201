package com.example.entidades;

import java.util.ArrayList;
import java.util.List;

import com.example.Grafico;

public class Factura {
	private static int cont = 1;
	
	private int numFactura = 0;
	List<Linea> lineas = new ArrayList<>();
	
	public static class Direccion {
		private static int otrocont = 1;
		
		public int getFacturas() {
			return cont;
		}
	}
	
	public class Linea {
		private double cantidad = 0;
		
		public int getNumFactura() {
			return numFactura;
		}
		public int setNumFactura(int num) {
			return numFactura = num;
		}
		
		public Linea(double cantidad) {
			this.cantidad = cantidad;
		}
	}
	
	public void addLinea(double cantidad) {
		lineas.add(new Linea(cantidad));
	}

	public Factura(int numFactura) {
		this.numFactura = numFactura;
	}
	
	public Linea getLinea(int index) {
		return lineas.get(index);
	}

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}
	
	public Grafico dameGrafico() {
		var msg = "Factura";
		var g = new Grafico() {
			
			@Override
			public void pintate() {
				System.out.println(msg + " " + numFactura);
			}
		};
		var p = new PersonaImp(1) {
			
		};
		return g;
	}
}

