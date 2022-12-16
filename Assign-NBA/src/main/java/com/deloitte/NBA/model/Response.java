package com.deloitte.NBA.model;

import com.deloitte.NBA.entity.NBA;

public class Response {

	private NBA nba;

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(NBA nba) {
		super();
		this.nba = nba;
	}

	public NBA getNba() {
		return nba;
	}

	public void setNba(NBA nba) {
		this.nba = nba;
	}

}
