package com.nayan.service;

import com.nayan.dao.UsersDao;
import com.nayan.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    public int create(Users users)
    {
        int id = this.usersDao.create(users);
        return id;
    }
}
