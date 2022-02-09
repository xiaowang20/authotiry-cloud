package com.wg.authority.common.bean;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * 登陆用户信息封装
 * @author xiongxiaoyang
 * @version 1.0
 * @since 2020/5/27
 */
@Data
@Repository
public class UserDetails {

    private Long id;

    private String username;

    private String nickName;
}
