package com.meetingmanage.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (MeetingMes)表实体类
 *
 * @author makejava
 * @since 2023-12-06 17:30:24
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("meeting_mes")
public class MeetingMes  {
    @TableId
    private Integer meetingid;
    //会议名称
    private String name;

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


