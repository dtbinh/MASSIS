package com.massisframework.massis.displays.floormap.layers;

import java.awt.Color;
import java.awt.Graphics2D;

import com.massisframework.gui.DrawableLayer;
import com.massisframework.massis.model.building.Floor;

import straightedge.geom.PolygonHolder;

/**
 * Draws each room of the floor
 *
 * @author rpax
 *
 */
public class RoomsLayer extends DrawableLayer<DrawableFloor> {

    public RoomsLayer(boolean enabled)
    {
        super(enabled);

    }

    @Override
    public void draw(DrawableFloor dfloor, Graphics2D g)
    {
    	final Floor f = dfloor.getFloor();
        for (PolygonHolder r : f.getRooms())
        {
            g.setColor(Color.gray);
            g.fill(r.getPolygon());
        }

    }

    @Override
    public String getName()
    {
        return "Rooms";
    }
}
