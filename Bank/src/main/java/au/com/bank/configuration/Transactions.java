package au.com.bank.configuration;

import au.com.bank.model.AccountList;
import au.com.bank.model.TransactionList;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "transactions")
public class Transactions {
    private List<TransactionList> transactionList = new ArrayList<>();

    public List<TransactionList> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<TransactionList> transactionList) {
        this.transactionList = transactionList;
    }
}
