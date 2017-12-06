package com.nextyu.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 2017-12-06 22:18
 *
 * @author nextyu
 */
@Slf4j
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.debug("username ", username);

        String encodePassword = passwordEncoder.encode("123456");

        // 根据用户名查找用户信息
        return new User(username,encodePassword,
                true,true,true,true,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
