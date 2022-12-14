package com.example.bankkata.services;

import com.example.bankkata.exception.accountException.AmountRedExceededException;
import com.example.bankkata.model.Account;
import com.example.bankkata.model.Operation;

import java.util.List;

public interface IOperationService {

    Operation savingOperation(Integer accountId , Double amount ) throws Exception;
    Operation withdrawOperation(Integer accountId , Double amount ) throws Exception;
    Operation AddOperation(Operation ops);
    List<Operation> getAllOps();
    List<Operation> getAllOpsByAccountId(Integer accountId);
}
