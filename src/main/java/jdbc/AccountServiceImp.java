/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;
import dao.AccountDao;
import model.Account;
/**
 *
 * @author Aleksander
 */
@Service
public class AccountServiceImp implements AccountDao {
    private static final String FIND_ALL_SQL = "select account_no, balance, last_paid_on from account";
    
    @Inject private NamedParameterJdbcOperations jdbcTemplate;
    @Inject private AccountRowMapper accountRowMapper;
    
    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query(FIND_ALL_SQL, new HashMap<String, Object>(), accountRowMapper);
    }
}
