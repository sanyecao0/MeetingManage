package com.meetingmanage.Controller;

import com.meetingmanage.Domain.MembersMes;
import com.meetingmanage.Service.MeetingMesService;
import com.meetingmanage.Service.MembersMesService;
import com.meetingmanage.Utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MembersMes")
public class MembersMesController {
    @Autowired
    private MembersMesService membersMesService;
    @PutMapping("/Join")
    public  void JoinMeeting(Integer StaffID,Integer MeetingID){
        MembersMes membersMes=new MembersMes(null,MeetingID,StaffID);
        membersMesService.save(membersMes);
    }
    @DeleteMapping("/Exit")
    public void ExitMeeting(Integer StaffID,Integer MeetingID){
          membersMesService.removeByStaffAndMeetingId(StaffID,MeetingID);
    }


}
