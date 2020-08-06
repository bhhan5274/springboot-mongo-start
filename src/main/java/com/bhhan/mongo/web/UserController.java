package com.bhhan.mongo.web;

import com.bhhan.mongo.domain.User;
import com.bhhan.mongo.service.Pageable;
import com.bhhan.mongo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hbh5274@gmail.com on 2020-08-06
 * Github : http://github.com/bhhan5274
 */

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public Page<User> findByUsersPageable(Pageable pageable){
        return userService.findUsersByPageable(pageable);
    }
}
