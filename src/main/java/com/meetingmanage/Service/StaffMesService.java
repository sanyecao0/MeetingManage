package com.meetingmanage.Service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.meetingmanage.Domain.StaffMes;
import java.util.List;

/**
 * (MeetingStaffmes)表服务接口
 *
 * @author makejava
 * @since 2023-12-06 17:23:44
 */
public interface StaffMesService extends IService<StaffMes> {

    Page<StaffMes> FindStaffByNameFuzzy(String name, Integer pageNum, Integer pageSize);
}

