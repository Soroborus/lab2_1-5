public class Dog {
    private String name;
    private int age;
    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getname(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int toHumanAge(){
        return this.age*8;
    }
    public String toString(){
        return (this.name+" is "+this.age+" y.o.");
    }
}
