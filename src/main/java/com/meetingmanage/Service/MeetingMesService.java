package com.meetingmanage.Service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.meetingmanage.Domain.MeetingMes;

public interface MeetingMesService extends IService<MeetingMes> {
    Page<MeetingMes> FindMeetingByNameFuzzy(String name, Integer pageNum, Integer pageSize);
}
