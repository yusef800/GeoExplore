package test.connect.geoexploreapp.model;

public class Range {
    public double min_latitude;
    public double min_longitude;
    public double max_latitude;
    public double max_longitude;

    public double getMin_latitude() {
        return min_latitude;
    }

    public void setMin_latitude(double min_latitude) {
        this.min_latitude = min_latitude;
    }

    public double getMin_longitude() {
        return min_longitude;
    }

    public void setMin_longitude(double min_longitude) {
        this.min_longitude = min_longitude;
    }

    public double getMax_latitude() {
        return max_latitude;
    }

    public void setMax_latitude(double max_latitude) {
        this.max_latitude = max_latitude;
    }

    public double getMax_longitude() {
        return max_longitude;
    }

    public void setMax_longitude(double max_longitude) {
        this.max_longitude = max_longitude;
    }
}
