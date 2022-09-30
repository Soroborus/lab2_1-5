public class Kenel {
    private Dog kenel[]=new Dog[10000];
    private int length=0;
    Kenel(Dog kenel[]){
        for (int i=0;i<kenel.length;i++){
            this.kenel[i]=kenel[i];
            length++;
        }
    }
    public void addDog(Dog a){
        if (length==10000){
            System.out.println("No more space");
        }
        else{
            this.kenel[length]=a;
            length++;
        }
    }
}
