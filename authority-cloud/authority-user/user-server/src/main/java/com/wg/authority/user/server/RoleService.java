package com.wg.authority.user.server;

import java.util.List;

public interface RoleService {
    /**
     * 给角色分配菜单
     * @param roleId
     * @param menuIds
     * @return
     */
    int assignMenu(Long roleId, List<Long> menuIds);

    /**
     * 给角色分配资源
     * @param roleId
     * @param resourceIds
     * @return
     */
    int assignResource(Long roleId, List<Long> resourceIds);
}
