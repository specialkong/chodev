package egovframework.example.cmmn.web;


public class DefaultPaginationRenderer extends AbstractPaginationRenderer {
	public DefaultPaginationRenderer() {
		this.firstPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">[처음]</a>&#160;";
		this.previousPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">[이전]</a>&#160;";
		this.currentPageLabel = "<strong>{0}</strong>&#160;";
		this.otherPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">{2}</a>&#160;";
		this.nextPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">[다음]</a>&#160;";
		this.lastPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">[마지막]</a>&#160;";
	}

	public String renderPagination(egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo paginationInfo, String jsFunction) {
		return super.renderPagination(paginationInfo, jsFunction);
	}
}
