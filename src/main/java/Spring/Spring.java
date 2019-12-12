/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring;
import java.util.List;
import model.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;

public class Spring {

    public static void main(String[] args) throws Exception {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService)appCtx.getBean("accountService");
        List<Account> delinquentAccounts = accountService.findDelinquentAccounts();
        for(Account a : delinquentAccounts){
            System.out.println(a.getAccountNo());
        }
    }
}