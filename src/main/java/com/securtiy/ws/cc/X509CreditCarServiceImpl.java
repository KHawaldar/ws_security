/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.securtiy.ws.cc;

import com.domain.card.CreditCard;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Shivraj
 */
@WebService(serviceName = "X509CreditCarServiceImpl")
public class X509CreditCarServiceImpl {

    /**
     * This is a sample web service operation
     */
    @WebMethod
   public CreditCard getCreditCardInfo(long cardNumber) {
       CreditCard cc =  new CreditCard();
       cc.setCardHolderFirstName("xxxx");
       cc.setCardHolderLastName("yyyy");
       cc.setCardNo("12345");
       cc.setCardType("VISA");
       return cc;
    }
}
