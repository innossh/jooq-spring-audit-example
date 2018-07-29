package innossh.jooq.spring.audit.example.service;

import innossh.jooq.spring.audit.example.db.tables.daos.UserDao;
import innossh.jooq.spring.audit.example.db.tables.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DefaultUserService implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> getUsers() {
        return userDao.findAll();
    }

}
