package com.wg.authority.user.server.Impl;

import com.wg.authority.user.entity.UmsMenu;
import com.wg.authority.user.mapper.UmsMenuMapper;
import com.wg.authority.user.server.MenuService;
import com.wg.authority.user.vo.MenuCode;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.wg.authority.user.mapper.UmsMenuDynamicSqlSupport.id;
import static com.wg.authority.user.mapper.UmsMenuDynamicSqlSupport.umsMenu;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;


@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private UmsMenuMapper menuMapper;
    @Override
    public List<MenuCode> treeList() {
    //设置父级
        SelectStatementProvider render = select(umsMenu.allColumns()).from(umsMenu).orderBy(id).build().render(RenderingStrategies.MYBATIS3);
        List<UmsMenu> menuList = menuMapper.selectMany(render);
        List<MenuCode> result = menuList.stream().filter(menu -> menu.getParentId().equals(0L)).map(menu -> coverMenuCode(menu, menuList)).collect(Collectors.toList());
        return result;
    }
    //找到叶子
    private MenuCode coverMenuCode(UmsMenu menu, List<UmsMenu> menuList) {
        MenuCode menuCode = new MenuCode();
        BeanUtils.copyProperties(menu,menuCode);
        List<MenuCode> children = menuList.stream().filter(subMenu -> subMenu.getParentId().equals(menu.getId())).map(subMenu -> coverMenuCode(subMenu, menuList)).collect(Collectors.toList());
        menuCode.setChildren(children);
        return menuCode;
    }
}
