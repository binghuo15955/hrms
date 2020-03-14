package com.hrms.entity;

import java.io.Serializable;
import java.util.List;

public class Page implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int currPage;//��ǰҳ��
    private int pageSize;//ÿҳ��ʾ�ļ�¼��
    private int totalCount;//�ܼ�¼��
    private int totalPage;//��ҳ��
    private List lists;//ÿҳ����ʾ������
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List getLists() {
		return lists;
	}
	public void setLists(List lists) {
		this.lists = lists;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Page(int currPage, int pageSize, int totalCount, int totalPage, List lists) {
		super();
		this.currPage = currPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.lists = lists;
	}
	public Page() {
		super();
	}
	@Override
	public String toString() {
		return "pageDivide [currPage=" + currPage + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", totalPage=" + totalPage + ", lists=" + lists + "]";
	}
    
    


}
