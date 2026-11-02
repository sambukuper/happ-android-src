package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vl7 extends au {
    public static final vl7 h0;
    public final ar3 g0;

    static {
        uh8.Z.getClass();
        gh8 gh8Var = uh8.f0;
        if (!gh8Var.f() || uh8.a(String.class) == null) {
            new ba7(String.class, gh8Var, null, null);
        }
        h0 = new vl7();
    }

    public vl7() {
        super(String[].class);
        this.g0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // defpackage.au, defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        ar3 ar3VarD;
        Object objC;
        if (d50Var != null) {
            m85 m85VarD = t37Var.X.d();
            gl glVarB = d50Var.b();
            if (glVarB == null || (objC = m85VarD.c(glVarB)) == null) {
                ar3VarD = null;
            } else {
                ar3VarD = t37Var.D(glVarB, objC);
            }
        } else {
            ar3VarD = null;
        }
        no3 no3VarK = lj7.k(t37Var, d50Var, String[].class);
        Boolean boolA = no3VarK != null ? no3VarK.a(ko3.X) : null;
        ar3 ar3Var = this.g0;
        if (ar3VarD == null) {
            ar3VarD = ar3Var;
        }
        ar3 ar3VarJ = lj7.j(t37Var, d50Var, ar3VarD);
        if (ar3VarJ == null) {
            ar3VarJ = t37Var.j(String.class, d50Var);
        }
        ar3 ar3Var2 = it0.r(ar3VarJ) ? null : ar3VarJ;
        return (ar3Var2 == ar3Var && Objects.equals(boolA, this.f0)) ? this : new vl7(this, d50Var, ar3Var2, boolA);
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((String[]) obj).length == 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // defpackage.ar3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r4, defpackage.ro3 r5, defpackage.t37 r6) {
        /*
            r3 = this;
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r0 = r4.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r0 = r3.f0
            if (r0 != 0) goto L14
            n37 r1 = defpackage.n37.v0
            l37 r2 = r6.X
            boolean r1 = r2.j(r1)
            if (r1 != 0) goto L18
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L1c
        L18:
            r3.r(r4, r5, r6)
            return
        L1c:
            r5.V0(r4)
            r3.r(r4, r5, r6)
            r5.D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl7.e(java.lang.Object, ro3, t37):void");
    }

    @Override // defpackage.au
    public final ar3 q(d50 d50Var, Boolean bool) {
        return new vl7(this, d50Var, this.g0, bool);
    }

    @Override // defpackage.au
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void r(String[] strArr, ro3 ro3Var, t37 t37Var) {
        int length = strArr.length;
        if (length == 0) {
            return;
        }
        int i = 0;
        ar3 ar3Var = this.g0;
        if (ar3Var == null) {
            while (i < length) {
                String str = strArr[i];
                if (str == null) {
                    ro3Var.X();
                } else {
                    ro3Var.c1(str);
                }
                i++;
            }
            return;
        }
        int length2 = strArr.length;
        while (i < length2) {
            String str2 = strArr[i];
            if (str2 == null) {
                t37Var.h(ro3Var);
            } else {
                ar3Var.e(str2, ro3Var, t37Var);
            }
            i++;
        }
    }

    public vl7(vl7 vl7Var, d50 d50Var, ar3 ar3Var, Boolean bool) {
        super(vl7Var, d50Var, bool);
        this.g0 = ar3Var;
    }

    @Override // defpackage.e41
    public final e41 o(ri8 ri8Var) {
        return this;
    }
}
