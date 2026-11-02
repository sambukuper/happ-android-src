package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k7 implements m61 {
    public final m61 a;
    public final float b;

    public k7(float f, m61 m61Var) {
        while (m61Var instanceof k7) {
            m61Var = ((k7) m61Var).a;
            f += ((k7) m61Var).b;
        }
        this.a = m61Var;
        this.b = f;
    }

    @Override // defpackage.m61
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.a.equals(k7Var.a) && this.b == k7Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
