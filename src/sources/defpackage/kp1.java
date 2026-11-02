package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 extends wj2 {
    @Override // defpackage.wj2, defpackage.s92
    public final sa7 sink(oi5 oi5Var, boolean z) throws IOException {
        oi5 oi5VarC = oi5Var.c();
        if (oi5VarC != null) {
            createDirectories(oi5VarC);
        }
        return super.sink(oi5Var, z);
    }
}
