package com.example.finalproject12be.domain.store.dto;

import com.example.finalproject12be.domain.store.entity.Store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreResponseDto {

	private Long storeId;
	private String address;
	private String name;
	private String callNumber;
	private String weekdaysTime;
	private Double longitude;
	private Double latitude;
	private boolean bookmark = false;
	private Long bookmarkCount;

	public StoreResponseDto(Store store) {
		this.storeId = store.getId();
		this.address = store.getAddress();
		this.name = store.getName();
		this.callNumber = store.getCallNumber();
		this.weekdaysTime = store.getWeekdaysTime();
		this.longitude = store.getLongitude();
		this.latitude = store.getLatitude();
	}

	public StoreResponseDto(Long storeId, String address, String name, String callNumber,
		String weekdaysTime, Double longitude, Double latitude, Long bookmarkCount) {
		this.storeId = storeId;
		this.address = address;
		this.name = name;
		this.callNumber = callNumber;
		this.weekdaysTime = weekdaysTime;
		this.longitude = longitude;
		this.latitude = latitude;
		this.bookmarkCount = bookmarkCount;
	}
	public void setBookmark(boolean bookmark){
		this.bookmark = bookmark;
	}

}