package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oe5 implements AutoCloseable {
    public final se5 X;
    public final Object Y;
    public boolean Z;
    public long f0;
    public long g0;
    public long h0;
    public long i0;
    public long j0;
    public final ArrayList k0;
    public final LinkedHashMap l0;

    public oe5(se5 se5Var) {
        se5Var.getClass();
        this.X = se5Var;
        this.Y = new Object();
        this.f0 = 1L;
        this.g0 = Long.MIN_VALUE;
        this.h0 = Long.MIN_VALUE;
        this.i0 = Long.MIN_VALUE;
        this.j0 = Long.MIN_VALUE;
        this.k0 = new ArrayList();
        this.l0 = new LinkedHashMap();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.Y) {
            if (this.Z) {
                return;
            }
            this.Z = true;
            ArrayList arrayListZ0 = wv0.Z0(this.l0.values());
            this.l0.clear();
            ArrayList<ne5> arrayList = new ArrayList(this.k0);
            this.k0.clear();
            Iterator it = arrayListZ0.iterator();
            while (it.hasNext()) {
                Object obj = ((te5) it.next()).a;
            }
            for (ne5 ne5Var : arrayList) {
                ne5Var.getClass();
                ne5Var.a(-1L, new ve5(11));
            }
        }
    }

    public final void g(long j) {
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    return;
                }
                this.i0 = j;
                Iterator it = this.k0.iterator();
                ne5 ne5Var = null;
                boolean z = false;
                Object obj = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (z) {
                            break;
                        }
                    } else {
                        Object next = it.next();
                        if (((ne5) next).b == j) {
                            if (!z) {
                                obj = next;
                                z = true;
                            }
                        }
                    }
                    obj = null;
                    break;
                }
                ne5 ne5Var2 = (ne5) obj;
                if (ne5Var2 != null) {
                    this.j0 = ne5Var2.e;
                    this.k0.remove(ne5Var2);
                    ne5Var = ne5Var2;
                }
                if (ne5Var != null) {
                    ne5Var.a(-1L, new ve5(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(long j, Object obj) {
        Object te5Var;
        ArrayList<ne5> arrayList;
        Object next;
        synchronized (this.Y) {
            try {
                if (this.Z || this.X.a(this.j0, j)) {
                    te5Var = new te5(obj);
                } else {
                    Iterator it = this.k0.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!this.X.a(((ne5) next).e, j));
                    ne5 ne5Var = (ne5) next;
                    if (ne5Var != null) {
                        ArrayList arrayListP = p(ne5Var.d, ne5Var.e, ne5Var.a);
                        ne5Var.a(j, obj);
                        this.k0.remove(ne5Var);
                        arrayList = arrayListP;
                        te5Var = null;
                    } else {
                        this.l0.put(Long.valueOf(j), new te5(obj));
                        if (this.l0.size() > 3) {
                            te5Var = this.l0.remove(Long.valueOf(((Number) wv0.q0(this.l0.keySet())).longValue()));
                        } else {
                            te5Var = null;
                            arrayList = null;
                        }
                    }
                }
                arrayList = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        te5 te5Var2 = (te5) te5Var;
        if (te5Var2 != null) {
            Object obj2 = te5Var2.a;
            if ((obj2 instanceof ve5) || obj2 != null) {
            }
        }
        if (arrayList != null) {
            for (ne5 ne5Var2 : arrayList) {
                ne5Var2.getClass();
                ne5Var2.a(-1L, new ve5(12));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0119  */
    /* JADX WARN: Code duplicated, block: B:80:0x0123 A[LOOP:2: B:78:0x011d->B:80:0x0123, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:92:0x0156  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    public final void m(long j, long j2, long j3, me5 me5Var) throws Throwable {
        Object next;
        Object obj;
        Object next2;
        te5 te5Var;
        ArrayList<ne5> arrayListP;
        Object objRemove;
        boolean z;
        te5 te5Var2;
        Object ve5Var;
        Object obj2;
        Object next3;
        me5Var.getClass();
        Object obj3 = this.Y;
        synchronized (obj3) {
            try {
                Iterator it = this.k0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((ne5) next).b == j));
                ne5 ne5Var = (ne5) next;
                if (ne5Var != null) {
                    mm2.a(j);
                    ne5Var.toString();
                    return;
                }
                boolean z2 = this.Z;
                long j4 = this.f0;
                this.f0 = j4 + 1;
                try {
                    if (!z2 && this.i0 != j && this.j0 != j3) {
                        boolean z3 = j < this.h0;
                        if (!z3) {
                            this.h0 = j;
                        }
                        boolean z4 = j3 < this.g0;
                        if (!z4) {
                            this.g0 = j3;
                        }
                        boolean z5 = z3 || z4;
                        Iterator it2 = this.l0.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = obj3;
                                next3 = null;
                                break;
                            } else {
                                next3 = it2.next();
                                obj = obj3;
                                if (this.X.a(j3, ((Number) next3).longValue())) {
                                    break;
                                } else {
                                    obj3 = obj;
                                }
                            }
                        }
                        Long l = (Long) next3;
                        if (l != null) {
                            objRemove = this.l0.remove(l);
                            arrayListP = p(j4, j3, z5);
                            te5Var = null;
                        } else {
                            this.k0.add(new ne5(z5, j, j2, j4, j3, me5Var));
                            arrayListP = null;
                            te5Var = null;
                            objRemove = null;
                            z = false;
                        }
                        if (arrayListP != null) {
                            for (ne5 ne5Var2 : arrayListP) {
                                ne5Var2.getClass();
                                ne5Var2.a(-1L, new ve5(12));
                            }
                        }
                        if (te5Var != null) {
                            obj2 = te5Var.a;
                            if (!(obj2 instanceof ve5) || obj2 != null) {
                            }
                        }
                        if (z) {
                            if (z2) {
                                ve5Var = new ve5(11);
                            } else {
                                te5Var2 = (te5) objRemove;
                                if (te5Var2 != null) {
                                    ve5Var = te5Var2.a;
                                } else {
                                    ve5Var = new ve5(10);
                                }
                            }
                            me5Var.b(ve5Var);
                        }
                    }
                    obj = obj3;
                    Iterator it3 = this.l0.keySet().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!this.X.a(j3, ((Number) next2).longValue()));
                    Long l2 = (Long) next2;
                    te5Var = l2 != null ? (te5) this.l0.remove(l2) : null;
                    arrayListP = null;
                    objRemove = null;
                    z = true;
                    if (arrayListP != null) {
                        while (r0.hasNext()) {
                            ne5Var2.getClass();
                            ne5Var2.a(-1L, new ve5(12));
                        }
                    }
                    if (te5Var != null) {
                        obj2 = te5Var.a;
                        if (!(obj2 instanceof ve5)) {
                        }
                    }
                    if (z) {
                        if (z2) {
                            ve5Var = new ve5(11);
                        } else {
                            te5Var2 = (te5) objRemove;
                            if (te5Var2 != null) {
                                ve5Var = te5Var2.a;
                            } else {
                                ve5Var = new ve5(10);
                            }
                        }
                        me5Var.b(ve5Var);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final ArrayList p(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.k0;
        for (Object obj : arrayList2) {
            ne5 ne5Var = (ne5) obj;
            if (ne5Var.a == z && ne5Var.d < j && ne5Var.e < j2) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
