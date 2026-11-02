package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l06 {
    public static final l06 c = new l06();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final yr2 a = new yr2((byte) 1);

    public final bx6 a(Class cls) {
        u62 u62Var;
        bx6 bx6VarW;
        Class cls2;
        eg3.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        bx6 bx6Var = (bx6) concurrentHashMap.get(cls);
        if (bx6Var != null) {
            return bx6Var;
        }
        Class cls3 = ex6.a;
        if (!cq2.class.isAssignableFrom(cls) && (cls2 = ex6.a) != null && !cls2.isAssignableFrom(cls)) {
            bt.q("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        p66 p66VarA = ((ep4) this.a.Y).a(cls);
        if ((p66VarA.d & 2) == 2) {
            if (cq2.class.isAssignableFrom(cls)) {
                bx6VarW = new ru4(ex6.c, v62.a, p66VarA.a);
            } else {
                gn8 gn8Var = ex6.b;
                u62 u62Var2 = v62.b;
                if (u62Var2 == null) {
                    bt.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                bx6VarW = new ru4(gn8Var, u62Var2, p66VarA.a);
            }
        } else if (cq2.class.isAssignableFrom(cls)) {
            bx6VarW = qu4.w(p66VarA, n45.b, jb4.b, ex6.c, p61.B(p66VarA.a()) != 1 ? v62.a : null, rp4.b);
        } else {
            m45 m45Var = n45.a;
            ib4 ib4Var = jb4.a;
            gn8 gn8Var2 = ex6.b;
            if (p61.B(p66VarA.a()) != 1) {
                u62 u62Var3 = v62.b;
                if (u62Var3 == null) {
                    bt.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                u62Var = u62Var3;
            } else {
                u62Var = null;
            }
            bx6VarW = qu4.w(p66VarA, m45Var, ib4Var, gn8Var2, u62Var, rp4.a);
        }
        bx6 bx6Var2 = (bx6) concurrentHashMap.putIfAbsent(cls, bx6VarW);
        return bx6Var2 != null ? bx6Var2 : bx6VarW;
    }
}
