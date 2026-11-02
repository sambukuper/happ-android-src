package defpackage;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w22 extends ju {
    public final /* synthetic */ byte l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w22(ju juVar, d50 d50Var, ri8 ri8Var, ar3 ar3Var, Boolean bool, byte b) {
        super(juVar, d50Var, ri8Var, ar3Var, bool);
        this.l0 = b;
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        switch (this.l0) {
            case 0:
                return ((EnumSet) obj).isEmpty();
            case 1:
                return ((List) obj).isEmpty();
            case 2:
                return !((Iterable) obj).iterator().hasNext();
            default:
                return !((Iterator) obj).hasNext();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r2 == java.lang.Boolean.TRUE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r2 == java.lang.Boolean.TRUE) goto L38;
     */
    @Override // defpackage.ar3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r5, defpackage.ro3 r6, defpackage.t37 r7) throws java.io.IOException {
        /*
            r4 = this;
            byte r0 = r4.l0
            r1 = 1
            java.lang.Boolean r2 = r4.h0
            switch(r0) {
                case 0: goto L72;
                case 1: goto L4c;
                case 2: goto L14;
                default: goto L8;
            }
        L8:
            java.util.Iterator r5 = (java.util.Iterator) r5
            r6.J0(r5)
            r4.u(r5, r6, r7)
            r6.D()
            return
        L14:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            if (r2 != 0) goto L22
            n37 r0 = defpackage.n37.v0
            l37 r3 = r7.X
            boolean r0 = r3.j(r0)
            if (r0 != 0) goto L26
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r2 != r0) goto L42
        L26:
            if (r5 == 0) goto L3b
            java.util.Iterator r0 = r5.iterator()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            r0.next()
            boolean r0 = r0.hasNext()
            r0 = r0 ^ r1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L42
            r4.s(r5, r6, r7)
            goto L4b
        L42:
            r6.J0(r5)
            r4.s(r5, r6, r7)
            r6.D()
        L4b:
            return
        L4c:
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            if (r0 != r1) goto L68
            if (r2 != 0) goto L60
            n37 r0 = defpackage.n37.v0
            l37 r1 = r7.X
            boolean r0 = r1.j(r0)
            if (r0 != 0) goto L64
        L60:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r2 != r0) goto L68
        L64:
            r4.v(r5, r6, r7)
            goto L71
        L68:
            r6.V0(r5)
            r4.v(r5, r6, r7)
            r6.D()
        L71:
            return
        L72:
            java.util.EnumSet r5 = (java.util.EnumSet) r5
            int r0 = r5.size()
            if (r0 != r1) goto L8e
            if (r2 != 0) goto L86
            n37 r0 = defpackage.n37.v0
            l37 r1 = r7.X
            boolean r0 = r1.j(r0)
            if (r0 != 0) goto L8a
        L86:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r2 != r0) goto L8e
        L8a:
            r4.t(r5, r6, r7)
            goto L97
        L8e:
            r6.V0(r5)
            r4.t(r5, r6, r7)
            r6.D()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.e(java.lang.Object, ro3, t37):void");
    }

    @Override // defpackage.e41
    public final e41 o(ri8 ri8Var) {
        switch (this.l0) {
            case 0:
                return this;
            case 1:
                return new w22((ju) this, this.f0, ri8Var, this.j0, this.h0, (byte) 1);
            case 2:
                return new w22((ju) this, this.f0, ri8Var, this.j0, this.h0, (byte) 2);
            default:
                return new w22((ju) this, this.f0, ri8Var, this.j0, this.h0, (byte) 3);
        }
    }

    @Override // defpackage.ju
    public final /* bridge */ /* synthetic */ void q(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        switch (this.l0) {
            case 0:
                t((EnumSet) obj, ro3Var, t37Var);
                break;
            case 1:
                v((List) obj, ro3Var, t37Var);
                break;
            case 2:
                s((Iterable) obj, ro3Var, t37Var);
                break;
            default:
                u((Iterator) obj, ro3Var, t37Var);
                break;
        }
    }

    @Override // defpackage.ju
    public final ju r(d50 d50Var, ri8 ri8Var, ar3 ar3Var, Boolean bool) {
        switch (this.l0) {
            case 0:
                return new w22((ju) this, d50Var, ri8Var, ar3Var, bool, (byte) 0);
            case 1:
                return new w22((ju) this, d50Var, ri8Var, ar3Var, bool, (byte) 1);
            case 2:
                return new w22((ju) this, d50Var, ri8Var, ar3Var, bool, (byte) 2);
            default:
                return new w22((ju) this, d50Var, ri8Var, ar3Var, bool, (byte) 3);
        }
    }

    public void s(Iterable iterable, ro3 ro3Var, t37 t37Var) {
        ar3 ar3Var;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Class<?> cls = null;
            ar3 ar3VarQ = null;
            do {
                Object next = it.next();
                if (next == null) {
                    t37Var.h(ro3Var);
                } else {
                    ar3 ar3Var2 = this.j0;
                    if (ar3Var2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            ar3VarQ = t37Var.q(cls2, this.f0);
                            cls = cls2;
                        }
                        ar3Var = ar3VarQ;
                    } else {
                        ar3Var = ar3VarQ;
                        ar3VarQ = ar3Var2;
                    }
                    ri8 ri8Var = this.i0;
                    if (ri8Var == null) {
                        ar3VarQ.e(next, ro3Var, t37Var);
                    } else {
                        ar3VarQ.f(next, ro3Var, t37Var, ri8Var);
                    }
                    ar3VarQ = ar3Var;
                }
            } while (it.hasNext());
        }
    }

    public void t(EnumSet enumSet, ro3 ro3Var, t37 t37Var) {
        ro3Var.m(enumSet);
        Iterator it = enumSet.iterator();
        ar3 ar3VarJ = this.j0;
        while (it.hasNext()) {
            Enum r1 = (Enum) it.next();
            if (ar3VarJ == null) {
                ar3VarJ = t37Var.j(r1.getDeclaringClass(), this.f0);
            }
            ar3VarJ.e(r1, ro3Var, t37Var);
        }
    }

    public void u(Iterator it, ro3 ro3Var, t37 t37Var) {
        if (it.hasNext()) {
            ri8 ri8Var = this.i0;
            ar3 ar3Var = this.j0;
            if (ar3Var != null) {
                do {
                    Object next = it.next();
                    if (next == null) {
                        t37Var.h(ro3Var);
                    } else if (ri8Var == null) {
                        ar3Var.e(next, ro3Var, t37Var);
                    } else {
                        ar3Var.f(next, ro3Var, t37Var, ri8Var);
                    }
                } while (it.hasNext());
                return;
            }
            g33 g33Var = this.k0;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    t37Var.h(ro3Var);
                } else {
                    Class<?> cls = next2.getClass();
                    ar3 ar3VarR = g33Var.R(cls);
                    if (ar3VarR == null) {
                        dh8 dh8Var = this.Z;
                        if (dh8Var.F0()) {
                            ar3VarR = p(g33Var, t37Var.e(dh8Var, cls), t37Var);
                        } else {
                            ar3VarR = t37Var.j(cls, this.f0);
                            g33 g33VarJ = g33Var.J(cls, ar3VarR);
                            if (g33Var != g33VarJ) {
                                this.k0 = g33VarJ;
                            }
                        }
                        g33Var = this.k0;
                    }
                    if (ri8Var == null) {
                        ar3VarR.e(next2, ro3Var, t37Var);
                    } else {
                        ar3VarR.f(next2, ro3Var, t37Var, ri8Var);
                    }
                }
            } while (it.hasNext());
        }
    }

    public void v(List list, ro3 ro3Var, t37 t37Var) throws IOException {
        int i = 0;
        ri8 ri8Var = this.i0;
        ar3 ar3Var = this.j0;
        if (ar3Var != null) {
            int size = list.size();
            if (size == 0) {
                return;
            }
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    try {
                        t37Var.h(ro3Var);
                    } catch (Exception e) {
                        lj7.m(t37Var, e, list, i);
                        throw null;
                    }
                } else if (ri8Var == null) {
                    ar3Var.e(obj, ro3Var, t37Var);
                } else {
                    ar3Var.f(obj, ro3Var, t37Var, ri8Var);
                }
                i++;
            }
            return;
        }
        d50 d50Var = this.f0;
        dh8 dh8Var = this.Z;
        if (ri8Var != null) {
            int size2 = list.size();
            if (size2 == 0) {
                return;
            }
            try {
                g33 g33Var = this.k0;
                while (i < size2) {
                    Object obj2 = list.get(i);
                    if (obj2 == null) {
                        t37Var.h(ro3Var);
                    } else {
                        Class<?> cls = obj2.getClass();
                        ar3 ar3VarR = g33Var.R(cls);
                        if (ar3VarR == null) {
                            if (dh8Var.F0()) {
                                ar3VarR = p(g33Var, t37Var.e(dh8Var, cls), t37Var);
                            } else {
                                ar3VarR = t37Var.j(cls, d50Var);
                                g33 g33VarJ = g33Var.J(cls, ar3VarR);
                                if (g33Var != g33VarJ) {
                                    this.k0 = g33VarJ;
                                }
                            }
                            g33Var = this.k0;
                        }
                        ar3VarR.f(obj2, ro3Var, t37Var, ri8Var);
                    }
                    i++;
                }
                return;
            } catch (Exception e2) {
                lj7.m(t37Var, e2, list, i);
                throw null;
            }
        }
        int size3 = list.size();
        if (size3 == 0) {
            return;
        }
        try {
            g33 g33Var2 = this.k0;
            while (i < size3) {
                Object obj3 = list.get(i);
                if (obj3 == null) {
                    t37Var.h(ro3Var);
                } else {
                    Class<?> cls2 = obj3.getClass();
                    ar3 ar3VarR2 = g33Var2.R(cls2);
                    if (ar3VarR2 == null) {
                        if (dh8Var.F0()) {
                            ar3VarR2 = p(g33Var2, t37Var.e(dh8Var, cls2), t37Var);
                        } else {
                            ar3VarR2 = t37Var.j(cls2, d50Var);
                            g33 g33VarJ2 = g33Var2.J(cls2, ar3VarR2);
                            if (g33Var2 != g33VarJ2) {
                                this.k0 = g33VarJ2;
                            }
                        }
                        g33Var2 = this.k0;
                    }
                    ar3VarR2.e(obj3, ro3Var, t37Var);
                }
                i++;
            }
        } catch (Exception e3) {
            lj7.m(t37Var, e3, list, i);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w22(Class cls, dh8 dh8Var, boolean z, ri8 ri8Var, ar3 ar3Var, byte b) {
        super(cls, dh8Var, z, ri8Var, ar3Var);
        this.l0 = b;
    }
}
