package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xh1 extends u2 implements ScheduledFuture {
    public final ScheduledFuture j0;

    public xh1(wh1 wh1Var) {
        this.j0 = wh1Var.a(new wl6((Object) this, (byte) 29));
    }

    @Override // defpackage.u2
    public final void c() {
        ScheduledFuture scheduledFuture = this.j0;
        Object obj = this.X;
        scheduledFuture.cancel((obj instanceof n2) && ((n2) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.j0.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.j0.getDelay(timeUnit);
    }
}
