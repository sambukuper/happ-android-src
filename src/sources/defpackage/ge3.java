package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ge3 extends jv0 {
    public final View Z;
    public int f0;
    public int g0;
    public final int[] h0;

    public ge3(View view) {
        super(0);
        this.h0 = new int[2];
        this.Z = view;
    }

    @Override // defpackage.jv0
    public final void d(c19 c19Var) {
        this.Z.setTranslationY(0.0f);
    }

    @Override // defpackage.jv0
    public final void e(c19 c19Var) {
        View view = this.Z;
        int[] iArr = this.h0;
        view.getLocationOnScreen(iArr);
        this.f0 = iArr[1];
    }

    @Override // defpackage.jv0
    public final w19 f(w19 w19Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c19 c19Var = (c19) it.next();
            if ((c19Var.a.d() & 8) != 0) {
                this.Z.setTranslationY(rk.c(this.g0, c19Var.a.c(), 0));
                break;
            }
        }
        return w19Var;
    }

    @Override // defpackage.jv0
    public final xd6 g(c19 c19Var, xd6 xd6Var) {
        View view = this.Z;
        int[] iArr = this.h0;
        view.getLocationOnScreen(iArr);
        int i = this.f0 - iArr[1];
        this.g0 = i;
        view.setTranslationY(i);
        return xd6Var;
    }
}
