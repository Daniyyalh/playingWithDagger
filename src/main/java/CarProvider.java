import dagger.Module;
import dagger.Provides;

@Module
public class CarProvider {

    @Provides
    Engine providesEngine(){
        return new Engine("V8");
    }

    @Provides
    Rims providesRims(){
        return new Rims("Steel");
    }


}
