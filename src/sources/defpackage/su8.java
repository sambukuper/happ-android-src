package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class su8 extends jx4 implements rv1 {
    public sd8 q0;
    public g22 r0;
    public h62 s0;
    public x77 t0;

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        p34Var.a();
        sd8 sd8Var = this.q0;
        ru8 ru8Var = new ru8(this, (byte) 0);
        x77 x77Var = this.t0;
        rd8 rd8VarA = sd8Var.a(ru8Var, x77Var.a() ? new dw0(x77Var.e) : null, null, new ru8(this, (byte) 1));
        x77 x77Var2 = this.t0;
        long j = ((dw0) rd8VarA.getValue()).a;
        d6 d6Var = x77Var2.c;
        if (x77Var2.b() && ((Boolean) ((rh5) d6Var.k0).getValue()).booleanValue()) {
            j = ((dw0) ((rh5) d6Var.f0).getValue()).a;
        }
        long j2 = j;
        if (x77Var2.b()) {
            x77Var2.e = j2;
        }
        if (dw0.c(j2) == 0.0f) {
            return;
        }
        be8 be8Var = this.r0.a;
        be8 be8Var2 = this.s0.a;
        sv1.k0(p34Var, j2, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
    }
}
