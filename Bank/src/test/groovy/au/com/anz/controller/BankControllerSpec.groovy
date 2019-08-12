package au.com.anz.controller

import au.com.anz.service.BankService
import spock.lang.Specification
import spock.lang.Unroll

class BankControllerSpec extends Specification {

    BankService bankService =Mock(BankService)
    BankController bankController =new BankController(bankService)
    def mockacccounts = ["account1", "account2"]
    def setup(){

    }


    def "getBankAccount should return list of bank account fir a  YAWE"() {

        given:
        def accesstoken = "test"
        def mockCustomerId = "123"

        when:
        def response = bankController.getAllBankAccountsofAUser(mockCustomerId)

        then:
        1 * bankService.getBankAccounts() >> mockacccounts
        response.body == mockacccounts
    }


}