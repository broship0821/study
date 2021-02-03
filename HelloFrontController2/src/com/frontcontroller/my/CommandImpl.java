package com.frontcontroller.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandImpl {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
