package com.wg.authority.user.controller.api;

import com.wg.authority.user.entity.UmsAdmin;
import com.wg.authority.user.server.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("api/admin")
@RequiredArgsConstructor
@ApiIgnore
public class UserApi {
    @Autowired
    UserService userService;

    /**
     * 根据用户名密码查询记录
     * */
    @GetMapping("queryByUsernameAndPassword")
    public UmsAdmin queryByUsernameAndPassword(String username, String password){
        return userService.queryByUsernameAndPassword(username,password);
    }
    /**
     * 根据用户名查询记录
     */
    @GetMapping("queryByUsername")
    public UmsAdmin queryByUsername(String userName){
        return userService.queryByUsername(userName);
    }
}
