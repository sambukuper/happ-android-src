package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf1 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ lh7 Y;

    public /* synthetic */ sf1(lh7 lh7Var, byte b) {
        this.X = b;
        this.Y = lh7Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        lh7 lh7Var = this.Y;
        switch (b) {
            case 0:
                sv1 sv1Var = (sv1) obj;
                long j = ((dw0) lh7Var.getValue()).a;
                if (!tk8.a(j, dw0.g)) {
                    sv1.k0(sv1Var, j, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
                }
                break;
            case 1:
                pk6 pk6Var = (pk6) obj;
                pk6Var.getClass();
                pk6Var.g(((Number) lh7Var.getValue()).floatValue());
                pk6Var.h(((Number) lh7Var.getValue()).floatValue());
                break;
            default:
                ((pk6) obj).b(((Number) lh7Var.getValue()).floatValue());
                break;
        }
        return dn8Var;
    }
}
