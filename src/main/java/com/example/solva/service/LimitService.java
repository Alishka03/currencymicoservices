package com.example.solva.service;

import com.example.solva.pojo.SaveLimitDTO;
import com.example.solva.pojo.LimitDTO;
import com.example.solva.pojo.UpdateLimitDTO;

import java.util.List;

public interface LimitService {

    List<LimitDTO> getAll(String userAccount);

    LimitDTO create(SaveLimitDTO initLimitDTO);

    LimitDTO update(UpdateLimitDTO updateLimitDTO);

    boolean updateLimitBalance(String account, String category, Double sum, String currencyShortname);
}
