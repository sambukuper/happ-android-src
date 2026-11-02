package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rj6 implements Serializable {
    public final Throwable X;

    public rj6(Throwable th) {
        th.getClass();
        this.X = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rj6) {
            return dh3.f(this.X, ((rj6) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.X + ')';
    }
}
