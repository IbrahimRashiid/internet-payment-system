package com.software.Phase2.Refund;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class RefundController {
    RefundService refundService=new RefundService();
    /////////add refund////////////////
    @PostMapping(value="/addRefund")
    public String addRefund(@RequestBody Refund refund  )
    {
       return refundService.addRefund(refund);

    }
    /////////////get all refunds//////////////
    @GetMapping(value="/getAllRefund")
    public List<Refund> getAllRefund()
    {
        return refundService.Refunds;
    }
    @PutMapping(value="/acceptRefund")
    public String accept(@PathParam("id") int id, @PathParam ("status") boolean status)
    {

    return  refundService.AcceptOrReject(id,status);
    }

}
