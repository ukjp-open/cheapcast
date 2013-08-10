package at.maui.cheapcast;

/**
 * Created with IntelliJ IDEA.
 * User: maui
 * Date: 09.08.13
 * Time: 01:17
 * To change this template use File | Settings | File Templates.
 */
public class Const {

    public static final String DEVICE_DESC = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "    <root xmlns=\"urn:schemas-upnp-org:device-1-0\">\n" +
            "        <specVersion>\n" +
            "        <major>1</major>\n" +
            "        <minor>0</minor>\n" +
            "        </specVersion>\n" +
            "        <URLBase>#base#</URLBase>\n" +
            "        <device>\n" +
            "            <deviceType>urn:schemas-upnp-org:device:dial:1</deviceType>\n" +
            "            <friendlyName>#friendlyname#</friendlyName>\n" +
            "            <manufacturer>Google Inc.</manufacturer>\n" +
            "            <modelName>Eureka Dongle</modelName>\n" +
            "            <UDN>uuid:#uuid#</UDN>\n" +
            "            <serviceList>\n" +
            "                <service>\n" +
            "                    <serviceType>urn:schemas-upnp-org:service:dial:1</serviceType>\n" +
            "                    <serviceId>urn:upnp-org:serviceId:dial</serviceId>\n" +
            "                    <controlURL>/ssdp/notfound</controlURL>\n" +
            "                    <eventSubURL>/ssdp/notfound</eventSubURL>\n" +
            "                    <SCPDURL>/ssdp/notfound</SCPDURL>\n" +
            "                </service>\n" +
            "            </serviceList>\n" +
            "        </device>\n" +
            "    </root>";
}