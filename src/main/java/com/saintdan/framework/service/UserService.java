package com.saintdan.framework.service;

import com.saintdan.framework.bo.UserParams;
import com.saintdan.framework.exception.UserException;
import com.saintdan.framework.po.User;

/**
 * User service.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 7/21/15
 * @since JDK1.8
 */
public interface UserService {

    User getUserByUsr(UserParams param) throws UserException;
}