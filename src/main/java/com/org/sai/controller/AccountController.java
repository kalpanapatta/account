package com.org.sai.controller;

import com.org.sai.model.Accounts;
import com.org.sai.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    AccountService accountService;

    //CRUD OPERTIONS
    @PostMapping("/create")
    public void addaccount(@RequestBody Accounts accounts) {
        accountService.addaccount(accounts);
    }

    @GetMapping("getById/{accountId}")
    public Accounts getById(@PathVariable Integer accountId) {
        Accounts k = accountService.getById(accountId);

        return k;
    }

    @GetMapping("getAll")
    public List<Accounts> getAll() {
        List<Accounts> l = accountService.getAll();

        return l;
    }

    @PutMapping("/update")
    public void updateaccount(@RequestBody Accounts accounts) {
        accountService.updateaccount(accounts);

    }
    @DeleteMapping("remove/{accountId}")
    public String deleteById(@PathVariable Integer accountId) {
        String s = accountService.DeleteById(accountId);

        return s;
    }

}

