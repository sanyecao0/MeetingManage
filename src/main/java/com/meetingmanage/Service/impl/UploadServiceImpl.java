package com.meetingmanage.Service.impl;

import com.meetingmanage.Service.UploadService;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

public class UploadServiceImpl implements UploadService {
    @Override
    public void uploadImg(MultipartFile img) throws Exception {
        //判断文件类型
        //获取原始文件名
        String originalFilename = img.getOriginalFilename();
        //对原始文件名进行判断
        if(!originalFilename.endsWith(".png")||!originalFilename.endsWith(".JPG")||!originalFilename.endsWith(".jpg")){
            throw new Exception("文件格式错误");
        }
        //生成一个随机的文件名，避免重复
        String fileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
        //拼接你要保存的文件路径，这里假设你要保存在D盘的images文件夹下
        String filePath = "D:/biancheng/Java Web/MeetingManage/StaffPhoto" + fileName;
        //创建一个File对象，表示要保存的文件
        File destFile = new File(filePath);
        //调用MultipartFile的transferTo方法，将文件保存到指定位置
        img.transferTo(destFile);

    }
}
