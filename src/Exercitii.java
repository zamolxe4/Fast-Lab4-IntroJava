/**
 * Created by user on 10/22/2016.
 */
public class Exercitii {
    public static void main(String[] args) {
        int a=SkeletonJava.readIntGUI("Introduceti primul numar:");
        int b=SkeletonJava.readIntGUI("Introduceti al doilea numar:");
        double avg=(a+b)/2.0;
        SkeletonJava.printGUI("media este:"+avg);
    }

}
