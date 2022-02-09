package com.wg.authority.user.api;


import com.wg.authority.user.entity.UmsAdmin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserApi {
    /**
     * 根据用户名密码查询用户表记录
     * @param username 用户名
     * @param password 密码
     * @return 用户对象，不存在返回null
     * */
    @GetMapping("api/admin/queryByUsernameAndPassword")
    UmsAdmin queryByUsernameAndPassword(@RequestParam("username") String username, @RequestParam("password") String password);

    /**
     * 根据用户名查询用户表记录
     * @param userName 用户名
     * @return
     */
    @GetMapping("api/admin/queryByUsername")
    UmsAdmin queryByUsername(@RequestParam("username") String userName);
}
