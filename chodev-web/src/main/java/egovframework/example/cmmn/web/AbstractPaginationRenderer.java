package egovframework.example.cmmn.web;

import java.text.MessageFormat;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationRenderer;

public abstract class AbstractPaginationRenderer implements PaginationRenderer {
	protected String firstPageLabel;
	protected String previousPageLabel;
	protected String currentPageLabel;
	protected String otherPageLabel;
	protected String nextPageLabel;
	protected String lastPageLabel;

	public String renderPagination(egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo paginationInfo, String jsFunction) {
		StringBuffer strBuff = new StringBuffer();
		int firstPageNo = paginationInfo.getFirstPageNo();
		int firstPageNoOnPageList = paginationInfo.getFirstPageNoOnPageList();
		int totalPageCount = paginationInfo.getTotalPageCount();
		int pageSize = paginationInfo.getPageSize();
		int lastPageNoOnPageList = paginationInfo.getLastPageNoOnPageList();
		int currentPageNo = paginationInfo.getCurrentPageNo();
		int lastPageNo = paginationInfo.getLastPageNo();
		if (totalPageCount > pageSize) {
			if (firstPageNoOnPageList > pageSize) {
				strBuff.append(MessageFormat.format(this.firstPageLabel,
						new Object[]{jsFunction, Integer.toString(firstPageNo)}));
				strBuff.append(MessageFormat.format(this.previousPageLabel,
						new Object[]{jsFunction, Integer.toString(firstPageNoOnPageList - 1)}));
			} else {
				strBuff.append(MessageFormat.format(this.firstPageLabel,
						new Object[]{jsFunction, Integer.toString(firstPageNo)}));
				strBuff.append(MessageFormat.format(this.previousPageLabel,
						new Object[]{jsFunction, Integer.toString(firstPageNo)}));
			}
		}

		for (int i = firstPageNoOnPageList; i <= lastPageNoOnPageList; ++i) {
			if (i == currentPageNo) {
				strBuff.append(MessageFormat.format(this.currentPageLabel, new Object[]{Integer.toString(i)}));
			} else {
				strBuff.append(MessageFormat.format(this.otherPageLabel,
						new Object[]{jsFunction, Integer.toString(i), Integer.toString(i)}));
			}
		}

		if (totalPageCount > pageSize) {
			if (lastPageNoOnPageList < totalPageCount) {
				strBuff.append(MessageFormat.format(this.nextPageLabel,
						new Object[]{jsFunction, Integer.toString(firstPageNoOnPageList + pageSize)}));
				strBuff.append(MessageFormat.format(this.lastPageLabel,
						new Object[]{jsFunction, Integer.toString(lastPageNo)}));
			} else {
				strBuff.append(MessageFormat.format(this.nextPageLabel,
						new Object[]{jsFunction, Integer.toString(lastPageNo)}));
				strBuff.append(MessageFormat.format(this.lastPageLabel,
						new Object[]{jsFunction, Integer.toString(lastPageNo)}));
			}
		}

		return strBuff.toString();
	}
}
