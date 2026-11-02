package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bh2 {
    public final gh2 a;
    public final AndroidComposeView b;
    public final t05 c;
    public final t05 d;
    public boolean e;

    public bh2(gh2 gh2Var, AndroidComposeView androidComposeView) {
        this.a = gh2Var;
        this.b = androidComposeView;
        t05 t05Var = vw6.a;
        this.c = new t05();
        this.d = new t05();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        ub ubVar = new ub(0, this, bh2.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 11);
        j05 j05Var = this.b.r1;
        if (!j05Var.e(ubVar)) {
            j05Var.a(ubVar);
        }
        this.e = true;
    }
}
