
package atm_project;
import java.util.*;
/**
 *
 * @author A212565
 */
public class ATM_Project {

    BankDatabase atm = new BankDatabase();
Account acc = new Account();
ArrayList<Account> accounts = new ArrayList<>() ;
Scanner sca = new Scanner(System.in);


int attempts;
int choice;
    //public int accountNumber;
    public int pin; 
    public String firstname;
    public String lastname;
    public String accounttype;
    static String bank;
    
   
    
    static {
     bank = "wBank";
    }
    
  
 
    public static void main(String[] args) {
        
        ATM_Project atmsystem = new ATM_Project();
        
        atmsystem.Selection();
     
        Account acc = new Account();
        
        BankDatabase atm =new BankDatabase();
        
        ArrayList<Account> accounts = new ArrayList<>() ;
        
        
    }
static int accountNumber;
public void Selection() {
    BankDatabase atm1 = new BankDatabase();
    int accountnum = atm1.getAccnum(accountNumber);
System.out.println("*********Welcome to the wBank ATM system***********");
System.out.println("Please enter your account number: ");
accountNumber=sca.nextInt();
System.out.println("Please enter your pin number: ");
int pin =sca.nextInt();
if(atm1.getAccount(accountNumber)!=atm1.getAccount(accountNumber) && 
 atm1.getAccountpin(pin)!= atm.getAccountpin(pin)){
  System.out.println("Account number or pin is incorrect, please re-enter!!!");
    Selection();

}else {
System.out.println("You have successfully logged in");
    while(true) {
        
    System.out.println("Welcome "+ atm1.getFirstname(firstname, accountNumber)+" " +atm1.getLastname(lastname, accountNumber) +" "+ atm1.getaccounttype(accounttype, accountNumber)) ;
        System.out.println("Please select the option you require: ");
        System.out.println("1. Check balance");
        System.out.println("2. Withdrawal");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. updatePin");
        System.out.println("6. Re-login");
        System.out.println("7. Exit");
        
      choice = sca.nextInt();
        
        switch(choice) {
            case 1:
                Check_balance(); 
                break;
            case 2:
                Withdrawal();
                break;
            case 3:
                Deposit();
                break;
            case 4:
                Transfer();
                break;
            case 5:
                resetPin();
                break;
            case 6:
                Selection();
                break;
            case 7:
                System.out.println("Thank you for using the system, see you next time!");
                System.exit(0);
                break;
            default :
                System.out.println("Invalid selection! Please re-enter the options");
                break;
        }
    }
}
 }

public void Check_balance(){
  BankDatabase atm1 = new BankDatabase();
  int accountnum = atm1.getAccnum(accountNumber);
  System.out.println("Currently, your available balance is: R" + 
  atm1.getavailable(accountnum));
 
}
 
public void Withdrawal(){
    BankDatabase atm1 = new BankDatabase();
    int accountnum = atm1.getAccnum(accountNumber);
    System.out.println("Please enter the amount you want to withdraw ");
    double withdrawal = sca.nextDouble();
    if(withdrawal <= atm1.getavailable(accountnum)){
         withdrawal = atm1.getAvailableWithdrawal(accountNumber, pin, withdrawal);
         atm1.getAvailablenewBalance(accountNumber);
        System.out.println("Withrawal successful. Your new available balance is R"+ atm1.getAvailablenewBalance(accountNumber));
    }
    else{
        System.out.println("You have insufficient funds for the withdrawal. Please try again");
  
    }
}   

public void Deposit(){
BankDatabase atm1 = new BankDatabase();
int accountnum = atm1.getAccnum(accountNumber);
System.out.println("Please enter the deposit amount R:");
double deposit = sca.nextDouble();
if(deposit > 0 || deposit < atm.getAvailableDeposit(accountnum,deposit)|| deposit > atm1.getAvailableDeposit(accountnum,deposit)){
deposit = atm1.getAvailableDeposit(accountnum,deposit);
//atm1.getAvailablenewBalance(accountNumber);
System.out.println("Congratulations, the deposit is successful! Your available balance is R"+ atm1.getAvailablenewBalance(accountNumber));
}
else{
System.out.println("No deposit amount inserted");
}
}


public void Transfer(){
BankDatabase atm1 = new BankDatabase();
int accountnum = atm1.getAccnum(accountNumber);
System.out.println("Please enter the account number of the person you are trasnsferring to:");
int accountnumber=sca.nextInt();
if(accountnumber != atm.authenticateAccount(accountnumber)){
    System.out.println("Account number incorrect. Please insert the correct account number");
  }
else{
System.out.println("Please enter the transfer amount R:" );
double transfer=sca.nextDouble();
if(transfer <= atm1.getAvailableBalance(accountnum)) {
transfer = atm1.getAvailableTransfer(accountnum, transfer);
//atm.getAvailablenewBalance(accountnumber);
System.out.println("Transfer is successful, your new available balance is R" + atm1.getAvailablenewBalance(accountNumber));  
}else {
System.out.println("The transfer amount is insufficient, please try again wit a lesser amount");
}
}
}
  
public void resetPin() {
System.out.println("Please enter the original pin:");
int pin=sca.nextInt();
if((acc.equals(pin))) {
System.out.println("Please enter a new pin:");
int newpin1=sca.nextInt();
System.out.println("Please enter the new pin again:");
int newpin2=sca.nextInt();
if(acc.validatePIN(newpin2)) {
System.out.println("The pin number has been successfully modified, and will log in again soon!!!");
acc.setPin(newpin1);
Selection();
}else {
System.out.println("The new pin number you entered twice is not the same, please try again!!!");
resetPin();
}
}else {
attempts++;
if(attempts>=3) {
System.out.println("The pin you entered three times is incorrect!");
System.out.println("The number of attempts exceeds the limit, will exit the ATM system!!!");
System.exit(0);
}
System.out.println("The pin entered is not the same as the original pin, please re-enter:");
resetPin();
    
}
}
}


