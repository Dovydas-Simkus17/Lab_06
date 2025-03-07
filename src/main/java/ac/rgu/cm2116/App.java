package Lab_06.src.main.java.ac.rgu.cm2116;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ArrayList<Integer> jim = new ArrayList<>();
        jim.add(5);
        jim.add(10);
        System.out.println(jim.get(0));
        jim.remove(0);
        System.out.println(jim.get(0));
    }
}
