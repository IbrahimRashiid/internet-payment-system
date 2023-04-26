package com.software.Phase2.transactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class TransactionsController {
    Transactions transactions=new Transactions();
    @GetMapping(value = "/transaction/Payment")
    public List<String> getPaymentTransactions()
    {
      return transactions.getPaymentTransaction();
    }
    @GetMapping(value = "/transaction/Refund")
    public List<String> getRefundTransactions()
    {
        return transactions.getRefundTransaction();
    }
    @GetMapping(value = "/transaction/Wallet")
    public List<String> getWalletTransactions()
    {
        return transactions.getWalletTransaction();
    }
}
