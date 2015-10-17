// Copyright 2012 Square, Inc.

package com.squareup.timessquare;

import java.util.Date;

/** Describes the state of a particular date cell in a {@link MonthView}. */
public class MonthCellDescriptor {
	public enum RangeState {
		NONE, FIRST, MIDDLE, LAST
	}

	private final Date date;
	private final int value;
	private final boolean isCurrentMonth;
	private boolean isSelected;
	private boolean isInDate;
	private boolean isOutDate;
	private final boolean isToday;
	// private final boolean isSelectable;
	private boolean isSelectable;
	private boolean isHighlighted;
	private boolean isNoRoom;
	private RangeState rangeState;

	public MonthCellDescriptor(Date date, int value, boolean isCurrentMonth,
			boolean isSelected, boolean isInDate, boolean isOutDate,
			boolean isToday, boolean isSelectable, boolean isHighlighted,
			boolean isNoRoom, RangeState rangeState) {
		this.date = date;
		this.value = value;
		this.isCurrentMonth = isCurrentMonth;
		this.isSelected = isSelected;
		this.isInDate = isInDate;
		this.isOutDate = isOutDate;
		this.isToday = isToday;
		this.isSelectable = isSelectable;
		this.isHighlighted = isHighlighted;
		this.isNoRoom = isNoRoom;
		this.rangeState = rangeState;
	}

	// MonthCellDescriptor(Date date, boolean currentMonth, boolean selectable,
	// boolean selected, boolean today, boolean highlighted, int value,
	// RangeState rangeState) {
	// this.date = date;
	// isCurrentMonth = currentMonth;
	// isSelectable = selectable;
	// isHighlighted = highlighted;
	// isSelected = selected;
	// isToday = today;
	// this.value = value;
	// this.rangeState = rangeState;
	// }

	public Date getDate() {
		return date;
	}

	public boolean isCurrentMonth() {
		return isCurrentMonth;
	}

	public boolean isSelectable() {
		return isSelectable;
	}

	public void setSelectable(boolean isSelectable) {
		this.isSelectable = isSelectable;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public boolean isInDate() {
		return isInDate;
	}

	public void setInDate(boolean isInDate) {
		this.isInDate = isInDate;
	}

	public boolean isOutDate() {
		return isOutDate;
	}

	public void setOutDate(boolean isOutDate) {
		this.isOutDate = isOutDate;
	}

	public void setSelected(boolean selected) {
		isSelected = selected;
	}

	boolean isHighlighted() {
		return isHighlighted;
	}

	void setHighlighted(boolean highlighted) {
		isHighlighted = highlighted;
	}

	public boolean isNoRoom() {
		return isNoRoom;
	}

	public void setNoRoom(boolean isNoRoom) {
		this.isNoRoom = isNoRoom;
	}

	public boolean isToday() {
		return isToday;
	}

	public RangeState getRangeState() {
		return rangeState;
	}

	public void setRangeState(RangeState rangeState) {
		this.rangeState = rangeState;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "MonthCellDescriptor [date=" + date + ", value=" + value
				+ ", isCurrentMonth=" + isCurrentMonth + ", isSelected="
				+ isSelected + ", isInDate=" + isInDate + ", isOutDate="
				+ isOutDate + ", isToday=" + isToday + ", isSelectable="
				+ isSelectable + ", isHighlighted=" + isHighlighted
				+ ", rangeState=" + rangeState + "]";
	}

}
