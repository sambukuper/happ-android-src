package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f90 implements f78 {
    public final q67 a;
    public final float b;

    public f90(q67 q67Var, float f) {
        this.a = q67Var;
        this.b = f;
    }

    @Override // defpackage.f78
    public final float a() {
        return this.b;
    }

    @Override // defpackage.f78
    public final long b() {
        int i = dw0.h;
        return dw0.g;
    }

    @Override // defpackage.f78
    public final d90 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f90)) {
            return false;
        }
        f90 f90Var = (f90) obj;
        return this.a.equals(f90Var.a) && Float.compare(this.b, f90Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
