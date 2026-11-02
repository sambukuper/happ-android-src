package io.sentry;

import defpackage.oi0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q7 implements n2 {
    public final io.sentry.protocol.w X;
    public final String Y;
    public final String Z;
    public final String f0;
    public HashMap g0;

    public q7(io.sentry.protocol.w wVar, String str, String str2, String str3) {
        this.X = wVar;
        this.Y = str;
        this.Z = str2;
        this.f0 = str3;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("event_id");
        this.X.serialize(cVar, iLogger);
        String str = this.Y;
        if (str != null) {
            cVar.p("name");
            cVar.y(str);
        }
        String str2 = this.Z;
        if (str2 != null) {
            cVar.p("email");
            cVar.y(str2);
        }
        String str3 = this.f0;
        if (str3 != null) {
            cVar.p("comments");
            cVar.y(str3);
        }
        HashMap map = this.g0;
        if (map != null) {
            for (String str4 : map.keySet()) {
                e.a(this.g0, str4, cVar, str4, iLogger);
            }
        }
        cVar.m();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.X);
        sb.append(", name='");
        sb.append(this.Y);
        sb.append("', email='");
        sb.append(this.Z);
        sb.append("', comments='");
        return oi0.p(sb, this.f0, "'}");
    }
}
