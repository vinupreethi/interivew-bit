package org.Ecommerce;

import java.util.Scanner;

public class NetBanking implements PaymentService {
    private String Sellername;
    private String password;
    private Account account;
    public NetBanking(String Sellername, String password) {
        this.Sellername = Sellername;
        this.password = password;
    }

    @Override
    public void pay(double amount) throws InSufficientBalanceException {
        System.out.println("Enter Sellername");
        Scanner scanner=new Scanner(System.in);
        String Sellername=scanner.next();
        String password=scanner.next();
        account=new Account(Sellername,password);
        if(account.checkBalance()) {
            account.withdrawAmount(amount);
        }
        else
        {
            throw new InSufficientBalanceException("Insufficient Balance");
        }
    }
}
