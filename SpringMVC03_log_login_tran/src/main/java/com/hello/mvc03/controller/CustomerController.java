package com.hello.mvc03.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hello.mvc03.model.biz.CustomerBiz;
import com.hello.mvc03.model.dto.CustomerDto;

@Controller
public class CustomerController {

	@Autowired
	private CustomerBiz biz;

	@RequestMapping("/list.do")
	public void selectList(Model model) {
		model.addAttribute("list", biz.selectList());
	}

	@RequestMapping(value = "/selectone.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String selectOne(Model model, String id) {

		model.addAttribute("dto", biz.selectOne(id));

		return "selectone";
	}

	@RequestMapping(value = "/insertform.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String insertform() {
		return "insertform";
	}

	@RequestMapping(value = "/updateform.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateform(Model model, String id) {
		model.addAttribute("dto", biz.selectOne(id));
		return "updateform";
	}

	@RequestMapping(value = "/insert.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String insert(CustomerDto dto) {
		int res = biz.insert(dto);

		if (res > 0) {
			return "redirect:list.do";
		} else {
			return "redirect:insertform.do";
		}
	}

	@RequestMapping(value = "/update.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String update(CustomerDto dto) {
		int res = biz.update(dto);

		if (res > 0) {
			return "redirect:selectone.do?id=" + dto.getId();
		} else {
			return "redirect:updateform.do?id=" + dto.getId();
		}
	}

	@RequestMapping(value = "/delete.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String delete(String id) {
		int res = biz.delete(id);

		if (res > 0) {
			return "redirect:list.do";
		} else {
			return "redirect:selectOne.do?id" + id;
		}

	}

	@RequestMapping("/loginform.do")
	public String login() {

		return "login";
	}

	@RequestMapping("/loginajax.do")
	@ResponseBody
	public Map<String, Boolean> loginchk(@RequestBody String aa, String id, String pw, HttpSession session) {
		// @ResponseBody : java객체를 response객체에 binding 시켜준다.
		// jackson : JSON 객체로 바꿔준다.
		System.out.println("@RequestBody : " + aa);

		CustomerDto dto = biz.login(id, pw);
		boolean loginchk = false;

		if (dto != null)
			session.setAttribute("dto", dto);
		loginchk = true;

		Map<String, Boolean> map = new HashMap<String, Boolean>();

		map.put("loginchk", loginchk);

		return map;
	}

	@RequestMapping("test.do")
	public String test() {
		biz.test();
		return "redirect:list.do";
	}
}

/*
 * @Transactional(tx:) -isolation : 별도로 정의하지 않으면 DB의 isolation level을 따른다.
 * -default : 데이터베이스에 의존 
 * -uncommitted : commit 되지 않은 데이터를 볼 수 있다. 
 * -committed : commit된 데이터만 볼 수 있다. 
 * -repeatable : 새로운 데이터 입력 시 볼 수 있다. 
 * -serializable : 동일한 데이터에 동시에 두 개 이상의 트랜잭션이 수행 불가 
 * -propagation : 전파규칙 정의 (기본값 : required) 
 * -reqired : 기본 트랜잭션이 존재하면 지원, 없으면 새로운 트랜잭션 시작 
 * -supports : 기존 트랜잭션이 존재하면 지원 , 없으면 트랜잭션 없이 
 * -mandatory : 반드시 트랜잭션 내에서 메서드 실행, 없으면 예외 발생 
 * -required_new : 언제나 새로운 트랜잭션 실행, 기존 트랜잭션 일시정지 
 * -not_supported : 기존 트랜잭션 내에서 실행, 없으면 트랜잭션 없이 
 * -never : mandatory와 반대(반드시 트랜잭션 외부에서 메서드 실행) 
 * -nested : 트랜잭션이 존재하면 중첩되어 실행, 없으면 새로운 트랜잭션 시작 
 * -readOnly : 읽기전용 
 * -rollbackFor : 정의된 exception에 대해서 rollback 수행(rollbackFor= Excetion.class) 
 * -norollbackFor : 정의된 exception에 대해서 rollback 수행 안함 
 * -timeout : 지정한 시간 내에 메서드 수행 완료되지 않으면 rollback (기본값 -1 = notimeout)
 * *mybatis에서 timeout이 존재하면 중첩되서 실행, 없으면 새로운 트랜잭션 시작
 * 
 */
