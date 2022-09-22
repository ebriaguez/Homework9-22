package Homework2;

public class Account {
    /*
Create a class named Homework2.Account - CHECK
Give it one instance variable - balance - CHECK
Create a getter and a setter - CHECK
Make sure that one cannot set the balance of the account class to a negative number - CHECK
Create an Homework2.Account object in main - CHECK
Attempt to set the balance to a negative balance - CHECK
Then use your getter to get the balance and print it out*/

    //instance variable
    private double balance;

    //getter and setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(this.balance < 0){
            this.balance = balance;
        } else if (this.balance > 0){
            this.balance = 0;;
        }
    }
}
