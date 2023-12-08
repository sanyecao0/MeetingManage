package com.meetingmanage.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.meetingmanage.Domain.StaffMes;
import com.meetingmanage.Mapper.MeetingMesMapper;
import com.meetingmanage.Service.MeetingMesService;
import com.meetingmanage.Domain.MeetingMes;
import org.springframework.stereotype.Service;

@Service("MeetingMesService")
public class MeetingMesServiceImpl extends ServiceImpl<MeetingMesMapper, MeetingMes> implements MeetingMesService {
    @Override
    public Page<MeetingMes> FindMeetingByNameFuzzy(String name, Integer pageNum, Integer pageSize) {
        QueryWrapper<MeetingMes> queryWrapper = new QueryWrapper<MeetingMes>();
        queryWrapper.like(StringUtils.isNotBlank(name), "Name", name);
        //分页查询
        Page<MeetingMes>MeetingMesPage=new Page<MeetingMes>(pageNum,pageSize);
        baseMapper.selectPage(MeetingMesPage,queryWrapper);
        return  MeetingMesPage;
    }
}
