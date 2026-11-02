package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j74 implements ny6 {
    public static final xd6 A0;
    public final hf1 X;
    public boolean Y;
    public e74 Z;
    public boolean f0;
    public final wg g0;
    public final rh5 h0;
    public final xz4 i0;
    public float j0;
    public final fu6 k0;
    public final boolean l0;
    public LayoutNode m0;
    public final g74 n0;
    public final d00 o0;
    public final d64 p0;
    public final vk1 q0;
    public final p64 r0;
    public final vk1 s0;
    public final q02 t0;
    public final m64 u0;
    public final y05 v0;
    public final rh5 w0;
    public final rh5 x0;
    public final y05 y0;
    public final zz2 z0;

    static {
        nw2 nw2Var = new nw2((byte) 1);
        uh3 uh3Var = new uh3((byte) 6);
        b1 b1Var = new b1(nw2Var, (byte) 11);
        ci8.i(1, uh3Var);
        A0 = new xd6(b1Var, uh3Var, (byte) 6);
    }

    public j74(int i, int i2) {
        hf1 hf1Var = new hf1();
        hf1Var.a = -1;
        hf1Var.d = -1;
        this.X = hf1Var;
        wg wgVar = new wg();
        wgVar.b = new oh5(i);
        wgVar.c = new oh5(i2);
        wgVar.e = new j64(i);
        this.g0 = wgVar;
        e74 e74Var = l74.a;
        lh4 lh4Var = lh4.i0;
        this.h0 = new rh5(e74Var, lh4Var);
        this.i0 = new xz4();
        this.k0 = new fu6(new vj2((Object) this, (byte) 13));
        this.l0 = true;
        this.n0 = new g74(this);
        this.o0 = new d00();
        this.p0 = new d64();
        this.q0 = new vk1((byte) 22);
        this.r0 = new p64(new qb(this, i));
        this.s0 = new vk1((Object) this, (byte) 23);
        this.t0 = new q02((Object) this, (byte) 15);
        this.u0 = new m64();
        dn8 dn8Var = dn8.a;
        this.v0 = new rh5(dn8Var, lh4Var);
        Boolean bool = Boolean.FALSE;
        this.w0 = z51.H(bool);
        this.x0 = z51.H(bool);
        this.y0 = new rh5(dn8Var, lh4Var);
        zz2 zz2Var = new zz2((byte) 8, false);
        ug8 ug8Var = ys0.j0;
        Float fValueOf = Float.valueOf(0.0f);
        zz2Var.Z = new qk(ug8Var, fValueOf, (wk) ug8Var.a.B(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.z0 = zz2Var;
    }

    public static Object f(j74 j74Var, int i, q51 q51Var) throws Throwable {
        j74Var.getClass();
        Object objI = j74Var.i(f15.X, new i74(j74Var, i, null, (byte) 0), q51Var);
        return objI == c71.X ? objI : dn8.a;
    }

    public final void a(e74 e74Var, boolean z, boolean z2) {
        ug8 ug8Var = ys0.j0;
        List list = e74Var.l;
        int i = e74Var.o;
        int i2 = e74Var.b;
        f74 f74Var = e74Var.a;
        this.r0.e = list.size();
        zz2 zz2Var = this.z0;
        wg wgVar = this.g0;
        q51 q51Var = null;
        if (!z && this.Y) {
            this.Z = e74Var;
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            try {
                if (((Number) ((qk) zz2Var.Z).Y.getValue()).floatValue() != 0.0f && f74Var != null && f74Var.a == ((oh5) wgVar.b).l() && i2 == ((oh5) wgVar.c).l()) {
                    og7 og7Var = (og7) zz2Var.Y;
                    if (og7Var != null) {
                        og7Var.m(null);
                    }
                    zz2Var.Z = new qk(ug8Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            }
        }
        if (z) {
            this.Y = true;
        }
        this.x0.setValue(Boolean.valueOf(((f74Var != null ? f74Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.w0.setValue(Boolean.valueOf(e74Var.c));
        this.j0 -= e74Var.d;
        this.h0.setValue(e74Var);
        if (z2) {
            wgVar.getClass();
            if (i2 < 0.0f) {
                zc3.c("scrollOffset should be non-negative");
            }
            ((oh5) wgVar.c).m(i2);
            zz2Var = zz2Var;
        } else {
            f74 f74Var2 = (f74) wv0.t0(list);
            f74 f74Var3 = (f74) wv0.B0(list);
            wa.O(f74Var2 != null ? f74Var2.a : -1L, "firstVisibleItem:index");
            wa.O(f74Var3 != null ? f74Var3.a : -1L, "lastVisibleItem:index");
            wgVar.getClass();
            wgVar.d = f74Var != null ? f74Var.i : null;
            if (wgVar.a || i > 0) {
                wgVar.a = true;
                if (i2 < 0.0f) {
                    zc3.c("scrollOffset should be non-negative");
                }
                wgVar.B(f74Var != null ? f74Var.a : 0, i2);
            }
            if (this.l0) {
                hf1 hf1Var = this.X;
                int i3 = hf1Var.a;
                boolean z3 = hf1Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != hf1.a(e74Var, z3)) {
                    hf1Var.a = -1;
                    o64 o64Var = hf1Var.b;
                    if (o64Var != null) {
                        o64Var.cancel();
                    }
                    hf1Var.b = null;
                }
                int i4 = hf1Var.d;
                if (i4 != -1 && hf1Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = hf1.a(e74Var, hf1Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        hf1Var.a = iA;
                        hf1Var.b = vk1.G(this.s0, iA);
                    }
                }
                hf1Var.d = i;
            }
        }
        if (z) {
            float f = e74Var.f;
            fi1 fi1Var = e74Var.i;
            b71 b71Var = e74Var.h;
            zz2Var.getClass();
            if (f <= fi1Var.h0(1.0f)) {
                return;
            }
            dd7 dd7VarD2 = yn0.D();
            gn2 gn2VarE2 = dd7VarD2 != null ? dd7VarD2.e() : null;
            dd7 dd7VarP2 = yn0.P(dd7VarD2);
            zz2 zz2Var2 = zz2Var;
            try {
                float fFloatValue = ((Number) ((qk) zz2Var2.Z).Y.getValue()).floatValue();
                og7 og7Var2 = (og7) zz2Var2.Y;
                if (og7Var2 != null) {
                    og7Var2.m(null);
                }
                qk qkVar = (qk) zz2Var2.Z;
                if (qkVar.h0) {
                    zz2Var2.Z = z68.u(qkVar, fFloatValue - f, 0.0f, 30);
                } else {
                    zz2Var2.Z = new qk(ug8Var, Float.valueOf(-f), null, 60);
                }
                zz2Var2.Y = w51.G(b71Var, null, null, new r5((Object) zz2Var2, q51Var, (byte) 17), 3);
            } finally {
                yn0.c0(dd7VarD2, dd7VarP2, gn2VarE2);
            }
        }
    }

    @Override // defpackage.ny6
    public final boolean b() {
        return this.k0.b();
    }

    public final int c() {
        return ((oh5) this.g0.b).l();
    }

    public final e74 d() {
        return (e74) this.h0.getValue();
    }

    public final void e(float f, e74 e74Var) {
        o64 o64Var;
        o64 o64Var2;
        if (this.l0) {
            boolean zIsEmpty = e74Var.l.isEmpty();
            hf1 hf1Var = this.X;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = hf1.a(e74Var, z);
                if (iA >= 0 && iA < e74Var.o) {
                    if (iA != hf1Var.a) {
                        if (hf1Var.c != z) {
                            hf1Var.a = -1;
                            o64 o64Var3 = hf1Var.b;
                            if (o64Var3 != null) {
                                o64Var3.cancel();
                            }
                            hf1Var.b = null;
                        }
                        hf1Var.c = z;
                        hf1Var.a = iA;
                        hf1Var.b = vk1.G(this.s0, iA);
                    }
                    List list = e74Var.l;
                    if (z) {
                        f74 f74Var = (f74) wv0.A0(list);
                        if (((f74Var.m + f74Var.n) + e74Var.r) - e74Var.n < (-f) && (o64Var2 = hf1Var.b) != null) {
                            o64Var2.g();
                        }
                    } else if (e74Var.m - ((f74) wv0.r0(list)).m < f && (o64Var = hf1Var.b) != null) {
                        o64Var.g();
                    }
                }
            }
            hf1Var.e = f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
    
        if (r3 == r8) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ny6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.f15 r19, defpackage.rn2 r20, defpackage.q51 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j74.i(f15, rn2, q51):java.lang.Object");
    }

    @Override // defpackage.ny6
    public final boolean j() {
        return ((Boolean) this.x0.getValue()).booleanValue();
    }

    @Override // defpackage.ny6
    public final boolean m() {
        return ((Boolean) this.w0.getValue()).booleanValue();
    }

    @Override // defpackage.ny6
    public final float n(float f) {
        return this.k0.n(f);
    }

    @Override // defpackage.ny6
    public final tx6 o() {
        return this.t0;
    }
}
