package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface wo2 extends xe2 {
    static /* synthetic */ xe2 c(wo2 wo2Var, s61 s61Var, int i, l90 l90Var, int i2) {
        if ((i2 & 1) != 0) {
            s61Var = b02.X;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            l90Var = l90.X;
        }
        return wo2Var.b(s61Var, i, l90Var);
    }

    xe2 b(s61 s61Var, int i, l90 l90Var);
}
