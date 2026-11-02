package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface kx4 {
    Object d(rn2 rn2Var, Object obj);

    boolean g(gn2 gn2Var);

    default kx4 y(kx4 kx4Var) {
        return kx4Var == hx4.X ? this : new fx0(this, kx4Var);
    }
}
