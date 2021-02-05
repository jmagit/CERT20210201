package com.sample;

import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sample.contracts.FacturaRepository;
import com.sample.domains.entities.Alumno;
import com.sample.domains.entities.Factura;
import com.sample.domains.entities.Persona;
import com.sample.domains.entities.Profesor;
import com.sample.domains.services.FacturaService;

public class Principal {

	private Integer rslt = 0;

	public static void main(String[] args) {
		try {
			var p = new Profesor(1, "Un", "Profesor", 33);
			ExecutorService servicio= Executors.newFixedThreadPool(10);
			Future<Integer> resultado= servicio.submit(() -> {
				int rslt = 0;
				for (int i = 1; i++ < 10;) {
					System.out.println("Hilo 1 - " + i);
					rslt += i;
//					if(i > 7)
//						throw new IndexOutOfBoundsException("Demo");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return rslt;
			});
			Future<Integer> resultado1= servicio.submit(() -> p.getId());
			
//			while (!resultado.isDone()) {
//				System.out.println("Esperando");
//				Thread.sleep(0);
//			}
			System.out.println("Llegue");
			System.out.println("Resultado 2: " + resultado1.get());
			System.out.println("Resultado: " + resultado.get());
			System.out.println("Termine");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("Upssss");
			e.getCause().printStackTrace();
		} finally { 
		 	//servicio.shutdown();
		}

	}
	public static void conRunable(String[] args) {
		int rslt = 0;
		var hilo1 = new Thread(() -> {
			for (int i = 1; i++ < 10;) {
				System.out.println("Hilo 1 - " + i);
				if(i > 7)
					throw new IndexOutOfBoundsException("Demo");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		var hilo2 = new Thread(() -> {
			for (int i = 1; i++ < 7;) {
				System.out.println("Hilo 2 - " + i);
				try {
					Thread.sleep(666);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//hilo1.stop();
		});

		try {
			hilo1.start();
			hilo2.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		// ...
//		do {
//			if (!hilo1.isAlive())
//				System.out.println("Hilo 1 terminado");
//			if (!hilo2.isAlive())
//				System.out.println("Hilo 2 terminado");
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		} while (hilo1.isAlive() || hilo2.isAlive());
	}

	public static void old(String[] args) {
//		List<Integer> listOfIntegers = List.of(1, 2, 3, 7, 8, 9, 4, 5, 6);
//		System.out.println("Sequential Stream: ");
//		listOfIntegers.stream().sorted().forEach(e -> System.out.print(e + " "));
//		System.out.println("\nParallel Stream: ");
//		listOfIntegers.stream().parallel()
//			.map(e -> Math.sqrt(e)).sequential().sorted().forEach(e -> System.out.print(e + " "));

		List<Persona> lista = List.of(new Profesor(1, "Un", "Profesor", 33), new Alumno(10, "Pepito", "Grillo", 2),
				new Alumno(11, "Carmelo", "Coton", 55), new Alumno(12, "Pedro", "Pica Piedra", 33),
				new Alumno(13, "Pablo", "Marmol", 32), new Profesor(2, "Otro", "Profe", 66));
//		lista.stream()
//			.filter(e -> e instanceof Alumno && e.getEdad() == 33)
//			.sorted((a,b) -> a.getNombre().compareTo(b.getNombre()))
//			.map(e -> e.getNombre() + " " + e.getApellidos())
//			.forEach(System.out::println);
		System.out.println("num: " + lista.stream().filter(e -> e instanceof Profesor).count());
		boolean soloAlumnos = true, paginado = true;
		int page = 0, rows = 3;
//		lista.stream().filter(e -> e instanceof Profesor)
//			.forEach(e -> e.setNombre(e.getNombre().toUpperCase()));
		List<Profesor> profes = lista.stream().filter(e -> e instanceof Profesor)
				.peek(e -> e.setNombre(e.getNombre().toUpperCase())).map(e -> (Profesor) e)
				.collect(Collectors.toList());
		profes.forEach(System.out::println);
		lista.forEach(System.out::println);
		Stream<Persona> consulta = lista.stream();
		if (soloAlumnos) {
			consulta = consulta.filter(e -> e instanceof Alumno);
		}
		if (paginado) {
			consulta = consulta.sorted().skip(page * rows).limit(rows);
		}
		consulta.map(e -> e.getEdad()).forEach(System.out::println);
		Stream.of(Profesor.class.getMethods()).map(m -> m.getReturnType()) // .getName())
				// .filter(m -> m.startsWith("set"))
				.forEach(System.out::println);
//		FacturaService srv = new FacturaService();
//		
//		srv.add(new Factura());
		/*
		 * ServiceLoader<FacturaRepository> services =
		 * ServiceLoader.load(FacturaRepository.class); services.forEach(s ->
		 * s.add(null)); services.stream().forEach(s ->
		 * System.out.println(s.getClass().getName())); try { // var c =
		 * Class.forName("com.sample.infraestructure.UoW.DataBase"); var s =
		 * services.findFirst().get(); var c = s.getClass();
		 * Stream.of(c.getDeclaredMethods()) .forEach(m ->
		 * System.out.println(m.getName())); Stream.of(c.getDeclaredFields()) .forEach(m
		 * -> System.out.println(m.getName())); var f = c.getDeclaredField("db"); Object
		 * o = f.get(s); c.newInstance(); // c.getConstructors()[0].newInstance(); var m
		 * = o.getClass().getDeclaredMethod("test"); // Object o = f.get(s);
		 * c.newInstance(); // c.getConstructors()[0].newInstance();
		 * m.setAccessible(true); m.invoke(o); } catch (Exception e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

}
