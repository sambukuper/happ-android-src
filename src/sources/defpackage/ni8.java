package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ni8 implements bh8 {
    public rt8 a() {
        return rt8.OUT_VARIANCE;
    }

    public abstract t14 b();

    public boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni8)) {
            return false;
        }
        ni8 ni8Var = (ni8) obj;
        return c() == ni8Var.c() && a() == ni8Var.a() && b().equals(ni8Var.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (cj8.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == rt8.INVARIANT) {
            return b().toString();
        }
        return a() + " " + b();
    }

    public ni8 d(z14 z14Var) {
        return this;
    }
}
