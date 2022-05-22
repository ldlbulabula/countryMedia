package com.ldl.service;

import com.ldl.bean.Class;
import org.springframework.web.multipart.MultipartFile;


public interface ClassService {
    Class uploadClass(Class clazz);
    String uploadFile(MultipartFile fujian);
//    ArrayList<String> uploadFujian(MultipartFile fujian);
}
