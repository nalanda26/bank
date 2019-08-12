package au.com.bank.model;


import au.com.bank.model.AccountList;

import java.util.ArrayList;
import java.util.List;

public class UserMap {

    private int userId;

    private List<AccountList> accountList = new ArrayList<>();

    public List<AccountList> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<AccountList> accountList) {
        this.accountList = accountList;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
