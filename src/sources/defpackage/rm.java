package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rm implements sm {
    @Override // defpackage.sm
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return c02.X;
    }

    @Override // defpackage.sm
    public final /* bridge */ boolean k(fk2 fk2Var) {
        return z39.y(this, fk2Var);
    }

    @Override // defpackage.sm
    public final gm p(fk2 fk2Var) {
        fk2Var.getClass();
        return null;
    }

    public final String toString() {
        return "EMPTY";
    }
}
