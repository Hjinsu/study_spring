package com.mvc.dto;

import com.mvc.dao.MVCBoardDaoImpl;

public class PageDto {
	
	private final static int PAGE_COUNT = 5;
	private int blockStartNum = 0;
	private int blockLastNum = 0;
	private int lastPageNum = 0;
	
	public int getBlockStartNum() {
		return blockStartNum;
	}
	public void setBlockStartNum(int blockStartNum) {
		this.blockStartNum = blockStartNum;
	}
	public int getBlockLastNum() {
		return blockLastNum;
	}
	public void setBlockLastNum(int blockLastNum) {
		this.blockLastNum = blockLastNum;
	}
	public int getLastPageNum() {
		return lastPageNum;
	}
	public void setLastPageNum(int lastPageNum) {
		this.lastPageNum = lastPageNum;
	}

    public void makeBlock(int curPage){
        int blockNum = 0;

        blockNum = (int)Math.floor((curPage-1)/ PAGE_COUNT);
        blockStartNum = (PAGE_COUNT * blockNum) + 1;
        blockLastNum = blockStartNum + (PAGE_COUNT-1);
    }
    public void makeLastPageNum() {
    	MVCBoardDaoImpl dao = new MVCBoardDaoImpl();
        int total = dao.getListSize();

        if( total % PAGE_COUNT == 0 ) {
            lastPageNum = (int)Math.floor(total/PAGE_COUNT);
        }
        else {
            lastPageNum = (int)Math.floor(total/PAGE_COUNT) + 1;
        }
    }
}
