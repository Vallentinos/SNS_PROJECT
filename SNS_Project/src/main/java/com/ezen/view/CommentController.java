package com.ezen.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ezen.dto.CommentVO;
import com.ezen.dto.MemberVO;

@Controller
public class CommentController {

	@Autowired 
	private com.ezen.service.CommentSerivce commentService;
	
	@PostMapping(value="/save")
	public String saveCommentAction(CommentVO commentVO, HttpSession session) {
		
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "not_logedin";
			
		}else {
			commentVO.setId(loginUser.getId()); // ����� id ����
			
			// ��ǰ�� ����
			if (commentService.saveComment(commentVO) > 0) {
				return "success";
			}else {
				return "fail";
			}
		}
	}
	
	@GetMapping(value = "/list" , produces="application/json; charset=UTF-8")
	public Map<String, Object> commentList(CommentVO vo){
		Map<String	, Object> commentInfo = new HashMap<>();
		
		// ��ǰ ��� ��� ��ȸ
			List<CommentVO> commentList = commentService.getcommentList(vo.getCseq());
			
			commentInfo.put("total", commentList.size());
			commentInfo.put("commentList", commentList);
			
			return commentInfo;
	}
	
}
