package com.abhinav.adaptor.bankAdaptor;

import com.abhinav.adaptor.ThirdPartyService.IciciThirdPartyBankService;

public class IciciBankAdaptor implements BankAdaptor {
    IciciThirdPartyBankService iciciThirdPartyBankService;
    public IciciBankAdaptor() {
        this.iciciThirdPartyBankService = new IciciThirdPartyBankService();
    }
    public void getBalance() {iciciThirdPartyBankService.getBalance();}
    public void sendMoney() {iciciThirdPartyBankService.sendMoney();}
}
