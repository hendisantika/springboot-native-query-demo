package com.hendisantika.springbootnativequerydemo;

import io.github.gasparbarancelli.NativeQueryOperator;
import io.github.gasparbarancelli.NativeQueryParam;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-native-query-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-09
 * Time: 07:59
 */
@Data
public class UserFilter {
    private Number id;

    /*
      Custom operator, when add parameter value in query and jwitg, the paramter is transformed
    */
    @NativeQueryParam(value = "name", operator = NativeQueryOperator.CONTAINING)
    private String name;
}