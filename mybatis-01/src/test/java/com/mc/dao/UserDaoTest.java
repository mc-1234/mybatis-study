package com.mc.dao;

import com.mc.pojo.User;
import com.mc.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author machong
 * Date on 2021/3/12  16:51
 */
public class UserDaoTest {

    @Test
    public void test() {

        // 获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        System.out.println(userList);

        // 关闭
        sqlSession.close();

    }
}
