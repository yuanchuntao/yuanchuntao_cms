package yuanchuntao_cms.pojo;

//----------------文章评论表
public class Comment {

	private Integer id;
	private Integer articleId;
	private Integer userId;
	private String content;
	private String created;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", articleId=" + articleId + ", userId=" + userId + ", content=" + content
				+ ", created=" + created + "]";
	}
	
	
	
}
