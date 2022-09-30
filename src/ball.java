abstract public class ball {
    protected double x=0.0;
    protected double y=0.0;
    ball(double x,double y){
        this.x=x;
        this.y=y;
    }
    ball(){
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void move(double xDisp,double yDisp){
        this.x+=xDisp;
        this.y=yDisp;
    }
    public String toString(){
        String s;
        s="x="+String.valueOf(this.x)+" y=";
        s+=String.valueOf(this.y);
        return s;
    }
}
