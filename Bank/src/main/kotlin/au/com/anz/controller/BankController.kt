package au.com.anz.controller

import au.com.anz.service.BankService
import au.com.bank.model.AccountList
import au.com.bank.model.TransactionList
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/v1"])
@Validated
class BankController(private  val bankService: BankService){

    @ApiOperation(value = "Returns bank accounts of a user")
    @ApiResponses(ApiResponse(code = 400, message = "Bad Request"), ApiResponse(code = 500, message = "Internal Server Error"))
    @ApiParam(value = "Access Token", required = false)
    @RequestMapping(value = ["/bank/accounts"], headers = ["accesstoken"], method = [RequestMethod.GET])

    fun getAllBankAccountsofAUser(@RequestHeader("accesstoken") accesstoken: String) :List<AccountList>? {
        var customerId: String = accesstoken
        var accounts =  bankService.getBankAccounts(customerId)
        return accounts
    }


    @ApiOperation(value = "Returns bank accounts of a user")
    @ApiResponses(ApiResponse(code = 400, message = "Bad Request"), ApiResponse(code = 500, message = "Internal Server Error"))
    @ApiParam(value = "Access Token", required = false)
    @RequestMapping(value = ["/bank/transactions"], headers = ["accesstoken"], method = [RequestMethod.GET])
    fun getAccountTransactions(@RequestHeader("accesstoken") accesstoken: String) :List<TransactionList>? {
        var customerId: String = accesstoken
        var transactions =  bankService.getAccountTransactions(customerId)
        return transactions
    }
}