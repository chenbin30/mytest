package cn.itcast.springboot.domain;
/**
 * Notice
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 下午12:31:12
 * @version 1.0
 */
public class Notice {
	private Long id;
	private String title;
	private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
}
