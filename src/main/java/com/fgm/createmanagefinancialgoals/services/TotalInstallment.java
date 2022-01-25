package com.fgm.createmanagefinancialgoals.services;

import com.fgm.createmanagefinancialgoals.repository.InstallmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TotalInstallment {
    @Autowired
    private InstallmentsRepository installmentsRepository;
    public  void selectTotals(){
        installmentsRepository.selectTotals();    }
}
