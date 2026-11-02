package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 {
    public final l5 a;
    public final /* synthetic */ byte b;

    public fl1(l5 l5Var, byte b) {
        this.b = b;
        l5Var.getClass();
        this.a = l5Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0175 A[LOOP:1: B:97:0x0145->B:109:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0145 A[ADDED_TO_REGION, LOOP:1: B:97:0x0145->B:109:0x0175, LOOP_START, PHI: r8
  0x0145: PHI (r8v1 ed1) = (r8v0 ed1), (r8v2 ed1) binds: [B:95:0x0142, B:109:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [ed1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [ed1, jd1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ed1] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ed1] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ed1] */
    public final boolean a(i86 i86Var, jd1 jd1Var, ed1 ed1Var) {
        ed1 ed1VarH;
        sx4 sx4Var;
        switch (this.b) {
            case 0:
                if (bl1.q(jd1Var) && bl1.e(ed1Var) != lh4.F0) {
                    return gl1.d(jd1Var, ed1Var);
                }
                if (jd1Var instanceof a41) {
                    ((a41) jd1Var).p();
                }
                while (jd1Var != 0) {
                    jd1Var = jd1Var.p();
                    if (((jd1Var instanceof sx4) && !bl1.k(jd1Var)) || (jd1Var instanceof tf5)) {
                        if (jd1Var != 0) {
                            while (ed1Var != null) {
                                if (jd1Var == ed1Var) {
                                    return true;
                                }
                                if (ed1Var instanceof tf5) {
                                    ed1Var = ed1Var.p();
                                } else if ((jd1Var instanceof tf5) && ((uf5) ((tf5) jd1Var)).i0.equals(((uf5) ((tf5) ed1Var)).i0) && bl1.c(ed1Var).equals(bl1.c(jd1Var))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
                if (jd1Var != 0) {
                    while (ed1Var != null) {
                        if (jd1Var == ed1Var) {
                            return true;
                        }
                        if (ed1Var instanceof tf5) {
                            ed1Var = ed1Var.p();
                        } else if (jd1Var instanceof tf5) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                if (gl1.a.a(i86Var, jd1Var, ed1Var)) {
                    if (i86Var == gl1.l) {
                        return true;
                    }
                    if (i86Var != gl1.k && (ed1VarH = bl1.h(jd1Var, sx4.class, true)) != null && (i86Var instanceof d83)) {
                        return ((d83) i86Var).X.n0().equals(ed1VarH.a());
                    }
                }
                return false;
            case 2:
                if (ed1Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                sx4 sx4Var2 = (sx4) bl1.h(jd1Var, sx4.class, true);
                sx4 sx4Var3 = (sx4) bl1.h(ed1Var, sx4.class, false);
                if (sx4Var3 != null) {
                    if (sx4Var2 != null && bl1.k(sx4Var2) && (sx4Var = (sx4) bl1.h(sx4Var2, sx4.class, true)) != null && bl1.p(sx4Var3.X(), sx4Var.n0())) {
                        return true;
                    }
                    ?? R = jd1Var instanceof ld0 ? bl1.r((ld0) jd1Var) : jd1Var;
                    sx4 sx4Var4 = (sx4) bl1.h(R, sx4.class, true);
                    if (sx4Var4 != null) {
                        if (bl1.p(sx4Var3.X(), sx4Var4.n0()) && i86Var != gl1.m) {
                            if (!(R instanceof ld0) || (R instanceof a41) || i86Var == gl1.l) {
                                return true;
                            }
                            if (i86Var != gl1.k && i86Var != null) {
                                t14 t14VarC = i86Var.c();
                                if (bl1.p(t14VarC, sx4Var3)) {
                                    return true;
                                }
                                t14VarC.q0();
                            }
                        }
                        return a(i86Var, jd1Var, sx4Var3.p());
                    }
                }
                return false;
            case 3:
                if (!bl1.c(ed1Var).A(bl1.c(jd1Var))) {
                    return false;
                }
                gl1.n.getClass();
                return true;
            case 4:
                return true;
            case 5:
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
            case 8:
                return false;
            case 9:
                return ek3.a(jd1Var, ed1Var);
            case 10:
                return ek3.b(i86Var, jd1Var, ed1Var);
            default:
                return ek3.b(i86Var, jd1Var, ed1Var);
        }
    }

    public final String toString() {
        return this.a.d();
    }
}
