package io.sentry.android.core;

import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.t3;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements io.sentry.e1 {
    public long a;
    public long b;
    public long c;
    public boolean d;

    @Override // io.sentry.e1
    public final void a(t3 t3Var) {
        if (this.d) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.a;
            this.a = jElapsedRealtimeNanos;
            long elapsedCpuTime = Process.getElapsedCpuTime() * 1000000;
            long j2 = elapsedCpuTime - this.b;
            this.b = elapsedCpuTime;
            t3Var.a = ((j2 / j) / this.c) * 100.0d;
            t3Var.b = true;
        }
    }

    @Override // io.sentry.e1
    public final void c() {
        this.d = true;
        this.c = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.a = SystemClock.elapsedRealtimeNanos();
        this.b = Process.getElapsedCpuTime() * 1000000;
    }
}
