package au.com.anz

import au.com.bank.configuration.Transactions
import au.com.bank.configuration.User
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

@SpringBootApplication
@EnableConfigurationProperties(User:: class, Transactions:: class)
class BankApplication
fun main(args: Array<String>) {
    SpringApplication.run(BankApplication::class.java, *args)
}