package com.bhhan.mongo.service;

import com.bhhan.mongo.domain.User;
import com.bhhan.mongo.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * Created by hbh5274@gmail.com on 2020-08-06
 * Github : http://github.com/bhhan5274
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Page<User> findUsersByPageable(Pageable pageable){
        return userRepository.findAll(pageable.toPageRequest());
    }
}
