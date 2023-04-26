package com.software.Phase2.transactions;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class Transactions {
  public  static List<String>refundTransaction=new ArrayList<String>();
  public  static List<String>paymentTransaction=new ArrayList<String>();
  public  static List<String>walletTransaction=new ArrayList<String>();
  public List<String>getPaymentTransaction()
  {
      return paymentTransaction;
  }
  public List<String>getRefundTransaction()
  {
    return refundTransaction;
  }
  public List<String>getWalletTransaction()
  {
    return walletTransaction;
  }


}
