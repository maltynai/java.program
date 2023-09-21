# java.program


The Personal Account Management System is a Java program that simulates a personal bank account, allowing users to make deposits and withdrawals, check their account balance, and view transaction history.

## Table of Contents

- [Overview](#overview)
- [How to Use](#how-to-use)
- [Sample Usage](#sample-usage)
- [Classes](#classes)


## Overview

This Java program consists of three classes: `PersonalAccount`, `Main`, and `Amount`. Here's a brief overview of each class:

- `PersonalAccount`: Represents a personal bank account with methods for depositing, withdrawing, checking the balance, and printing transaction history.

- `Main`: Contains the `main` method and serves as the entry point for the program. It demonstrates the usage of the `PersonalAccount` class by creating an account, making deposits and withdrawals, and displaying the account balance and transaction history.

- `Amount`: Represents an individual transaction with an amount and transaction type (deposit or withdrawal).

## How to Use

To use this Personal Account Management System, follow these steps:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/maltynai/java.project.git
2.Compile the Java files:
  ``bash
   javac Main.java

3.Run the program:
  ``bash
   java Main



## Sample usage

Here's an example of how to use the program:

Create a personal account with an account number and account holder name.

Deposit funds into the account.

Withdraw funds from the account.

Check the account balance.

View the transaction history.

## Classes

PersonalAccount
The PersonalAccount class represents a personal bank account with the following methods:

withdraw(double amount): Allows the user to withdraw funds from the account.

deposit(double amount): Allows the user to deposit funds into the account.

getBalance(): Retrieves the account balance.

printTransactionHistory(): Displays the transaction history.

Amount
The Amount class represents an individual transaction with an amount and transaction type.
