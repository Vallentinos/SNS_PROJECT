package com.ezen.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.dto.CommentVO;

<<<<<<< HEAD
@Repository("SnsCommentDAO")
public class CommentDAO   {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// �Խñ� ���
	public int saveComment(CommentVO vo) {
		System.out.println("===> Mybatis�� saveComment() ��� ó��");
		return mybatis.insert("CommentMapper.saveComment", vo);
		
	}
	
	public List<CommentVO> commentList(int cseq){
		
		return mybatis.selectList("CommentMapper.commentList", cseq);
	}
	
	public int countCommentList(int cseq) {
		return mybatis.selectOne("CommentMapper.countcommentList", cseq);
	}
	
	/*
	public List<CommentVO>  commentListWithPaging(Criteria criteria, int cseq){
		HashMap<String,Object> map = new HashMap<>();
		
		map.put("criteria", criteria);
		map.put("cseq", cseq);
		
		return mybatis.selectList("CommentMapper.commentListWithPaging", map);
	}
	*/
=======
@Repository("commentDAO")
public class CommentDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// �Խñ� ���
	public void insertComment(CommentVO vo) {
		//System.out.println("===> Mybatis�� insertComment() ��� ó��");
		mybatis.insert("commentMapper.insertComment", vo);
		
	}
	
	// �Խñ� ����
	public void updateComment(CommentVO vo) {
		//System.out.println("===> Mybatis�� updateComment() ��� ó��");
		mybatis.update("commentMapper.updateComment", vo);
	
	}
	
	// �Խñ� ����
	
	public void deleteComment(CommentVO vo) {
		//System.out.println("===> Mybatis�� deleteComment() ��� ó��");
		mybatis.delete("commentMapper.deleteComment", vo);
	}
	
	public CommentVO getComment(CommentVO vo) {
		//System.out.println("===> Mybatis�� getComment() ��� ó��");
		return mybatis.selectOne("commentMapper.getComment", vo);
	}
	
	public List<CommentVO> getCommentList(CommentVO vo){
		//System.out.println("===> Mybatis�� getCommentList() ��� ó��");
		return mybatis.selectList("commentMapper.getCommentList", vo);
	}
	
>>>>>>> refs/remotes/origin/경석님
}
