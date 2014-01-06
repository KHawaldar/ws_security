/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.securtiy.ws.cc;

import com.domain.card.CreditCard;
import javax.jws.WebService;

/**
 *
 * @author Shivraj
 */
//@WebService(endpointInterface = "com.securtiy.ws.cc.CreditCardServiceImpl",serviceName = "userTokencreditcardservice")
@WebService(serviceName = "UserTknCreditCardServiceImplService",portName = "UserTknCreditCardServiceImpl")

public class UserTknCreditCardServiceImpl {

    //@Override
    public CreditCard getCreditCardInfo(long cardNumber) {
       CreditCard cc =  new CreditCard();
       cc.setCardHolderFirstName("xxxx");
       cc.setCardHolderLastName("yyyy");
       cc.setCardNo("12345");
       cc.setCardType("VISA");
       return cc;
    }
    
}
