package com.google.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.google.sawon.vo.TelInfoVO;

public interface TelInfoService {
	//매개변수가 전부 vo임, 스프링에선 이게 더 좋은 방법
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException;
	public TelInfoVO getTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException;
	public void updateTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException;
	public void insertTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException;
	public void deleteTelinfo(TelInfoVO vo) throws ClassNotFoundException, SQLException;
}
