package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class la2 implements u27 {
    public final u27 a;
    public final boolean b;
    public final gn2 c;

    public la2(u27 u27Var, boolean z, gn2 gn2Var) {
        gn2Var.getClass();
        this.a = u27Var;
        this.b = z;
        this.c = gn2Var;
    }

    @Override // defpackage.u27
    public final Iterator iterator() {
        return new ka2(this);
    }
}
