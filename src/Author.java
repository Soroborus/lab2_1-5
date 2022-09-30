public class Author extends testAuthor {
    private String name;
    private String email;
    private char gender;
Author(String name, String email,char gender){
    super(name,email,gender);
}
 public String getName(){
    return super.name;
 }
 public String getEmail(){
    return super.email;
 }
 public void setEmail(String email){
    this.email=email;
 }
 public char getGender(){
    return super.gender;
 }
 @Override
 public String toString(){
    return super.name+" "+super.email+" "+super.gender;
 }
}
abstract  class testAuthor{
 protected String name;
 protected String email;
 protected char gender;
 testAuthor(String name, String email,char gender){
     this.name=name;
     this.email=email;
     this.gender=gender;
 }


}
