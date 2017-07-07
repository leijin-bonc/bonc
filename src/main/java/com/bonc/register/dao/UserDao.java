/*
 * 文件名：UserDao.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月6日
 */

package com.bonc.register.dao;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.bonc.register.entity.User;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Jingege
 * @version 2017年7月6日
 * @see UserDao
 * @since
 */

public interface UserDao extends CrudRepository<User, Long>{

    User findById(String id);
    
    User findByUsernameAndPassword(String username,String password);
}
