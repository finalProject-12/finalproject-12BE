package com.example.finalproject12be.domain.store.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MappedSearchRequest {

	private int page;
	private int size;
	private String storeName;
	private String gu;
	private boolean open;
	private boolean holidayBusiness;
	private boolean nightBusiness;

	private String radius;
	private String latitude;
	private String longitude;


	@Builder
	public MappedSearchRequest(int page, int size, String storeName, String gu, boolean open,
		boolean holidayBusiness, boolean nightBusiness, String baseRadius, String baseLatitude, String baseLongitude)
	{
		this.page = page;
		this.size = size;
		this.storeName = storeName;
		this.gu = gu;
		this.open = open;
		this.holidayBusiness = holidayBusiness;
		this.nightBusiness = nightBusiness;
		this.radius= baseRadius;
		this.latitude = baseLatitude;
		this.longitude = baseLongitude;
	}
}
