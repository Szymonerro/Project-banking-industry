package org.example;

import org.apache.commons.io.FileUtils;
import org.example.card.CreditCard;
import org.example.collectionStream.*;
import org.example.linkedLists.AccountNumbersManager;
import org.example.linkedLists.BranchEmployeeManager;
import org.example.account.*;
import org.example.card.DebitCard;
import org.example.enums.*;
import org.example.exceptions.*;
import org.example.operations.*;
import org.example.people.BankEmployee;
import org.example.people.BankManager;
import org.example.people.Customer;
import org.example.threads.ThreadClassExample;
import org.example.utils.*;
import org.example.threads.RunnableInterfaceExample;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//import org.example.utils.BubbleSort;

public class Main {
    public static void main(String[] args) throws InsufficientFundsException, TransferLimitExceededException, WrongAmountException, TransfersAmountLimitException, TransferFailedException, IOException {

        AppStart appStart = new AppStart();
        appStart.welcome();

        Bank mainBranch = new Bank ("Main branch", "22 Percival Court, London, UK");
        Bank branch1 = new Bank ("Warsaw Branch 01", "Marszałkowska 102, Warsaw, PL");

        ArrayList<Customer> customer = new ArrayList<>();
        customer.add(new Customer(Title.MR, "Szymon", "Rosiak", 27, "Lazurowa 12, Warszawa", EmploymentContractType.EMPLOYMENT_CONTRACT, 5000));
        customer.add(new Customer(Title.MRS, "Izabela", "Kowalska", 26, "Prosta 51, Kraków", EmploymentContractType.PART_TIME_EMPLOYMENT_CONTRACT, 10700));
        customer.add(new Customer(Title.MRS, "Izabela", "Kowalska", 26, "Prosta 51, Kraków", EmploymentContractType.PART_TIME_EMPLOYMENT_CONTRACT, 10700));
        customer.add(new Customer(Title.MR, "Michał", "Kaliński", 40, "Kopalniana 16, Wrocław", EmploymentContractType.TEMPORARY_EMPLOYMENT_CONTRACT, 900));

        ArrayList<Customer> company = new ArrayList<>();
        company.add(new Customer("Solvd", 11743254, "Jerozolimskie 100, Warszawa"));

        ArrayList<BankEmployee> bankEmployee = new ArrayList<>();
        bankEmployee.add(new BankEmployee (Title.MR, "Wojciech", "Krawczyk", 26, "Sowińskiego 14, Warszawa", 101, Position.CUSTOMER_SERVICE, 4000));
        bankEmployee.add(new BankEmployee (Title.MR, "Krzysztof", "Laskowski", 33, "Niebieska 7, Warszawa", 102, Position.CUSTOMER_SERVICE, 4000));
        bankEmployee.add(new BankEmployee (Title.MR, "Natalia", "Markowska", 29, "378 Victoria Street, London", 103, Position.CUSTOMER_SERVICE, 4000));

        LinkedList<BranchEmployeeManager> employeeList = new LinkedList<>();
        employeeList.add(new BranchEmployeeManager(bankEmployee.get(0), branch1));
        employeeList.add(new BranchEmployeeManager(bankEmployee.get(1), branch1));
        employeeList.add(new BranchEmployeeManager(bankEmployee.get(2), mainBranch));

        ArrayList<BankManager> bankManager = new ArrayList<>();
        bankManager.add(new BankManager(Title.MR, "Krzysztof", "Mazur", 40, "Szkolna 16, Warszawa", 112, Position.BRANCH_MANAGER, 7000));

        BankAccount bankAccount = new BankAccount(customer.get(0), 4827110000234560L, 2000);
        SavingsAccount savingsAccount = new SavingsAccount(customer.get(1), 2312387231369120L, 5, 5000);
        InvestmentAccount investmentAccount = new InvestmentAccount(customer.get(0), 5353529874324001L, 10000);
        BusinessAccount businessAccount = new BusinessAccount(company.get(0), 6767112212120001L, 70000);

        AccountNumbersManager accountNumber = new AccountNumbersManager();
        accountNumber.add(bankAccount.getAccountNumber());
        accountNumber.add(savingsAccount.getAccountNumber());

        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        Transfer transfer = new Transfer ();

        LoanCalculator loanCalculator = new LoanCalculator();
        CreditScoreCalculator creditScoreCalculator = new CreditScoreCalculator(18,4000,500);

        ArrayList<CreditRequest> creditRequest = new ArrayList<>();
        creditRequest.add(new CreditRequest(customer.get(0), 4000, 10));
        creditRequest.add(new CreditRequest(customer.get(2),1000,4));
        creditRequest.add(new CreditRequest(customer.get(0),2500, 1));

        CreditCard creditCard = new CreditCard(68793782124L, customer.get(0), Color.GOLD, bankAccount, CardBrand.VISA);
        DebitCard debitCard = new DebitCard(76768696969L, customer.get(0), Color.SILVER, bankAccount, CardBrand.MASTERCARD);

        bankAccount.setCard(debitCard);
        bankAccount.setCard(creditCard);

        File inputFile = new File("ProjectRequirements.txt");
        File outputFile = new File("UniqueWordsAmount.txt");
        String newText = "Read text from the file and calculate the numbers of the unique words. Write the result to the file.\n" +
                "The main requirement is: using StringUtils and FileUtils to implement it with minimum lines of code.";
        FileUtils.writeStringToFile(inputFile, newText, "UTF-8");

        UniqueWordsCounterUtils.countUniqueWords(inputFile, outputFile);

        ThreadClassExample thread1 = new ThreadClassExample();
        ThreadClassExample thread2 = new ThreadClassExample();
        RunnableInterfaceExample runnable = new RunnableInterfaceExample();
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);


//        .BubbleSort bubbleSort = new BubbleSort();
//        .bubbleSort.bubbleSort();
//        .System.out.println(bubbleSort);

        System.out.println("\n********** BANK BRANCH DETAILS **********\n");
        System.out.println(mainBranch);
        System.out.println(branch1);

        System.out.println("********** WORKERS **********\n");
        System.out.println(bankEmployee.get(0) + "\n");
        System.out.println(bankManager.get(0) + "\n");

        System.out.println("********** CUSTOMERS **********\n");
        System.out.println(customer.get(0) + "\n");
        System.out.println(customer.get(1) + "\n");
        System.out.println(company + "\n");

        System.out.println("********** CUSTOMERS CREDIT SCORES **********\n");
        customer.get(0).creditScoring();
        customer.get(1).creditScoring();
        customer.get(3).creditScoring();

        System.out.println("********** ADULT STATUS **********\n");
        System.out.println("Is customer2 adult?" +
                "\nAnswer: " + customer.get(3).isAdult());

        System.out.println("\n********** BANK ACCOUNTS **********\n");
        System.out.println(bankAccount + "\n");
        System.out.println(savingsAccount + "\n");
        System.out.println(investmentAccount + "\n");
        System.out.println(businessAccount + "\n");

        System.out.println("********** CHANGE ACCOUNT LIMITS **********\n");
        bankAccount.changeWithdrawalLimit(15);
        bankAccount.changeMaxDailyTransferAmount(15000);
        System.out.println("Current daily transfer limit: " + bankAccount.getMaxDailyTransfers() + "\n");
        bankAccount.changeMaxDailyTransfers(20);
        System.out.println("Current daily transfer limit: " + bankAccount.getMaxDailyTransfers() + "\n");

        System.out.println("********** CARDS **********\n");
        System.out.println(creditCard + "\n");
        System.out.println(debitCard + "\n");

        System.out.println("********** WHOSE CARD? **********\n");
        System.out.println(creditCard.checkOwner());

        System.out.println("\n********** CARD BLOCK / UNBLOCK **********\n");
        debitCard.block();
        System.out.println("\nIs debitCard blocked?\n" +
                "Answer: " + debitCard.isBlocked() + "\n");
        debitCard.unblock();
        System.out.println("\nIs debitCard blocked?\n" +
                "Answer: " + debitCard.isBlocked() + "\n");

        System.out.println("********** DEPOSITS / WITHDRAWS **********\n");

        withdraw.withdraw(bankAccount, 9);
        deposit.deposit(bankAccount, 100);
        deposit.deposit(bankAccount, -40);
        deposit.deposit(bankAccount, 100);
        withdraw.withdraw(businessAccount, 80000);

        System.out.println("\n********** TRANSFERS **********\n");
        transfer.transfer(bankAccount, savingsAccount, 700);
        transfer.transfer(businessAccount,savingsAccount, 10, "Test description");
//        transfer.transfer(bankAccount,savingsAccount, 1600);       - InsufficientFundsException

        System.out.println("********** BALANCE CHECK **********\n");
        CheckBalance.checkBalance(bankAccount);

        System.out.println("********** CREDIT SCORE CALCULATOR **********\n");
        creditScoreCalculator.creditScoring();


        System.out.println("********** LOAN CALCULATOR **********\n");
        loanCalculator.loanCalculator(42000, 36,6.5 );
        loanCalculator.loanCalculator(90, 36,6.5 );

        System.out.println("\n********** CREDIT REQUESTS **********\n");
        creditRequest.get(0).verification();
        creditRequest.get(1).verification();
        creditRequest.get(2).verification();

        System.out.println("********** COMPARISON - equals() **********\n");
        System.out.println("customer1.equals(customer2): " + customer.get(2).equals(customer.get(3))); // true
        System.out.println("customer.equals(customer2): " + customer.get(0).equals(customer.get(3))); // false

        System.out.println("\n********** COMPARISON - hashCode() **********\n");
        System.out.println("customer.hashCode(): " + customer.get(0).hashCode()); // unique value
        System.out.println("customer1.hashCode(): " + customer.get(2).hashCode()); // unique value
        System.out.println("customer2.hashCode(): " + customer.get(3).hashCode()); // same value as customer1.hashCode()

        System.out.println("\n********** ACCOUNT NUMBERS LINKED LIST **********\n");
        accountNumber.showElements();
        System.out.println(accountNumber.size());
        System.out.println(accountNumber.get(0));
        accountNumber.remove(0);
        System.out.println(accountNumber.size());
        accountNumber.add(businessAccount.getAccountNumber());
        System.out.println(accountNumber.size());
        for (BranchEmployeeManager employeeManager : employeeList) {
            if (employeeManager.getBranch().equals(branch1)) {
                employeeManager.showEmployeesInBranch(branch1);
            }
        }

        System.out.println("********** LAMBDA TEST **********\n");
        System.out.println(LambdaExample.isPositive.test(5));
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");

        System.out.println(LambdaExample.<Integer>getFirstElement().apply(intList)); // 1
        System.out.println(LambdaExample.<String>getFirstElement().apply(stringList)); // a

        System.out.println(LambdaExample.<Integer>getAverage().apply(intList)); // 3.0
        System.out.println(LambdaExample.getAverage().apply(Arrays.asList(1.0, 2.0, 3.0))); // 2.0

        System.out.println(LambdaExample.concatenateStrings.apply("Hello ", "world" + "\n")); // HelloWorld

        System.out.println("********** COLLECTION STREAM **********\n");
        CustomerNameCollectionStream.printCustomerNames(customer);
        AdultCustomersStream.printAdultCustomers(customer);
        CustomerCountStream.printCustomerCount(customer);
        AverageAgeStream.printAverageAge(customer);
        MaleCustomersStream.filterMaleCustomers(customer);
        FemaleCustomersStream.filterFemaleCustomers(customer);
        CustomerSalaryStream.filterCustomersAboveSalary(customer, 5000);
        CustomerCreditScoreStream.filterCustomersCreditScore(customer, 20);

        System.out.println("\n********** REFLECTION **********\n");

        Class<Customer> customerClass = Customer.class;

        ReflectionUtils.getClassInformation(customerClass);
        ReflectionUtils.getFieldInformation(customerClass);
        ReflectionUtils.getConstructorInformation(customerClass);
        ReflectionUtils.getMethodInformation(customerClass);
        ReflectionUtils.invokeMethod(customer.get(0), "creditScoring");


        System.out.println("********** THREADS TEST **********\n");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}

