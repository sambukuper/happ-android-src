package defpackage;

import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ul4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ea6 Y;

    public /* synthetic */ ul4(ea6 ea6Var, byte b) {
        this.X = b;
        this.Y = ea6Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ea6 ea6Var = this.Y;
        switch (b) {
            case 0:
                ea6Var.X = null;
                return dn8.a;
            default:
                return RealWebSocket.failWebSocket$lambda$0$0(ea6Var);
        }
    }
}
