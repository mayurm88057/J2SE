package SingletonDesignPattern;

import java.lang.reflect.Constructor;

public class Example {
	public static void main(String[] args) throws Exception {
		
		/*
		 * Samosa samosa = Samosa.getSomosa();
		 * 
		 * System.out.println(samosa.hashCode());
		 * 
		 * Samosa samosa2 = Samosa.getSomosa();
		 * 
		 * System.out.println(samosa2.hashCode());
		 * 
		 * System.out.println(Jalebi.getJalebi().hashCode());
		 */
		 // reflection APi to break singleton pattern
		
		Samosa s1=Samosa.getSomosa();
		System.out.println(s1.hashCode());
		
		Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Samosa s2=constructor.newInstance();
		System.out.println(s2.hashCode());
	
	}

}
