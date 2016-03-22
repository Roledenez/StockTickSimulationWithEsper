import java.util.Date;

/**
 * Created by Roledene on 3/22/2016.
 */
public class Tick {
    String symbol;
    Double open;
    Double close;
    Double low;
    Double high;
    Date timeStamp;

    public Tick(String symbol, Double open, double close, double low, double high, long t) {
        this.symbol = symbol;
        this.open = open;
        this.close = close;
        this.low = low;
        this.high = high;
        timeStamp = new Date(t);
    }

    public String getSymbol() {
        return symbol;
    }

    public Double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }

    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return "Open: " + open.toString()+ " Close: " + close.toString() + " Low: " + low.toString() + " High: " + high.toString() + " time: " + timeStamp.toString();
    }
}
