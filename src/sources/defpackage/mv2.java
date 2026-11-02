package defpackage;

import android.os.Handler;
import okhttp3.Handshake;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ dn2 Y;

    public /* synthetic */ mv2(dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = dn2Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn2 dn2Var = this.Y;
        switch (b) {
            case 0:
                return Handshake.peerCertificates_delegate$lambda$0(dn2Var);
            case 1:
                dn2Var.invoke();
                return Boolean.TRUE;
            case 2:
                dn2Var.invoke();
                return Boolean.TRUE;
            case 3:
                dn2Var.invoke();
                return dn8.a;
            case 4:
                float fFloatValue = ((Number) dn2Var.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
            default:
                return (Handler) dn2Var.invoke();
        }
    }
}
