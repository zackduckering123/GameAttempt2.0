package com.company.game.tiles.blocks;

import com.company.game.util.AABB;
import com.company.game.util.Vector2f;

import java.awt.*;
import java.awt.image.BufferedImage;

public class HoleBlock extends Block {
    public HoleBlock(int w, int h, BufferedImage img, Vector2f pos) {
        super(w, h, img, pos);
    }

    @Override
    public boolean update(AABB p) {
        return false;
    }

    @Override
    public void render(Graphics2D g) {
        super.render(g);
        g.setColor(Color.green);
        g.drawRect((int) pos.getWorldVar().x, (int) pos.getWorldVar().y, w, h);
    }
}


