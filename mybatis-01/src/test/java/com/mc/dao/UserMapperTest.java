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
public class UserMapperTest {

    @Test
    public void test() {

        // 获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        System.out.println(userList);

        // 关闭
        sqlSession.close();

    }

    @Test
    public void test1(){
        // 获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);


        // 关闭
        sqlSession.close();
    }

    @Test
    public void test2(){
        // 获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);


        // 关闭
        sqlSession.close();
    }

    @Test
    public void test3(){
        // 获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(5, "Ning", "123456", null));
        if(res>0){
            System.out.println("添加成功！");
        }

        //提交事务
        sqlSession.commit();
        // 关闭
        sqlSession.close();
    }

    @Test
    public void test4(){
        // 获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(5,"ning","123465",null));
        //提交事务
        sqlSession.commit();
        // 关闭
        sqlSession.close();
    }

    @Test
    public void test5(){
        // 获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(5);
        //提交事务
        sqlSession.commit();
        // 关闭
        sqlSession.close();
    }
}
