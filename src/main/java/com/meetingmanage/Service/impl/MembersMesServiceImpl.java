package com.meetingmanage.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.meetingmanage.Mapper.MembersMesMapper;
import com.meetingmanage.Service.MembersMesService;
import com.meetingmanage.Domain.MembersMes;
import org.springframework.stereotype.Service;

@Service("MembersMesService")
public class MembersMesServiceImpl extends ServiceImpl<MembersMesMapper, MembersMes> implements MembersMesService {
}
