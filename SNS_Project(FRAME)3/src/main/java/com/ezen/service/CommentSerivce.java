package com.ezen.service;

import java.util.List;

import com.ezen.dto.CommentVO;

public interface CommentSerivce {

<<<<<<< HEAD
	// �Խñ� ���
	int saveComment(CommentVO vo);
=======
	// �Խñ� ���
	void saveComment(CommentVO vo);
>>>>>>> refs/remotes/origin/경석님

	List<CommentVO> getcommentList(int cseq);

	int getcountCommentList(int cseq);

}