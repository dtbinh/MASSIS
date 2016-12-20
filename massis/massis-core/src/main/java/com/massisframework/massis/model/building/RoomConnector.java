package com.massisframework.massis.model.building;

import java.util.List;

import com.massisframework.massis.model.components.RoomComponent;

import straightedge.geom.vision.Occluder;

/**
 * Connects one or more rooms
 *
 * @author rpax
 *
 */
public interface RoomConnector extends Occluder{

    public List<RoomComponent> getConnectedRooms();
    
}
