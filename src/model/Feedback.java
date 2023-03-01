/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Feedback {
    private String feedbackId;
    private String review;
    private int rating;
    private String customerName;
    private String orderId;
    private LocalDate created;
    

    public Feedback() {
    }

    public Feedback(String feedbackId, String review, int rating, String customerName, String orderId) {
        this.feedbackId = feedbackId;
        this.review = review;
        this.rating = rating;
        this.customerName = customerName;
        this.orderId = orderId;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
    
}
