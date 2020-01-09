package yuanchuntao_cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface BaseDao<T> {

	/**
	 * 查找
	 * @param user
	 * @return
	 */
	List<T> selects(T t);
	/**
	 * 添加
	 * @param user
	 * @return
	 */
	int insert(T user);
	/**
	 * 回显
	 * @param id
	 * @return
	 */
	T selectById(Integer id);
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
	int update(T t);
}
