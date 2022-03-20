package com.company.game.tiles;
import com.company.game.graphics.Sprite;
import com.company.game.util.Vector2f;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;



public class TileManager {

    public static ArrayList<TileMap> tm;

    public TileManager(String path) {
        tm = new ArrayList<TileMap>();
        addTileMap(path, 64, 64);
    }
    private void addTileMap(String path, int blockwidth,int blockHeight) {
        String imagePath;

        int width = 0;
        int height = 0;
        int tileWidth;
        int tileHeight;
        int tileCount;
        int tileColumns;
        int layer = 0;
        Sprite sprite;

        String[] data = new String[10];

        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder = builderFactory.newDocumentBuilder();
            Document doc = builder.parse(new File(getClass().getClassLoader().getResource(.toURI)));
            doc.getDocumentElement().normalise();

            NodeList list = doc.getElementsByTagName()
        }

    }
}
