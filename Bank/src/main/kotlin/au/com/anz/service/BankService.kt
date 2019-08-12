package au.com.anz.service

import au.com.bank.configuration.Transactions
import au.com.bank.model.AccountList
import au.com.bank.configuration.User
import au.com.bank.model.TransactionList
import au.com.bank.model.UserMap
import org.springframework.stereotype.Service
import java.util.stream.Collectors



@Service
class BankService (private val user: User,
                   private val transactions: Transactions) {
    fun getBankAccounts(customerId : String) : List<AccountList>? {
        val accountsMap: MutableMap<Int, UserMap> = user.userMap.stream().collect(Collectors.toMap({ account -> account.userId }, { account -> account }))
        return accountsMap[customerId.toInt()]?.accountList?.toList()

    }

    fun getAccountTransactions(customerId : String) :List<TransactionList>? {

        return transactions.transactionList.filter { transactionList -> transactionList.accountId==customerId.toLong() }

    }
}