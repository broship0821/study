package com.empmanage.sawon.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empmanage.sawon.service.SawonService;
import com.empmanage.sawon.service.dao.SawonDAO;
import com.empmanage.sawon.vo.SawonVO;

@Service/*("sawonService")*/
public class SawonServiceImpl implements SawonService {
	
	@Autowired
	private SawonDAO dao;
	
	@Override
	@Transactional
	public ArrayList<SawonVO> getAllSawon() throws Exception {
		return dao.getAllSawon();
	}
	
	@Override
	@Transactional
	public SawonVO getTelinfo(int id) {
		return dao.getTelinfo(id);
	}
	
	@Override
	@Transactional
	public int insertSawon(SawonVO vo) {
		return dao.insertSawon(vo);
	}
	
	@Override
	@Transactional
	public int deleteSawon(int id) {
		return dao.deleteSawon(id);
	}
	
	@Override
	@Transactional
	public int updateSawon(SawonVO vo) {
		return dao.updateSawon(vo);
	}
}
