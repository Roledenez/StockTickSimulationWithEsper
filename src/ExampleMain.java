import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;

import java.util.Random;

/**
 * Created by Roledene on 3/22/2016.
 */
public class ExampleMain {

    private static Random generator=new Random();

    public static void GenerateRandomTick(EPRuntime cepRT){
        double open = (double) generator.nextInt(10);
        double close = (double) generator.nextInt(10);
        double high = (double) generator.nextInt(10);
        double low = (double) generator.nextInt(10);

        long timeStamp = System.currentTimeMillis();
        String symbol = "EURUSD";

        Tick tick= new Tick(symbol,open,close,low,high,timeStamp);

        System.out.println("Sending tick:" + tick);
        cepRT.sendEvent(tick);
    }

    public static void main(String[] args) {
        //The Configuration is meant only as an initialization-time object.
        Configuration cepConfig = new Configuration();
        cepConfig.addEventType("StockTick",Tick.class.getName());

        EPServiceProvider cep= EPServiceProviderManager.getProvider("myCEPEngine",cepConfig);

        EPRuntime cepRT = cep.getEPRuntime();
    }
}
