package ie.transportdublin.server.plugin.json;

import ie.transportdublin.xml.Stop;

import javax.xml.bind.annotation.XmlRootElement;

import org.neo4j.graphdb.Node;

@XmlRootElement( name = "stop" )
public class RouteStop
{

    private String stopId;
    private String stopName;
    private Coordinate latLon;

    public RouteStop()
    {
    }

    public RouteStop( String stopId, String stopName, Coordinate latLon )
    {
        super();
        this.stopId = stopId;
        this.stopName = stopName;
        this.latLon = latLon;
    }

    public RouteStop( Node hit )
    {
        Stop stop = new Stop( hit );
        this.stopId = stop.getStopId();
        this.stopName = stop.getStopName();
        this.latLon = stop.getCoordinate();
    }

    public String getStopId()
    {
        return stopId;
    }

    public void setStopId( String stopId )
    {
        this.stopId = stopId;
    }

    public String getStopName()
    {
        return stopName;
    }

    public void setStopName( String stopName )
    {
        this.stopName = stopName;
    }

    public Coordinate getLatLon()
    {
        return latLon;
    }

    public void setLatLon( Coordinate latLon )
    {
        this.latLon = latLon;
    }

}
