package com.google.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.sawon.dao.TelInfoDAO;
import com.google.sawon.vo.TelInfoVO;
@Service
public class TelInfoServiceImpl implements TelInfoService {
	@Autowired
	private TelInfoDAO dao;

	@Override
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException {
		return dao.getAllTelinfo(vo);
	}

	@Override
	public TelInfoVO getTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException {
		return dao.getTelinfo(vo);
	}

	@Override
	public void updateTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException {
		dao.updateTelinfo(vo);
	}

	@Override
	public void insertTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException {
		dao.insertTelinfo(vo);
	}

	@Override
	public void deleteTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException {
		dao.deleteTelinfo(vo);
	}

}
