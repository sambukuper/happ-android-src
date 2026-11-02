package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh1 implements wh1 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ vh1 Y;
    public final /* synthetic */ Runnable Z;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;
    public final /* synthetic */ TimeUnit h0;

    public /* synthetic */ sh1(vh1 vh1Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.X = b;
        this.Y = vh1Var;
        this.Z = runnable;
        this.f0 = j;
        this.g0 = j2;
        this.h0 = timeUnit;
    }

    @Override // defpackage.wh1
    public final ScheduledFuture a(wl6 wl6Var) {
        byte b = this.X;
        Runnable runnable = this.Z;
        vh1 vh1Var = this.Y;
        switch (b) {
            case 0:
                return vh1Var.Y.scheduleAtFixedRate(new th1(vh1Var, runnable, wl6Var, (byte) 0), this.f0, this.g0, this.h0);
            default:
                return vh1Var.Y.scheduleWithFixedDelay(new th1(vh1Var, runnable, wl6Var, (byte) 2), this.f0, this.g0, this.h0);
        }
    }
}
