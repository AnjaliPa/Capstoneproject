package com.npu.capstone.domain;

public class Project {
	
	private String prjt_desc;
	
	public  Project(){
		
	}
	
	public Project( String desc ){
		prjt_desc = desc;
	}
	
	public String getPrjt_desc(){
		return prjt_desc;
	}

}
