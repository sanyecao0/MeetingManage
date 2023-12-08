package com.meetingmanage.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.meetingmanage.Mapper.MembersMesMapper;
import com.meetingmanage.Service.MembersMesService;
import com.meetingmanage.Domain.MembersMes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MembersMesService")
public class MembersMesServiceImpl extends ServiceImpl<MembersMesMapper, MembersMes> implements MembersMesService {
    @Override
    public List<MembersMes> GetByMeetingID(Integer meetingID) {
        QueryWrapper<MembersMes> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("meetingID");
        List<MembersMes> list=baseMapper.selectList(queryWrapper);
        return list;
    }
    /*获取会议内员工数量*/
    public  Integer GetMeetingNumbers(Integer meetingID){
        QueryWrapper queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("meetingID",meetingID);
        List<MembersMes> list=baseMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
        return  list.size();
    }

    @Override
    public void removeByStaffAndMeetingId(Integer staffID, Integer meetingID) {
        QueryWrapper<MembersMes> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("meetingID",meetingID).eq("StaffID",staffID);
        baseMapper.delete(queryWrapper);
    }

}
