package com.meetingmanage.Domain;


import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (MeetingStaffmes)表实体类
 *
 * @author makejava
 * @since 2023-12-06 17:23:43
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("meeting_staffmes")
public class StaffMes {
    public StaffMes(String name) {
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @TableId(value = "StaffID",type = IdType.AUTO)
    private Integer staffid;

    //用户名
    @TableField(value = "StaffName")
    private String Name;

    //头像
    @TableField(value = "Photo",fill = FieldFill.INSERT)
    private String photo;

}

