/**
 * Created by user on 10/22/2016.
 */
public class ExArray {
    public static void main(String[] args) {
        int[] sir={-69,-6,-71,-8,-9}; //doar daca stiu valorile

        double avg;
        int sum=0;
        int max=sir[0];
       // int[]sir=new int[5]; //le citesc de undeva
        for(int i=0;i<sir.length;i++) //initializez
        {
            System.out.println(sir[i]); //afisez
            sum=sum+sir[i];
            if(sir[i]>max)
            {
                max=sir[i];
            }
        }
        avg=sum/(double)sir.length;
        System.out.println("avg:"+avg);
        System.out.println("max este:"+max);

        for(int d=0;d<sir.length;d++)
        {
            System.out.println(2*sir[d]);
        }
        for(int v=0;v<sir.length;v++)
        {
            if(sir.length%2!=0)
            {
                System.out.println(sir.length%2);
            }

        }


    }
}
