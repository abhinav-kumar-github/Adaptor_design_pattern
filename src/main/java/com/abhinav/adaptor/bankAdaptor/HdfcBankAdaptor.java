package com.abhinav.adaptor.bankAdaptor;

import com.abhinav.adaptor.ThirdPartyService.HdfcThirdPartyBankService;

public class HdfcBankAdaptor implements BankAdaptor {
    HdfcThirdPartyBankService hdfcThirdPartyBankService;
    public HdfcBankAdaptor() {
        this.hdfcThirdPartyBankService = new HdfcThirdPartyBankService();
    }
    public void getBalance() {hdfcThirdPartyBankService.getBalance();}
    public void sendMoney() {hdfcThirdPartyBankService.sendMoney();}
}
