package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.biz.MVCBoardBizImpl;
import com.mvc.dto.MVCBoardDto;

@Controller
public class MVCBoardController {
	@Autowired
	private MVCBoardBizImpl biz;
	
	@RequestMapping("/boardlist.do")
	public String selectList(Model md) {
		md.addAttribute("list", biz.selectList());
		return "boardlist";
	}
	@RequestMapping("/insertres.do")
	public String insert(@ModelAttribute MVCBoardDto dto) {
		int res = biz.insert(dto);
		
		if(res >0)
			return "redirect:boardlist.do";
		else
			return "insertform";
	}
	
	@RequestMapping(value = "/insert.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String insertForm() {
		return "insertform";
	}
	@RequestMapping("/selectone.do")
	public String selectone(Model md, int seq) {
		md.addAttribute("dto",biz.selectOne(seq));
		
		return "selectone";
	}
	@RequestMapping("/update.do")
	public String update(Model md, int seq) {
		md.addAttribute("dto",biz.selectOne(seq));
		
		return "updateform";
	}
	@RequestMapping("/updateres.do")
	public String updateRes(Model md, MVCBoardDto dto) {
		int res = biz.update(dto);
		
		if(res >0) {
			md.addAttribute("seq", dto.getSeq());
			return "redirect:selectone.do";
		}
		else
			return "updateform";
	}
	@RequestMapping("/delete.do")
	public String delete(Model md,int seq) {
		int res = biz.delete(seq);
		
		if(res > 0) 
			return "redirect:boardlist.do";
		else {
			md.addAttribute("seq",seq);
			return "rediret:selectone.do";
		}
	}
}
