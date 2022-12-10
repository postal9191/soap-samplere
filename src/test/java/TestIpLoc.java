import com.lavasoft.GeoIPService;
import org.testng.annotations.Test;

public class TestIpLoc {

    @Test
    public void testMyIp() {
        String ipLocation = new GeoIPService().getGeoIPServiceSoap12().getIpLocation("92.101.253.82");
        System.out.println(ipLocation);
    }
}
