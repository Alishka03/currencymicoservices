package com.example.solva.service;

import com.example.solva.pojo.TransLimDTO;
import com.example.solva.pojo.SaveTransactionDTO;
import com.example.solva.pojo.TransactionDTO;

import java.util.List;

public interface TransactionService {
    List<TransLimDTO> getAllExceededLimitTransactions(String account);

    List<TransactionDTO> getByAccount(String account);

    TransactionDTO create(SaveTransactionDTO saveTransactionDTO);
}
