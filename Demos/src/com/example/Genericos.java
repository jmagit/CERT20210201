package com.example;

import java.util.ArrayList;
import java.util.List;

public class Genericos {
	class Elemento<T> {
		private T id;
		private String texto;
		
		public Elemento(T id, String texto) {
			super();
			this.id = id;
			this.texto = texto;
		}
		public T getId() {
			return id;
		}
		public void setId(T id) {
			this.id = id;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
	}

	class ElementoObject {
		private Object id;
		private String texto;
		
		public ElementoObject(Object id, String texto) {
			super();
			this.id = id;
			this.texto = texto;
		}
		public Object getId() {
			return id;
		}
		public void setId(Object id) {
			this.id = id;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
	}

	class ElementoInt {
		private int id;
		private String texto;
		
		public ElementoInt(int id, String texto) {
			super();
			this.id = id;
			this.texto = texto;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
	}
	class ElementoChar {
		private char id;
		private String texto;
		
		public ElementoChar(char id, String texto) {
			this.id = id;
			this.texto = texto;
		}
		public char getId() {
			return id;
		}
		public void setId(char id) {
			this.id = id;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
	}
	
	public void test() {
		List<ElementoInt> provincias = new ArrayList<>();
		provincias.add(new ElementoInt(28, "Madrid"));
		List<ElementoChar> genero = new ArrayList<>();
		genero.add(new ElementoChar('M', "Masculinos"));
		
		List<ElementoObject> lista = new ArrayList<>();
		lista.add(new ElementoObject('M', "Masculinos"));
		lista.add(new ElementoObject(28, "Madrid"));
		lista.add(new ElementoObject("kk", "Algo"));
		List<Elemento<Integer>> provincias2 = new ArrayList<>();
		provincias2.add(new Elemento<Integer>(28, "Madrid"));
		// provincias2.add(new Elemento<Integer>("kk", "Algo"));
		List<Elemento<String>> lista2 = new ArrayList<>();
		var clase = Elemento.class;
		lista2.add(new Elemento<String>("kk", "Algo"));
	}
}
