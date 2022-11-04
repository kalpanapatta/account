package com.org.sai.service;

import com.org.sai.accountsrepo.AccountRepo;
import com.org.sai.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceimpl implements AccountService {
    @Autowired
    AccountRepo accountRepo;

    @Override
    public void addaccount(Accounts accounts) {
        accountRepo.save(accounts);

    }

    @Override
    public Accounts getById(Integer accountId) {
        Accounts acc = accountRepo.getById(accountId);
             return acc;
    }

    @Override
    public List<Accounts> getAll() {
        List<Accounts> list = accountRepo.findAll();
        return list ;
    }

    @Override
    public void updateaccount(Accounts accounts) {
         accountRepo.save(accounts);
    }

    @Override
    public String DeleteById(Integer accountId) {
        accountRepo.deleteById(accountId);
        return "successfully delete";
    }


}
