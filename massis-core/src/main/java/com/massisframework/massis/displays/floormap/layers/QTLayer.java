package com.massisframework.massis.displays.floormap.layers;

import java.awt.Color;
import java.awt.Graphics2D;

import com.massisframework.massis.model.building.Floor;

import straightedge.geom.KPolygon;

/**
 * Shows the rectangles generated by the floor's QuadTree.
 *
 * @author rpax
 *
 */
public class QTLayer extends FloorMapLayer {

    public QTLayer(boolean enabled)
    {
        super(enabled);
    }

    @Override
    protected void draw(Floor f, Graphics2D g)
    {
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
