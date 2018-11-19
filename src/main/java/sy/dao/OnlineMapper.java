package sy.dao;

import sy.model.Online;

public interface OnlineMapper {
    int insert(Online record);

    int insertSelective(Online record);
}