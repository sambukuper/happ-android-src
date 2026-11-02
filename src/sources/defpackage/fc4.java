package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fc4 implements Runnable {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ fc4(jl1 jl1Var, qz qzVar, int i, Runnable runnable) {
        this.Z = jl1Var;
        this.f0 = qzVar;
        this.Y = i;
        this.g0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Object obj = this.g0;
        final int i = this.Y;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        switch (b) {
            case 0:
                ((ec4) obj2).d(i);
                ((hc4) obj3).i.getClass();
                vb4.b((r43) obj, hc4.p);
                return;
            default:
                final jl1 jl1Var = (jl1) obj3;
                final qz qzVar = (qz) obj2;
                Runnable runnable = (Runnable) obj;
                wr6 wr6Var = (wr6) jl1Var.h0;
                byte b2 = 1;
                try {
                    try {
                        wr6 wr6Var2 = (wr6) jl1Var.Z;
                        Objects.requireNonNull(wr6Var2);
                        wr6Var.C(new aq8(wr6Var2, b2));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) jl1Var.X).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            wr6Var.C(new uz7() { // from class: bq8
                                @Override // defpackage.uz7
                                public final Object execute() {
                                    ((f63) jl1Var.f0).z(qzVar, i + 1, false);
                                    return null;
                                }
                            });
                        } else {
                            jl1Var.c(qzVar, i);
                        }
                        break;
                    } catch (tz7 unused) {
                        ((f63) jl1Var.f0).z(qzVar, i + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public /* synthetic */ fc4(hc4 hc4Var, ec4 ec4Var, int i, String str, r43 r43Var) {
        this.Z = hc4Var;
        this.f0 = ec4Var;
        this.Y = i;
        this.g0 = r43Var;
    }
}
