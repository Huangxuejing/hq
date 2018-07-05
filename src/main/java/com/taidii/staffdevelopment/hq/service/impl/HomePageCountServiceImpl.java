package com.taidii.staffdevelopment.hq.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.dto.HomePageCountDTO;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.error.ProductbundleError;
import com.taidii.staffdevelopment.hq.dao.IAccountsTeacherDao;
import com.taidii.staffdevelopment.hq.dao.IAttendanceTeacherDao;
import com.taidii.staffdevelopment.hq.dao.ICenterDao;
import com.taidii.staffdevelopment.hq.dao.IEnrollmentEnrollmentformDao;
import com.taidii.staffdevelopment.hq.dao.IFinanceInvoiceDao;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.service.ICenterService;
import com.taidii.staffdevelopment.hq.service.IHomePageCountService;
@Service
public class HomePageCountServiceImpl implements IHomePageCountService{

	@Autowired
	private ICenterService iCenterService;
	
	@Autowired
	private IAccountsTeacherDao iAccountsTeacherDao;
	
	@Autowired
	private IAttendanceTeacherDao iAttendanceTeacherDao;
	
	@Autowired
	private IFinanceInvoiceDao iFinanceInvoiceDao;
	
	@Autowired
	private IEnrollmentEnrollmentformDao iEnrollmentEnrollmentformDao;
	
	@Autowired
	private ICenterDao centerDao;
	/**
	 * 获取首页统计信息
	 * @param userId
	 * @return
	 * @throws ParseException 
	 */
	@Override
	public HomePageCountDTO getHomePage(Integer userId) {
		HomePageCountDTO homePageCountDTO=new HomePageCountDTO();
		
		List<OptionDTO> opList = iCenterService.getCenters(userId);
		
		//获取所有centre的id
		List<Integer> centerIdLists = new ArrayList<>();
		for(int i=0;i<opList.size();i++) {
			centerIdLists.add(opList.get(i).getId());
		}
		if(centerIdLists.size()<1) {
			return homePageCountDTO;
		}
		//获取centre下的所有员工
		List<Integer> userIds = iAccountsTeacherDao.getAccountsTeacher(centerIdLists);
		homePageCountDTO.setTotalStaff(userIds.size());
		
		Float staffAttendanceRate = 0f;
		
		List<Integer> list = null;
		//获取系统当前时间
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		//获取员工当天的出勤率
		if(userIds.size()>0) {
			try {
				list = iAttendanceTeacherDao.getAttendanceTeacher(userIds,df.parse(df.format(day)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		if(userIds.size()>0&&list.size()>0) {
			staffAttendanceRate = (float) (list.size()/userIds.size()*100);
		}
		homePageCountDTO.setStaffAttendanceRate(staffAttendanceRate+"%");
		//获取金额
		Double money = iFinanceInvoiceDao.getBalanceByIds(centerIdLists);
		homePageCountDTO.setOutStandingAmount(money);
		
		//获取当月金额
		Double monthMoney = iFinanceInvoiceDao.getMonthBalanceByCenterIds(centerIdLists);
		homePageCountDTO.setOutStandingAmountTheMonth(monthMoney);
		
		//获取学生总数
		List<Integer> nowStudentIds=iEnrollmentEnrollmentformDao.getNowTotalStudent(centerIdLists);
		homePageCountDTO.setTotalStudent(nowStudentIds.size());
		//获取学生出勤率
		Integer studentSize=0;
		if(nowStudentIds.size()>0) {
			try {
				studentSize = iEnrollmentEnrollmentformDao.getAttendanceStudent(nowStudentIds, df.parse(df.format(day)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		Float studentAttendanceRate = 0f;
		if(studentSize!=0&&nowStudentIds.size()>0) {
			studentAttendanceRate = (float) (studentSize/nowStudentIds.size()*100);
		}
		homePageCountDTO.setStudentAttendanceRate(studentAttendanceRate+"%");
		//获取本月新入学的学生人数
		Integer newStudents=iEnrollmentEnrollmentformDao.getStatusStudent(centerIdLists, 2, null);
		homePageCountDTO.setNewStudentCount(newStudents);
		//获取离圆 人数
		Integer withdStudents=iEnrollmentEnrollmentformDao.getStatusStudent(centerIdLists, 3, null);
		homePageCountDTO.setLeaveStudentCount(withdStudents);
		return homePageCountDTO;
	}
	
	private Integer getHqId(LoginUser loginUser){
        //查询hq
        List<HqHqaccount> hq = centerDao.selectCentersByUserId(loginUser.getId());
        if(hq == null || hq.size()==0){
            throw new BizException(ProductbundleError.NO_HQ);
        }
        return hq.get(0).getHqId();
    }


}
