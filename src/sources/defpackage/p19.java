package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class p19 extends o19 {
    public static final w19 v = w19.g(null, WindowInsets.CONSUMED);

    public p19(w19 w19Var, WindowInsets windowInsets) {
        super(w19Var, windowInsets);
    }

    @Override // defpackage.l19, defpackage.t19
    public fe3 h(int i) {
        return fe3.d(this.c.getInsets(u19.a(i)));
    }

    @Override // defpackage.l19, defpackage.t19
    public fe3 i(int i) {
        return fe3.d(this.c.getInsetsIgnoringVisibility(u19.a(i)));
    }

    @Override // defpackage.l19, defpackage.t19
    public boolean t(int i) {
        return this.c.isVisible(u19.a(i));
    }

    @Override // defpackage.l19, defpackage.t19
    public final void d(View view) {
    }
}
