public class Delivery {
    // Attributes
    private String deliveryId;
    private String orderID;
    private String deliveryStatus;
    private String expectedDeliveryDate;
    private String deliveryHub;


    // Constructor
    public Delivery(String deliveryId, String orderID, String deliveryStatus, String expectedDeliveryDate, String deliveryHub) {
        this.deliveryId = deliveryId;
        this.orderID = orderID;
        this.deliveryStatus = deliveryStatus;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.deliveryHub = deliveryHub;
    }

    //method to schedule a delivery

    //method to track a delivery

    //method to update a delivery status
}
