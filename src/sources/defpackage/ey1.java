package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import io.sentry.ILogger;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.j0;
import io.sentry.protocol.k0;
import io.sentry.s5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ ey1(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        this.X = (byte) 2;
        this.Y = atomicReference;
        this.h0 = view;
        this.Z = list;
        this.f0 = countDownLatch;
        this.g0 = iLogger;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        byte b = this.X;
        Object obj = this.g0;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        Object obj4 = this.h0;
        Object obj5 = this.Y;
        switch (b) {
            case 0:
                e08 e08Var = (e08) obj3;
                e08 e08Var2 = (e08) obj2;
                View view = (View) obj4;
                Window window = ((ComponentActivity) obj).getWindow();
                window.getClass();
                gn2 gn2Var = e08Var.a;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) gn2Var.B(resources)).booleanValue();
                gn2 gn2Var2 = e08Var2.a;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((ny1) obj5).b(e08Var, e08Var2, window, view, zBooleanValue, ((Boolean) gn2Var2.B(resources2)).booleanValue());
                return;
            case 1:
                String strSubstring = (String) obj3;
                dn2 dn2Var = (dn2) obj2;
                yz4 yz4Var = (yz4) obj;
                qd0 qd0Var = (qd0) obj4;
                ((ra) obj5).getClass();
                boolean zC = ln7.c();
                if (zC) {
                    try {
                        if (strSubstring.length() > 127) {
                            strSubstring = strSubstring.substring(0, 127);
                        }
                        Trace.beginSection(strSubstring);
                    } catch (Throwable th) {
                        if (zC) {
                            Trace.endSection();
                        }
                        throw th;
                    }
                }
                try {
                    dn2Var.invoke();
                    oc5 oc5Var = wl6.h0;
                    yz4Var.k(oc5Var);
                    qd0Var.b(oc5Var);
                    break;
                } catch (Throwable th2) {
                    yz4Var.k(new mc5(th2));
                    qd0Var.d(th2);
                    break;
                }
                if (zC) {
                    Trace.endSection();
                    return;
                }
                return;
            default:
                AtomicReference atomicReference = (AtomicReference) obj5;
                View view2 = (View) obj4;
                List list = (List) obj3;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                ILogger iLogger = (ILogger) obj;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    j0 j0Var = new j0("android_view_system", arrayList);
                    k0 k0VarE = ViewHierarchyEventProcessor.e(view2);
                    arrayList.add(k0VarE);
                    ViewHierarchyEventProcessor.d(view2, k0VarE, list);
                    atomicReference.set(j0Var);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th3) {
                    iLogger.e(s5.ERROR, "Failed to process view hierarchy.", th3);
                    return;
                }
        }
    }

    public /* synthetic */ ey1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
        this.h0 = obj5;
    }
}
