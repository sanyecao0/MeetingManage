package com.meetingmanage.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.meetingmanage.Mapper.MeetingMesMapper;
import com.meetingmanage.Service.MeetingMesService;
import com.meetingmanage.Domain.MeetingMes;
import org.springframework.stereotype.Service;

@Service("MeetingMesService")
public class MeetingMesServiceImpl extends ServiceImpl<MeetingMesMapper, MeetingMes> implements MeetingMesService {
}
