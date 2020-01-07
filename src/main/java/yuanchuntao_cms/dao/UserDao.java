package yuanchuntao_cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import yuanchuntao_cms.pojo.User;

public interface UserDao {

	/**
	 * 查找
	 * @param user
	 * @return
	 */
	List<User> selects(User user);
	/**
	 * 添加
	 * @param user
	 * @return
	 */
	int insert(User user);
	/**
	 * 回显
	 * @param id
	 * @return
	 */
	User selectById(Integer id);
	/**
	 * 删除(批删)
	 * @param ids
	 * @return
	 */
	int del(@Param("ids") String ids);
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	int update(User user);
	
	
}
