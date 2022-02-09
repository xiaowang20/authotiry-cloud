package com.wg.authority.user.server;

import com.wg.authority.user.vo.MenuCode;

import java.util.List;

public interface MenuService {

    /**
     * 树形结构返回所有菜单列表
     * @return
     */
    List<MenuCode> treeList();

}
