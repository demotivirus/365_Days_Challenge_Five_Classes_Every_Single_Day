package com.demotivirus.Day_015;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Bank {
    private Money totalMoney = new Money();
    private List<User_Amount> user_amounts = new ArrayList<>();

    public void addUserAmount(User user){
        user_amounts.add(new User_Amount(user, new Amount(0d)));
    }

    public void addMoneyToAmount(User user, double sum){
        user.minusCash(sum);
        for (User_Amount ua : user_amounts){
            if (ua.getUser().equals(user)){
                ua.getAmount().plusMoney(sum);
                totalMoney.plusCash(sum);
            }
        }
    }
}
