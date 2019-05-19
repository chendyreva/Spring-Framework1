package com.geekbrains.studentsapp.services;

import com.geekbrains.studentsapp.entities.SystemUser;
import com.geekbrains.studentsapp.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
    void save(SystemUser systemUser);

    @Transactional
    StudentDetails loadUserByUsername(String userName) throws UsernameNotFoundException;
}
