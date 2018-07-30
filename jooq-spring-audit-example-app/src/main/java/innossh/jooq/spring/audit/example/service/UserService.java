package innossh.jooq.spring.audit.example.service;

import innossh.jooq.spring.audit.example.db.tables.pojos.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    @Transactional
    public List<User> getUsers();

    @Transactional
    public void createUser(User user);

}
