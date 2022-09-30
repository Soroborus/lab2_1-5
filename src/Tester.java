import java.sql.Array;
import java.util.Scanner;

public class Tester {
    protected int quantity;
    protected Circle array[];
    Tester(int n){
        Scanner c= new Scanner(System.in);
        array=new Circle[n];
        double x,y,R;
        System.out.println("Input elements' centre coordinates and radius");
        for (int i=0;i<n;i++){
            x=c.nextDouble();
            y=c.nextDouble();
            R=c.nextDouble();
            array[i]=new Circle(x,y,R);

        }
        this.quantity=n;
    }
    public void output(){
        for (int i=0;i<this.quantity;i++){
            System.out.println(array[i]);
        }
    }


}
