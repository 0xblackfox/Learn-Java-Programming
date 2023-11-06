import java.util.*;

public class array_list {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();

		al.add(12);
		al.add(23);
		al.add(1);
		/*		System.out.println(al);*/
		al.add(2, 123);
		al.add(12);

		System.out.println(al);
		/*
				al.remove(1);
				System.out.println(al);*/


		/*		List<Integer> newal = new ArrayList<>();
				newal.add(5);

				al.addAll(newal);

				System.out.println(al);*/

		/*		for (int n : al) {
					System.out.println(get(n));
				}*/

		/*		al.remove(Integer.valueOf(23));
				System.out.println(al);*/

		/*		al.clear();
				System.out.println(al);*/

		/*		al.set(0, 21);
				System.out.println(al);


				System.out.println(al.contains(20));*/


		for (int i = 0; i < al.size(); i++ ) {
			System.out.println("normal Iterable: " + al.get(i));

		}

		for (Integer n : al) {
			System.out.println("Foreach Iterable: " + n);

		}


		Iterator<Integer> list = al.iterator();
		while (list.hasNext()) {
			System.out.println("Iterator : " + list.next());
		}




	}


}