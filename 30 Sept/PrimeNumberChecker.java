import java.util.*; //Importing util java library
public class PrimeNumberChecker{
	public static void main(String[] args){
	int num;
	Scanner myObj=new Scanner(System.in);
	Boolean flag=false;
	
	System.out.println("Enter the Number:");
	num = myObj.nextInt();
	
	//for 0 and 1 
	if(num==0 || num==1){
		flag= true;
	}
	//condition for non-prime number
	for(int i=2;i<num/2;i++){
	if(num%i==0){
		flag=true;
		break;
	}
	}
	if(!flag) System.out.println(num+ "is a prime number.");
	else System.out.println(num+"is not a prime number");	
	
}
}