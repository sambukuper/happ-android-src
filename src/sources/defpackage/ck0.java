package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ck0 {
    public final d6 a;
    public final ScheduledExecutorService b;

    public ck0(d6 d6Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = d6Var;
        this.b = scheduledExecutorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ck0) {
            ck0 ck0Var = (ck0) obj;
            if (this.a == ck0Var.a && this.b.equals(ck0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.a + ", executor=" + this.b + ')';
    }
}
