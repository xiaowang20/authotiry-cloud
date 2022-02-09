package com.wg.authority.user.server;

import com.wg.authority.user.entity.UmsAdmin;
import com.wg.authority.user.entity.UmsMenu;
import com.wg.authority.user.vo.UserLoginParam;

import java.util.List;

/**
 * 用户服务接口
 */
public interface UserService {
    /**
     * 根据用户名密码查询记录
     * @param username
     * @param password
     * @return 用户对象，不存在返回null
     */
    UmsAdmin queryByUsernameAndPassword(String username, String password);

    /**
     * 根据使用者名子查询记录
     * @param userName
     * @return
     */
    UmsAdmin queryByUsername(String userName);

    /**
     * 注册
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    String login(UserLoginParam userLoginParam);

    /**
     * 得到用户权限
     * @param adminId
     * @return
     */
    List<UmsMenu> getPermissionList(Long adminId);
}
