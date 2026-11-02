package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 implements n2 {
    public Integer X;
    public List Y;
    public HashMap Z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f4.class == obj.getClass()) {
            f4 f4Var = (f4) obj;
            if (io.sentry.util.b.i(this.X, f4Var.X) && io.sentry.util.b.i(this.Y, f4Var.Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.Y;
        if (this.X != null) {
            cVar.p("segment_id");
            cVar.x(this.X);
        }
        HashMap map = this.Z;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.Z, str, cVar, str, iLogger);
            }
        }
        cVar.m();
        cVar2.h0 = true;
        if (this.X != null) {
            cVar2.D();
            cVar2.g();
            cVar2.X.append((CharSequence) "\n");
        }
        List list = this.Y;
        if (list != null) {
            cVar.v(iLogger, list);
        }
        cVar2.h0 = false;
    }
}
