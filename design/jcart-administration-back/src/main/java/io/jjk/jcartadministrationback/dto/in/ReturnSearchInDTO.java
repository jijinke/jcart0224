package io.jjk.jcartadministrationback.dto.in;

public class ReturnSearchInDTO {
    private Integer returId;
    private long orderId;
    private String customerName;
    private String productCode;
    private String productName;
    private Byte status;

    public Integer getReturId() {
        return returId;
    }

    public void setReturId(Integer returId) {
        this.returId = returId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
