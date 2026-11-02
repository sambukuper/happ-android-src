package defpackage;

import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y63 {
    public static final f4 a = new f4(d02.X);
    public static final f4 b;
    public static final f4 c;
    public static final f4 d;

    static {
        wo1.a(4096);
        wo1 wo1Var = new wo1(4096);
        wo1.a(4096);
        b = new f4(new ta7(wo1Var, new wo1(4096)));
        c = new f4(Boolean.FALSE);
        d = new f4(Boolean.TRUE);
    }

    public static final void a(s63 s63Var) {
        r72 r72Var;
        f4 f4Var = b73.a;
        u71 u71Var = new u71(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE);
        Object obj = s63Var.l;
        if (obj instanceof r72) {
            r72Var = (r72) obj;
        } else {
            if (!(obj instanceof s72)) {
                throw new AssertionError();
            }
            r72 r72Var2 = new r72((s72) obj);
            s63Var.l = r72Var2;
            r72Var = r72Var2;
        }
        r72Var.a.put(b73.a, u71Var);
    }
}
