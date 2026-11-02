package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sd2 implements u27 {
    public final u27 a;
    public final gn2 b;
    public final gn2 c;

    public sd2(u27 u27Var, gn2 gn2Var, gn2 gn2Var2) {
        u27Var.getClass();
        gn2Var.getClass();
        this.a = u27Var;
        this.b = gn2Var;
        this.c = gn2Var2;
    }

    @Override // defpackage.u27
    public final Iterator iterator() {
        return new rd2(this);
    }
}
