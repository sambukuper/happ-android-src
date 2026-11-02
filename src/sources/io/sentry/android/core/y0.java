package io.sentry.android.core;

import defpackage.fl6;
import defpackage.j78;
import io.sentry.s5;
import io.sentry.v4;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements d0 {
    public final long Y;
    public Future Z;
    public final boolean g0;
    public final boolean h0;
    public final AtomicLong X = new AtomicLong(0);
    public final io.sentry.util.a f0 = new io.sentry.util.a();

    public y0(long j, boolean z, boolean z2) {
        this.Y = j;
        this.g0 = z;
        this.h0 = z2;
    }

    public final void a(String str) {
        if (this.h0) {
            io.sentry.g gVar = new io.sentry.g();
            gVar.g0 = "navigation";
            gVar.d(str, "state");
            gVar.i0 = "app.lifecycle";
            gVar.k0 = s5.INFO;
            v4.b().a(gVar, new io.sentry.n0());
        }
    }

    public final void b() {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            Future future = this.Z;
            if (future != null) {
                future.cancel(false);
                this.Z = null;
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.d0
    public final void g() {
        b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        v4.b().o(new j78(this, (byte) 14));
        AtomicLong atomicLong = this.X;
        long j = atomicLong.get();
        boolean z = j == 0 || j + this.Y <= jCurrentTimeMillis;
        if (z && this.g0) {
            v4.b().l();
        }
        v4.b().i().getReplayController().m(z);
        atomicLong.set(jCurrentTimeMillis);
        a("foreground");
    }

    @Override // io.sentry.android.core.d0
    public final void k() {
        this.X.set(System.currentTimeMillis());
        v4.b().i().getReplayController().D();
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            b();
            fl6 fl6Var = new fl6(this, (byte) 24);
            try {
                this.Z = v4.b().i().getTimerExecutorService().b(fl6Var, this.Y);
            } catch (Throwable th) {
                v4.b().i().getLogger().e(s5.WARNING, "Failed to schedule end of session. Ending it now.", th);
                fl6Var.run();
            }
            aVar.close();
            a("background");
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
