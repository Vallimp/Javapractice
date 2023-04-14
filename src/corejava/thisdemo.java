package corejava;

public class thisdemo {
//global variabel
int a= 2;

 public void getData()
 {
	 //local variable
int a= 3;
int b=a+this.a;
System.out.println(a);
System.out.println(this.a);
System.out.println(b);
//this always refers to the global variable
// this refers to current object- object scope lies in class level
}
//

public static void main(String[] args) {
// TODO Auto-generated method stub

thisdemo td=new thisdemo();
td.getData();
	}

}

