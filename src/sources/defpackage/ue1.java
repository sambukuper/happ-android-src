package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 implements qz2, rz2 {
    public final h44 a;
    public final Context b;
    public final w06 c;
    public final Set d;
    public final Executor e;

    public ue1(Context context, String str, Set set, w06 w06Var, Executor executor) {
        this.a = new h44(new wy0(context, str, (byte) 1));
        this.d = set;
        this.e = executor;
        this.c = w06Var;
        this.b = context;
    }

    public final fb9 a() {
        if (!us7.g(this.b)) {
            return g28.l(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        return g28.d(this.e, new te1(this, (byte) 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            g28.l(null);
        } else if (!us7.g(this.b)) {
            g28.l(null);
        } else {
            g28.d(this.e, new te1(this, (byte) 1));
        }
    }
}
