package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class np3 extends z75 implements Serializable {
    public static final l20 i0;
    public final io3 X;
    public l37 Y;
    public final qf1 Z;
    public j50 f0;
    public il1 g0;
    public LinkedHashSet h0;

    static {
        fj3 fj3Var = new fj3();
        fj3Var.X = new c24(48, 48);
        fj3Var.Y = true;
        i0 = new l20(null, fj3Var, uh8.Z, ej7.n0, Locale.getDefault(), m10.a, new md0((byte) 6));
    }

    public np3() {
        io3 io3Var = new io3(null);
        new ConcurrentHashMap(64, 0.6f, 2);
        this.X = io3Var;
        if (io3Var.f0 == null) {
            io3Var.f0 = this;
        }
        mj7 mj7Var = new mj7();
        c24 c24Var = new c24();
        c24Var.X = new c24(20, MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE);
        dh8[] dh8VarArr = uh8.Y;
        u97 u97Var = new u97();
        b30 b30Var = new b30();
        l20 l20Var = i0;
        l20 l20Var2 = l20Var.Y == b30Var ? l20Var : new l20(b30Var, l20Var.Z, l20Var.X, l20Var.g0, l20Var.h0, l20Var.i0, l20Var.f0);
        ep3 ep3Var = ep3.g0;
        md0 md0Var = new md0((byte) 5);
        int[] iArr = new int[oz4.X];
        ov0 ov0Var = new ov0();
        pb1 pb1Var = ob1.a;
        this.Y = new l37(l20Var2, mj7Var, u97Var, c24Var, md0Var, pb1Var);
        this.g0 = new il1(l20Var2, mj7Var, u97Var, c24Var, md0Var, ov0Var, pb1Var);
        l37 l37Var = this.Y;
        xp4 xp4Var = xp4.v0;
        if (l37Var.f(xp4Var)) {
            c(xp4Var, false);
        }
        this.Z = new qf1();
        new c24(Math.min(64, 500), 2000);
        new HashMap(8);
        new ReentrantLock();
        this.f0 = j50.j0;
    }

    public final qf1 a(l37 l37Var) {
        j50 j50Var = this.f0;
        qf1 qf1Var = this.Z;
        qf1Var.getClass();
        return new qf1(qf1Var, l37Var, j50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(r59 r59Var, ds0 ds0Var) throws IOException {
        l37 l37Var = this.Y;
        if (!l37Var.j(n37.l0) || !(ds0Var instanceof Closeable)) {
            try {
                a(l37Var).F(r59Var, ds0Var);
                r59Var.close();
                return;
            } catch (Exception e) {
                Annotation[] annotationArr = it0.a;
                r59Var.j1(qo3.f0);
                try {
                    r59Var.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                it0.w(e);
                u52.q(e);
                return;
            }
        }
        Closeable closeable = (Closeable) ds0Var;
        try {
            a(l37Var).F(r59Var, ds0Var);
            try {
                closeable.close();
                r59Var.close();
            } catch (Exception e3) {
                e = e3;
                closeable = null;
                it0.f(r59Var, closeable, e);
                throw null;
            }
        } catch (Exception e4) {
            e = e4;
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
    public final void c(xp4 xp4Var, boolean z) {
        l37 l37VarG;
        il1 il1VarG;
        l37 l37Var = this.Y;
        if (z) {
            long j = l37Var.X;
            long j2 = new xp4[]{xp4Var}[0].Y | j;
            if (j2 != j) {
                l37VarG = l37Var;
                l37VarG = l37Var.g(j2);
            }
        } else {
            long j3 = l37Var.X;
            long j4 = (~new xp4[]{xp4Var}[0].Y) & j3;
            if (j4 != j3) {
                l37VarG = l37Var;
                l37VarG = l37Var.g(j4);
            }
        }
        l37VarG = l37Var;
        l37VarG = l37Var;
        this.Y = l37VarG;
        il1 il1Var = this.g0;
        if (z) {
            long j5 = il1Var.X;
            long j6 = new xp4[]{xp4Var}[0].Y | j5;
            if (j6 != j5) {
                il1VarG = il1Var;
                il1VarG = il1Var.g(j6);
            }
        } else {
            long j7 = il1Var.X;
            long j8 = (~new xp4[]{xp4Var}[0].Y) & j7;
            if (j8 != j7) {
                il1VarG = il1Var;
                il1VarG = il1Var.g(j8);
            }
        }
        il1VarG = il1Var;
        il1VarG = il1Var;
        this.g0 = il1VarG;
    }

    public final r59 d(ih4 ih4Var) {
        it5 it5VarH;
        io3 io3Var = this.X;
        x41 x41Var = new x41(ih4Var, io3Var.g0);
        m90 m90VarA = ((b38) ih4Var.Y).a;
        boolean z = m90VarA != null;
        if (m90VarA == null) {
            m90VarA = (!ie2.a(4, io3Var.X) ? sq3.Y : io3Var.Z).a();
        }
        k43 k43Var = new k43(io3Var.h0, m90VarA, x41Var);
        if (z) {
            k43Var.Z = false;
        }
        r59 r59Var = new r59(k43Var, io3Var.Y, io3Var.f0, ih4Var, io3Var.j0);
        r37 r37Var = io3Var.i0;
        if (r37Var != io3.m0) {
            r59Var.n0 = r37Var;
        }
        l37 l37Var = this.Y;
        l37Var.getClass();
        n37 n37Var = n37.f0;
        int i = l37Var.n0;
        if ((n37Var.Y & i) != 0 && r59Var.X == null && (it5VarH = l37Var.h()) != null) {
            r59Var.X = it5VarH;
        }
        boolean z2 = (n37.w0.Y & i) != 0;
        if (z2) {
            int i2 = z2 ? qo3.l0.Y : 0;
            int i3 = i2;
            int i4 = r59Var.Z;
            int i5 = (i2 & i3) | ((~i3) & i4);
            int i6 = i4 ^ i5;
            if (i6 != 0) {
                r59Var.Z = i5;
                if ((eq2.j0 & i6) != 0) {
                    r59Var.g0 = qo3.k0.a(i5);
                    qo3 qo3Var = qo3.j0;
                    if (qo3Var.a(i6)) {
                        if (qo3Var.a(i5)) {
                            r59Var.m0 = 127;
                        } else {
                            r59Var.m0 = 0;
                        }
                    }
                    qo3 qo3Var2 = qo3.m0;
                    if (qo3Var2.a(i6)) {
                        boolean zA = qo3Var2.a(i5);
                        fs3 fs3Var = r59Var.h0;
                        if (!zA) {
                            fs3Var.e = null;
                            r59Var.h0 = fs3Var;
                        } else if (fs3Var.e == null) {
                            fs3Var.e = new z47(r59Var);
                            r59Var.h0 = fs3Var;
                        }
                    }
                }
                r59Var.o0 = !qo3.h0.a(i5);
                r59Var.p0 = qo3.o0.a(i5);
            }
        }
        return r59Var;
    }

    public final void e(rx4 rx4Var) {
        if (rx4Var == null) {
            bt.q("argument \"module\" is null");
            return;
        }
        v97 v97Var = (v97) rx4Var;
        String str = v97Var.X;
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            e((rx4) it.next());
        }
        if (this.Y.f(xp4.D0)) {
            LinkedHashSet linkedHashSet = this.h0;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.h0 = linkedHashSet;
            }
            if (!linkedHashSet.add(str)) {
                return;
            }
        }
        y97 y97Var = v97Var.Y;
        if (y97Var != null) {
            j50 j50Var = this.f0;
            s37 s37Var = j50Var.g0;
            Object[] objArr = s37Var.X;
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
                    if (length > 0) {
                        System.arraycopy(objArr, 0, objArr2, 1, length);
                    }
                    objArr2[0] = y97Var;
                    objArr = objArr2;
                    break;
                }
                if (objArr[i] == y97Var) {
                    if (i == 0) {
                        break;
                    }
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                    System.arraycopy(objArr, 0, objArr3, 1, i);
                    objArr3[0] = y97Var;
                    int i2 = i + 1;
                    int i3 = length - i2;
                    if (i3 > 0) {
                        System.arraycopy(objArr, i2, objArr3, i2, i3);
                    }
                    objArr = objArr3;
                    break;
                }
                i++;
            }
            s37 s37Var2 = new s37((u37[]) objArr, s37Var.Y, s37Var.Z);
            if (j50Var.g0 != s37Var2) {
                j50Var = new j50(s37Var2);
            }
            this.f0 = j50Var;
        }
    }

    public final String f(ds0 ds0Var) throws lq3 {
        io3 io3Var = this.X;
        try {
            ih4 ih4Var = new ih4((!ie2.a(4, io3Var.X) ? sq3.Y : io3Var.Z).a());
            try {
                b(d(ih4Var), ds0Var);
                return ih4Var.p();
            } catch (Throwable th) {
                throw th;
            }
        } catch (lq3 e) {
            throw e;
        } catch (IOException e2) {
            throw new pp3(null, "Unexpected IOException (of type " + e2.getClass().getName() + "): " + it0.h(e2));
        }
    }
}
