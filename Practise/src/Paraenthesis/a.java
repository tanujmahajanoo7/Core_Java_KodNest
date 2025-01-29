import java.util.*;

class Main {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> bm = new HashMap<>();
        bm.put(')', '(');
        bm.put('}', '{');
        bm.put(']', '[');

        for(char ch : expression.toCharArray()) {
            if(bm.containsKey(ch)){
                char topElement=stack.isEmpty() ? '#' :stack.pop();
                if(bm.get(ch)!=topElement) {
                    return false;
                }
            }
            else {
                stack.push(ch);
            }
        }    
        return stack.isEmpty();    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();  // Read user input

        boolean result = isBalanced(expression);
        System.out.println(result ? "true" : "false");
    }
}
