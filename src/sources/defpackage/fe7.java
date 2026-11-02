package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fe7 extends d90 {
    public final long a;

    public fe7(long j) {
        this.a = j;
    }

    @Override // defpackage.d90
    public final void a(float f, long j, df dfVar) {
        dfVar.d(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = dw0.b(dw0.c(jB) * f, jB);
        }
        dfVar.f(jB);
        if (dfVar.c != null) {
            dfVar.i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe7)) {
            return false;
        }
        long j = ((fe7) obj).a;
        int i = dw0.h;
        return tk8.a(this.a, j);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pc6.p("SolidColor(value=", dw0.h(this.a), ")");
    }
}
