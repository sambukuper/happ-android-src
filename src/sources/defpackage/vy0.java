package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vy0 implements w06 {
    public final /* synthetic */ byte a;

    @Override // defpackage.w06
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                h44 h44Var = ExecutorsRegistrar.a;
                return new vh1(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new o81("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                h44 h44Var2 = ExecutorsRegistrar.a;
                return new vh1(Executors.newCachedThreadPool(new o81("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                h44 h44Var3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new o81("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
