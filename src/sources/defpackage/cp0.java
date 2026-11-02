package defpackage;

import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends fe8 {
    public boolean a = false;
    public final ViewGroup b;

    public cp0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.fe8, defpackage.zd8
    public final void a() {
        rq7.l(this.b, false);
    }

    @Override // defpackage.fe8, defpackage.zd8
    public final void d(Transition transition) {
        if (!this.a) {
            rq7.l(this.b, false);
        }
        transition.y(this);
    }

    @Override // defpackage.fe8, defpackage.zd8
    public final void e(Transition transition) {
        rq7.l(this.b, false);
        this.a = true;
    }

    @Override // defpackage.fe8, defpackage.zd8
    public final void f() {
        rq7.l(this.b, true);
    }
}
