package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d7 implements n2 {
    public final Date X;
    public Date Y;
    public final AtomicInteger Z;
    public final String f0;
    public final String g0;
    public Boolean h0;
    public c7 i0;
    public Long j0;
    public Double k0;
    public final String l0;
    public String m0;
    public final String n0;
    public final String o0;
    public String p0;
    public boolean q0;
    public final io.sentry.util.a r0 = new io.sentry.util.a();
    public ConcurrentHashMap s0;

    public d7(c7 c7Var, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
        this.i0 = c7Var;
        this.X = date;
        this.Y = date2;
        this.Z = new AtomicInteger(i);
        this.f0 = str;
        this.g0 = str2;
        this.h0 = bool;
        this.j0 = l;
        this.k0 = d;
        this.l0 = str3;
        this.m0 = str4;
        this.n0 = str5;
        this.o0 = str6;
        this.p0 = str7;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d7 clone() {
        d7 d7Var = new d7(this.i0, this.X, this.Y, this.Z.get(), this.f0, this.g0, this.h0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0);
        d7Var.q0 = this.q0;
        return d7Var;
    }

    public final void b(Date date) {
        io.sentry.util.a aVar = this.r0;
        aVar.g();
        try {
            this.h0 = null;
            if (this.i0 == c7.Ok) {
                this.i0 = this.q0 ? c7.Unhandled : c7.Exited;
            }
            if (date != null) {
                this.Y = date;
            } else {
                date = new Date();
                this.Y = date;
            }
            this.k0 = Double.valueOf(Math.abs(date.getTime() - this.X.getTime()) / 1000.0d);
            long time = this.Y.getTime();
            if (time < 0) {
                time = Math.abs(time);
            }
            this.j0 = Long.valueOf(time);
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

    public final boolean c(c7 c7Var, String str, boolean z, String str2) {
        io.sentry.util.a aVar = this.r0;
        aVar.g();
        boolean z2 = true;
        boolean z3 = false;
        if (c7Var != null) {
            try {
                this.i0 = c7Var;
                if (c7Var != c7.Ok) {
                    this.q0 = false;
                }
                z3 = true;
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (str != null) {
            this.m0 = str;
            z3 = true;
        }
        if (z) {
            this.Z.addAndGet(1);
            z3 = true;
        }
        if (str2 != null) {
            this.p0 = str2;
        } else {
            z2 = z3;
        }
        if (z2) {
            this.h0 = null;
            Date date = new Date();
            this.Y = date;
            long time = date.getTime();
            if (time < 0) {
                time = Math.abs(time);
            }
            this.j0 = Long.valueOf(time);
        }
        aVar.close();
        return z2;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        String str = this.g0;
        if (str != null) {
            cVar.p("sid");
            cVar.y(str);
        }
        String str2 = this.f0;
        if (str2 != null) {
            cVar.p("did");
            cVar.y(str2);
        }
        if (this.h0 != null) {
            cVar.p("init");
            cVar.w(this.h0);
        }
        cVar.p("started");
        cVar.v(iLogger, this.X);
        cVar.p("status");
        cVar.v(iLogger, this.i0.name().toLowerCase(Locale.ROOT));
        if (this.j0 != null) {
            cVar.p("seq");
            cVar.x(this.j0);
        }
        cVar.p("errors");
        cVar.u(this.Z.intValue());
        if (this.k0 != null) {
            cVar.p("duration");
            cVar.x(this.k0);
        }
        if (this.Y != null) {
            cVar.p("timestamp");
            cVar.v(iLogger, this.Y);
        }
        if (this.p0 != null) {
            cVar.p("abnormal_mechanism");
            cVar.v(iLogger, this.p0);
        }
        if (this.q0) {
            cVar.p("non_terminating_unhandled_error");
            cVar.z(this.q0);
        }
        cVar.p("attrs");
        cVar.k();
        cVar.p(BuildConfig.BUILD_TYPE);
        cVar.v(iLogger, this.o0);
        String str3 = this.n0;
        if (str3 != null) {
            cVar.p("environment");
            cVar.v(iLogger, str3);
        }
        String str4 = this.l0;
        if (str4 != null) {
            cVar.p("ip_address");
            cVar.v(iLogger, str4);
        }
        if (this.m0 != null) {
            cVar.p("user_agent");
            cVar.v(iLogger, this.m0);
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap = this.s0;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                e.b(this.s0, str5, cVar, str5, iLogger);
            }
        }
        cVar.m();
    }
}
