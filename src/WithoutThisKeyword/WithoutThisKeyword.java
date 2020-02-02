
package WithoutThisKeyword;

public class WithoutThisKeyword {
    int id;
    String name;
   WithoutThisKeyword(int id, String name){
   id = id;
   name = name;
   } 
   void display(){
       System.out.println(id + " " + name);
   }
    public static void main(String[] args) {
        
        WithoutThisKeyword s1 = new WithoutThisKeyword(1, "Wan Sornolota IT");
        WithoutThisKeyword s2 = new WithoutThisKeyword(2, "Wanipti");
        
        s1.display();
        s2.display();
    }
}
