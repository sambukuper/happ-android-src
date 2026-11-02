package defpackage;

import com.tencent.mmkv.MMKV;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.AppInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class cl5 extends xw8 {
    public final vz7 b = new vz7(new dw4((byte) 17));
    public final vz7 c = new vz7(new dw4((byte) 18));
    public final Collator d = Collator.getInstance();
    public final tx0 e = new tx0(this, (byte) 2);
    public final oh7 f;
    public final h76 g;
    public final u77 h;
    public final f76 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cl5() {
        km5 km5Var = km5.f0;
        jk5 jk5Var = jk5.Y;
        ec7 ec7Var = ec7.Y;
        oh7 oh7VarA = ph7.a(new lk5(jk5Var, "", ec7Var, km5Var, ec7Var, false));
        this.f = oh7VarA;
        this.g = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.h = u77VarB;
        this.i = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(String str) {
        Object next;
        Object value;
        lk5 lk5Var;
        km5 km5VarB;
        qm5 qm5VarC;
        String lowerCase;
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        rw1 it = wv0.d1(((lk5) this.g.X.getValue()).c).iterator();
        do {
            rw1 rw1Var = it;
            if (!rw1Var.Y.hasNext()) {
                next = null;
                break;
            }
            next = rw1Var.next();
            lowerCase = ((AppInfo) ((pb3) next).b).getPackageName().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } while (!lowerCase.equals(lowerCase2));
        pb3 pb3Var = (pb3) next;
        if (pb3Var == null) {
            return false;
        }
        int i = pb3Var.a;
        AppInfo appInfo = (AppInfo) pb3Var.b;
        oh7 oh7Var = this.f;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            lk5Var = (lk5) value;
            lk5Var.getClass();
            km5VarB = lk5Var.d.b(appInfo.getPackageName());
            qm5VarC = lk5Var.c.c();
            qm5VarC.set(i, AppInfo.a(appInfo, 1));
        } while (!oh7Var.k(value, lk5.a(lk5Var, null, null, qm5VarC.c(), km5VarB, null, false, 51)));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ig8 f() {
        return (ig8) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(String str) {
        Boolean rj6Var;
        ArrayList arrayList;
        h76 h76Var = this.g;
        try {
            String strLineSeparator = System.lineSeparator();
            strLineSeparator.getClass();
            Set setC1 = wv0.c1(fm7.F0(str, new String[]{strLineSeparator}, 6));
            int iOrdinal = ((lk5) h76Var.X.getValue()).a.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                gu guVarD1 = wv0.d1(((lk5) h76Var.X.getValue()).c);
                arrayList = new ArrayList();
                rw1 it = guVarD1.iterator();
                while (it.Y.hasNext()) {
                    Object next = it.next();
                    String lowerCase = ((AppInfo) ((pb3) next).b).getPackageName().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (setC1.contains(lowerCase)) {
                        arrayList.add(next);
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new b55();
                }
                gu guVarD2 = wv0.d1(((lk5) h76Var.X.getValue()).c);
                arrayList = new ArrayList();
                rw1 it2 = guVarD2.iterator();
                while (it2.Y.hasNext()) {
                    Object next2 = it2.next();
                    String lowerCase2 = ((AppInfo) ((pb3) next2).b).getPackageName().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (!setC1.contains(lowerCase2)) {
                        arrayList.add(next2);
                    }
                }
            }
            u15.S(this.f, new kd(arrayList, (byte) 3));
            rj6Var = Boolean.TRUE;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Boolean bool = Boolean.FALSE;
        if (rj6Var instanceof rj6) {
            rj6Var = bool;
        }
        return rj6Var.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(jk5 jk5Var) {
        oh7 oh7Var = this.f;
        oh7Var.getClass();
        while (true) {
            Object value = oh7Var.getValue();
            lk5 lk5Var = (lk5) value;
            lk5Var.getClass();
            jk5 jk5Var2 = jk5Var;
            if (oh7Var.k(value, lk5.a(lk5Var, jk5Var2, null, null, null, null, false, 62))) {
                ((MMKV) x06.a.getValue()).l(jk5Var2.ordinal(), "perAppProxyMode");
                jm4.Q(zw8.a(this), (u61) null, new yk5(this, null, (byte) 8), 3);
                return;
            }
            jk5Var = jk5Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void i(s51 s51Var) {
        bl5 bl5Var;
        if (s51Var instanceof bl5) {
            bl5Var = (bl5) s51Var;
            int i = bl5Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                bl5Var.h0 = i - Integer.MIN_VALUE;
            } else {
                bl5Var = new bl5(this, s51Var);
            }
        } else {
            bl5Var = new bl5(this, s51Var);
        }
        Object obj = bl5Var.f0;
        int i2 = bl5Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            f76 f76Var = f().e;
            yk5 yk5Var = new yk5(this, null, (byte) 9);
            bl5Var.h0 = 1;
            if (z91.n(f76Var, yk5Var, bl5Var) == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        bt.i("SharedFlow never completes, this call should never return.");
    }
}
