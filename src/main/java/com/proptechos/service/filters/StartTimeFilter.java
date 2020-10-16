package com.proptechos.service.filters;

import com.proptechos.http.query.IQueryFilter;
import com.proptechos.http.query.QueryParam;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * StartTimeFilter class used for receiving observation for period
 *
 * @apiNote Applicable only to SensorService
 *
 * @see com.proptechos.service.SensorService
 */
public class StartTimeFilter implements IQueryFilter {

  private final String startTimeString;

  public StartTimeFilter(Instant startTime) {
    this.startTimeString = DateTimeFormatter.ISO_INSTANT.format(startTime);
  }

  @Override
  public QueryParam queryParam() {
    return new QueryParam("startTime", startTimeString);
  }
}
