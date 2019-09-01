package ch17.hyungnam;

public class PrinterDriver {

	public static void main(String[] args) {
		String myDoc="This is a report about . . .";
		
		Printable1 prn=new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		prn=new LPrinterDriver();
		prn.print(myDoc);
	}

}

interface Printable1{
	public void print(String doc);
	
}

class SPrinterDriver implements Printable1{
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable1{
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}
