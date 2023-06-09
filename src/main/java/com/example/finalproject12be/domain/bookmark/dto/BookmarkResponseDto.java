package com.example.finalproject12be.domain.bookmark.dto;

import com.example.finalproject12be.domain.bookmark.entity.Bookmark;
import com.example.finalproject12be.domain.store.entity.Store;

import lombok.Getter;

@Getter
public class BookmarkResponseDto {

	private final Long storeId;
	private final String address;
	private final String name;
	private final String callNumber;
	private final String weekdaysTime;
	private boolean bookmark = true; //이걸 줄 필요가 있나 ?
	private final long totalBookmark;
	private boolean holidayBusiness = false;
	private boolean nightBusiness = false;
	private boolean foreign = false;

	public BookmarkResponseDto(Store store) {
		this.storeId = store.getId();
		this.address = store.getAddress();
		this.name = store.getName();
		this.callNumber = store.getCallNumber();
		this.weekdaysTime = store.getWeekdaysTime();
		this.totalBookmark = store.getBookmarks().size();
	}

	public void setHolidayBusiness(boolean holidayBusiness){
		this.holidayBusiness = holidayBusiness;
	}

	public void setNightBusiness(boolean nightBusiness){
		this.nightBusiness = nightBusiness;
	}

	public void setForeign(boolean foreign){ this.foreign = foreign; }
}
