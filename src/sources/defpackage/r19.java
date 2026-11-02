package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class r19 extends q19 {
    public static final w19 w = w19.g(null, WindowInsets.CONSUMED);

    public r19(w19 w19Var, WindowInsets windowInsets) {
        super(w19Var, windowInsets);
    }

    @Override // defpackage.p19, defpackage.l19, defpackage.t19
    public fe3 h(int i) {
        return fe3.d(this.c.getInsets(v19.a(i)));
    }

    @Override // defpackage.p19, defpackage.l19, defpackage.t19
    public fe3 i(int i) {
        return fe3.d(this.c.getInsetsIgnoringVisibility(v19.a(i)));
    }

    @Override // defpackage.p19, defpackage.l19, defpackage.t19
    public boolean t(int i) {
        return this.c.isVisible(v19.a(i));
    }

    @Override // defpackage.l19, defpackage.t19
    public void o(View view) {
    }
}
