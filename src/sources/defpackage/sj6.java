package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sj6 implements Serializable {
    public final Object X;

    public /* synthetic */ sj6(Object obj) {
        this.X = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof rj6) {
            return ((rj6) obj).X;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sj6) {
            return dh3.f(this.X, ((sj6) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.X;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.X;
        if (obj instanceof rj6) {
            return ((rj6) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
