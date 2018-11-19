package sy.dao;

import sy.model.Bug;

public interface BugMapper {
    int insert(Bug record);

    int insertSelective(Bug record);
}