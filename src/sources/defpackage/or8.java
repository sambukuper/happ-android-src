package defpackage;

import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class or8 {
    public final pr8 a;
    public final rj0 b;
    public final c93 c;
    public final h57 d;
    public final Object e;
    public yg1 f;
    public final LinkedHashMap g;
    public LinkedHashMap h;
    public ux0 i;

    public or8(pr8 pr8Var, rj0 rj0Var, c93 c93Var, h57 h57Var) {
        pr8Var.getClass();
        h57Var.getClass();
        this.a = pr8Var;
        this.b = rj0Var;
        this.c = c93Var;
        this.d = h57Var;
        this.e = new Object();
        this.g = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(or8 or8Var, s51 s51Var) throws Throwable {
        mr8 mr8Var;
        if (s51Var instanceof mr8) {
            mr8Var = (mr8) s51Var;
            int i = mr8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                mr8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                mr8Var = new mr8(or8Var, s51Var);
            }
        } else {
            mr8Var = new mr8(or8Var, s51Var);
        }
        Object obj = mr8Var.f0;
        c71 c71Var = c71.X;
        int i2 = mr8Var.h0;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    w39.n0(obj);
                    return obj;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            synchronized (or8Var.e) {
                yg1 yg1Var = or8Var.f;
                if (yg1Var == null || or8Var.i != null) {
                    return Boolean.FALSE;
                }
                mr8Var.h0 = 1;
                Object objH = yg1Var.h(mr8Var);
                return objH == c71Var ? c71Var : objH;
            }
        } catch (CancellationException unused) {
            hi5.m0();
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, long j, s51 s51Var) {
        nr8 nr8Var;
        if (s51Var instanceof nr8) {
            nr8Var = (nr8) s51Var;
            int i = nr8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                nr8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                nr8Var = new nr8(this, s51Var);
            }
        } else {
            nr8Var = new nr8(this, s51Var);
        }
        Object objX = nr8Var.f0;
        int i2 = nr8Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(objX);
            ym7 ym7Var = new ym7(list, q51Var, (byte) 11);
            nr8Var.h0 = 1;
            objX = a28.x(j, ym7Var, nr8Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objX);
        }
        List list2 = (List) objX;
        return list2 == null ? d02.X : list2;
    }

    public final void c(Surface surface) {
        wg1 wg1Var;
        surface.getClass();
        synchronized (this.e) {
            try {
                LinkedHashMap linkedHashMap = this.h;
                if (linkedHashMap != null && (wg1Var = (wg1) linkedHashMap.get(surface)) != null && !this.g.containsKey(surface)) {
                    if (hi5.i0("CXCP")) {
                        wg1Var.toString();
                    }
                    this.g.put(surface, wg1Var);
                    try {
                        wg1Var.d();
                    } catch (ug1 e) {
                        if (hi5.m0()) {
                            surface.toString();
                        }
                        this.d.a(e.X);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        Set setKeySet;
        jl0 jl0VarA = this.b.a();
        jl0VarA.getClass();
        synchronized (jl0VarA.a) {
            try {
                jl0VarA.c.add(this);
                LinkedHashMap linkedHashMap = jl0VarA.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap2.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            c((Surface) it.next());
        }
    }

    public final void e() {
        synchronized (this.e) {
            try {
                if (this.g.isEmpty() && this.h == null) {
                    hi5.i0("CXCP");
                    jl0 jl0VarA = this.b.a();
                    jl0VarA.getClass();
                    synchronized (jl0VarA.a) {
                        jl0VarA.c.remove(this);
                    }
                    ux0 ux0Var = this.i;
                    if (ux0Var != null) {
                        ux0Var.V(dn8.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
