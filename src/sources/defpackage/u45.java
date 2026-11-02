package defpackage;

import java.nio.file.Path;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u45 extends kb8 {
    public u45() {
        super(u52.c(), (byte) 2);
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        ro3Var.c1(xw3.e(obj).toUri().toString());
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        Path pathE = xw3.e(obj);
        Class clsC = u52.c();
        z76 z76VarD = ri8Var.d(pathE, gr3.VALUE_STRING);
        z76VarD.f0 = clsC;
        z76 z76VarE = ri8Var.e(ro3Var, z76VarD);
        ro3Var.c1(pathE.toUri().toString());
        ri8Var.f(ro3Var, z76VarE);
    }
}
