package defpackage;

import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l76 extends nv {
    public final /* synthetic */ m76 a;

    public l76(m76 m76Var) {
        this.a = m76Var;
    }

    @Override // defpackage.nv
    public final void timedOut() {
        Socket socket;
        m76 m76Var = this.a;
        if (m76Var.o0) {
            return;
        }
        m76Var.o0 = true;
        wg wgVar = m76Var.p0;
        if (wgVar != null) {
            ((o42) wgVar.d).cancel();
        }
        p76 p76Var = m76Var.q0;
        if (p76Var == null || (socket = p76Var.c) == null) {
            return;
        }
        ks8.d(socket);
    }
}
