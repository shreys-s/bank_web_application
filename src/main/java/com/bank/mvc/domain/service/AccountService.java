package com.bank.mvc.domain.service;

import com.bank.mvc.models.Account;
import com.bank.mvc.models.User;

import java.util.Collection;

/**
 * Created by Zalman on 10.05.2015.
 */
public interface AccountService {
    public Account getAccountById(long userId);
    public Collection<Account> getAll();
}
