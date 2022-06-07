package oops.constructer.paramaterizedconstructer;

public class paramaterizedconstructer {
		
public static void main(String[] args) 
{

Gun gun =new Gun(4,1.5,"Black");

Gun gun1 =new Gun(6,2.4,"Black");

System.out.println(gun.colour);
System.out.println("Gun Details:");
System.out.println("gun.noofbullet:"+gun.noofbullet);
System.out.println("weght:"+gun.weight);
System.out.println("colour:"+gun.colour);


System.out.println(gun1.colour);
System.out.println("Gun Details:");
System.out.println("gun.noofbullet:"+gun1.noofbullet);
System.out.println("weght:"+gun1.weight);
System.out.println("colour:"+gun1.colour);

}
}


