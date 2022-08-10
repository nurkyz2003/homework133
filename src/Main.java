import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] massiv = {1,3,5,7,9};
        Class klass = new Class(19,"Nurkyz",massiv);
        System.out.println(klass.getNumber());
        System.out.println(klass.getWord());
        System.out.println(Arrays.toString(klass.getArray()));
    }
}