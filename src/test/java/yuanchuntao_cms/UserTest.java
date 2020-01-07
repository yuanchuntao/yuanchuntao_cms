package yuanchuntao_cms;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import yuanchuntao_cms.dao.UserDao;
import yuanchuntao_cms.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserTest {

	@Autowired
	private UserDao userDao;
	
	@Test
	public void test() {
		/*
		 * List<User> list = userDao.selects(null); System.out.println(list);
		 * 
		 * User user = new User(); user.setUsername("袁纯涛1"); userDao.insert(user);
		 * 
		 * 
		 * userDao.del("203,204");sss
		 * 
		 * user.setId(203); userDao.update(user);
		 */
	}
}
