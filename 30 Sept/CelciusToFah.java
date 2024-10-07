import java.util.Scanner; //Import the scanner class
public class CelciusToFah{
	public static void main(String args[]){
	float fah,cel;
	Scanner myObj=new Scanner(System.in);
	System.out.println("Enter the temp. in celcius:");
	cel=myObj.nextInt();
	
	fah=((cel*9)/5)+32;
	System.out.println("Temperature in Fahrenheit is:"+ fah);
	}
}