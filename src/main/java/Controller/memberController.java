package Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Dao.member.memberDao;
import Dao.member.memberQuery;
import Model.member;

@Controller
@RequestMapping("/member")
public class memberController {
	
	//切換到login畫面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/checkUser")
	//判斷帳號密碼
	public String checkUser(HttpSession session,HttpServletRequest request)throws Exception{
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		member m=memberQuery.checkUser(Username, Password);
		
		if(m!=null) {
			session.setAttribute("M", m);
			return "loginSuccess";
		}else {
			return "loginError";
		}
	}
	
	//切換到Manager管理頁
	@RequestMapping("/Manager")
	public String Manager() {
		return "Manager";
	}
	
	
	
	
	
	//切換到login 註冊
	@RequestMapping("/addmember")
	public String addmember() {
		return "member/addmember";
	}
	
	//新增會員
	@RequestMapping("/Create")
	public ModelAndView Create(member m)throws Exception{
		
		if(memberQuery.checkUserName(m.getUsername())!=null)
		{
			return new ModelAndView("member/addError");
		}else {
			new memberDao().add(m);
			return new ModelAndView("member/addSuccess");
		}
		
		
	}
	
	
	
	//切換到MemberManager頁
	
	
	
	
	//切換到memberQuery頁
	
	
	
	
	//切換到memberUpdate頁
	
	
}
