package com.hrms.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoZonedDateTime;
import java.util.Date;

public class DateUtils {

	public static Date LocalDateToDate(LocalDate localDate) {

		ZoneId zoneId = ZoneId.systemDefault();

		ChronoZonedDateTime<LocalDate> zonedDateTime = localDate.atStartOfDay(zoneId);

		return Date.from(zonedDateTime.toInstant());

	}

}
