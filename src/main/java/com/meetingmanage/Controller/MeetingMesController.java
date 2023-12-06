package com.meetingmanage.Controller;

import com.meetingmanage.Service.MeetingMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MeetingMes")
public class MeetingMesController {
    @Autowired
    private MeetingMesService meetingMesService;
}
