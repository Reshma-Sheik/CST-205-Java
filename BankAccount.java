class BankAccount{	//data

String accName;
int accNo;
String accType;
double accBalance;

void deposit(double x){
System.out.println("Amount deposited = "+x+"\n");
accBalance += x;
display();
}
 
void withdraw(double x){
System.out.println("Amount withdrawn = "+x+"\n");
accBalance -= x;
display();	}
 
void display(){
System.out.println("Account User = "+accName+"\nAccount Balance = "+accBalance+"\nAccount type = "+accType+"\nAccount No = "+accNo+"\n");
}
void disAmount(double x){
System.out.println("Amount entered = "+x+"\n");	
}

//constructors

BankAccount(String s, String t, int n, double b){	
System.out.println("\nHello User !"); 
accName = s;
accType = t;
accNo = n;
accBalance = b;
display();
}

BankAccount(){	 //default
System.out.println("\nHello User !");
display();
}
 
public static void main(String args[]){
boolean flag;
double Amount;

BankAccount acc1 = new BankAccount(); //First user is null of account type null with initial balance 0 and account no 0
Amount = 1000.00; 		//Amount to be deposited
flag = true; 		//Since deposit
acc1.disAmount(Amount);
if(flag)
acc1.deposit(Amount);
else 
if(acc1.accBalance<Amount)
System.out.println("Insufficient balance !");
else	
acc1.withdraw(Amount);

BankAccount acc2 = new BankAccount("Edward", "Savings", 12345, 125000);
Amount = 10000; 			//Amount to be withdrawn
flag = false; 			//Since withdraw
acc2.disAmount(Amount);	
if(flag)
acc2.deposit(Amount);
else 
if(acc2.accBalance<Amount)
System.out.println("Insufficient balance !");
else
acc2.withdraw(Amount);
}
}
