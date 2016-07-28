package homework2;


import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		//import a scanner so that i can scan in the imput
		//Scanner in = new Scanner(System.in);
		//System.out.println("Input ");
		//Object Interger;
		//int y =in.nextInt();
		 List <String> list = new ArrayList<String>();
	        Scanner stdin = new Scanner(System.in);

	        do {
	            System.out.println("Current list is " + list);
	            System.out.println("Add more? (y/n)");
	            if (stdin.next().startsWith("y")) {
	                System.out.println("Enter : ");
	                list.add(stdin.next());
	            } else {
	                break;
	            }
	        } while (true);

	        System.out.println("List is " + list);
	        String[] arr = list.toArray(new String[0]);
	        System.out.println("Array is " + Arrays.toString(arr));
		
		
	}

}
