package com.ldu.pojo;
/**
 * 商品拓展 联合查询
 */
import java.util.List;

public class CommentExtend extends Goods{
    private List<Comments> comments;
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	
	
}