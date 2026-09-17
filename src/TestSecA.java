//1==> Create two classes which have two methods each 
//2==> Both methods must have a different return type 
//3==> call them in main class and allocate memory 
class One
{
public int uAge()
{
int age=20;
return age;
}
public float fees()
{
float fee=20000.0f;
return fee;
}
}
class Two
{
public String name()
{
String uname="Admin";
return uname;
}
public char initials()
{
char in='a';
return in;
}
}
public class TestSecA
{
public static void main(String xyz[])
{
One one=new One();
Two two=new Two();
System.out.println("Main start");
System.out.println(one.uAge());
System.out.println(one.fees());
System.out.println(two.name());
System.out.println(two.initials());
}
}
