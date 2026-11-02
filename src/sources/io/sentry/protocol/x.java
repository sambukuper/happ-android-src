package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements n2 {
    public final String X;
    public final String Y;
    public HashMap Z;

    public x(String str, String str2) {
        this.X = str;
        this.Y = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.X.equals(xVar.X) && this.Y.equals(xVar.Y);
    }

    public final int hashCode() {
        return Objects.hash(this.X, this.Y);
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("name");
        cVar.y(this.X);
        cVar.p("version");
        cVar.y(this.Y);
        HashMap map = this.Z;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.Z, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
