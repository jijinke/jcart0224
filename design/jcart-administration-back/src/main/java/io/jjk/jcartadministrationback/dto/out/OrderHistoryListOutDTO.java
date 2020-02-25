package io.jjk.jcartadministrationback.dto.out;

public class OrderHistoryListOutDTO {
    private Long orderHistortId;
    private Long timestamp;
    private Byte orderStatus;
    private String comment;
    private Boolean customerNotified;

    public Long getOrderHistortId() {
        return orderHistortId;
    }

    public void setOrderHistortId(Long orderHistortId) {
        this.orderHistortId = orderHistortId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getCustomerNotified() {
        return customerNotified;
    }

    public void setCustomerNotified(Boolean customerNotified) {
        this.customerNotified = customerNotified;
    }
}
