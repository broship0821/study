package com.empmanage.sawon.service.dao;

import java.util.ArrayList;

import com.empmanage.sawon.vo.SawonVO;

public interface SawonDAO {
	ArrayList<SawonVO> getAllSawon();
	SawonVO getTelinfo(int id);
	int insertSawon(SawonVO vo);
	int updateSawon(SawonVO vo);
	int deleteSawon(int id);
}
