package defpackage;

import android.graphics.RenderEffect;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o60 {
    public RenderEffect a;
    public final float b;
    public final float c;

    public o60(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectC = tc.c(this.b, this.c);
        this.a = renderEffectC;
        return renderEffectC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o60)) {
            return false;
        }
        o60 o60Var = (o60) obj;
        return this.b == o60Var.b && this.c == o60Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + pc6.d(Float.hashCode(this.b) * 31, this.c, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=Clamp)";
    }
}
