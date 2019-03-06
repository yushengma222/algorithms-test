package com.example.algorithms.jsontest;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yushengma
 */
public class Person {
    private String name;
    private Date birthDate;
    private BigDecimal money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
