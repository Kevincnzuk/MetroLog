package com.github.kevincnzuk.metrolog.dto;

import java.util.List;

public class RideDTO {
    private long id;
    private long time;
    private String stationFrom;
    private String stationTo;
    private List<RouteDTO> listRoutes;

    public RideDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(String stationFrom) {
        this.stationFrom = stationFrom;
    }

    public String getStationTo() {
        return stationTo;
    }

    public void setStationTo(String stationTo) {
        this.stationTo = stationTo;
    }

    public List<RouteDTO> getListRoutes() {
        return listRoutes;
    }

    public void setListRoutes(List<RouteDTO> listRoutes) {
        this.listRoutes = listRoutes;
    }
}
