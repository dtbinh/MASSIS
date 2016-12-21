package com.massisframework.massis.displays.floormap.layers;

import java.awt.Color;
import java.awt.Graphics2D;

import com.massisframework.gui.DrawableLayer;
import com.massisframework.massis.model.building.Floor;

import straightedge.geom.KPolygon;

/**
 * Shows the rectangles generated by the floor's QuadTree.
 *
 * @author rpax
 *
 */
public class QTLayer extends DrawableLayer<DrawableFloor> {

    public QTLayer(boolean enabled)
    {
        super(enabled);
    }

    @Override
    public void draw(DrawableFloor dfloor, Graphics2D g)
    {
    	final Floor f = dfloor.getFloor();
        g.setColor(Color.MAGENTA);
        for (KPolygon poly : f.getQTRectangles())
        {
            g.draw(poly);
        }
    }

    @Override
    public String getName()
    {
        return "QuadTree Layer";
    }
}
