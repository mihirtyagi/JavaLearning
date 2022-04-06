package Unit_01;

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
	
		// Converting int into Integer
		int a= 20;
		
		String s = "" + a +"";
		
		Integer i = Integer.valueOf(a); //Converting int into interger explicitly
		Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) Internally
		
		System.out.println(a + " " + " " j);
		
		System.out.println(byteobj);
		
		//Unboxoing: Converting Objexts to Primitives
		byte bytevalue = byteobj;
		System.out.println(bytevalue);
		
		}

	}
