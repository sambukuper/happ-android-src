package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.widget.Button;
import android.widget.Toast;
import io.sentry.ILogger;
import io.sentry.a7;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryPerformanceProvider;
import io.sentry.android.core.c2;
import io.sentry.android.core.e;
import io.sentry.android.core.g0;
import io.sentry.android.core.w1;
import io.sentry.android.core.y0;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.m;
import io.sentry.android.replay.p;
import io.sentry.b4;
import io.sentry.b7;
import io.sentry.cache.a;
import io.sentry.cache.c;
import io.sentry.cache.g;
import io.sentry.cache.tape.j;
import io.sentry.d;
import io.sentry.d7;
import io.sentry.e7;
import io.sentry.g1;
import io.sentry.g4;
import io.sentry.g7;
import io.sentry.l4;
import io.sentry.l5;
import io.sentry.n5;
import io.sentry.o;
import io.sentry.o7;
import io.sentry.protocol.w;
import io.sentry.s1;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t2;
import io.sentry.util.b;
import io.sentry.util.f;
import io.sentry.util.h;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j78 implements uz7, fa5, zw7, p63, EventListener.Factory, g7, l4, w1, j6, f, g4 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ j78(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // io.sentry.g4
    public void a(b4 b4Var) {
        ((g1) this.Y).K(new b4());
    }

    @Override // io.sentry.android.core.w1
    public void b() {
        FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.Y;
        WeakReference weakReference = feedbackShakeIntegration.g0;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        Boolean bool = g0.g0.f0;
        if (activity == null || feedbackShakeIntegration.Z == null || !feedbackShakeIntegration.f0 || feedbackShakeIntegration.g(activity) || Boolean.TRUE.equals(bool)) {
            return;
        }
        activity.runOnUiThread(new sc4((Object) feedbackShakeIntegration, (Object) activity, (byte) 28));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    @Override // defpackage.j6
    public void c(Object obj) {
        long j;
        int columnIndex;
        e eVar = (e) this.Y;
        Uri uri = (Uri) obj;
        if (uri != null) {
            c2 c2Var = (c2) eVar.X;
            s6 s6Var = (s6) eVar.Y;
            Button button = (Button) eVar.Z;
            n5 n5Var = c2Var.f0;
            try {
                Cursor cursorQuery = c2Var.getContext().getContentResolver().query(uri, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_size")) != -1 && !cursorQuery.isNull(columnIndex)) {
                            j = cursorQuery.getLong(columnIndex);
                            cursorQuery.close();
                        }
                        if (j > s6Var.getMaxAttachmentSize()) {
                            c2Var.j0 = uri;
                            n5Var.getClass();
                            button.setText("Remove screenshot");
                        } else {
                            s6Var.getLogger().h(s5.WARNING, "Selected screenshot is larger than the maxAttachmentSize of %d bytes, dropping it.", Long.valueOf(s6Var.getMaxAttachmentSize()));
                            Context context = c2Var.getContext();
                            n5Var.getClass();
                            Toast.makeText(context, "Screenshot is too large", 0).show();
                        }
                    } catch (Throwable th) {
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th3) {
                b.t(th3);
                s6Var.getLogger().e(s5.WARNING, "Unable to determine the size of the selected screenshot, the attachment size limit is applied when the feedback is captured.", th3);
            }
            j = -1;
            if (j > s6Var.getMaxAttachmentSize()) {
                c2Var.j0 = uri;
                n5Var.getClass();
                button.setText("Remove screenshot");
            } else {
                s6Var.getLogger().h(s5.WARNING, "Selected screenshot is larger than the maxAttachmentSize of %d bytes, dropping it.", Long.valueOf(s6Var.getMaxAttachmentSize()));
                Context context2 = c2Var.getContext();
                n5Var.getClass();
                Toast.makeText(context2, "Screenshot is too large", 0).show();
            }
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return _UtilJvmKt.asFactory$lambda$0((EventListener) this.Y, call);
    }

    @Override // io.sentry.g7
    public void d(e7 e7Var) {
        b7 b7Var = (b7) this.Y;
        o oVar = b7Var.q;
        if (oVar != null) {
            oVar.b(e7Var);
        }
        a7 a7Var = b7Var.f;
        o7 o7Var = b7Var.r;
        if (o7Var.g == null) {
            if (a7Var.a) {
                b7Var.v(a7Var.b, null);
                return;
            }
            return;
        }
        if (o7Var.f) {
            ListIterator listIterator = b7Var.c.listIterator();
            while (listIterator.hasNext()) {
                e7 e7Var2 = (e7) listIterator.next();
                if (!e7Var2.f && e7Var2.b == null) {
                    return;
                }
            }
        }
        b7Var.q();
    }

    @Override // io.sentry.util.f
    public Object e() {
        j jVar;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 17:
                l5 l5Var = (l5) obj;
                int i = SentryPerformanceProvider.h0;
                return l5Var;
            case 23:
                return ((c) obj).X.getSerializer();
            case 24:
                g gVar = (g) obj;
                s6 s6Var = gVar.a;
                File fileB = a.b(s6Var, ".scope-cache");
                if (fileB == null) {
                    s6Var.getLogger().h(s5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new io.sentry.cache.tape.b();
                }
                File file = new File(fileB, "breadcrumbs.json");
                try {
                    int maxBreadcrumbs = s6Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileR = j.R(file, false);
                    try {
                        try {
                            jVar = new j(file, randomAccessFileR, maxBreadcrumbs, false);
                        } catch (Throwable th) {
                            randomAccessFileR.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        s6Var.getLogger().e(s5.ERROR, "Failed to create breadcrumbs queue", e);
                        return new io.sentry.cache.tape.b();
                    }
                    break;
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = s6Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileR2 = j.R(file, false);
                    try {
                        jVar = new j(file, randomAccessFileR2, maxBreadcrumbs2, false);
                    } catch (Throwable th2) {
                        randomAccessFileR2.close();
                        throw th2;
                    }
                    break;
                }
                return new io.sentry.cache.tape.e(jVar, new d((Object) gVar, (byte) 8));
            default:
                return Boolean.valueOf(h.c("androidx.core.app.FrameMetricsAggregator", (ILogger) obj));
        }
    }

    @Override // defpackage.uz7
    public Object execute() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 1:
                wr6 wr6Var = (wr6) ((jl1) obj).k0;
                SQLiteDatabase sQLiteDatabaseG = wr6Var.g();
                sQLiteDatabaseG.beginTransaction();
                try {
                    sQLiteDatabaseG.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseG.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + wr6Var.Y.j()).execute();
                    sQLiteDatabaseG.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseG.endTransaction();
                }
            default:
                yr6 yr6Var = (yr6) obj;
                Iterator it = ((Iterable) ((wr6) yr6Var.Z).m(new kp5((byte) 18))).iterator();
                while (it.hasNext()) {
                    ((f63) yr6Var.f0).z((qz) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.zw7
    public ax7 f(yw7 yw7Var) {
        Context context = (Context) this.Y;
        String str = yw7Var.b;
        b8 b8Var = yw7Var.c;
        b8Var.getClass();
        if (str != null && str.length() != 0) {
            return new xm2(context, str, b8Var, true, true);
        }
        bt.q("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // io.sentry.l4
    public void h(g1 g1Var) {
        d7 d7VarP;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                g1Var.D(new jn0((s1) obj, g1Var, (byte) 20));
                break;
            case 13:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            default:
                m mVar = (m) obj;
                g1Var.getClass();
                g1Var.h(mVar.d());
                String strC = g1Var.C();
                String strK0 = strC != null ? fm7.K0('.', strC, strC) : null;
                io.sentry.android.replay.capture.a aVar = mVar.l;
                byte b2 = 2;
                nw3 nw3Var = io.sentry.android.replay.capture.c.u[2];
                aVar.getClass();
                nw3Var.getClass();
                Object andSet = aVar.b.getAndSet(strK0);
                if (!dh3.f(andSet, strK0)) {
                    io.sentry.android.replay.capture.b bVar = new io.sentry.android.replay.capture.b(andSet, strK0, aVar.d, b2);
                    io.sentry.android.replay.capture.c cVar = aVar.c;
                    s6 s6Var = cVar.a;
                    if (s6Var.getThreadChecker().c()) {
                        cVar.e.submit(new io.sentry.android.replay.util.h(new t2(bVar, (byte) 7), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            bVar.invoke();
                        } catch (Throwable th) {
                            s6Var.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                }
                break;
            case 14:
                AtomicLong atomicLong = ((y0) obj).X;
                if (atomicLong.get() == 0 && (d7VarP = g1Var.p()) != null) {
                    atomicLong.set(d7VarP.X.getTime());
                    break;
                }
                break;
            case 15:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                if (g1Var.p() != null) {
                    atomicBoolean.set(true);
                }
                break;
            case 18:
                g1Var.D(new jn0((io.sentry.android.core.internal.gestures.g) obj, g1Var, (byte) 25));
                break;
            case 19:
                ((s1[]) obj)[0] = g1Var.j();
                break;
            case 20:
                int i = ReplayIntegration.r0;
                g1Var.getClass();
                g1Var.h(((p) obj).c);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                int i2 = ReplayIntegration.r0;
                g1Var.getClass();
                if (dh3.f(g1Var.g(), (w) obj)) {
                    g1Var.h(w.Y);
                }
                break;
        }
    }

    @Override // defpackage.fa5
    public void i(fb9 fb9Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 3:
                i21.p((Intent) obj);
                break;
            case 4:
                ((i39) obj).b.c(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // defpackage.p63
    public void k(q63 q63Var) throws Exception {
        Object objL;
        u79 u79Var = (u79) this.Y;
        try {
            n63 n63VarD = q63Var.d();
            if (n63VarD != null) {
                xd6 xd6Var = u79Var.c;
                xd6Var.getClass();
                d63 d63VarR0 = n63VarD.r0();
                dh0 dh0Var = d63VarR0 instanceof eh0 ? ((eh0) d63VarR0).a : null;
                if (dh0Var != null && ((dh0Var.e() == bh0.h0 || dh0Var.e() == bh0.f0) && dh0Var.d() == ah0.g0 && dh0Var.c() == ch0.f0)) {
                    synchronized (xd6Var.Z) {
                        try {
                            objL = ((ArrayDeque) xd6Var.Y).size() >= 3 ? xd6Var.l() : null;
                            ((ArrayDeque) xd6Var.Y).addFirst(n63VarD);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (objL != null) {
                        ((n63) objL).close();
                        return;
                    }
                    return;
                }
                n63VarD.close();
            }
        } catch (IllegalStateException unused) {
            hi5.j0();
        }
    }

    public /* synthetic */ j78(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj2;
    }
}
