package io.sentry.android.replay.capture;

import io.sentry.f4;
import io.sentry.i1;
import io.sentry.n0;
import io.sentry.u6;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    public final u6 a;
    public final f4 b;

    public i(u6 u6Var, f4 f4Var) {
        this.a = u6Var;
        this.b = f4Var;
    }

    public static void a(i iVar, i1 i1Var) {
        n0 n0Var = new n0();
        if (i1Var != null) {
            u6 u6Var = iVar.a;
            n0Var.h = iVar.b;
            i1Var.r(u6Var, n0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.a + ", recording=" + this.b + ')';
    }
}
