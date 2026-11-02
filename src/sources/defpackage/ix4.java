package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface ix4 extends kx4 {
    @Override // defpackage.kx4
    default Object d(rn2 rn2Var, Object obj) {
        return rn2Var.K(obj, this);
    }

    @Override // defpackage.kx4
    default boolean g(gn2 gn2Var) {
        return ((Boolean) gn2Var.B(this)).booleanValue();
    }
}
