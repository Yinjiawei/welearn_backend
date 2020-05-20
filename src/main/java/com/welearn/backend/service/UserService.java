package com.welearn.backend.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
//    @Autowired
//    private UserMapper userMapper;

//    public void createOrUpdate(User user) {
//        UserExample userExample = new UserExample();
//        userExample.createCriteria()
//                .andAccountIdEqualTo(user.getAccountId());
//        List<User> users = userMapper.selectByExample(userExample);
//
//        if (users.size() == 0) {
//            // insert
//            user.setGmtCreate(System.currentTimeMillis());
//            user.setGmtModified(user.getGmtCreate());
//            userMapper.insert(user);
//        } else {
//            // update
//            User updateUser = new User();
//            updateUser.setGmtModified(System.currentTimeMillis());
//            updateUser.setAvatarUrl(user.getAvatarUrl());
//            updateUser.setName(user.getName());
//            updateUser.setToken(user.getToken());
//            UserExample userUpdateExample = new UserExample();
//            userUpdateExample.createCriteria()
//                    .andIdEqualTo(users.get(0).getId());
//            userMapper.updateByExampleSelective(updateUser, userUpdateExample);
//        }
//    }
}
