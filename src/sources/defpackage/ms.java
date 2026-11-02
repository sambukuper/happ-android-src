package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.service.d;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ms {
    public final rb8 a;
    public final rp8 b;
    public final m51 c;
    public final hs d;
    public volatile long e;
    public final String f;
    public final xe2 g;

    public ms() {
        rb8 rb8Var = new rb8((byte) 3);
        rp8 rp8Var = new rp8();
        HappApplication happApplication = HappApplication.M0;
        ((vp8) k32.i().Y.getValue()).getClass();
        this.a = rb8Var;
        this.b = rp8Var;
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.c = gv3.c(g33.K(ow7VarB, ye1.Z));
        this.d = new hs(this);
        this.e = -1L;
        this.f = rp8Var.e;
        this.g = rp8Var.g;
    }

    public static boolean b(String str, String str2) {
        Object next;
        qg5 qg5Var;
        if (str != null) {
            List listF = f(str);
            if (str2 != null) {
                List listF2 = f(str2);
                ka2 ka2Var = new ka2(w27.m0(wv0.l0(x97.a0(0, Math.min(listF.size(), listF2.size()))), new fs(listF, listF2, (byte) 0)));
                do {
                    if (!ka2Var.hasNext()) {
                        next = null;
                        break;
                    }
                    next = ka2Var.next();
                    qg5Var = (qg5) next;
                } while (((Number) qg5Var.X).intValue() == ((Number) qg5Var.Y).intValue());
                qg5 qg5Var2 = (qg5) next;
                boolean z = qg5Var2 != null && ((Number) qg5Var2.X).intValue() < ((Number) qg5Var2.Y).intValue();
                if (z || listF.size() == listF2.size()) {
                    return z;
                }
                if (listF.size() < listF2.size()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List f(String str) {
        List listK;
        kc6 kc6Var = ns.a;
        kc6Var.getClass();
        str.getClass();
        int iEnd = 0;
        fm7.A0(0);
        Matcher matcher = kc6Var.X.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listK = arrayList;
        } else {
            listK = i21.K(str.toString());
        }
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    return wv0.U0(listK, listIterator.nextIndex() + 1);
                }
            }
        }
        return d02.X;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        is isVar;
        boolean z;
        Object next;
        String str;
        String str2;
        vo8 vo8Var;
        vo8 vo8Var2;
        vo8 vo8Var3;
        if (s51Var instanceof is) {
            isVar = (is) s51Var;
            int i = isVar.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                isVar.i0 = i - Integer.MIN_VALUE;
            } else {
                isVar = new is(this, s51Var);
            }
        } else {
            isVar = new is(this, s51Var);
        }
        Object obj = isVar.g0;
        int i2 = isVar.i0;
        if (i2 == 0) {
            w39.n0(obj);
            boolean zB = this.b.a.b("pref_beta_version");
            isVar.f0 = zB;
            isVar.i0 = 1;
            Serializable serializableC = this.a.c(isVar);
            c71 c71Var = c71.X;
            if (serializableC == c71Var) {
                return c71Var;
            }
            obj = serializableC;
            z = zB;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = isVar.f0;
            w39.n0(obj);
        }
        Iterator it = ((List) obj).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                cp8 cp8Var = (cp8) next;
                int i3 = cp8Var.b;
                up8 up8Var = cp8Var.c;
                if (!z || (vo8Var2 = up8Var.a) == null || (str = vo8Var2.a) == null) {
                    str = up8Var.b.a;
                }
                os osVar = new os(i3, str);
                do {
                    Object next2 = it.next();
                    cp8 cp8Var2 = (cp8) next2;
                    int i4 = cp8Var2.b;
                    up8 up8Var2 = cp8Var2.c;
                    if (!z || (vo8Var = up8Var2.a) == null || (str2 = vo8Var.a) == null) {
                        str2 = up8Var2.b.a;
                    }
                    os osVar2 = new os(i4, str2);
                    if (osVar.compareTo(osVar2) < 0) {
                        next = next2;
                        osVar = osVar2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        cp8 cp8Var3 = (cp8) next;
        if (cp8Var3 != null) {
            up8 up8Var3 = cp8Var3.c;
            if (!z || (vo8Var3 = up8Var3.a) == null) {
                vo8Var3 = up8Var3.b;
            }
            int i5 = cp8Var3.b;
            String str3 = vo8Var3.a;
            zo8 zo8Var = new zo8(i5, vo8Var3.d, str3, vo8Var3.c, vo8Var3.b, vo8Var3.e);
            if (b("4.9.0", str3)) {
                return zo8Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r2.a(r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.s51 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.js
            if (r0 == 0) goto L13
            r0 = r8
            js r0 = (defpackage.js) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            js r0 = new js
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f0
            int r1 = r0.h0
            rp8 r2 = r7.b
            r3 = 2
            r4 = 1
            c71 r5 = defpackage.c71.X
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2c
            defpackage.w39.n0(r8)
            goto L7c
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            r7 = 0
            return r7
        L33:
            defpackage.w39.n0(r8)
            goto L73
        L37:
            defpackage.w39.n0(r8)
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r8.<init>(r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r8 = r8.setFlags(r1)
            r8.getClass()
            su.happ.proxyutility.HappApplication r1 = su.happ.proxyutility.HappApplication.M0
            su.happ.proxyutility.HappApplication r1 = defpackage.k32.i()
            java.io.File r6 = new java.io.File
            java.lang.String r7 = r7.f
            r6.<init>(r7)
            java.lang.String r7 = "su.happ.proxyutility.provider"
            android.net.Uri r7 = androidx.core.content.FileProvider.c(r1, r7, r6)
            r8.addFlags(r4)
            r8.setData(r7)
            su.happ.proxyutility.HappApplication r7 = defpackage.k32.i()
            r7.startActivity(r8)
            r0.h0 = r4
            java.lang.Object r7 = r2.b(r0)
            if (r7 != r5) goto L73
            goto L7b
        L73:
            r0.h0 = r3
            java.lang.Object r7 = r2.a(r0)
            if (r7 != r5) goto L7c
        L7b:
            return r5
        L7c:
            dn8 r7 = defpackage.dn8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms.c(s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (e(r6, r0) == r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.s51 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ks
            if (r0 == 0) goto L13
            r0 = r6
            ks r0 = (defpackage.ks) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            ks r0 = new ks
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f0
            int r1 = r0.h0
            r2 = 2
            r3 = 1
            c71 r4 = defpackage.c71.X
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            defpackage.w39.n0(r6)
            sj6 r6 = (defpackage.sj6) r6
            java.lang.Object r5 = r6.X
            goto L56
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r5)
            r5 = 0
            return r5
        L35:
            defpackage.w39.n0(r6)
            goto L49
        L39:
            defpackage.w39.n0(r6)
            r0.h0 = r3
            rp8 r6 = r5.b
            xe2 r6 = r6.i
            java.lang.Object r6 = defpackage.gv3.q(r6, r0)
            if (r6 != r4) goto L49
            goto L55
        L49:
            zo8 r6 = (defpackage.zo8) r6
            if (r6 == 0) goto L56
            r0.h0 = r2
            java.lang.Object r5 = r5.e(r6, r0)
            if (r5 != r4) goto L56
        L55:
            return r4
        L56:
            dn8 r5 = defpackage.dn8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms.d(s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [zo8] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [zo8] */
    public final Object e(zo8 zo8Var, s51 s51Var) throws Throwable {
        ls lsVar;
        Throwable th;
        ?? r12;
        int i;
        ?? r13;
        d dVar;
        HappApplication happApplicationI;
        String path;
        ms msVar;
        String str;
        if (s51Var instanceof ls) {
            lsVar = (ls) s51Var;
            int i2 = lsVar.o0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lsVar.o0 = i2 - Integer.MIN_VALUE;
            } else {
                lsVar = new ls(this, s51Var);
            }
        } else {
            lsVar = new ls(this, s51Var);
        }
        Object obj = lsVar.m0;
        c71 c71Var = c71.X;
        int i3 = lsVar.o0;
        try {
            try {
                if (i3 == 0) {
                    w39.n0(obj);
                    try {
                        rp8 rp8Var = this.b;
                        lsVar.f0 = zo8Var;
                        lsVar.l0 = 0;
                        lsVar.o0 = 1;
                        if (rp8Var.f(zo8Var, lsVar) != c71Var) {
                            i = 0;
                            r13 = zo8Var;
                        }
                        return c71Var;
                    } catch (Throwable th2) {
                        th = th2;
                        r12 = 0;
                        if (r12 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                            th.printStackTrace();
                        }
                        if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        return new rj6(th);
                    }
                }
                if (i3 == 1) {
                    int i4 = lsVar.l0;
                    zo8 zo8Var2 = lsVar.f0;
                    w39.n0(obj);
                    i = i4;
                    r13 = zo8Var2;
                } else {
                    if (i3 != 2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = lsVar.l0;
                    msVar = lsVar.k0;
                    dVar = lsVar.j0;
                    HappApplication happApplication = lsVar.i0;
                    String str2 = lsVar.h0;
                    String str3 = lsVar.g0;
                    w39.n0(obj);
                    path = str3;
                    str = str2;
                    happApplicationI = happApplication;
                    zo8Var = i5;
                }
                long jLongValue = ((Number) obj).longValue();
                hs hsVar = this.d;
                dVar.getClass();
                msVar.e = d.e(happApplicationI, str, path, jLongValue, hsVar);
                return dn8.a;
                dVar = d.a;
                HappApplication happApplication2 = HappApplication.M0;
                happApplicationI = k32.i();
                String str4 = r13.Z;
                path = this.b.f.getPath();
                if (path == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                rp8 rp8Var2 = this.b;
                lsVar.f0 = null;
                lsVar.g0 = path;
                lsVar.h0 = str4;
                lsVar.i0 = happApplicationI;
                lsVar.j0 = dVar;
                lsVar.k0 = this;
                lsVar.l0 = i;
                lsVar.o0 = 2;
                Object objQ = gv3.q(rp8Var2.h, lsVar);
                if (objQ != c71Var) {
                    msVar = this;
                    str = str4;
                    zo8Var = i;
                    obj = objQ;
                    long jLongValue2 = ((Number) obj).longValue();
                    hs hsVar2 = this.d;
                    dVar.getClass();
                    msVar.e = d.e(happApplicationI, str, path, jLongValue2, hsVar2);
                    return dn8.a;
                }
                return c71Var;
            } catch (Throwable th3) {
                th = th3;
                r12 = i;
                if (r12 != 0) {
                    th.printStackTrace();
                }
                if (th instanceof InterruptedException) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r12 = zo8Var;
        }
    }
}
