package io.jjk.jcartadministrationback.dto.out;


public class ReturnHistoryListOutDTO {
    private Integer returnHistoryId;
    private Long timestamp;
    private Byte returnStatus;
    private String comment;
    private Boolean customerNotfied;

    public Integer getReturnHistoryId() {
        return returnHistoryId;
    }

    public void setReturnHistoryId(Integer returnHistoryId) {
        this.returnHistoryId = returnHistoryId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getCustomerNotfied() {
        return customerNotfied;
    }

    public void setCustomerNotfied(Boolean customerNotfied) {
        this.customerNotfied = customerNotfied;
    }
}
