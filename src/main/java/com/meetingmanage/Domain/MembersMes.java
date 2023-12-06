package com.meetingmanage.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (MeetingMembersmes)表实体类
 *
 * @author makejava
 * @since 2023-12-06 17:30:36
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("meeting_membersmes")
public class MembersMes {
    public Integer getMeetingmesid() {
        return meetingmesid;
    }

    public void setMeetingmesid(Integer meetingmesid) {
        this.meetingmesid = meetingmesid;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    @TableId
    private Integer meetingmesid;

    //会议ID
    private Integer meetingid;
    //员工ID
    private Integer staffid;



}


