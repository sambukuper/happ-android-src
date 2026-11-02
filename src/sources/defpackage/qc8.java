package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qc8 {
    public final Context a;
    public final r41 b;
    public final zv7 c;
    public final ScheduledThreadPoolExecutor e;
    public final oc8 g;
    public final vt d = new vt(0);
    public boolean f = false;

    public qc8(r41 r41Var, oc8 oc8Var, zv7 zv7Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = r41Var;
        this.g = oc8Var;
        this.c = zv7Var;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public final synchronized void a(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc8.b():boolean");
    }

    public final void c(long j) {
        this.e.schedule(new sc8(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        a(true);
    }
}
