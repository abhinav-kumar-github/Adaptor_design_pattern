package com.abhinav.adaptor.ThirdPartyService;

import org.springframework.stereotype.Service;

public class HdfcThirdPartyBankService implements ThirdPartyBankService {
    public void getBalance() {
        System.out.println("HDFC bank balance fetched");
    }
    public void sendMoney() {
        System.out.println("HDFC bank money sent");
    }
}
