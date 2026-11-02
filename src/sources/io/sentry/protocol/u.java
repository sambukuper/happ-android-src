package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.q5;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements n2 {
    public String X;
    public String Y;
    public CopyOnWriteArraySet Z;
    public CopyOnWriteArraySet f0;
    public HashMap g0;

    public u(String str, String str2) {
        this.X = str;
        this.Y = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.X.equals(uVar.X) && this.Y.equals(uVar.Y)) {
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
        cVar.p("name");
        cVar.y(this.X);
        cVar.p("version");
        cVar.y(this.Y);
        CopyOnWriteArraySet copyOnWriteArraySet = this.Z;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = q5.d().b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f0;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = q5.d().a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            cVar.p("packages");
            cVar.v(iLogger, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            cVar.p("integrations");
            cVar.v(iLogger, copyOnWriteArraySet2);
        }
        HashMap map = this.g0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.g0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
