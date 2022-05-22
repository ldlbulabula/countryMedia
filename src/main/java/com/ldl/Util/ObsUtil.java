package com.ldl.Util;

import com.obs.services.ObsClient;
import com.obs.services.model.PutObjectResult;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Random;

public class ObsUtil {
    //桶名
    static String bucketName = "lidelin";
    //ak
    static String accessKeyId = "JKW7PAGRGKAXFK4Z1K3G";
    //sk
    static String accessKeySecret = "3sFQSv4yoxaD4wKwXjlr24qlmueJJV5zhfqujbp2";

    static String endpoint = "obs.cn-south-1.myhuaweicloud.com";
    //文件存储目录的地址
    private static String fileUrl = "conutryMedia/";


    //文件上传
    public static String uploadFile(MultipartFile file){
        ObsClient obsClient = new ObsClient(accessKeyId, accessKeySecret, endpoint);

        try {
            InputStream inputStream = file.getInputStream();
            String originalFilename = file.getOriginalFilename();  //得到文件名
            //取文件名的后缀(.jpg)，即文件类型，再toLowerCase()转换为小写的字符串
            String substring = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
            Random random = new Random();
            String name = random.nextInt(10000) + System.currentTimeMillis() + substring;
            PutObjectResult putObjectResult = obsClient.putObject(bucketName, fileUrl + name, inputStream);
            String url = putObjectResult.getObjectUrl();
            inputStream.close();
            obsClient.close();
            return url;
        } catch (Exception e) {
            return null;
        }

    }

    //上传字符串
    public static String uploadString(String content){
        ObsClient obsClient = new ObsClient(accessKeyId, accessKeySecret, endpoint);
        try {
            PutObjectResult putObjectResult = obsClient.putObject(bucketName, fileUrl + "012", new ByteArrayInputStream(content.getBytes()));
            String url = putObjectResult.getObjectUrl();
            obsClient.close();
            return url;
        } catch (Exception e) {
            return null;
        }

    }
}