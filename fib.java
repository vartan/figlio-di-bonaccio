
/**
 * I made this to explain recusion to someone.
 * @author Vartan
 */
public class Fibonacci {

    public static int fib(int i) {
        return i<=1 ? i : fib(i-2)+fib(i-1);
    }
    /* For example:
     * Let's say we ask for        fib(5)
     *              fib(4)           +              fib(3)
     *      /fib(3)    +      fib(2)\   +    /fib(2)\    +    fib(1)
     * /fib(2)+   fib(1)\+/fib(1)+fib(0)\+/fib(1)+fib(0)\  +   1
    * /fib(1)+fib(0)\+ 1 +   1   +   0   +   1   +  0    +     1
     * 1    +  0  +  1  +    1   +   0   +   1   +  0    +     1
     *                        =5
     *
     * This function is extremely slow because it calls many functions. fib(5)
     * called fib() an additional 14 times, after which it can finally add all
     * of the 1s and 0s up.
     */
}
