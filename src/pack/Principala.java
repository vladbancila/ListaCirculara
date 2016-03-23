package pack;

public class Principala {

	public static void main(String[] args) {
		
		MyCircularList listaCirculara = new MyCircularList();
		
		System.out.println(listaCirculara.toString());
		
		listaCirculara.insereazaElement(1);		
		
		listaCirculara.insereazaElement(2);
		
		listaCirculara.insereazaElement(3);
		
		listaCirculara.insereazaElement(4);
		
		System.out.println(listaCirculara.first.element);
		
		System.out.println(listaCirculara.first.next.element);
		
		System.out.println(listaCirculara.first.next.next.element);
		
		System.out.println(listaCirculara.first.next.next.next.element);
		
		System.out.println(listaCirculara.first.next.next.next.next.element);
		
		System.out.println(listaCirculara.toString());
	}

}
