package com.meetingmanage.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.meetingmanage.Mapper.StaffMesMapper;
import com.meetingmanage.Service.StaffMesService;
import com.meetingmanage.Domain.StaffMes;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * (MeetingStaffmes)表服务实现类
 *
 * @author Cohm
 * @since 2023-12-06 17:23:45
 */
@Service("StaffMesService")
public class StaffMesServiceImpl extends ServiceImpl<StaffMesMapper, StaffMes>  implements StaffMesService {

    @Override
    public Page<StaffMes> FindStaffByNameFuzzy(String name,Integer pageNum,Integer pageSize) {
        QueryWrapper<StaffMes> queryWrapper = new QueryWrapper<StaffMes>();
        queryWrapper.like(StringUtils.isNotBlank(name), "Name", name);
        //分页查询
        Page<StaffMes> StaffMesPage=new Page<StaffMes>(pageNum,pageSize);
        baseMapper.selectPage(StaffMesPage,queryWrapper);
        return  StaffMesPage;
    }
}

