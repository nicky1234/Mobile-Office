package com.mo.mobileoffice.function.meeting.bean;

/** 请求所有楼层的物理信息的请求参数bean **/
public class FloorInfo_Request {

	public String user_id;
	public String token;

	public FloorInfo_Request(String user_id, String token) {
		super();
		this.user_id = user_id;
		this.token = token;
	}

}
