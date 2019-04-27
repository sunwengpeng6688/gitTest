package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.pojo.User;

public interface UserMapper {
	//查询所有，mybatis注解方式
	@Select("select * from user")
	public List<User> findAll();
	
	//新增
	@Insert("insert into user"
			+ " (name,birthday,address)"
			+ " values(#{user.name},#{user.birthday},#{user.address})")
	public void insert(@Param("user") User user);
	
	//修改
	@Update("UPDATE USER"
			+ " SET NAME=#{user.name},birthday=#{user.birthday},address=#{user.address}"
			+ " WHERE id=#{user.id}")
	public void update(@Param("user") User user);
	
	//删除
	@Delete("DELETE FROM USER WHERE id=#{id}")
	public void delete(Integer id);
}
