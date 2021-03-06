package study.entity;
// Generated 26 Mar, 2022 8:59:56 AM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ComplaintCommentTable generated by hbm2java
 */
@Entity
@Table(name = "complaint_comment_table", catalog = "water_jar_management")
public class ComplaintComment implements java.io.Serializable {

	private Integer complaintCommentId;
	private ComplaintTable complaintTable;
	private String commentText;
	private Date commentDateTime;

	public ComplaintComment() {
	}

	public ComplaintComment(ComplaintTable complaintTable) {
		this.complaintTable = complaintTable;
	}

	public ComplaintComment(ComplaintTable complaintTable, String commentText, Date commentDateTime) {
		this.complaintTable = complaintTable;
		this.commentText = commentText;
		this.commentDateTime = commentDateTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "complaint_comment_id", unique = true, nullable = false)
	public Integer getComplaintCommentId() {
		return this.complaintCommentId;
	}

	public void setComplaintCommentId(Integer complaintCommentId) {
		this.complaintCommentId = complaintCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "complaint_id", nullable = false)
	public ComplaintTable getComplaintTable() {
		return this.complaintTable;
	}

	public void setComplaintTable(ComplaintTable complaintTable) {
		this.complaintTable = complaintTable;
	}

	@Column(name = "comment_text", length = 500)
	public String getCommentText() {
		return this.commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "comment_date_time", length = 19)
	public Date getCommentDateTime() {
		return this.commentDateTime;
	}

	public void setCommentDateTime(Date commentDateTime) {
		this.commentDateTime = commentDateTime;
	}

	@Override
	public String toString() {
		return "ComplaintCommentTable [complaintCommentId=" + complaintCommentId + ", complaintTable=" + complaintTable
				+ ", commentText=" + commentText + ", commentDateTime=" + commentDateTime + "]";
	}
	
	

}
