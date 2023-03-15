package com.nayan.dao;

import com.nayan.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UsersDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int create(Users users)
    {
       int id = (Integer) hibernateTemplate.save(users);
       return id;
    }
}
