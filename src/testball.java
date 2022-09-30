public class testball extends ball{
    private double x;
    private double y;
    public void pushback(){
        super.y=0;
        super.x=0;
        printCords();
    }
    public void printCords(){
        System.out.println("The ball is at ("+super.x+","+super.y+").");
    }
    testball(){
        super();
    }
    testball(double x,double y){
        super(x,y);
    }
}
