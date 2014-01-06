/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.card;

/**
 *
 * @author Shivraj
 */
public class CreditCard {
    
    
    private String cardHolderFirstName;

    public String getCardHolderFirstName() {
        return cardHolderFirstName;
    }

    public void setCardHolderFirstName(String cardHolderFirstName) {
        this.cardHolderFirstName = cardHolderFirstName;
    }

    public String getCardHolderLastName() {
        return cardHolderLastName;
    }

    public void setCardHolderLastName(String cardHolderLastName) {
        this.cardHolderLastName = cardHolderLastName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCv2Number() {
        return cv2Number;
    }

    public void setCv2Number(String cv2Number) {
        this.cv2Number = cv2Number;
    }
    private String cardHolderLastName;
    private String cardNo;
    private String cardType;
    private String cv2Number;
}
