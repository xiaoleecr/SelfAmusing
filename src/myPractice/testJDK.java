package myPractice;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testJDK {
	// 递归删除指定路径下的所有文件
	public static void deleteAll(File file) {
		if (file.isFile() || file.list().length == 0) {
			file.delete();
		} else {
			File[] files = file.listFiles();
			for (File f : files) {
				deleteAll(f);// 递归删除每一个文件
				f.delete();// 删除该文件夹
			}
		}
	}

	public static void toNull(Student stu){
		stu = null;
	}

	public static void main(String[] args) throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Calendar calendar = Calendar.getInstance();  
//		int month = calendar.get(Calendar.MONTH);
//		calendar.set(Calendar.MONTH, month-1);
//		calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));  
//		Date today = calendar.getTime();
//        int count = calendar.get(Calendar.DAY_OF_MONTH);
//        for(int i = 0;i<count;i++){
//        	calendar.add(Calendar.DAY_OF_MONTH, (i == 0?0:-1));  
//	        Date date = calendar.getTime();
//	        String statDate = sdf.format(date);
//	        System.out.println(statDate);
//		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = new Date();
		date.setTime(1526260102853L);
		String now = sdf.format(date);
		System.out.println(now);
		
	}
	private static String likeSample(String str){
	
		
		String sample = "";
		String likeSample="";
		sample = str.replaceAll("[1-9]", "*");
		int index = sample.lastIndexOf("*");
		if((index+1)%2==1){
			likeSample = str.substring(0, index+2);
		}else{
			likeSample = str.substring(0, index+1);
		}
		return likeSample;
	}
}
