/**
 * Create Date:2017年11月23日
 */
package com.hiring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.hiring.model.UserInfo;

/**
 * Title:TODO 类标题
 * Description:TODO 类功能描述
 * Author:guole
 * Date:2017年11月23日
 */
public interface UserDao {
	  @Select("select * from user_info")
	  @Results(value={
			  @Result(property = "id", column = "id") ,
			  @Result(property = "userId", column = "user_id") ,
		        @Result(property = "userName", column = "user_name")
	  				}
		       )
	    public List<UserInfo> getAll();
}
