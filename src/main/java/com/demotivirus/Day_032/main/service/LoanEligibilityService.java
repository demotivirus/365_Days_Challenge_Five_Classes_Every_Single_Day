package com.demotivirus.Day_032.main.service;

import com.demotivirus.Day_032.main.loaneligibility.Acknowledgement;
import com.demotivirus.Day_032.main.loaneligibility.CustomerRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanEligibilityService {
    public Acknowledgement checkLoan(CustomerRequest request){
        Acknowledgement acknowledgement = new Acknowledgement();
        List<String> mismatchCriteriaList = new ArrayList<>();

        if (request.getAge() < 30 && request.getAge() >= 60)
            mismatchCriteriaList.add("Person age should in between 30 to 60");
        if (request.getYearlyIncome() < 200_000)
            mismatchCriteriaList.add("minimum income should be more than 200000");
        if (request.getCibilScore() < 500)
            mismatchCriteriaList.add("Low CIBIL Score please try after 6 month");

        if (mismatchCriteriaList.size() > 0) {
            acknowledgement.setIsEligible(false);
            acknowledgement.setApprovedAmount(0);
        }
        else {
            acknowledgement.setApprovedAmount(500_000);
            acknowledgement.setIsEligible(true);
            mismatchCriteriaList.clear();
        }

        return acknowledgement;
    }
}
