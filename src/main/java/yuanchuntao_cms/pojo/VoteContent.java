package yuanchuntao_cms.pojo;

//------------------投票内容表
public class VoteContent {

	private Integer id;
	private String title;
	private String content;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Vote_Content [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
