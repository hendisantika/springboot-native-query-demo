package com.hendisantika.springbootnativequerydemo;

import io.github.gasparbarancelli.NativeQuery;
import io.github.gasparbarancelli.NativeQueryParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-native-query-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-09
 * Time: 07:59
 */
public interface UserNativeQuery extends NativeQuery {

    List<UserTO> findUsers();

    /*
      Add fields children of parameter
    */
    List<UserTO> findUsersByFilter(@NativeQueryParam(value = "filter", addChildren = true) UserFilter filter);

    /*
      Add pagination
    */
    List<UserTO> findActiveUsers(Pageable pageable);

    /*
      Add pagination and return object with values for the pagination (count, page, size)
    */
    Page<UserTO> findActiveUsersWithPage(Pageable pageable);

    /*
      Custom parameter name
    */
    UserTO findUserById(@NativeQueryParam(value = "codigo") Number id);

    List<Number> getUsersId();

    String getUserName(Number id);

}

