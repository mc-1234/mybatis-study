package com.mc.dao;

import com.mc.pojo.User;

import java.util.List;

/**
 * @Author machong
 * Date on 2021/3/12  16:39
 */
public interface UserMapper {

    // 查询所有用户
    List<User> getUserList();

    // 根据id查询用户
    User findUserById(int id);

    //新增用户信息
    int addUser(User user);

    //修改用户信息
    int updateUser(User user);

    //根据id删除用户
    int deleteUser(int id);
}
