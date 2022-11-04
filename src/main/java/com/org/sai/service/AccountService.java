package com.org.sai.service;

import com.org.sai.model.Accounts;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AccountService {
    public void addaccount(Accounts accounts);

    public Accounts getById(Integer accountId);

    public List<Accounts> getAll();

    public void updateaccount(Accounts accounts);

    public String DeleteById(Integer accountId);
}



