package com.meetingmanage.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.meetingmanage.Domain.MeetingMes;
import com.meetingmanage.Service.MeetingMesService;
import com.meetingmanage.Service.MembersMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/MeetingMes")
public class MeetingMesController {
    @Autowired
    private MeetingMesService meetingMesService;
    @Autowired
    private MembersMesService membersMesService;
    @GetMapping("/test")
    public String test(){
        System.out.println("test");
        return "test";
    }

    @PutMapping("/Add")
    public void AddMeeting(@RequestBody MeetingMes meetingMes){
        meetingMesService.save(meetingMes);
        System.out.println("MeetingMes.Add");
    }
    @DeleteMapping("/Delete")
    public  void DeleteMeeting(Integer MeetingID){
        Integer size=membersMesService.GetMeetingNumbers(MeetingID);
        System.out.println(size);
        if(size==0){
            meetingMesService.removeById(MeetingID);
            System.out.println("Delete,finish");
        }
    }
    @PostMapping("/Update")
    public  void UpdateMeeting(@RequestBody MeetingMes meetingMes){
        meetingMesService.updateById(meetingMes);
    }
    @GetMapping("/NameFuzzy2Get")
    public Page<MeetingMes> GetMeetings(
            @RequestParam(value = "name",required = false) String name,
            @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "2") Integer pageSize){
        Page<MeetingMes> MeetingMesPage = meetingMesService.FindMeetingByNameFuzzy(name,pageNum, pageSize);
        return  MeetingMesPage;
    }


}
