package defpackage;

import android.content.res.Configuration;
import android.hardware.camera2.CameraCaptureSession;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.capture.a;
import io.sentry.android.replay.capture.b;
import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.capture.f;
import io.sentry.android.replay.capture.i;
import io.sentry.android.replay.k;
import io.sentry.android.replay.l;
import io.sentry.android.replay.util.h;
import io.sentry.android.replay.w;
import io.sentry.n0;
import io.sentry.protocol.g;
import io.sentry.rrweb.m;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ vg0(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.X = (byte) 2;
        this.Z = appComponentsBreadcrumbsIntegration;
        this.Y = j;
        this.f0 = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        byte b = this.X;
        g gVar = null;
        long j = this.Y;
        Object obj = this.f0;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                ((ol0) obj2).a.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                return;
            case 1:
                ((me6) obj2).p((te6) obj, j);
                return;
            case 2:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                n0 n0Var = AppComponentsBreadcrumbsIntegration.g0;
                if (appComponentsBreadcrumbsIntegration.Y != null) {
                    int i = appComponentsBreadcrumbsIntegration.X.getResources().getConfiguration().orientation;
                    if (i == 1) {
                        gVar = g.PORTRAIT;
                    } else if (i == 2) {
                        gVar = g.LANDSCAPE;
                    }
                    String lowerCase = gVar != null ? gVar.name().toLowerCase(Locale.ROOT) : "undefined";
                    io.sentry.g gVar2 = new io.sentry.g(j);
                    gVar2.g0 = "navigation";
                    gVar2.i0 = "device.orientation";
                    gVar2.d(lowerCase, "position");
                    gVar2.k0 = s5.INFO;
                    n0 n0Var2 = new n0();
                    n0Var2.d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.Y.a(gVar2, n0Var2);
                    return;
                }
                return;
            default:
                f fVar = (f) obj2;
                w wVar = (w) obj;
                l lVar = fVar.h;
                if (lVar != null) {
                    wVar.K(lVar, Long.valueOf(j));
                }
                long jD = fVar.x.d() - ((long) fVar.v.getSessionReplay().h);
                l lVar2 = fVar.h;
                String strU = lVar2 != null ? lVar2.u(jD) : null;
                a aVar = fVar.l;
                nw3 nw3Var = c.u[2];
                aVar.getClass();
                nw3Var.getClass();
                Object andSet = aVar.b.getAndSet(strU);
                if (!dh3.f(andSet, strU)) {
                    b bVar = new b(andSet, strU, aVar.d, (byte) 2);
                    c cVar = aVar.c;
                    s6 s6Var = cVar.a;
                    if (s6Var.getThreadChecker().c()) {
                        cVar.e.submit(new h(new t2(bVar, (byte) 7), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            bVar.invoke();
                        } catch (Throwable th) {
                            s6Var.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                    break;
                }
                ArrayList arrayList = fVar.y;
                aa6 aa6Var = new aa6();
                bw0.h0(arrayList, new k(jD, fVar, aa6Var, (byte) 1));
                if (aa6Var.X) {
                    int i2 = 0;
                    for (Object obj3 : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            i21.X();
                            throw null;
                        }
                        i iVar = (i) obj3;
                        iVar.a.v0 = i2;
                        List<io.sentry.rrweb.b> list = iVar.b.Y;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof m) {
                                    ((m) bVar2).f0 = i2;
                                }
                            }
                        }
                        i2 = i3;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ vg0(Object obj, Object obj2, long j, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = j;
    }
}
