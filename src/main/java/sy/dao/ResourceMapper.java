package sy.dao;

import sy.model.Resource;

public interface ResourceMapper {
    int insert(Resource record);

    int insertSelective(Resource record);
}