package com.project.react_spring.Models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Accounts {
    public int account_id;
    public int limit;
    public List<String> products;

    public Accounts() {
    }

    public Accounts(int account_id, int limit, List<String> products) {
        this.account_id = account_id;
        this.limit = limit;
        this.products = products;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
