package com.abhinav.adaptor;

import com.abhinav.adaptor.bankAdaptor.BankAdaptor;
import com.abhinav.adaptor.bankAdaptor.HdfcBankAdaptor;
import com.abhinav.adaptor.bankAdaptor.IciciBankAdaptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdaptorApplication {
    public static void main(String[] args) {
//        SpringApplication.run(AdaptorApplication.class, args);
        System.out.println("############################");
        System.out.println("#  Adaptor design pattern  #");
        System.out.println("############################\n\n");

        BankAdaptor bankAdaptor1 = new HdfcBankAdaptor();
        bankAdaptor1.getBalance();
        bankAdaptor1.sendMoney();

        BankAdaptor bankAdaptor2 = new IciciBankAdaptor();
        bankAdaptor2.getBalance();
        bankAdaptor2.sendMoney();
    }

}