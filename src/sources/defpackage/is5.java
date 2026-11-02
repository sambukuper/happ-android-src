package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class is5 {
    public final String a;
    public final lr5 b;
    public final gn2 c;
    public final b71 d;
    public final Object e = new Object();
    public volatile y45 f;

    public is5(String str, lr5 lr5Var, gn2 gn2Var, b71 b71Var) {
        this.a = str;
        this.b = lr5Var;
        this.c = gn2Var;
        this.d = b71Var;
    }

    public final Object a(nw3 nw3Var, Object obj) {
        y45 y45Var;
        Context context = (Context) obj;
        nw3Var.getClass();
        y45 y45Var2 = this.f;
        if (y45Var2 != null) {
            return y45Var2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    k71 k42Var = this.b;
                    gn2 gn2Var = this.c;
                    applicationContext.getClass();
                    List list = (List) gn2Var.B(applicationContext);
                    b71 b71Var = this.d;
                    a23 a23Var = new a23((Object) applicationContext, (Object) this, (byte) 12);
                    list.getClass();
                    m92 m92Var = new m92(new hr5(a23Var, (byte) 1));
                    if (k42Var == null) {
                        k42Var = new k42();
                    }
                    this.f = new y45(new y45(new ib1(m92Var, i21.K(new q0((Object) list, (q51) null, (byte) 17)), k42Var, b71Var)));
                }
                y45Var = this.f;
                y45Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return y45Var;
    }
}
