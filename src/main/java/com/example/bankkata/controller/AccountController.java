package com.example.bankkata.controller;

import com.example.bankkata.model.Account;
import com.example.bankkata.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/katabank/account")
public class AccountController {

    @Autowired
    IAccountService iAccountService;

    @GetMapping()
    Account getAccount(@PathVariable Integer accountId){
       return iAccountService.getAccount(accountId);
    }

    @PostMapping()
    Account addAccount(@RequestBody Account account){
      return   iAccountService.createAccount(account);
    }
    @PutMapping ()
    Account updateAccount(@RequestBody Account account){
        return iAccountService.updateAccount(account);
    }

    @DeleteMapping()
    void deleteAccount(@PathVariable Integer accountId){
        iAccountService.deleteAccount(accountId);
    }

    @GetMapping("/all")
    List<Account> getAccounts(){
        return iAccountService.getAccounts();
    }


}
