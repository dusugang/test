package com.youbaoplus.tee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;

public class ReflectTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		String className="java.lang.Double";
		Class cls=Class.forName(className);
		Class clsp=cls.getSuperclass();
		System.out.print(Modifier.toString(cls.getModifiers())+" ");
		System.out.print("class "+cls.getName());
		if(clsp!=null &&clsp!=Object.class){
			System.out.println(" extends "+clsp.getName()+"{\n");
			
		}
		printCostruts(cls);
		System.out.println();
		printMethods(cls);
		System.out.println();
		printFields(cls);
		System.out.println("}");
		System.exit(0);
	}
	
	
	public static void printCostruts(Class c1){
		Constructor []constr=c1.getDeclaredConstructors();
		
		for (Constructor constructor : constr) {
			String name=constructor.getName();
			String modifyStr=Modifier.toString(constructor.getModifiers());
			if(modifyStr.length()>0){
				System.out.print(modifyStr+" ");
			}
			
			System.out.print(name+"(");
			Class []parm=constructor.getParameterTypes();
			
			for (int i = 0; i < parm.length; i++) {
				if(i>0){
					System.out.print(",");
				}
				System.out.print(parm[i].getName());
			}
			System.out.println(");");
		}
		
		
	}
	public static void printMethods(Class c){
		Method []methods =c.getDeclaredMethods();
		for (Method method : methods) {
			Class retType=method.getReturnType();
			String modifiStr=Modifier.toString(method.getModifiers());
			String name =method.getName();
			System.out.print(modifiStr+" ");
			System.out.print(retType.getName()+" ");
			System.out.print(name+"(");
			Class []par = method.getParameterTypes();
			for (int i = 0; i < par.length; i++) {
				if (i>0) {
					System.out.print(",");
				}
				System.out.print(par[i].getName());
			}
			System.out.println(");");
		}
	}
	
	public static void printFields(Class c){
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			Class type = field.getType();
			String name = field.getName();
			System.out.print(Modifier.toString(field.getModifiers())+" ");
			System.out.print(type+" ");
			System.out.println(name+" ;");
			
		}
	}

}
