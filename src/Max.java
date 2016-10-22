/**
 * Created by user on 10/22/2016.
 */
public class Max {
    public static void main(String[] args) {


        int max = 0;
        int i = 1;
        int n = SkeletonJava.readIntGUI("Dati n:");


        while (true) {
            for (i = 1; i <=n;i++) {

                int nr = SkeletonJava.readIntGUI("Introduceti nr " + i);
                if (nr > max) {
                    max = nr;

                }



            }
            SkeletonJava.printGUI("Maximul este: " +max);

        }
    }
}