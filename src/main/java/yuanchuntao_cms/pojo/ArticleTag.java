package yuanchuntao_cms.pojo;

// -------------文章标签关联表
public class ArticleTag {

	private Integer aid;
	private Integer tid;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Article_Tag [aid=" + aid + ", tid=" + tid + "]";
	}
	
	
}
