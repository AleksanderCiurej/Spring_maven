/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author Aleksander
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AccountRowMapper implements RowMapper<Account>{

    @Override
    public Account mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Account account = new Account();
        account.setAccountNo(resultSet.getString(1));
        account.setBalance(resultSet.getBigDecimal(2));
        account.setLastPaidOn(resultSet.getDate(3));
        
        return account;
    }
    
    
}
