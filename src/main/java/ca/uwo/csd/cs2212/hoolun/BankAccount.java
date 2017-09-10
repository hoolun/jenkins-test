package ca.uwo.csd.cs2212.hoolun;

public class BankAccount {

  private double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (amount < 0) {
      amount = 0;
    }

    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

  public double credit(double amount) {
    if (amount < 0) {
      amount = 0;
    }

    balance += amount;
    return amount;
  }

}
