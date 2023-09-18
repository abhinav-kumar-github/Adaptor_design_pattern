package com.abhinav.adaptor.ThirdPartyService;

import org.springframework.stereotype.Service;

public class IciciThirdPartyBankService implements ThirdPartyBankService {
    public void getBalance() {
        System.out.println("ICICI bank balance fetched");
    }
    public void sendMoney() {
        System.out.println("ICICI bank money sent");
    }
}
