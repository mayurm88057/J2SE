package ConstructorEx;

import java.lang.reflect.Constructor;

public class Object2 {

	public static void main(String[] args)  throws Exception,SecurityException{
 Constructor<Data> constructor = Data.class.getConstructor();
 Data d2=constructor.newInstance();
 d2.m1();
 System.out.println(d2.name);
	}
}
