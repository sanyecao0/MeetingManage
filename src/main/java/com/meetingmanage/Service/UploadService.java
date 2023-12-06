package com.meetingmanage.Service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    void uploadImg(MultipartFile img) throws Exception;
}
