package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pw0 implements f78 {
    public final long a;

    public pw0(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        xc3.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.f78
    public final float a() {
        return dw0.c(this.a);
    }

    @Override // defpackage.f78
    public final long b() {
        return this.a;
    }

    @Override // defpackage.f78
    public final d90 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw0)) {
            return false;
        }
        long j = ((pw0) obj).a;
        int i = dw0.h;
        return tk8.a(this.a, j);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pc6.p("ColorStyle(value=", dw0.h(this.a), ")");
    }
}
