package main;

public class GenericMethods {
	
	public static <T> void argumentosGenericos(T arg1, T arg2, T arg3) {
		
        System.out.println("Argumentos: " + arg1 + ", " + arg2 + ", " + arg3);
    }
	
	public static void main(String args[]) {
        Persona persona = new Persona("Joel", "Vasquez", 20);

        argumentosGenericos(persona, "Hola", 42);
        argumentosGenericos(3.14, true, "Mundo");
        argumentosGenericos('A', 123, false);
	}


}
