package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b implements n2 {
    public String Z;
    public int f0;
    public int g0;
    public HashMap h0;

    public j() {
        super(c.Meta);
        this.Z = _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f0 == jVar.f0 && this.g0 == jVar.g0 && io.sentry.util.b.i(this.Z, jVar.Z);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.Z, Integer.valueOf(this.f0), Integer.valueOf(this.g0)});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("type");
        cVar.v(iLogger, this.X);
        cVar.p("timestamp");
        cVar.u(this.Y);
        cVar.p("data");
        cVar.k();
        cVar.p("href");
        cVar.y(this.Z);
        cVar.p("height");
        cVar.u(this.f0);
        cVar.p("width");
        cVar.u(this.g0);
        HashMap map = this.h0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.h0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
        cVar.m();
    }
}
