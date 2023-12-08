package com.meetingmanage.Service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    String uploadImg(MultipartFile img) throws Exception;
}
