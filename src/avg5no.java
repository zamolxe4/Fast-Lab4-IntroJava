/**
 * Created by user on 10/22/2016.
 */
public class avg5no {
    public static void main(String[] args) {
        int n = SkeletonJava.readIntGUI("Dati n:");
        int sum = 0;
        if (n == 0) {
            SkeletonJava.printGUI("Nu ati introdus niciun numar");
        } else {
            for (int i = 0; i < n; i++) {

                int val = i + 1;
                int nrCurent = SkeletonJava.readIntGUI("int nr " + val + ":");
                sum = sum + nrCurent;
            }
            double avg = sum / (double) n;
            SkeletonJava.printGUI("Media este: " + avg);
        }
    }
}
