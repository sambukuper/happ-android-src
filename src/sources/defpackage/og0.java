package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class og0 {
    public final Map a;
    public final Object b = new Object();
    public final LinkedHashMap c = new LinkedHashMap();
    public final mg0 d;

    public og0(String str, Map map, Context context, s98 s98Var, wj0 wj0Var) {
        this.a = map;
        wj0Var.a(uj0.X, new c1(this, (byte) 8));
        mg0 mg0VarA = a(str);
        if (mg0VarA != null) {
            this.d = mg0VarA;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) ng0.a(str));
        bt.l(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    public final mg0 a(String str) {
        str.getClass();
        synchronized (this.b) {
            try {
                mg0 mg0Var = (mg0) this.c.get(new ng0(str));
                if (mg0Var != null) {
                    return mg0Var;
                }
                xj0 xj0Var = (xj0) this.a.get(new ng0(str));
                mg0 mg0Var2 = xj0Var != null ? xj0Var.a : null;
                if (mg0Var2 != null) {
                    if (!str.equals("CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) ng0.a(str)) + " but it was actually " + ((Object) ng0.a("CXCP-Camera2"))).toString());
                    }
                    this.c.put(new ng0(str), mg0Var2);
                }
                return mg0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
