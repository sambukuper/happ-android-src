package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h29 {
    public final a80 a;
    public final float b;

    public h29(Rect rect, float f) {
        this.a = new a80(rect);
        this.b = f;
    }

    public final Rect a() {
        a80 a80Var = this.a;
        a80Var.getClass();
        return new Rect(a80Var.a, a80Var.b, a80Var.c, a80Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h29.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        h29 h29Var = (h29) obj;
        return dh3.f(this.a, h29Var.a) && this.b == h29Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public h29(a80 a80Var, float f) {
        this.a = a80Var;
        this.b = f;
    }
}
