package com.tka.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PaymentDto {
	
	@NotNull(message = "Booking Id is required")
	private Long bookingId;
	 @NotBlank(message = "Payment method is required")
	private Long PaymentMethod;
	 @Min(value = 1, message = "Amount must be greater than 0")
	private double amount;
	private String status;
	public PaymentDto() {
	
	

}
	
	@Override
	public String toString() {
		return "PaymentDto [bookingId=" + bookingId + ", PaymentMethod=" + PaymentMethod + ", amount=" + amount
				+ ", status=" + status + "]";
	}

	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Long getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(Long paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
