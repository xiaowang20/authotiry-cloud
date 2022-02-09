package com.wg.authority.user.server;

import com.wg.authority.user.entity.UmsAdmin;

import java.util.List;

/**
 * admin用户服务接口
 */
public interface AdminService {
    /**
     * 修改指定admin信息
     * @param adminId
     * @param umsAdminParam
     */
    int updateByAdminParam(Long adminId, UmsAdmin umsAdminParam);

    /**
     * 给用户分配角色
     * @param adminId
     * @param roleIds
     * @return
     */
    int assignRole(Long adminId, List<Long> roleIds);
}
