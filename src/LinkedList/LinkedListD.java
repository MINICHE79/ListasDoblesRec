package LinkedList;

import node.node;

public class LinkedListD<T> {
	private node<T> start = null, end = null;
	
	public LinkedListD(){
		start = new node<T>();
		start.setIndex(-1);
		end = new node<T>();
		end.setIndex(-1);
	}
	
	public LinkedListD(T value){
		this();
		start.setNext(new node<T>(value));
//		start.getNext().setIndex(0);
		end.setBack(start.getNext());
		Reindex();
	}
	
	public void add(T value){
		node<T> tmp = end.getBack();
		end.setBack(new node<T>(value));
		if (tmp == null){
			start.setNext(end.getBack());
		} 
		else{
			end.getBack().setBack(tmp);
			tmp.setNext(end.getBack());
		}
		Reindex();
	}
	
	public void addstart(T value){
		node<T> tmp = start.getNext();
		start.setNext(new node<T>(value));
		if (tmp == null){
//			start.getNext().setIndex(0);
			end.setBack(start.getNext());
		} 
		else{
			start.getNext().setNext(tmp);
			tmp.setBack(start.getNext());
		}
		Reindex();
	}
	
	public void addend(T value){
		node<T> tmp = end.getBack();
		end.setBack(new node<T>(value));
		if (tmp == null){
//			end.getBack().setIndex(0);
			start.setNext(end.getBack());
		} 
		else{
			end.getBack().setBack(tmp);
			tmp.setNext(end.getBack());
		}
		Reindex();
	}
	
	public boolean addbefore(T value, T newvalue){
		node<T> finder = search(value);
		node<T> nodo = new node<T>(newvalue);
		if(finder != null){
			nodo.setNext(finder);
			nodo.setBack(finder.getBack());
			finder.getBack().setNext(nodo);
			finder.setBack(nodo);
			Reindex();
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean addafter(T value, T newvalue){
		node<T> finder = search(value);
		node<T> nodo = new node<T>(newvalue);
		if(finder != null){
			nodo.setNext(finder.getNext());
			finder.setNext(nodo);
			nodo.setBack(finder);
			nodo.getNext().setBack(nodo);
			Reindex();
			return true;
		}
		else{
			return false;
		}
	}
	
	public void getfirst(){
		node<T> tmp = start.getNext();
		System.out.println(tmp.getValue());
	}
	
	public void getlast(){
		node<T> tmp = end.getBack();
		System.out.println(tmp.getValue());
	}
	
	public void indexof(T value){
		node<T> finder = search(value);
		if(finder != null)
			System.out.println(finder.getIndex());
	}
	
	public node<T> search (T value){
		return search (value, start, end); 
	}
	private node<T> search (T value, node<T> start, node<T> end){
		if (start.getNext() == null || end.getBack() == null){
			System.out.println("vacia");
			return null;
		}
		else if(start.getNext().getValue().equals(value)){
			return start.getNext();
		}
		else if(end.getBack().getValue().equals(value)){
			return end.getBack();
		}
		else if(start.getNext().equals(end) || start.equals(end)){
			System.out.println("mitad");
			return null;
		}
		return search(value, start.getNext(), end.getBack());
	}
	
	public boolean Remove(T value){
		node <T> tmp = search(value);
		if(tmp!=null){
			if(tmp.getNext() != null)
				tmp.getNext().setBack(tmp.getBack());
			else
				end.setBack(tmp.getBack());
			if(tmp.getBack() != null)
				tmp.getBack().setNext(tmp.getNext());
			else
				start.setNext(tmp.getNext());
			Reindex();
			return true;
		}
		return false;
	}
	
	public void Reindex(){
		node<T> tmp = start;
		int i = 0;
		while (tmp.getNext()!=null) {
			tmp = tmp.getNext();
			tmp.setIndex(i);
			i++;
		}
	}
	
	public void pronter() {
		node<T> tmp = start;
		while (tmp.getNext()!=null) {
			tmp = tmp.getNext();
			System.out.println(tmp.getValue()  + "   " + tmp.getIndex());
		}
	}
	
	public void prenter() {
		node<T> tmp = end;
		while (tmp.getBack()!=null) {
			tmp = tmp.getBack();
			System.out.println(tmp.getValue() + "   " + tmp.getIndex());
		}
	}

}
