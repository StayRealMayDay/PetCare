package com.pet.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pet.entity.PetUser;
import com.pet.service.PetUserService;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping("/petUser")
public class PetUserController {

	
	@Autowired
	PetUserService petUserService;
	
	@RequestMapping("/toIndex")
	public String toIndex()
	{
		return "front/index";
	}
	
//	@RequestMapping("/toLogin")
//	public String toLogin()
//	{
//		return "front/login";
//	}
	
	//登陆  
//	@RequestMapping("/login")
//	public String login(Model m,PetUser u,HttpSession session){
//		String petUserPwd2;
//		String petUserName1=u.getUsername();
//		String petUserPwd1=u.getPwd();
//		PetUser petUser1=petUserService.findUniqueBy("username", petUserName1);
//		if(petUser1!=null){
//			petUserPwd2=petUser1.getPwd();
//		    if(petUserPwd2.equals(petUserPwd1)){
//			   m.addAttribute("u", petUser1);
//			   session.setAttribute("userSession", petUser1);
//			  return "front/index";
//		  }
//		 else
//			  return "front/login";
//		}
//	else
//			return "front/login";
//	}

	@RequestMapping(value="/login",method = POST)

	public ResponseEntity login(@RequestBody PetUser petUser, HttpSession session)
	{
		System.out.println(petUser.getUsername());
		System.out.println(petUser.getPwd());
		if(null==petUser.getUsername()) return new ResponseEntity<>("a1123asdasdas141git",HttpStatus.OK);
		else{
			PetUser user = petUserService.findUniqueBy("username",petUser.getUsername());
		    if(null==user) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    else if(user.getPwd().equals(petUser.getPwd())){
				return new ResponseEntity<>(user, HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
	}
	
	//注册
//	@RequestMapping("/toRegister")
//	public List<PetUser> toRegister()
//	{
//		return petUserService.findAll();
//	}

//	@RequestMapping("/register")
//	public boolean register(PetUser petUser,Model m,HttpSession session){
//
//		PetUser user=petUserService.findUniqueBy("username", petUser.getUsername());
//		if(null!=user) return "front/register";
//
//	petUserService.save(petUser);
//	session.setAttribute("userSession", petUser);
//	m.addAttribute("u", petUser);
//    return "front/index";
//	}
	
	//个人信息
	@RequestMapping("/personalInformation")
	public String personal_information(Model m,HttpSession session){
		PetUser user=(PetUser)session.getAttribute("userSession");
		m.addAttribute("u", user);
		return "front/userCenter";	
	}	
	
	//修改个人信息
	@RequestMapping("/modifyPsInf")
	public String modifypsinf(PetUser petUser,HttpSession session){
		PetUser user=(PetUser)session.getAttribute("userSession");
		user.setEmail(petUser.getEmail());
		user.setUserAddress(petUser.getUserAddress());
		user.setPhone(petUser.getPhone());
		user.setUsername(petUser.getUsername());
		petUserService.update(user);
		return "front/modifyPsInfSuccess";
	}
	//修改密码
	@RequestMapping("/changePwd")
	public String changepwd(PetUser petUser,HttpSession session){
		PetUser user=(PetUser)session.getAttribute("userSession");
		user.setPwd(petUser.getPwd());
		return "front/userCenter";
	}
}
