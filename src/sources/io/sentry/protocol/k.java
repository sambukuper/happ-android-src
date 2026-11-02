package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements n2 {
    public String X;
    public String Y;
    public String Z;
    public w f0;
    public w g0;
    public String h0;
    public AbstractMap i0;

    public k(String str) {
        if (str.length() > 4096) {
            this.X = str.substring(0, 4096);
        } else {
            this.X = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return io.sentry.util.b.i(this.X, kVar.X) && io.sentry.util.b.i(this.Y, kVar.Y) && io.sentry.util.b.i(this.Z, kVar.Z) && io.sentry.util.b.i(this.f0, kVar.f0) && io.sentry.util.b.i(this.g0, kVar.g0) && io.sentry.util.b.i(this.h0, kVar.h0) && io.sentry.util.b.i(this.i0, kVar.i0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("message");
        cVar.y(this.X);
        if (this.Y != null) {
            cVar.p("contact_email");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.p("name");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("associated_event_id");
            this.f0.serialize(cVar, iLogger);
        }
        if (this.g0 != null) {
            cVar.p("replay_id");
            this.g0.serialize(cVar, iLogger);
        }
        if (this.h0 != null) {
            cVar.p("url");
            cVar.y(this.h0);
        }
        AbstractMap abstractMap = this.i0;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.i0.get(str);
                cVar.p(str);
                cVar.v(iLogger, obj);
            }
        }
        cVar.m();
    }

    public final String toString() {
        return "Feedback{message='" + this.X + "', contactEmail='" + this.Y + "', name='" + this.Z + "', associatedEventId=" + this.f0 + ", replayId=" + this.g0 + ", url='" + this.h0 + "', unknown=" + this.i0 + '}';
    }
}
