package com.massisframework.massis.displays.floormap.layers;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import com.massisframework.gui.DrawableLayer;
import com.massisframework.massis.model.building.Floor;
import com.massisframework.massis.util.geom.CoordinateHolder;

public class RoomsLabelLayer extends DrawableLayer<DrawableFloor> {

    private static final Font NAME_FONT = new Font("Georgia", Font.BOLD, 30);

    public RoomsLabelLayer(boolean enabled)
    {
        super(enabled);
    }

    @Override
    public void draw(DrawableFloor dfloor, Graphics2D g)
    {
    	final Floor f = dfloor.getFloor();
        g.setColor(Color.orange);
        Font originalF = g.getFont();
        g.setFont(NAME_FONT);
        for (CoordinateHolder r : f.getRooms())
        {
            char[] chars = r.toString().toCharArray();
            g.setColor(Color.black);
            g.drawChars(chars, 0, chars.length, (int) r.getX(),
                    (int) r.getY());
        }
        g.setFont(originalF);
    }

    @Override
    public String getName()
    {
        return "Room Labels";
    }
}
