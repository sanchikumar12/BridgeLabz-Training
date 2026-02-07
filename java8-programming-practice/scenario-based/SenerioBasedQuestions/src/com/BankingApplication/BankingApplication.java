package com.BankingApplication;

import java.util.*;

/* Nominee */
class Nominee {
    String name;

    Nominee(String name) {
        this.name = name;
    }

    Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

/* Loan */
class Loan {
    String loanType;
    Double amount;

    Loan(String loanType, Double amount) {
        this.loanType = loanType;
        this.amount = amount;
    }

    Optional<Double> getAmount() {
        return Optional.ofNullable(amount);
    }
}

/* Transaction */
class Transaction {
    String referenceNumber;

    Transaction(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    Optional<String> getReferenceNumber() {
        return Optional.ofNullable(referenceNumber);
    }
}

/* Credit Card */
class CreditCard {
    String cardNumber;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    Optional<String> getCardNumber() {
        return Optional.ofNullable(cardNumber);
    }
}

/* Bank Account */
class BankAccount {
    String accountNumber;
    Double balance;
    Nominee nominee;
    Loan loan;
    Transaction transaction;
    CreditCard creditCard;

    BankAccount(String accountNumber, Double balance, Nominee nominee,
                Loan loan, Transaction transaction, CreditCard creditCard) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.nominee = nominee;
        this.loan = loan;
        this.transaction = transaction;
        this.creditCard = creditCard;
    }

    Optional<Nominee> getNominee() {
        return Optional.ofNullable(nominee);
    }

    Optional<Loan> getLoan() {
        return Optional.ofNullable(loan);
    }

    Optional<Double> getBalance() {
        return Optional.ofNullable(balance);
    }

    Optional<Transaction> getTransaction() {
        return Optional.ofNullable(transaction);
    }

    Optional<CreditCard> getCreditCard() {
        return Optional.ofNullable(creditCard);
    }
}

public class BankingApplication {

    private static final double MIN_BALANCE = 1000.0;

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "ACC123",
                null,
                null,
                new Loan("Home Loan", 500000.0),
                new Transaction(null),
                new CreditCard("4567-XXXX-XXXX-1234")
        );

        /* 1. Nominee handling */
        account.getNominee()
                .map(Nominee::getName)
                .orElse(Optional.of("No nominee assigned"))
                .ifPresent(n -> System.out.println("Nominee: " + n));

        /* 2. Fetch loan details */
        account.getLoan()
                .ifPresentOrElse(
                        l -> System.out.println("Loan Amount: " + l.getAmount().orElse(0.0)),
                        () -> System.out.println("No loan available")
                );

        /* 3. Balance or minimum balance */
        double balance = account.getBalance().orElse(MIN_BALANCE);
        System.out.println("Account Balance: " + balance);

        /* 4. Safe transaction reference number */
        String refNo = account.getTransaction()
                .flatMap(Transaction::getReferenceNumber)
                .orElse("Reference not available");
        System.out.println("Transaction Ref: " + refNo);

        /* 5. Display credit card details only if present */
        account.getCreditCard()
                .map(CreditCard::getCardNumber)
                .ifPresent(card -> System.out.println("Credit Card: " + card));
    }
}
