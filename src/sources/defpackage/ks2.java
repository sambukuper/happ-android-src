package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import io.sentry.g1;
import io.sentry.l4;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks2 implements r51, l4 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;

    public /* synthetic */ ks2(y5 y5Var, String str) {
        this.X = (byte) 1;
        this.Y = str;
    }

    @Override // defpackage.r51
    public Object g(fb9 fb9Var) throws ExecutionException {
        byte b = this.X;
        String str = this.Y;
        switch (b) {
            case 0:
                if (!fb9Var.i()) {
                    throw new ExecutionException(fb9Var.f());
                }
                String str2 = (String) fb9Var.g();
                if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                return str;
            default:
                return !fb9Var.i() ? g28.k(y5.O(fb9Var)) : g28.l(new Pair((String) fb9Var.g(), str));
        }
    }

    @Override // io.sentry.l4
    public void h(g1 g1Var) {
        g1Var.u(this.Y);
    }

    public /* synthetic */ ks2(String str, byte b) {
        this.X = b;
        this.Y = str;
    }
}
