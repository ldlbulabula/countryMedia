package com.ldl.Util;
import java.util.UUID;

/**
* 该工具类已经不再使用
* 文件已经从本地保存转为华为云保存
* 具体看Util包下的ObsUtil
* */
@Deprecated
public class FileUtil {
	//项目中文件存储的路径
	String path = "D:\\conutryMedia";

	//根据UUID生成文件名
	public static String getUUIDFileName() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}
	//从请求头中提取文件名和类型
	public static String getRealFileName(String context) {
		// Content-Disposition: form-data; name="myfile"; filename="a_left.jpg"
		int index = context.lastIndexOf("=");
		String filename = context.substring(index + 2, context.length() - 1);
		return filename;
	}
	//根据给定的文件名和后缀截取文件名
	public static String getFileType(String fileName){
		//9527s.jpg
		int index = fileName.lastIndexOf(".");
		return fileName.substring(index);
	}


//	public List<String> saveFuJian(Class clazz, ClassMapper classMapper){
//		MultipartFile[] fujian = clazz.getFujian();
//		if(fujian==null){
//			System.out.println("FileUtil的附件为空");
//			return new ArrayList<>();
//		}
//		//获取所有的附件
//		List<String> saveFileNames=new ArrayList<>();
//		for (MultipartFile file : fujian) {
//			//提取生成文件名UUID + 上传文件的后缀
//			String saveFileName= FileUtil.getUUIDFileName() + FileUtil.getFileType(file.getOriginalFilename());
//			//转存
//			String saveFileNameAddress = path + File.separator + saveFileName;
//			try {
//				file.transferTo(new File(saveFileNameAddress));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			classMapper.addClass_fujian(clazz.getClass_id(),saveFileNameAddress);
//			saveFileNames.add(saveFileNameAddress);
//		}
//		System.out.println("FileUtil的附件路径 ："+saveFileNames);
//		return saveFileNames;
//	}


//	public String saveFuJian(MultipartFile fujian){
//		if(fujian==null){
//			System.out.println("FileUtil的附件为空");
//			return "";
//		}
//
//			//提取生成文件名UUID + 上传文件的后缀
//			String saveFileName= FileUtil.getUUIDFileName() + FileUtil.getFileType(fujian.getOriginalFilename());
//			//转存
//			String saveFileNameAddress = path + File.separator + saveFileName;
//			try {
//				fujian.transferTo(new File(saveFileNameAddress));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		System.out.println("FileUtil的附件路径 ："+saveFileNameAddress);
//		return saveFileNameAddress;
//	}


//	public String saveCover(Class  clazz, ClassMapper classMapper){
//		if(clazz.getCover()==null){
//			System.out.println("FileUtil的封面为空");
//			classMapper.addClass_cover(clazz.getClass_id(),"");
//			return "";
//		}
//		String coverFileName= FileUtil.getUUIDFileName()+FileUtil.getFileType(clazz.getCover().getOriginalFilename());
//		String coverFileAddress = path + File.separator + coverFileName;
//		try {
//			clazz.getCover().transferTo(new File(coverFileAddress));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		classMapper.addClass_cover(clazz.getClass_id(),coverFileAddress);
//		System.out.println("FileUtil的封面路径"+coverFileAddress);
//		return coverFileAddress;
//	}
}
