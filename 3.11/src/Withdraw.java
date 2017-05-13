
import java.util.Scanner;

public class Withdraw {
 private String name;
 private double balance;
 public Account(String name, double balance){
	 this.name = name;
	 
	 if (balance > 0.0)
		 this.balance = balance;
 }
 
 public void deposit(double depositamount){
	 if (depositamount > 0.0)
		 balance = balance + depositstatement;
 }
 public void withdraw(double withdrawamount){
	 if (balance > withdrawamount)
		 balance = balance - withdrawamount;
	 else
		 System.out.print ("withdraw amount excedes balance");
	 return balance;
 }
 
 public double getbalance(){
	 return balance;
 }
 public void setname(string name){
 this.name = name;
 }
}
