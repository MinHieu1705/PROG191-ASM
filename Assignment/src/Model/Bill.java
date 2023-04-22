/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class Bill extends Menu implements Serializable {
    
    private Integer quanity;
    private Integer subTotal;
    private Date date;

    public Bill(String code, String name, Integer price, Integer quanity, Integer subTotal, Date date) {
        super(code, name, price);
        this.quanity = quanity;
        this.subTotal = subTotal;
        this.date = date;
    }

    public Integer getQuanity() {
        return quanity;
    }

    public void setQuanity(Integer quanity) {
        this.quanity = quanity;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
