package com.medlinker.dao;

import com.medlinker.main.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    @Results(id = "findMap",
            value = {
                @Result(column = "ID", property = "id"),
                @Result(column = "USERNAME", property = "username"),
                @Result(column = "BIRTHDAY", property = "birthday"),
                @Result(column = "SEX", property = "sex"),
                @Result(column = "ADDRESS", property = "address")

            })
    List<User> findAll();

    /**
     * emm
     * 查询单个用户
     * @param userId
     * @return
     */
    User findOne(Integer userId);

}
