package io.sentry.android.replay;

import defpackage.dh3;
import defpackage.oi0;
import defpackage.p61;
import io.sentry.t6;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final d0 a;
    public final l b;
    public final Date c;
    public final int d;
    public final long e;
    public final t6 f;
    public final String g;
    public final List h;

    public f(d0 d0Var, l lVar, Date date, int i, long j, t6 t6Var, String str, List list) {
        this.a = d0Var;
        this.b = lVar;
        this.c = date;
        this.d = i;
        this.e = j;
        this.f = t6Var;
        this.g = str;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.a.equals(fVar.a) && this.b == fVar.b && this.c.equals(fVar.c) && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && dh3.f(this.g, fVar.g) && this.h.equals(fVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p61.g(oi0.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), this.e, 31)) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.a + ", cache=" + this.b + ", timestamp=" + this.c + ", id=" + this.d + ", duration=" + this.e + ", replayType=" + this.f + ", screenAtStart=" + this.g + ", events=" + this.h + ')';
    }
}
