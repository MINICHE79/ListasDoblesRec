package app;



import LinkedList.LinkedListD;

public class App {

	public static void main(String[] args) {
		LinkedListD<String> names     = new LinkedListD<String>();
		names.addstart("adios");
		names.addstart("hola");
		names.addend("Carcel");
		names.addstart("lolis");
		names.addafter("hola", "Jose");
		names.addbefore("hola", "Perro");
		
		names.Remove("Perro");
		
		names.pronter();
		
//		names.indexof("Jose");
//		names.getfirst();
//		names.getlast();

	}

}
