package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nj5 implements vc6 {
    public final Set X;
    public final c15 Y = new c15(0, new pp2[16]);

    public nj5(Set set) {
        this.X = set;
    }

    @Override // defpackage.vc6
    public final void c() {
        c15 c15Var = this.Y;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            vc6 vc6Var = ((pp2) objArr[i2]).a;
            this.X.remove(vc6Var);
            vc6Var.c();
        }
    }

    @Override // defpackage.vc6
    public final void a() {
    }

    @Override // defpackage.vc6
    public final void b() {
    }
}
