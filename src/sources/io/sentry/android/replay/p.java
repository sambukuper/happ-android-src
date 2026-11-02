package io.sentry.android.replay;

import defpackage.dh3;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final long a;
    public final y b;
    public final io.sentry.protocol.w c;
    public final io.sentry.android.replay.capture.c d;

    public p(long j, y yVar, io.sentry.protocol.w wVar, io.sentry.android.replay.capture.c cVar) {
        yVar.getClass();
        wVar.getClass();
        this.a = j;
        this.b = yVar;
        this.c = wVar;
        this.d = cVar;
    }

    public static p a(p pVar, y yVar, io.sentry.protocol.w wVar, io.sentry.android.replay.capture.c cVar, int i) {
        long j = pVar.a;
        if ((i & 2) != 0) {
            yVar = pVar.b;
        }
        y yVar2 = yVar;
        if ((i & 4) != 0) {
            wVar = pVar.c;
        }
        io.sentry.protocol.w wVar2 = wVar;
        if ((i & 8) != 0) {
            cVar = pVar.d;
        }
        yVar2.getClass();
        wVar2.getClass();
        return new p(j, yVar2, wVar2, cVar);
    }

    public final boolean b() {
        y yVar = y.STARTED;
        y yVar2 = this.b;
        return yVar2.compareTo(yVar) >= 0 && yVar2.compareTo(y.STOPPED) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b && dh3.f(this.c, pVar.c) && dh3.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31;
        io.sentry.android.replay.capture.c cVar = this.d;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "ReplayState(generation=" + this.a + ", lifecycleState=" + this.b + ", replayId=" + this.c + ", captureStrategy=" + this.d + ')';
    }
}
