package main;

public class Main {

	public static void main(String[] arg) {
		NoGenericMethods<String> noGenericMethods1 = new NoGenericMethods<>("Joel", "Janeth", "Cielo");
		NoGenericMethods<Integer> noGenericMethods2 = new NoGenericMethods<>(1, 2, 3);
		NoGenericMethods<Double> noGenericMethods3 = new NoGenericMethods<>(1.1, 2.2, 3.3);

		System.out.println("Objeto generico 1: " + noGenericMethods1.getObjeto1() +  noGenericMethods1.getObjeto2() + noGenericMethods1.getObjeto3());

		System.out.println("Objeto generico 2: " + noGenericMethods2.getObjeto1() + noGenericMethods2.getObjeto2() +  noGenericMethods2.getObjeto3());

		System.out.println("Objeto generico 3:  " + noGenericMethods3.getObjeto1() + noGenericMethods3.getObjeto2() + noGenericMethods3.getObjeto3());

	}
}
