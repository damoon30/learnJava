package com.atguigu.gmall.gmalluser.mapper;


import com.atguigu.gmall.gmalluser.bean.UmsMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
