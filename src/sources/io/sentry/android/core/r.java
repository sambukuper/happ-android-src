package io.sentry.android.core;

import android.os.SystemClock;
import defpackage.ad1;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements io.sentry.android.core.internal.util.s {
    public final /* synthetic */ byte a;
    public float b = 0.0f;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    @Override // io.sentry.android.core.internal.util.s
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis();
                System.nanoTime();
                long j5 = jCurrentTimeMillis * 1000000;
                u uVar = (u) obj;
                long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime())) - uVar.a;
                if (jElapsedRealtimeNanos >= 0) {
                    if (z2) {
                        uVar.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos), Long.valueOf(j3), j5));
                    } else if (z) {
                        uVar.i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos), Long.valueOf(j3), j5));
                    }
                    if (f != this.b) {
                        this.b = f;
                        uVar.h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos), Float.valueOf(f), j5));
                    }
                    break;
                }
                break;
            default:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                System.nanoTime();
                long j6 = jCurrentTimeMillis2 * 1000000;
                ad1 ad1Var = (ad1) obj;
                long jElapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime())) - ad1Var.a;
                if (jElapsedRealtimeNanos2 >= 0) {
                    if (z2) {
                        ((ConcurrentLinkedDeque) ad1Var.g).addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos2), Long.valueOf(j3), j6));
                    } else if (z) {
                        ((ConcurrentLinkedDeque) ad1Var.f).addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos2), Long.valueOf(j3), j6));
                    }
                    if (f != this.b) {
                        this.b = f;
                        ((ConcurrentLinkedDeque) ad1Var.h).addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos2), Float.valueOf(f), j6));
                    }
                    break;
                }
                break;
        }
    }
}
