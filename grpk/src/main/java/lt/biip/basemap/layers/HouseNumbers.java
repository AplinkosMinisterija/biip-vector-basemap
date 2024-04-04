package lt.biip.basemap.layers;


import com.onthegomap.planetiler.FeatureCollector;
import com.onthegomap.planetiler.ForwardingProfile;
import com.onthegomap.planetiler.reader.SourceFeature;

public class HouseNumbers implements ForwardingProfile.FeatureProcessor {

    @Override
    public void processFeature(SourceFeature sf, FeatureCollector features) {
        if (sf.getSource().equals("ar") && sf.isPoint()) {

            if (sf.getTag("PASTO_KODA").equals("LT-01103")) {
                System.err.println("hello");
            }

            features.point("housenumber")
                    .setAttr("housenumber", sf.getTag("PATALPOS_N"))
                    .setMinZoom(14);
        }
    }
}
