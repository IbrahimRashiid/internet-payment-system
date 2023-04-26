package com.software.Phase2.Refund;

import java.util.ArrayList;
import java.util.List;

import com.software.Phase2.Database.DataBaseUser;
import com.software.Phase2.registeration.User;
import com.software.Phase2.transactions.Transactions;
import org.springframework.stereotype.Component;

@Component
public class RefundService {
	 static List<Refund>Refunds=new ArrayList<>();
	User user;
	    public String addRefund(Refund refund)
	     {
			 user= DataBaseUser.searchByUserName(refund.getUserName());
			 if(user==null) return "User not found";
    else {
			 Refunds.add(refund);

			 DataBaseUser.searchByUserName(refund.getUserName()).setWalletBalance(refund.getRefundAmount()+user.getWalletBalance());
			 Transactions.refundTransaction.add(refund.getUserName()+" added refund "+
					 refund.getRefundAmount()+" for "+refund.getServiceName());
				 Transactions.walletTransaction.add(refund.getUserName()+" added "+
						 refund.getRefundAmount()+" to his wallet");

			 return "Refund is added successfully";
	}

	     }

		 public List<Refund>allRefunds()
		 {
			 return Refunds;
		 }

	     public String AcceptOrReject(int n,boolean stu)
	     {
          --n;
	         Refunds.get(n).setStatus(stu);
			 return "done!!";
	     }



}
