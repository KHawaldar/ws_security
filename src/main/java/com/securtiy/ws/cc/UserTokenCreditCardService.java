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

public interface UserTokenCreditCardService {
    
    public CreditCard getCreditCardInfo(long cardNumber);
    
    
}
