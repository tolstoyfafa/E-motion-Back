package com.motus.emotion.service;

import com.motus.emotion.dto.LocationDto;
import com.motus.emotion.model.Location;

import java.util.List;

public interface LocationService {
    Location create(Location location);

    List<Location> findByUser(Long userId);

    List<Location> findAll();

    Location update(Long id, LocationDto locationDto);
}
