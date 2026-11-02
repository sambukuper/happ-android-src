package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.bt;
import defpackage.d02;
import defpackage.lr;
import defpackage.n84;
import defpackage.rc3;
import defpackage.w84;
import defpackage.x84;
import defpackage.yu5;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lrc3;", "Ld94;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements rc3 {
    @Override // defpackage.rc3
    public final Object create(Context context) {
        context.getClass();
        lr lrVarN = lr.n(context);
        lrVarN.getClass();
        if (!((HashSet) lrVarN.Z).contains(ProcessLifecycleInitializer.class)) {
            bt.i("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!x84.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new w84());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.k0;
        processLifecycleOwner.getClass();
        processLifecycleOwner.g0 = new Handler();
        processLifecycleOwner.h0.d(n84.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new yu5(processLifecycleOwner));
        return processLifecycleOwner;
    }

    @Override // defpackage.rc3
    public final List dependencies() {
        return d02.X;
    }
}
