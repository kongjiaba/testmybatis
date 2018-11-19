package sy.dao;

import sy.model.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}