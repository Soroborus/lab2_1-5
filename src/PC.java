public class PC {
    protected String CPU;
    protected String GPU;
    protected int RAM;
    protected int price;

    PC(String CPU,String GPU,int RAM,int price){
        this.CPU=CPU;
        this.GPU=GPU;
        this.RAM=RAM;

        this.price=price;

    }
    PC(){
        this.CPU="";
        this.GPU="";
        this.RAM=0;

        this.price=0;

    }

    @Override
    public String toString() {
        return (this.GPU+" "+this.CPU+" "+this.RAM+" "+this.RAM);
    }
}
