package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.entidades.Alumno;
import com.example.entidades.Cobrador;
import com.example.entidades.Factura;
import com.example.entidades.Persona;
import com.example.entidades.PersonaImp;
import com.example.entidades.Profesor;
import com.example.entidades.Servicio;

/**
 * Ejemplos del curso
 * 
 * @author Javier
 *
 */
public class Principal {

	/**
	 * Método principal
	 * 
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		var f = new Factura(1000);
		f.addLinea(10);
		f.addLinea(100);
		var l = f.getLinea(0);
		System.out.println(l.getNumFactura());
		f.setNumFactura(666);
		System.out.println(l.getNumFactura());
		System.out.println(f.getLinea(1).getNumFactura());
		
		var d = new Factura.Direccion();
		
		f.dameGrafico().pintate();
		
		Persona persona = new Profesor(1, "Pepito");
		persona = new Cobrador(0);
		System.out.println(persona.getCompleto());
		System.out.println(Persona.getEdad(persona));
		
	}
	public static void main1() {
		System.out.println(3 / 0);
		System.out.println(3.0 / 0);
		Object object = null;
		var i = new int[10][10][2];
		var aux = i[1];
		i[1] = i[0];
		i[0] = aux;
		i = null;
		int a;
		a = 1;
		int b = a = 0;
		var rslt = switch (a) {
		case 1, 3, 5:
			yield "impar";
		case 2, 4, 6:
			yield "par";
		default :
			yield "Desconocido";
		};
		etiqueta:
		while (a > 0) {
			switch (a) {
			case 10: 
				break etiqueta;
			case 1:
			case 3:
				a += 1;
			case 2, 4, 6:
				a+=1;
				break;
			};
		}
		try {
			
		} catch (NullPointerException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		var p = new Principal();
		short corto = 0;
		p.divide((int)corto, 2);
		
		p.algo(Servicio.dameProfesor(), "kkk");
		
	}

	/**
	 * Divi ....
	 * 
	 * @param a Primer operando
	 * @param b Segundo operando
	 * @return Resultado de la division entera
	 * @throws ArithmeticException Divide by zero
	 */
	public int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
	public long divide(long a, long b) throws ArithmeticException {
		return a / b;
	}
	public double divide(double a, double b) {
		return a / b;
	}

	public void algo(Persona p) {
		
	}
	public void algo(Alumno p) {
		
	}
	public void algo(Grafico p, String ...nombres) {
		
	}
}
