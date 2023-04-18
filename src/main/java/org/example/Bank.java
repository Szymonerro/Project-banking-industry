package org.example;


    // 1st class - Bank
    public class Bank {

        // 3 public properties (pola)
        public String bankName = "Lloyds Bank";
        private String bankBranch;
        private String address;

        // constructor with 3 properties
        public Bank(String bankName, String bankBranch, String address) {
            this.bankBranch = bankBranch;
            this.address = address;
        }

        // get and set methods that allow access to properties
        public String getBankBranch() {
            return bankBranch;
        }

        public void setBankBranch(String bankBranch) {
            this.bankBranch = bankBranch;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        // 2nd class - Bank Account
        public class BankAccount {
            // two private properties
            private String accountNumber;
            private double balance;

            public BankAccount(String accountNumber, double balance) {
                this.accountNumber = accountNumber;
                this.balance = balance;
            }

            public String getAccountNumber() {
                return accountNumber;
            }

            public void setAccountNumber(String accountNumber) {
                this.accountNumber = accountNumber;
            }

            public double getBalance() {
                return balance;
            }

            public void setBalance(double balance) {
                this.balance = balance;
            }
        }

        // 3rd class - Customer
        public class Customer {
            private String firstName;
            private String lastName;
            private String address;

            public Customer(String firstName, String lastName, String address) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.address = address;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }
        }

        // 4th class - bankEmployee
        public class BankEmployee {
            private String employeeName;
            private String employeeLastName;
            private int employeeId;

            public BankEmployee(String employeeName, String employeeLastName, int employeeId) {
                this.employeeName = employeeName;
                this.employeeLastName = employeeLastName;
                this.employeeId = employeeId;
            }

            public String getEmployeeName() {
                return employeeName;
            }

            public void setEmployeeName(String employeeName) {
                this.employeeName = employeeName;
            }

            public String getEmployeeLastName() {
                return employeeLastName;
            }

            public void setEmployeeLastName(String employeeLastName) {
                this.employeeLastName = employeeLastName;
            }

            public int getEmployeeId() {
                return employeeId;
            }

            public void setEmployeeId(int employeeId) {
                this.employeeId = employeeId;
            }
        }

        // 5th class - Bank Manager
        public class BankManager {
            private String managerName;
            private String managerLastName;
            private int managerId;

            public BankManager(String managerName, String managerLastName, int managerId) {
                this.managerName = managerName;
                this.managerLastName = managerLastName;
                this.managerId = managerId;
            }

            public String getManagerName() {
                return managerName;
            }

            public void setManagerName(String managerName) {
                this.managerName = managerName;
            }

            public String getManagerLastName() {
                return managerLastName;
            }

            public void setManagerLastName(String managerLastName) {
                this.managerLastName = managerLastName;
            }

            public int getManagerId() {
                return managerId;
            }

            public void setManagerId(int managerId) {
                this.managerId = managerId;
            }
        }

        // 6th class - Transaction
        public class Transaction {
            private String transactionType;

            public Transaction(String transactionType) {
                this.transactionType = transactionType;
            }

            public String getTransactionType() {
                return transactionType;
            }

            public void setTransactionType(String transactionType) {
                this.transactionType = transactionType;
            }
        }

        // 7th class - TransactionHistory
        public class TransactionHistory {
            private String transactionType;
            private int numberOfTransactions;

            public TransactionHistory(String transactionType, int numberOfTransactions) {
                this.transactionType = transactionType;
                this.numberOfTransactions = numberOfTransactions;
            }

            public String getTransactionType() {
                return transactionType;
            }

            public void setTransactionType(String transactionType) {
                this.transactionType = transactionType;
            }

            public int getNumberOfTransactions() {
                return numberOfTransactions;
            }

            public void setNumberOfTransactions(int numberOfTransactions) {
                this.numberOfTransactions = numberOfTransactions;
            }
        }

        // 8th class - Account Type
        public class AccountType {
            private String accountType;

            public AccountType(String accountType) {
                this.accountType = accountType;
            }

            public String getAccountType() {
                return accountType;
            }

            public void setAccountType(String accountType) {
                this.accountType = accountType;
            }
        }

        // 9th class - Savings Account
        public class SavingAccount {
            private double amountOfSavings;
            private int interestRate;

            public SavingAccount(double amountOfSavings, int interestRate) {
                this.amountOfSavings = amountOfSavings;
                this.interestRate = interestRate;
            }

            public double getAmountOfSavings() {
                return amountOfSavings;
            }

            public void setAmountOfSavings(double amountOfSavings) {
                this.amountOfSavings = amountOfSavings;
            }

            public int getInterestRate() {
                return interestRate;
            }

            public void setInterestRate(int interestRate) {
                this.interestRate = interestRate;
            }
        }

            // 10th class - Investment Account
            public class InvestmentAccount {
                private String accountNumber;
                private double balance;

                public InvestmentAccount(String accountNumber, double balance) {
                    this.accountNumber = accountNumber;
                    this.balance = balance;
                }

                public String getAccountNumber() {
                    return accountNumber;
                }

                public void setAccountNumber(String accountNumber) {
                    this.accountNumber = accountNumber;
                }

                public double getBalance() {
                    return balance;
                }

                public void setBalance(double balance) {
                    this.balance = balance;
                }
            }

            // 11th class - Investment Account
            public class BusinessAccount {
                private String accountNumber;
                private double balance;

                public BusinessAccount(String accountNumber, double balance) {
                    this.accountNumber = accountNumber;
                    this.balance = balance;
                }

                public String getAccountNumber() {
                    return accountNumber;
                }

                public void setAccountNumber(String accountNumber) {
                    this.accountNumber = accountNumber;
                }

                public double getBalance() {
                    return balance;
                }

                public void setBalance(double balance) {
                    this.balance = balance;
                }
            }

            // 12th class - Card Type
            public class CardType {
                private String cardType;

                public CardType(String cardType) {
                    this.cardType = cardType;
                }

                public String getCardType() {
                    return cardType;
                }

                public void setCardType(String cardType) {
                    this.cardType = cardType;
                }
            }

            // 13th class - Credit Card
            public class CreditCard {
                private String cardType;
                private int cardNumber;
                private double balance;

                public CreditCard(String cardType, int cardNumber, double balance) {
                    this.cardType = cardType;
                    this.cardNumber = cardNumber;
                    this.balance = balance;
                }

                public String getCardType() {
                    return cardType;
                }

                public void setCardType(String cardType) {
                    this.cardType = cardType;
                }

                public int getCardNumber() {
                    return cardNumber;
                }

                public void setCardNumber(int cardNumber) {
                    this.cardNumber = cardNumber;
                }

                public double getBalance() {
                    return balance;
                }

                public void setBalance(double balance) {
                    this.balance = balance;
                }
            }

            // 14th class - Debit Card
            public class DebitCard {
                private String cardType;
                private int cardNumber;
                private double balance;

                public DebitCard(String cardType, int cardNumber, double balance) {
                    this.cardType = cardType;
                    this.cardNumber = cardNumber;
                    this.balance = balance;
                }

                public String getCardType() {
                    return cardType;
                }

                public void setCardType(String cardType) {
                    this.cardType = cardType;
                }

                public int getCardNumber() {
                    return cardNumber;
                }

                public void setCardNumber(int cardNumber) {
                    this.cardNumber = cardNumber;
                }

                public double getBalance() {
                    return balance;
                }

                public void setBalance(double balance) {
                    this.balance = balance;
                }
            }

            // 15th class - Loan
            public class Loan {
                private double loanAmount;
                private int interestRate;

                public Loan(double loanAmount, int interestRate) {
                    this.loanAmount = loanAmount;
                    this.interestRate = interestRate;
                }

                public double getLoanAmount() {
                    return loanAmount;
                }

                public void setLoanAmount(double loanAmount) {
                    this.loanAmount = loanAmount;
                }

                public int getInterestRate() {
                    return interestRate;
                }

                public void setInterestRate(int interestRate) {
                    this.interestRate = interestRate;
                }
            }
        }