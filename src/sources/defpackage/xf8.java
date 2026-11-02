package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xf8 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final WorkDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final d0 e;
    public final String[] g;
    public final sa2 h;
    public final jb1 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public dn2 k = new w60((byte) 12);
    public final LinkedHashMap f = new LinkedHashMap();

    public xf8(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, d0 d0Var) {
        String lowerCase;
        this.a = workDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = d0Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, zp4.H(linkedHashMap3, lowerCase3));
            }
        }
        this.h = new sa2(this.g.length);
        this.i = new jb1(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(tq5 tq5Var, s51 s51Var) {
        pf8 pf8Var;
        if (s51Var instanceof pf8) {
            pf8Var = (pf8) s51Var;
            int i = pf8Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                pf8Var.i0 = i - Integer.MIN_VALUE;
            } else {
                pf8Var = new pf8(this, s51Var);
            }
        } else {
            pf8Var = new pf8(this, s51Var);
        }
        Object objD = pf8Var.g0;
        int i2 = pf8Var.i0;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objD);
            b58 b58Var = new b58((byte) 7);
            pf8Var.f0 = tq5Var;
            pf8Var.i0 = 1;
            objD = tq5Var.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", b58Var, pf8Var);
            if (objD != c71Var) {
            }
            return c71Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) pf8Var.f0;
            w39.n0(objD);
            return set;
        }
        tq5Var = (tq5) pf8Var.f0;
        w39.n0(objD);
        Set set2 = (Set) objD;
        if (!set2.isEmpty()) {
            pf8Var.f0 = set2;
            pf8Var.i0 = 2;
            if (mn7.d(tq5Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", pf8Var) == c71Var) {
                return c71Var;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object b(s51 s51Var) throws Throwable {
        rf8 rf8Var;
        mj0 mj0Var;
        Throwable th;
        mj0 mj0Var2;
        Object value;
        int[] iArr;
        if (s51Var instanceof rf8) {
            rf8Var = (rf8) s51Var;
            int i = rf8Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                rf8Var.j0 = i - Integer.MIN_VALUE;
            } else {
                rf8Var = new rf8(this, s51Var);
            }
        } else {
            rf8Var = new rf8(this, s51Var);
        }
        Object objQ = rf8Var.h0;
        int i2 = rf8Var.j0;
        q51 q51Var = null;
        byte b = 0;
        if (i2 == 0) {
            w39.n0(objQ);
            WorkDatabase_Impl workDatabase_Impl = this.a;
            mj0Var = workDatabase_Impl.f;
            boolean zX = mj0Var.x();
            m02 m02Var = m02.X;
            if (!zX) {
                return m02Var;
            }
            try {
                if (!this.j.compareAndSet(true, false)) {
                    mj0Var.a0();
                    return m02Var;
                }
                if (!((Boolean) this.k.invoke()).booleanValue()) {
                    mj0Var.a0();
                    return m02Var;
                }
                sf8 sf8Var = new sf8(this, q51Var, b);
                rf8Var.f0 = this;
                rf8Var.g0 = mj0Var;
                rf8Var.j0 = 1;
                objQ = workDatabase_Impl.q(false, sf8Var, rf8Var);
                c71 c71Var = c71.X;
                if (objQ == c71Var) {
                    return c71Var;
                }
            } catch (Throwable th2) {
                th = th2;
                mj0Var2 = mj0Var;
                mj0Var2.a0();
                throw th;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mj0Var2 = rf8Var.g0;
            xf8 xf8Var = rf8Var.f0;
            try {
                w39.n0(objQ);
                mj0Var = mj0Var2;
                this = xf8Var;
            } catch (Throwable th3) {
                th = th3;
                mj0Var2.a0();
                throw th;
            }
        }
        Set set = (Set) objQ;
        if (!set.isEmpty()) {
            jb1 jb1Var = this.i;
            try {
                set.getClass();
                if (!set.isEmpty()) {
                    oh7 oh7Var = jb1Var.a;
                    do {
                        value = oh7Var.getValue();
                        int[] iArr2 = (int[]) value;
                        int length = iArr2.length;
                        iArr = new int[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                        }
                    } while (!oh7Var.k(value, iArr));
                }
                this.e.B(set);
            } catch (Throwable th4) {
                th = th4;
                mj0Var2 = mj0Var;
                mj0Var2.a0();
                throw th;
            }
        }
        mj0Var.a0();
        return set;
    }

    public final void c(dn2 dn2Var, dn2 dn2Var2) {
        dn2Var.getClass();
        dn2Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            dn2Var.invoke();
            m51 m51Var = this.a.a;
            q51 q51Var = null;
            if (m51Var != null) {
                w51.G(m51Var, new x61("Room Invalidation Tracker Refresh"), null, new t17(this, dn2Var2, q51Var, (byte) 16), 2);
            } else {
                dh3.T("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (defpackage.mn7.d(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if (defpackage.mn7.d(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00db -> B:28:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ed8 r18, int r19, defpackage.s51 r20) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.d(ed8, int, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:19:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.ed8 r8, int r9, defpackage.s51 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.uf8
            if (r0 == 0) goto L13
            r0 = r10
            uf8 r0 = (defpackage.uf8) r0
            int r1 = r0.m0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m0 = r1
            goto L18
        L13:
            uf8 r0 = new uf8
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.k0
            int r1 = r0.m0
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.j0
            int r8 = r0.i0
            java.lang.String[] r9 = r0.h0
            java.lang.String r1 = r0.g0
            tq5 r3 = r0.f0
            defpackage.w39.n0(r10)
            r10 = r9
            r9 = r3
            goto L81
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            r7 = 0
            return r7
        L38:
            defpackage.w39.n0(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.xf8.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L83
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.p61.l(r5, r4, r3)
            r0.f0 = r9
            r0.g0 = r1
            r0.h0 = r10
            r0.i0 = r8
            r0.j0 = r7
            r0.m0 = r2
            java.lang.Object r3 = defpackage.mn7.d(r9, r3, r0)
            c71 r4 = defpackage.c71.X
            if (r3 != r4) goto L81
            return r4
        L81:
            int r8 = r8 + r2
            goto L4a
        L83:
            dn8 r7 = defpackage.dn8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.e(ed8, int, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(s51 s51Var) throws Throwable {
        vf8 vf8Var;
        mj0 mj0Var;
        if (s51Var instanceof vf8) {
            vf8Var = (vf8) s51Var;
            int i = vf8Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vf8Var.i0 = i - Integer.MIN_VALUE;
            } else {
                vf8Var = new vf8(this, s51Var);
            }
        } else {
            vf8Var = new vf8(this, s51Var);
        }
        Object obj = vf8Var.g0;
        int i2 = vf8Var.i0;
        q51 q51Var = null;
        byte b = 1;
        if (i2 == 0) {
            w39.n0(obj);
            WorkDatabase_Impl workDatabase_Impl = this.a;
            mj0 mj0Var2 = workDatabase_Impl.f;
            if (mj0Var2.x()) {
                try {
                    sf8 sf8Var = new sf8(this, q51Var, b);
                    vf8Var.f0 = mj0Var2;
                    vf8Var.i0 = 1;
                    Object objQ = workDatabase_Impl.q(false, sf8Var, vf8Var);
                    c71 c71Var = c71.X;
                    if (objQ == c71Var) {
                        return c71Var;
                    }
                    mj0Var = mj0Var2;
                    mj0Var.a0();
                } catch (Throwable th) {
                    th = th;
                    mj0Var = mj0Var2;
                    mj0Var.a0();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mj0Var = vf8Var.f0;
            try {
                w39.n0(obj);
                mj0Var.a0();
            } catch (Throwable th2) {
                th = th2;
                mj0Var.a0();
                throw th;
            }
        }
        return dn8.a;
    }
}
