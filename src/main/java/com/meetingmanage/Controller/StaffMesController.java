package com.meetingmanage.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.meetingmanage.Domain.StaffMes;
import com.meetingmanage.Service.StaffMesService;
import com.meetingmanage.Service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/StaffMes")
public class StaffMesController {
    @Autowired
    private StaffMesService staffMesService;
    @Autowired
    private UploadService uploadService;

    /*添加员工信息*/
    @PutMapping("/Add")
    public void AddStaff(@RequestBody StaffMes staff){
        staffMesService.save(staff);
    }
    /*删除员工信息*/
    @DeleteMapping("/Delete")
    public void RemoveStaff(Integer StaffID){
       staffMesService.removeById(StaffID);
    }
    /*修改员工信息*/
    @PostMapping("/Update")
    public void UpdateStaff(@RequestBody StaffMes staff){
       staffMesService.updateById(staff);
    }
    /*id获取员工信息*/
    @GetMapping("/ID2Get")
    public StaffMes GetStaff(Integer id){
        StaffMes mes = staffMesService.getById(id);
        return  mes;
    }
    /*姓名模糊分页查询获取员工信息*/
    @GetMapping("/NameFuzzy2Get")
    public Page<StaffMes> GetStaff(
            @RequestParam(value = "name",required = false) String name,
                                   @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize",defaultValue = "2") Integer pageSize){
        Page<StaffMes> staffMesPage = staffMesService.FindStaffByNameFuzzy(name,pageNum, pageSize);
        return  staffMesPage;
    }
    @PostMapping("/Upload")
    public void UploadStaffPhoto(MultipartFile img) throws Exception {
          uploadService.uploadImg(img);
    }
}
