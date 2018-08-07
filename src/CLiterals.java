/**
 *  Class to show examples of character literals
 */

public class CLiterals {
    public static void main(String[] args) {
        System.out.println('a');

        System.out.print("->");
        System.out.print('\n');
        System.out.println("<-");

        System.out.print("->");
        System.out.print('\t');
        System.out.println("<-");

        System.out.print("->");
        System.out.print('\\');
        System.out.println("<-");

        System.out.print("->");
        System.out.print('\'');
        System.out.println("<-");

        System.out.println('\u096A'); // 4
        System.out.println('\u0041'); // A
        System.out.println('\u23F3'); // hourglass
        System.out.println('\u20B9'); // indian symbol
    }
}
