package com.springboot.studyjunil.service.board;

import com.springboot.studyjunil.web.dto.board.CreateBoardReqDto;
import com.springboot.studyjunil.web.dto.board.CreateBoardRespDto;
import com.springboot.studyjunil.web.dto.board.ReadBoardRespDto;

public interface BoardService {
	public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public ReadBoardRespDto readBoard(int boardcode) throws Exception;
	public ReadBoardRespDto readBoardList(int page) throws Exception;
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
}
