package com.empmanage.sawon.service;

import java.util.ArrayList;

import com.empmanage.sawon.vo.SawonVO;

public interface SawonService {
	ArrayList<SawonVO> getAllSawon() throws Exception;
	SawonVO getTelinfo(int id);
	int insertSawon(SawonVO vo);
	int updateSawon(SawonVO vo);
	int deleteSawon(int id);
}
