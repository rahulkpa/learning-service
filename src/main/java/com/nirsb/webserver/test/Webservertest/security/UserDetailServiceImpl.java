package com.nirsb.webserver.test.Webservertest.security;

import com.nirsb.webserver.test.Webservertest.exception.UnAuthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = repo.findByUserName(s);
        if(user == null){
            throw new UnAuthorizedException("User is not an authorized");
        }
        return new UserDetailsImpl(user);
    }
}
