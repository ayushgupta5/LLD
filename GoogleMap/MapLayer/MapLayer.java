package MapLayer;

public class MapLayer implements IMapLayer {
    private String layerType;

    public MapLayer(String layerType) {
        this.layerType = layerType;
    }

    @Override
    public void enableLayer() {
        System.out.println(layerType + " layer enabled.");
    }

    @Override
    public void disableLayer() {
        System.out.println(layerType + " layer disabled.");
    }
}
