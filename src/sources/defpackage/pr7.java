package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.domain.sub.SubId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pr7 {
    public final xr7 a;
    public final oh7 b;
    public final ConcurrentHashMap c;

    public pr7(xr7 xr7Var) {
        xr7Var.getClass();
        this.a = xr7Var;
        dm5 dm5Var = dm5.f0;
        dm5Var.getClass();
        this.b = ph7.a(dm5Var);
        this.c = new ConcurrentHashMap();
    }

    public static /* synthetic */ Object b(pr7 pr7Var, String str, boolean z, String str2, q30 q30Var, ok4 ok4Var, zs1 zs1Var, pk4 pk4Var, Boolean bool, s51 s51Var, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return pr7Var.a(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : q30Var, (i & 16) != 0 ? null : ok4Var, (i & 32) != 0 ? null : zs1Var, (i & 64) != 0 ? null : pk4Var, (i & 128) != 0 ? mr7.a : lr7.a, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : bool, s51Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(String str, boolean z, String str2, dn2 dn2Var, gn2 gn2Var, gn2 gn2Var2, sn2 sn2Var, nr7 nr7Var, Boolean bool, s51 s51Var) throws Throwable {
        or7 or7Var;
        gn2 gn2Var3;
        gn2 gn2Var4;
        String str3;
        boolean z2;
        dn2 dn2Var2;
        o15 o15Var;
        sn2 sn2Var2;
        Boolean bool2;
        String str4;
        Object objPutIfAbsent;
        o15 o15Var2;
        Boolean bool3;
        String str5;
        Object obj;
        av7 av7Var;
        Object value;
        if (s51Var instanceof or7) {
            or7Var = (or7) s51Var;
            int i = or7Var.q0;
            if ((i & Integer.MIN_VALUE) != 0) {
                or7Var.q0 = i - Integer.MIN_VALUE;
            } else {
                or7Var = new or7(this, s51Var);
            }
        } else {
            or7Var = new or7(this, s51Var);
        }
        Object objD = or7Var.o0;
        int i2 = or7Var.q0;
        oh7 oh7Var = this.b;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objD);
            SubId subId = new SubId(str);
            ConcurrentHashMap concurrentHashMap = this.c;
            Object objA = concurrentHashMap.get(subId);
            if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(subId, (objA = r15.a()))) != null) {
                objA = objPutIfAbsent;
            }
            o15 o15Var3 = (o15) objA;
            if (dh3.f(nr7Var, lr7.a) && o15Var3.k()) {
                return null;
            }
            or7Var.f0 = str;
            or7Var.g0 = str2;
            or7Var.h0 = dn2Var;
            gn2Var3 = gn2Var;
            or7Var.i0 = gn2Var3;
            gn2Var4 = gn2Var2;
            or7Var.j0 = gn2Var4;
            or7Var.k0 = sn2Var;
            or7Var.l0 = bool;
            or7Var.m0 = o15Var3;
            or7Var.n0 = z;
            or7Var.q0 = 1;
            if (o15Var3.g(or7Var) != c71Var) {
                str3 = str;
                z2 = z;
                dn2Var2 = dn2Var;
                o15Var = o15Var3;
                sn2Var2 = sn2Var;
                bool2 = bool;
                str4 = str2;
            }
            return c71Var;
        }
        if (i2 == 1) {
            z2 = or7Var.n0;
            o15Var = or7Var.m0;
            bool2 = or7Var.l0;
            sn2Var2 = or7Var.k0;
            gn2 gn2Var5 = or7Var.j0;
            gn2 gn2Var6 = or7Var.i0;
            dn2Var2 = or7Var.h0;
            str4 = or7Var.g0;
            str3 = or7Var.f0;
            w39.n0(objD);
            gn2Var4 = gn2Var5;
            gn2Var3 = gn2Var6;
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o15Var2 = or7Var.m0;
            str5 = or7Var.f0;
            try {
                w39.n0(objD);
            } catch (Throwable th) {
                th = th;
                obj = null;
            }
        }
        try {
            av7Var = (av7) objD;
            do {
                value = oh7Var.getValue();
            } while (!oh7Var.k(value, ((cm5) value).d(new SubId(str5), av7Var)));
            o15Var2.m(null);
            return av7Var;
        } catch (Throwable th2) {
            th = th2;
        }
        while (true) {
            try {
                Object value2 = oh7Var.getValue();
                bool3 = bool2;
                if (oh7Var.k(value2, ((cm5) value2).d(new SubId(str3), yu7.a))) {
                    break;
                }
                bool2 = bool3;
            } catch (Throwable th3) {
                th = th3;
                o15Var2 = o15Var;
            }
            obj = null;
            o15Var2.m(obj);
            throw th;
        }
        xr7 xr7Var = this.a;
        or7Var.f0 = str3;
        or7Var.g0 = null;
        or7Var.h0 = null;
        or7Var.i0 = null;
        or7Var.j0 = null;
        or7Var.k0 = null;
        or7Var.l0 = null;
        or7Var.m0 = o15Var;
        or7Var.n0 = z2;
        or7Var.q0 = 2;
        String str6 = str4;
        String str7 = str3;
        objD = xr7Var.d(str7, z2, str6, dn2Var2, gn2Var3, gn2Var4, sn2Var2, bool3, or7Var);
        if (objD != c71Var) {
            o15Var2 = o15Var;
            str5 = str7;
            av7Var = (av7) objD;
            do {
                value = oh7Var.getValue();
            } while (!oh7Var.k(value, ((cm5) value).d(new SubId(str5), av7Var)));
            o15Var2.m(null);
            return av7Var;
        }
        return c71Var;
    }
}
