package com.meetingmanage.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.meetingmanage.Domain.MembersMes;

import java.util.List;


/**
 * (MeetingMembersmes)表服务接口
 *
 * @author makejava
 * @since 2023-12-06 17:44:25
 */
public interface MembersMesService extends IService<MembersMes> {


    List<MembersMes> GetByMeetingID(Integer meetingID);
    Integer  GetMeetingNumbers(Integer meetingID);

    void removeByStaffAndMeetingId(Integer staffID, Integer meetingID);
}

