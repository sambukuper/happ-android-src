package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class km0 extends a38 {
    public final Typeface a;
    public final wl6 b;
    public boolean c;

    public km0(wl6 wl6Var, Typeface typeface) {
        this.a = typeface;
        this.b = wl6Var;
    }

    @Override // defpackage.a38
    public final void d(int i) {
        if (this.c) {
            return;
        }
        rv0 rv0Var = (rv0) this.b.Y;
        if (rv0Var.l(this.a)) {
            rv0Var.j(false);
        }
    }

    @Override // defpackage.a38
    public final void e(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        rv0 rv0Var = (rv0) this.b.Y;
        if (rv0Var.l(typeface)) {
            rv0Var.j(false);
        }
    }
}
