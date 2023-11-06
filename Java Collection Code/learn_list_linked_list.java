import java.util.*;

public class learn_list_linked_list {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<>();

		ll.add("hello");
		ll.add("My");
		ll.add("name");
		ll.add("is");
		ll.add("siam");

		System.out.println(ll);

		ll.remove("hello");
		System.out.println(ll);

		System.out.println(ll.get(1));

		Iterator<String> newll = ll.iterator();
		while (newll.hasNext()) {
			System.out.print(newll.next() + " ");
		}


	}

}