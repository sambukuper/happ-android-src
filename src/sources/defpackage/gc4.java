package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gc4 implements Runnable {
    public final /* synthetic */ byte X = 1;
    public Object Y;
    public Object Z;
    public Object f0;

    public /* synthetic */ gc4(Context context, av0 av0Var, CountDownLatch countDownLatch) {
        this.Y = context;
        this.Z = av0Var;
        this.f0 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        fb9 fb9VarO;
        Object objCall = null;
        boolean z = false;
        switch (this.X) {
            case 0:
                xb4 xb4VarA = ((ec4) this.Y).a();
                xb4VarA.a(new zo2((byte) 10, this, xb4VarA, z), (h37) ((hc4) this.f0).j.Y);
                return;
            case 1:
                try {
                    objCall = ((qi2) this.Y).call();
                    break;
                } catch (Exception unused) {
                }
                ((Handler) this.f0).post(new zo2((ay1) this.Z, objCall, (byte) 11));
                return;
            default:
                av0 av0Var = (av0) this.Z;
                Intent intent = av0Var.X;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    fb9VarO = g28.l(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = av0Var.X;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = av0Var.X;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.Y;
                    bundle.putBoolean("supports_message_handled", true);
                    eb9 eb9VarN = eb9.n(context);
                    synchronized (eb9VarN) {
                        i = eb9VarN.Y;
                        eb9VarN.Y = i + 1;
                    }
                    fb9VarO = eb9VarN.o(new bb9(i, 2, bundle, (byte) 0));
                }
                fb9VarO.b(dp1.g0, new rb8(this.f0, (byte) 12));
                return;
        }
    }

    public /* synthetic */ gc4() {
    }

    public gc4(hc4 hc4Var, ec4 ec4Var, r43 r43Var) {
        this.f0 = hc4Var;
        this.Y = ec4Var;
        this.Z = r43Var;
    }
}
