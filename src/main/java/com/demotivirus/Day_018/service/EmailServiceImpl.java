package com.demotivirus.Day_018.service;

import com.demotivirus.Day_018.dao.EmailDao;
import com.demotivirus.Day_018.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmailServiceImpl implements EmailService{
    @Autowired
    private EmailDao emailDao;

    @Override
    public List<Email> getAllEmails() {
        return emailDao.getAllEmails();
    }
}
