package com.keduit.service;

import java.util.List;

import com.keduit.domain.BoardVO;
import com.keduit.domain.Criteria;

public interface BoardService {

	public Long register(BoardVO board);
	
	public BoardVO get(Long bno); //한 건 읽어옴
	
//	public List<BoardVO> getList(); //여러건 읽어옴
	public List<BoardVO> getList(Criteria cri); //여러건 읽어옴
	
	public int modify(BoardVO board); // 수정하는 애

	public boolean remove(Long bno); // 삭제
	
	public int getTotalCount(Criteria cri);
	
}
