package app;



import java.util.Iterator;

import LinkedList.LinkedListD;

public class App {

	public static void main(String[] args) {
		LinkedListD<String> names     = new LinkedListD<String>();
		LinkedListD<String> names2    = new LinkedListD<String>();
		LinkedListD<Integer> Nums     = new LinkedListD<Integer>(1);
		LinkedListD<Integer> Nums2    = new LinkedListD<Integer>(2);
		LinkedListD<Integer> Nums3    = new LinkedListD<Integer>();
		
		Nums.addend(3);
		Nums2.addend(4);
		
		Nums3.Merge(Nums, Nums2);
		
		Nums3.pronter();
//		System.out.println(Nums.SonIguales(Nums2));
//		System.out.println(Nums.Suma());
//		System.out.println(Nums.Maximo());
		names.addstart("adios");
		names.addstart("hola");
		names.addend("Carcel");
		names.addstart("lolis");
		
//		names.addstart("lolis");
		
		names.add("Pepe");
		names.addafter("hola", "Jose");
		names.addbefore("hola", "Perro");
		
//		names.clear();
//		names.Remove("Perro");
//		names.removefirst();
//		names.removelast();
//		names.RemoveAfter("adios");
//		names.RemoveBefore("Pepe");
//		System.out.println(names.ExisteElemento("hola"));
		System.out.println(names.Ocurrencia("lolis"));
		
		Iterator<String> iterator = names.iterator();
		for (Iterator<String> i = iterator; i.hasNext();) {
			System.out.println(iterator.next());
		}
		
//		names.pronter();
//		names.prenter();
//		names.indexof("Jose");
//		names.getfirst();
//		names.getlast();

	}

}
