package cl.ucn.disc.dsm.rmardones.directorio;

import android.app.Application;
import android.content.Context;


/**
 *  Main App
 *
 *  @author Rachell Mardones-Luna
 */
@AcraCore(buildConfigClass = BuildConfig.class)
public class App extends Application{
    /**
     *
     * @param base context to use.
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        //The following line triggers the initialization of ACRA
        ACRA.init(this);
    }
}
