package defpackage;

import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class ss3 implements dn2 {
    public final /* synthetic */ byte X;
    public final us3 Y;

    public /* synthetic */ ss3(us3 us3Var, byte b) {
        this.X = b;
        this.Y = us3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        us3 us3Var = this.Y;
        switch (b) {
            case 0:
                List listK = i21.K(pm.a(us3Var.X.h0, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", _UrlKt.FRAGMENT_ENCODE_SET, "WARNING"));
                return listK.isEmpty() ? oy1.f0 : new vm(listK, (byte) 0);
            default:
                return us3Var.X.h0.e();
        }
    }
}
