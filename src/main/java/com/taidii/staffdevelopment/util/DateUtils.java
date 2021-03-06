package com.taidii.staffdevelopment.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.taidii.staffdevelopment.hq.constant.RepeatConstant;

/**
 * @description:时间工具包
 * @projectName:staff-development
 * @className:DateUtils.java
 * @author:wentao
 * @createTime:2018年6月13日 上午9:58:07
 * @version 1.0.1
 */
public class DateUtils {

	//public final String format_1 = "";
	public static final String ddmmyyyy = "dd/MM/YYYY";
	public  static  final  String YYYYMMdd="yyyy-MM-dd";
	public  static  final  String HHMMSS="HH:mm:ss";
	public  static  final  String DDMMYY="dd-MM-yyyy";
	public  static  final  String HHMM="HH:mm";
	public  static  final  String YYMMDD="yyyy-MM-dd";
	public static final String MMDDYYYY = "MM/dd/yyyy";
	public static final String DDMMYYYY = "dd/MM/yyyy";
	

	/**
	 * 
	 * @description:时间比较
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 下午5:01:28
	 */
	public static boolean isBeforeDate(Date startDate,Date endDate){
		return startDate.before(endDate);
	}
	
	/**
	 * 
	 * @description:date类型转成String类型
	 * @param startDate
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 下午5:08:29
	 */
	public static String dateToString(Date startDate,String type){
		if(type == null) {
			type = DDMMYY;
		}
		if(type.equals(HHMMSS)){
			type=HHMMSS;
		}
		if(type.equals(YYYYMMdd)){
			type=YYYYMMdd;
		}
		SimpleDateFormat df = new SimpleDateFormat(type);
		return df.format(startDate);
		}

	/**
	 * 
	 * @description:String 转Date
	 * @param date
	 * @param type
	 * @return
	 * @author:王涛
	 * @throws ParseException 
	 * @createTime:2018年6月21日 下午6:34:25
	 */
	public static Date stringToDate(String date,String type){
		Date strtodate=null;
		try{
			if(type == null) {
				type = DateUtils.HHMMSS;
				SimpleDateFormat df = new SimpleDateFormat(DateUtils.HHMMSS);
				strtodate= df.parse(date);
			}
			if(type.equals(DateUtils.YYYYMMdd)){
				SimpleDateFormat df = new SimpleDateFormat(DateUtils.YYYYMMdd);
				strtodate=df.parse(date);
			}
			if(type.equals(DateUtils.HHMM)){
				SimpleDateFormat df = new SimpleDateFormat(DateUtils.HHMM);
				strtodate=df.parse(date);
			}
			if(type.equals(DateUtils.MMDDYYYY)){
				SimpleDateFormat df = new SimpleDateFormat(DateUtils.MMDDYYYY);
				strtodate=df.parse(date);
			}
			if(type.equals(DDMMYYYY)){
				SimpleDateFormat df = new SimpleDateFormat(DateUtils.DDMMYYYY);
				strtodate=df.parse(date);
			}
			SimpleDateFormat df = new SimpleDateFormat(type);
			strtodate=df.parse(date);
		}catch(Exception e){
			e.printStackTrace();
		}

		return strtodate;
	}
	/**
	 * 
	 * @description:date转化成String
	 * @param date
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 下午3:33:39
	 */
	public static String dateToStringHms(Date date){
		 SimpleDateFormat formatter = new SimpleDateFormat(DateUtils.HHMMSS);
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	/**
	 * @description:将时间转成国际时间格式
	 * @param date
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午10:02:54
	 */
	public static String dateToUK(Date date) {
		String format = "d MMMMM yyyy";
		SimpleDateFormat sdf=new SimpleDateFormat(format,Locale.UK);
		return sdf.format(date);
	}

	/**
	 * @description: -- 日期扎转化mmddyyyy
	 * @author:谭农春
	 * @createTime: 2018/6/19 17:14 
	 */
	
	public  static String mmddyyy(Date date){
		if(null == date){
			return "";
		}
		SimpleDateFormat sdf=new SimpleDateFormat(ddmmyyyy,Locale.UK);
		return sdf.format(date);
	}

	/**
	 * @description:比对两个日期是否相同
	 * @param date1
	 * @param date2
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月23日 下午3:49:09
	 */
	public static boolean isSameDate(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
	       cal1.setTime(date1);

	       Calendar cal2 = Calendar.getInstance();
	       cal2.setTime(date2);

	       boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
	               .get(Calendar.YEAR);
	       boolean isSameMonth = isSameYear
	               && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
	       boolean isSameDate = isSameMonth
	               && cal1.get(Calendar.DAY_OF_MONTH) == cal2
	                       .get(Calendar.DAY_OF_MONTH);

	       return isSameDate;
	}
	
	/**
	 * 
	 * @description:根据时间去判断是星期几 
	 * @param date 时间的格式 dd/MM/yyyy
	 * @return
	 * @author:王涛
	 * @throws Exception 
	 * @createTime:2018年6月27日 下午2:47:17
	 */
	public static Integer dateToWeek(String date) throws Exception{
		Integer repeat=-1;
		 SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		 String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		// 获得一个日历
		 Calendar cal = Calendar.getInstance(); 
		 Date datet = null;
		 try {
	         datet = f.parse(date);
	         cal.setTime(datet);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		 int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
	     if (w < 0){
	         w = 0;
	     }
	     switch(weekDays[w]){
	     case "星期日":
	    	 repeat=RepeatConstant.REPEAT_SUNDAY;
	    	 break;
	     case "星期一":
	    	 repeat=RepeatConstant.REPEAT_MONDAY;
	    	 break;
	     case "星期二":
	    	 repeat=RepeatConstant.REPEAT_TUESDAY;
	    	 break;
	     case "星期三":
	    	 repeat=RepeatConstant.REPEAT_WEDNESDAY;
	    	 break;
	     case "星期四":
	    	 repeat=RepeatConstant.REPEAT_THURSDAY;
	    	 break;
	     case "星期五":
	    	 repeat=RepeatConstant.REPEAT_FRIDAY;
	    	 break;
	     case "星期六":
	    	 repeat=RepeatConstant.REPEAT_SATURDAY;
	    	 break;
	    default:
	    		throw new Exception("根据时间去判断是星期错误");
	     }
	    return repeat;
	}
}
