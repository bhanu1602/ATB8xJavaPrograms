package sept.ex_230924;

public class Lab056 {

    /*
     * Notes:
     * 1. Character arithmetic is possible in a `switch` statement. In this case, `'a' + 1` evaluates to the character 'b' (ASCII value of 'a' is 97, and 'b' is 98).
     * 2. You can use expressions in case labels, as shown here with `'a' + 1`.
     * 3. In Java, the `char` type is essentially a numeric type, so arithmetic operations can be performed on it.
     * 4. The semicolon (`;`) after `case 'a' + 1` is a syntax error; it should be a colon (`:`).
     * 5. The `switch` will match the computed value of `'a' + 1` with `c`. Since `c` is 'a', there is no match for 'b' in this case.
     */

    public static void main(String[] args) {

        char c = 'a';

        switch (c) {
            case 'a' + 1:  // This will evaluate to 'b'
                System.out.println('B');  // Will print 'B' if c is 'b'
                break;
        }
    }
}

