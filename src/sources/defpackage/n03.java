package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n03 {
    public final y24 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final j05 f = new j05();
    public final n55 g = new n55();
    public final a05 h = new a05(10);

    public n03(y24 y24Var) {
        this.a = y24Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    public final void a(long j, List list, boolean z) {
        a05 a05Var;
        long[] jArr;
        c55 c55Var;
        Object objD;
        Object obj;
        int size = list.size();
        n55 n55Var = this.g;
        n55 n55Var2 = n55Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            a05Var = this.h;
            if (i >= size) {
                break;
            }
            jx4 jx4Var = (jx4) list.get(i);
            if (jx4Var.p0) {
                jx4Var.o0 = new p5(this, jx4Var, (byte) 28);
                if (z2) {
                    c15 c15Var = n55Var2.a;
                    Object[] objArr = c15Var.X;
                    int i2 = c15Var.Z;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((c55) obj).c.equals(jx4Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    c55Var = (c55) obj;
                    if (c55Var != null) {
                        c55Var.i = true;
                        c55Var.d.a(j);
                        if (z) {
                            Object objD2 = a05Var.d(j);
                            if (objD2 == null) {
                                objD2 = new j05();
                                a05Var.g(j, objD2);
                            }
                            ((j05) objD2).a(c55Var);
                        }
                    } else {
                        z2 = false;
                        c55Var = new c55(jx4Var);
                        c55Var.d.a(j);
                        if (z) {
                            objD = a05Var.d(j);
                            if (objD == null) {
                                objD = new j05();
                                a05Var.g(j, objD);
                            }
                            ((j05) objD).a(c55Var);
                        }
                        n55Var2.a.b(c55Var);
                    }
                } else {
                    c55Var = new c55(jx4Var);
                    c55Var.d.a(j);
                    if (z) {
                        objD = a05Var.d(j);
                        if (objD == null) {
                            objD = new j05();
                            a05Var.g(j, objD);
                        }
                        ((j05) objD).a(c55Var);
                    }
                    n55Var2.a.b(c55Var);
                }
                n55Var2 = c55Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = a05Var.b;
            Object[] objArr2 = a05Var.c;
            long[] jArr3 = a05Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                j05 j05Var = (j05) objArr2[i8];
                                c15 c15Var2 = n55Var.a;
                                Object[] objArr3 = c15Var2.X;
                                int i9 = c15Var2.Z;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((c55) objArr3[i10]).f(j3, j05Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        a05Var.a();
    }

    public final boolean b(zz2 zz2Var, boolean z) {
        n55 n55Var = this.g;
        c15 c15Var = n55Var.a;
        if (!n55Var.a((qi4) zz2Var.Y, this.a, zz2Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((c55) objArr[i2]).e(zz2Var, z) || z3;
        }
        Object[] objArr2 = c15Var.X;
        int i3 = c15Var.Z;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((c55) objArr2[i4]).d(zz2Var) || z4;
        }
        n55Var.b(zz2Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            j05 j05Var = this.f;
            int i5 = j05Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((jx4) j05Var.g(i6));
            }
            j05Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            n55Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        n55 n55Var = this.g;
        c15 c15Var = n55Var.a;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            ((c55) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            n55Var.a.g();
        }
    }

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
    public final void d(jx4 jx4Var) {
        if (this.b) {
            this.e = true;
            this.f.a(jx4Var);
            return;
        }
        n55 n55Var = this.g;
        j05 j05Var = n55Var.b;
        j05Var.d();
        j05Var.a(n55Var);
        while (j05Var.j()) {
            n55 n55Var2 = (n55) j05Var.l(j05Var.b - 1);
            int i = 0;
            while (true) {
                c15 c15Var = n55Var2.a;
                if (i < c15Var.Z) {
                    c55 c55Var = (c55) c15Var.X[i];
                    if (c55Var.c.equals(jx4Var)) {
                        n55Var2.a.j(c55Var);
                        c55Var.c();
                    } else {
                        j05Var.a(c55Var);
                        i++;
                    }
                }
            }
        }
    }
}
