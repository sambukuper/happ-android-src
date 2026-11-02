package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.e;
import io.sentry.internal.debugmeta.c;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n2 {
    public ConcurrentHashMap X;
    public double Y;
    public String Z;
    public double f0;

    public b(Long l, Number number, long j) {
        this.Z = l.toString();
        this.f0 = number.doubleValue();
        this.Y = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.util.b.i(this.X, bVar.X) && this.Z.equals(bVar.Z) && this.f0 == bVar.f0 && this.Y == bVar.Y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Z, Double.valueOf(this.f0)});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        c cVar = (c) r3Var;
        cVar.k();
        cVar.p("value");
        cVar.v(iLogger, Double.valueOf(this.f0));
        cVar.p("elapsed_since_start_ns");
        cVar.v(iLogger, this.Z);
        cVar.p("timestamp");
        cVar.v(iLogger, io.sentry.config.a.c(this.Y));
        ConcurrentHashMap concurrentHashMap = this.X;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.X, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
