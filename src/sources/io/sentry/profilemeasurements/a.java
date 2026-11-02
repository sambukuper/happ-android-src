package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.e;
import io.sentry.internal.debugmeta.c;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n2 {
    public ConcurrentHashMap X;
    public String Y;
    public Collection Z;

    public a(String str, AbstractCollection abstractCollection) {
        this.Y = str;
        this.Z = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.util.b.i(this.X, aVar.X) && this.Y.equals(aVar.Y) && new ArrayList(this.Z).equals(new ArrayList(aVar.Z));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        c cVar = (c) r3Var;
        cVar.k();
        cVar.p("unit");
        cVar.v(iLogger, this.Y);
        cVar.p("values");
        cVar.v(iLogger, this.Z);
        ConcurrentHashMap concurrentHashMap = this.X;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.X, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
