package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

@Autor(nombre = "Yo mismo")
public class Delegados {
	static class BinariaAsc implements Comparator<String> {
		public static int comparar(String o1, String o2) {
			return o1.compareTo(o2);
		}

		@Override
		public int compare(String o1, String o2) {
			return comparar(o1, o2);
		}
	}

	public Delegados() {
	}
	@FunctionalInterface
	interface Operacion {
		double calcula(double a, double b);
	}

	@Autor(nombre = "Yo mismo")
	public int ordenDes(String uno, @Autor(nombre = "Yo mismo") String dos) {
		return -uno.compareTo(dos);
	}

	public void test() {
		List<String> lista = null;

		boolean cond = true;
		Operacion op;
		if (cond) {
			op = (a, b) -> a + b;
		} else {
			op = (a, b) -> a * b;
		}
		// ...

		BinaryOperator<Double> bOperator = (a, b) -> a * b;
		
		double rslt = op.calcula(0, 0);

		ordenar(lista, new BinariaAsc());

		ordenar(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		ordenar(lista, (o1, o2) -> -o1.compareTo(o2));
		ordenar(lista, this::ordenDes); // (o1, o2) -> this.ordenDes(o1, o2)
		ordenar(lista, BinariaAsc::comparar); // (o1, o2) -> BinariaAsc.comparar(o1, o2)
		ordenar(lista, String::compareTo);   // o1.compareTo(o2)

		Comparator<String> orderby = (a, b) -> -a.compareTo(b);

		var kk = new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return -a.compareTo(b);
			}
		};
		orderby.compare("a", "b");
		ordenar(lista, orderby);

		ordenar(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.toLowerCase().compareTo(o2.toLowerCase());
			}
		});
		ordenar(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.toLowerCase().compareTo(o2.toLowerCase());
			}
		});
		find(lista, s -> s.startsWith("J"));
	}

	public String find(List<String> lista, Predicate<String> where) {
		for (String item : lista) {
			if(where.test(item))
				return item;
		}
		return null;
	}
	
	public List<String> ordenar(List<String> lista, Comparator<String> comparador) {
		List<String> rsltList = null;
		String s1 = "", s2 = "";
		// ...
		if (comparador.compare(s1, s2) < 0) {
			// ...
		} else if (comparador.compare(s1, s2) == 0) {
			// ...
		} else {
			// ...
		}
		// ...
		return rsltList;
	}

	/*
	 * public List<String> ordenar(List<String> lista, int tipo) { List<String>
	 * rsltList = null; String s1 = "", s2 = ""; // ... switch (tipo) { case 1:
	 * if(s1.compareTo(s2) < 0) { // .. } else if(s1.compareTo(s2) == 0) { // ... }
	 * else { // ... } break; case 2: // ... if(s1.compareTo(s2) > 0) { // .. } else
	 * if(s1.compareTo(s2) == 0) { // ... } else { // ... } break; default: throw
	 * new IllegalArgumentException("Unexpected value: " + tipo); } // ... return
	 * rsltList; } /* public List<String> ordenarDesc(List<String> lista) {
	 * List<String> rsltList = null; String s1 = "", s2 = ""; // ...
	 * if(s1.compareTo(s2) > 0) { // .. } else if(s1.compareTo(s2) == 0) { // ... }
	 * else { // ... } // ... return rsltList; }
	 */
}
