package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ob3 extends lj7 implements p51 {
    public static final ob3 g0 = new ob3((byte) 0);
    public static final ob3 h0 = new ob3((byte) 1);
    public final Boolean Z;
    public final /* synthetic */ byte f0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ob3(byte b) {
        this(List.class);
        this.f0 = b;
        switch (b) {
            case 1:
                this(Collection.class);
                break;
            default:
                break;
        }
    }

    public static void o(List list, ro3 ro3Var, t37 t37Var, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String str = (String) list.get(i2);
                if (str == null) {
                    t37Var.h(ro3Var);
                } else {
                    ro3Var.c1(str);
                }
            } catch (Exception e) {
                lj7.m(t37Var, e, list, i2);
                throw null;
            }
        }
    }

    public static void p(Collection collection, ro3 ro3Var, t37 t37Var) throws IOException {
        int i = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    t37Var.h(ro3Var);
                } else {
                    ro3Var.c1(str);
                }
                i++;
            }
        } catch (Exception e) {
            lj7.m(t37Var, e, collection, i);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // defpackage.p51
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
        no3 no3VarK = lj7.k(t37Var, d50Var, this.X);
        Boolean boolA = no3VarK != null ? no3VarK.a(ko3.X) : null;
        ar3 ar3VarJ = lj7.j(t37Var, d50Var, ar3VarD);
        if (ar3VarJ == null) {
            ar3VarJ = t37Var.j(String.class, d50Var);
        }
        if (!it0.r(ar3VarJ)) {
            return new uv0(t37Var.s().b(null, String.class, uh8.f0), true, null, ar3VarJ);
        }
        if (Objects.equals(boolA, this.Z)) {
            return this;
        }
        switch (this.f0) {
            case 0:
                return new ob3(this, boolA, (byte) 0);
            default:
                return new ob3(this, boolA, (byte) 1);
        }
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((Collection) obj).isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r4 == java.lang.Boolean.TRUE) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r4 == java.lang.Boolean.TRUE) goto L21;
     */
    @Override // defpackage.ar3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r5, defpackage.ro3 r6, defpackage.t37 r7) throws java.io.IOException {
        /*
            r4 = this;
            byte r0 = r4.f0
            r1 = 1
            java.lang.Boolean r4 = r4.Z
            switch(r0) {
                case 0: goto L2e;
                default: goto L8;
            }
        L8:
            java.util.Collection r5 = (java.util.Collection) r5
            int r0 = r5.size()
            if (r0 != r1) goto L24
            if (r4 != 0) goto L1c
            n37 r0 = defpackage.n37.v0
            l37 r1 = r7.X
            boolean r0 = r1.j(r0)
            if (r0 != 0) goto L20
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r4 != r0) goto L24
        L20:
            p(r5, r6, r7)
            goto L2d
        L24:
            r6.V0(r5)
            p(r5, r6, r7)
            r6.D()
        L2d:
            return
        L2e:
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            if (r0 != r1) goto L4a
            if (r4 != 0) goto L42
            n37 r2 = defpackage.n37.v0
            l37 r3 = r7.X
            boolean r2 = r3.j(r2)
            if (r2 != 0) goto L46
        L42:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            if (r4 != r2) goto L4a
        L46:
            o(r5, r6, r7, r1)
            goto L53
        L4a:
            r6.V0(r5)
            o(r5, r6, r7, r0)
            r6.D()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob3.e(java.lang.Object, ro3, t37):void");
    }

    @Override // defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws IOException {
        switch (this.f0) {
            case 0:
                List list = (List) obj;
                z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(list, gr3.START_ARRAY));
                ro3Var.m(list);
                o(list, ro3Var, t37Var, list.size());
                ri8Var.f(ro3Var, z76VarE);
                break;
            default:
                Collection collection = (Collection) obj;
                z76 z76VarE2 = ri8Var.e(ro3Var, ri8Var.d(collection, gr3.START_ARRAY));
                ro3Var.m(collection);
                p(collection, ro3Var, t37Var);
                ri8Var.f(ro3Var, z76VarE2);
                break;
        }
    }

    public ob3(Class cls) {
        super(0, cls);
        this.Z = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob3(ob3 ob3Var, Boolean bool, byte b) {
        super(ob3Var);
        this.f0 = b;
        this.Z = bool;
    }
}
