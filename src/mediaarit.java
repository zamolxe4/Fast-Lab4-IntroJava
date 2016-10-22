/**
 * Created by user on 10/22/2016.
 */
public class mediaarit {
    public static void main(String[] args) {
            int sum=0;
        int counter=0;
        while(true)
        {
            counter++;
            int nrCurent=SkeletonJava.readIntGUI("Introduceti numarul "+counter+": ");
            if(nrCurent<0 || counter>=10)
            {
                counter--;
                break;
            }
            sum=sum+nrCurent;
        }
        double avg=sum/(double)counter;
        SkeletonJava.printGUI("media este: "+avg);
    }
}
