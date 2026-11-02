package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class we8 {
    public static volatile s91 e;
    public final f08 a;
    public final f08 b;
    public final of1 c;
    public final jl1 d;

    public we8(f08 f08Var, f08 f08Var2, of1 of1Var, jl1 jl1Var, yr6 yr6Var) {
        this.a = f08Var;
        this.b = f08Var2;
        this.c = of1Var;
        this.d = jl1Var;
        ((Executor) yr6Var.Y).execute(new fl6((Object) yr6Var, (byte) 17));
    }

    public static we8 a() {
        s91 s91Var = e;
        if (s91Var != null) {
            return (we8) ((v06) s91Var.g0).get();
        }
        bt.i("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (we8.class) {
                try {
                    if (e == null) {
                        wl6 wl6Var = new wl6((byte) 25, false);
                        context.getClass();
                        wl6Var.Y = context;
                        e = wl6Var.K();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final ve8 c(ob0 ob0Var) {
        Set setUnmodifiableSet = ob0Var instanceof ob0 ? Collections.unmodifiableSet(ob0.d) : Collections.singleton(new y02("proto"));
        lr lrVarA = qz.a();
        ob0Var.getClass();
        lrVarA.Y = "cct";
        String str = ob0Var.a;
        String str2 = ob0Var.b;
        if (str2 == null) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        lrVarA.Z = oi0.m("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        return new ve8(setUnmodifiableSet, lrVarA.e(), this);
    }
}
