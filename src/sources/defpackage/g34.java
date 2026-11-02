package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface g34 extends nh1 {
    default int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        return K(new lh3(ug3Var, ug3Var.getLayoutDirection()), new xe1(tr4Var, l55.Y, m55.Y, (byte) 2), s31.b(0, i, 0, 0, 13)).a();
    }

    yr4 K(zr4 zr4Var, tr4 tr4Var, long j);

    default int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        return K(new lh3(ug3Var, ug3Var.getLayoutDirection()), new xe1(tr4Var, l55.Y, m55.X, (byte) 2), s31.b(0, 0, 0, i, 7)).b();
    }

    default int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        return K(new lh3(ug3Var, ug3Var.getLayoutDirection()), new xe1(tr4Var, l55.X, m55.X, (byte) 2), s31.b(0, 0, 0, i, 7)).b();
    }

    default int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        return K(new lh3(ug3Var, ug3Var.getLayoutDirection()), new xe1(tr4Var, l55.X, m55.Y, (byte) 2), s31.b(0, i, 0, 0, 13)).a();
    }
}
