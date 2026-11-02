package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wf7 implements ta2 {
    public final float a;
    public final float b;
    public final Object c;

    public wf7(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.pk
    public final ju8 a(ug8 ug8Var) {
        Object obj = this.c;
        return new lr5(this.a, this.b, obj == null ? null : (wk) ug8Var.a.B(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wf7) {
            wf7 wf7Var = (wf7) obj;
            if (wf7Var.a == this.a && wf7Var.b == this.b && dh3.f(wf7Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + pc6.d((obj != null ? obj.hashCode() : 0) * 31, this.a, 31);
    }

    public /* synthetic */ wf7(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
