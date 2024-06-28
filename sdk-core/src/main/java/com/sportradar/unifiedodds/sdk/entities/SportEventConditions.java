/*
 * Copyright (C) Sportradar AG. See LICENSE for full license governing this code
 */

package com.sportradar.unifiedodds.sdk.entities;

import java.util.List;

/**
 * Defines methods implemented by classes representing sport event conditions
 */
@SuppressWarnings({ "LineLength" })
public interface SportEventConditions {
    /**
     * Returns a {@link String} specifying the attendance of the associated sport event
     *
     * @return - a {@link String} specifying the attendance of the associated sport event
     */
    String getAttendance();

    /**
     * Returns the mode of the event
     *
     * @return - the mode of the event
     */
    String getEventMode();

    /**
     * Returns the {@link Referee} instance representing the referee presiding over the associated sport event
     *
     * @return - the {@link Referee} instance representing the referee presiding over the associated sport event, if available;
     *           otherwise null
     */
    Referee getReferee();

    /**
     * Returns the {@link WeatherInfo} instance representing the expected weather on the associated sport event
     *
     * @return - the {@link WeatherInfo} instance representing the expected weather on the associated sport event, if available;
     *           otherwise null
     */
    WeatherInfo getWeatherInfo();

    /**
     * Returns the list of {@link Pitcher}
     * @return the list of {@link Pitcher}
     */
    List<Pitcher> getPitchers();
}
