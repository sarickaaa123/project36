package project35;

public class Student {//klasa
	int id;//date member(instancirana varijabla)
	String ime;//date member(instancirana varijabla)
   int starost;//date member(instancirana varijabla)
   
   Student(int i,String n){//konstruktor so 2 parimetri
	   id=i;
	   ime=n;
	}
   Student(int i,String n, int a){//konstruktor so 3 parimetri
	   id=i;
	   ime=n;
	   starost=a;
   }
   void display() {//metod
	System.out.println(id + "" + ime + "" + starost);
   }
 public static void main(String args[]) {
	 Student s1=new Student(111,"Petar");//kreiraj objekt s1
	 Student s2=new Student(222,"Marko", 25);//kreiraj objekt s2
	 s1.display();//pecati - s1
	 s2.display();//pecati - s2
 }
}