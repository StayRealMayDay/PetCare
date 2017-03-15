package com.pet.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//
//import com.pet.dao.UserDao;
//import com.pet.entity.PetUser;
//import com.pet.entity.SysUser;
//import com.pet.service.PetUserService;
//import com.pet.service.UserService;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//	@Autowired
//	PetUserService petUserService;
//	
//	
//	@RequestMapping("/toLo")
//	public String tologin()
//	{
//		return "front/login";
//	}
//	
 //
//	
//	
//	@RequestMapping("/login")
//	public String login(Model m,PetUser u)
//	{
//		String petUserPwd2;
//		String petUserName1=u.getUsername();
//		String petUserPwd1=u.getPwd();
//		PetUser petUser1=petUserService.findUniqueBy("username", petUserName1);
//		if(petUser1!=null){
//			petUserPwd2=petUser1.getPwd();
//		
//		if(petUserPwd2.equals(petUserPwd1)){
//			m.addAttribute("u", u);
//			return "front/success";
//		  }
//		else
//			return "front/login";
//		}
//		else
//			return "front/login";
//		
//	}
//	
//	@RequestMapping("/resetUserpwd")
//	public String resetusername(Model m,PetUser petUser){
//		
//		String petUserName1=petUser.getUsername();
//		String petUserPwd1=petUser.getPwd();
//		PetUser petUser1=petUserService.findUniqueBy("username", petUserName1);
//		String petUserPwd2=petUser1.getPwd();
//		if(petUserPwd2.equals(petUserPwd1)){
//			petUserService.update(petUser);
//		}
//		
//		
//		return "front/resetuserpwdsuccess";
//	}
//	
//}
