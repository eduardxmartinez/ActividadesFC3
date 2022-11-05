import java.util.ArrayList;

public class mainTree {
    public static void main(String args[]) {
		BinaryTree ob = new BinaryTree();
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(25);
		arr.add(30);
		arr.add(35);
	
		int n = arr.size();
		
		//elemento a buscar
		int x = 10;
	
		System.out.println("Los elementos son: "+arr);
	
		int posicion = ob.binarySearch(arr,0,n-1,x);
	
		if (posicion == -1)
			System.out.println("Elemento inexistente");
		else
			System.out.println("El elemento " + x + " se encuentra en la "
							+ "posicion " + posicion);
	}
}
