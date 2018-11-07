package com.igeekhome.pojo;

public class Paging {
	private int page; // 第几页
	private int rows; // 每页记录数
	private int start; // 起始页

	public Paging(int page, int rows) {
		super();
		this.page = page;
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getStart() {
		return (page - 1) * rows;
	}

	@Override
	public String toString() {
		return "Paging [page=" + page + ", rows=" + rows + ", start=" + start + "]";
	}

}