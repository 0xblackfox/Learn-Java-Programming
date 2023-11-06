import java.util.*;

public class learn_stack {

	public static void main(String[] args) {

		Stack<String> stk = new Stack<>();

		stk.push("12");
		stk.push("1232");
		stk.push("121");
		stk.push("siam");
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);

		System.out.println(stk.peek());



	}

}