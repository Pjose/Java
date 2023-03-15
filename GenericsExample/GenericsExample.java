package com.pj.generics

/* Program that shows the kind of problems Java Generics 
 * was intended to solve.
 */
public class IntegerPrinter {
	Integer itemToPrint;
	
	public IntegerPrinter(Integer itemToPrint) {
		this.itemToPrint = itemToPrint;
	}
	
	public void print() {
		System.out.println(itemToPrint);
	}
}

package com.pj.generics
public class GenericExample {
	
	public static void main(String[] args) {
		
		IntegerPrinter printer = new IntegerPrinter(23);
		printer.print();
		
		DoublePrinter doublePrinter = new DoublePrinter(33.4);
		printer.print();
		
		StringPrinter doublePrinter = new StringPrinter("Hello, from printer.");
		printer.print();
	}
}

package com.pj.generics
public class DoublePrinter {
	Double itemToPrint;
	
	public IntegerPrinter(Double itemToPrint) {
		this.itemToPrint = itemToPrint;
	}
	
	public void print() {
		System.out.println(itemToPrint);
	}
}

package com.pj.generics
public class StringPrinter {
	String itemToPrint;
	
	public IntegerPrinter(String itemToPrint) {
		this.itemToPrint = itemToPrint;
	}
	
	public void print() {
		System.out.println(itemToPrint);
	}
}

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

package com.pj.generics
public class Printer<T> {
	T itemToPrint;
	
	public Printer(T itemToPrint) {
		this.itemToPrint = itemToPrint;
	}
	
	public void print() {
		System.out.println(itemToPrint);
	}
}

package com.pj.generics
public class GenericExample {
	
	public static void main(String[] args) {
		
		Printer<Integer> printer = new Printer<>(23);
		printer.print();
		
		Printer<Double> dblPrinter = new Printer<>(33.4);
		dblPrinter.print();
		
		Printer<String> strPrinter = new Printer<>("Hello, from printer.");
		strPrinter.print();
	}
}