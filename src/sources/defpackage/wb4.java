package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb4 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public final Object d;

    public wb4(Class cls) {
        this.a = (byte) 2;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = ((UUID) this.b).toString();
        string.getClass();
        this.c = new l49(string, (u39) null, cls.getName(), (String) null, (u91) null, (u91) null, 0L, 0L, 0L, (p31) null, 0, (z00) null, 0L, 0L, 0L, 0L, false, (yd5) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(aq4.G(1));
        eu.I0(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public g49 a() {
        g49 g49VarB = b();
        p31 p31Var = ((l49) this.c).j;
        boolean z = p31Var.b() || p31Var.e || p31Var.c || p31Var.d;
        l49 l49Var = (l49) this.c;
        if (l49Var.q) {
            if (z) {
                bt.q("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (l49Var.g > 0) {
                bt.q("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = l49Var.x;
        if (str == null) {
            List listF0 = fm7.F0(l49Var.c, new String[]{"."}, 6);
            String strQ0 = listF0.size() == 1 ? (String) listF0.get(0) : (String) wv0.A0(listF0);
            if (strQ0.length() > 127) {
                strQ0 = fm7.Q0(127, strQ0);
            }
            l49Var.x = strQ0;
        } else if (str.length() > 127) {
            ((l49) this.c).x = fm7.Q0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        l49 l49Var2 = (l49) this.c;
        this.c = new l49(string, l49Var2.b, l49Var2.c, l49Var2.d, new u91(l49Var2.e), new u91(l49Var2.f), l49Var2.g, l49Var2.h, l49Var2.i, new p31(l49Var2.j), l49Var2.k, l49Var2.l, l49Var2.m, l49Var2.n, l49Var2.o, l49Var2.p, l49Var2.q, l49Var2.r, l49Var2.s, l49Var2.u, l49Var2.v, l49Var2.w, l49Var2.x, l49Var2.y, 524288);
        return g49VarB;
    }

    public abstract g49 b();

    public abstract fk2 c();

    public void d() {
        ((xb4) this.d).a(new vb4(this), (Executor) this.b);
    }

    public void e(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ((l49) this.c).g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((l49) this.c).g) {
            return;
        }
        bt.q("The given initial delay is too large and will cause an overflow!");
    }

    public abstract byte[] f(Object obj);

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + ": " + c();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ wb4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
