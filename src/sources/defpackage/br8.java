package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class br8 {
    public final jr8 a;
    public final k28 b;
    public final Object c;
    public ux0 d;
    public final qv e;
    public final kt f;
    public boolean g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public we6 l;
    public s7 m;
    public t7 n;
    public i00 o;
    public final xq8 p;
    public final qv q;

    public br8(jr8 jr8Var, k28 k28Var) {
        jr8Var.getClass();
        this.a = jr8Var;
        this.b = k28Var;
        this.c = new Object();
        this.e = nr4.f(0);
        this.f = new kt();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.p = new xq8(this);
        this.q = nr4.f(0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[Catch: all -> 0x0123, TryCatch #2 {, blocks: (B:24:0x0055, B:28:0x00a6, B:27:0x005f), top: B:87:0x0055, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af A[Catch: all -> 0x00c7, TryCatch #6 {all -> 0x00c7, blocks: (B:22:0x004f, B:23:0x0054, B:29:0x00ac, B:31:0x00af, B:33:0x00b7, B:35:0x00c4, B:34:0x00bd, B:39:0x00cc, B:40:0x00ce, B:42:0x00e8, B:43:0x00e9, B:45:0x00f0, B:46:0x00f1, B:47:0x00f2, B:49:0x00fa, B:50:0x00fd, B:52:0x010b, B:54:0x0118, B:53:0x0111, B:59:0x0124, B:60:0x0125, B:24:0x0055, B:28:0x00a6, B:27:0x005f, B:41:0x00cf), top: B:95:0x004f, outer: #1, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: all -> 0x00c7, TryCatch #6 {all -> 0x00c7, blocks: (B:22:0x004f, B:23:0x0054, B:29:0x00ac, B:31:0x00af, B:33:0x00b7, B:35:0x00c4, B:34:0x00bd, B:39:0x00cc, B:40:0x00ce, B:42:0x00e8, B:43:0x00e9, B:45:0x00f0, B:46:0x00f1, B:47:0x00f2, B:49:0x00fa, B:50:0x00fd, B:52:0x010b, B:54:0x0118, B:53:0x0111, B:59:0x0124, B:60:0x0125, B:24:0x0055, B:28:0x00a6, B:27:0x005f, B:41:0x00cf), top: B:95:0x004f, outer: #1, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd A[Catch: all -> 0x00c7, TryCatch #6 {all -> 0x00c7, blocks: (B:22:0x004f, B:23:0x0054, B:29:0x00ac, B:31:0x00af, B:33:0x00b7, B:35:0x00c4, B:34:0x00bd, B:39:0x00cc, B:40:0x00ce, B:42:0x00e8, B:43:0x00e9, B:45:0x00f0, B:46:0x00f1, B:47:0x00f2, B:49:0x00fa, B:50:0x00fd, B:52:0x010b, B:54:0x0118, B:53:0x0111, B:59:0x0124, B:60:0x0125, B:24:0x0055, B:28:0x00a6, B:27:0x005f, B:41:0x00cf), top: B:95:0x004f, outer: #1, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc A[Catch: all -> 0x00c7, TryCatch #6 {all -> 0x00c7, blocks: (B:22:0x004f, B:23:0x0054, B:29:0x00ac, B:31:0x00af, B:33:0x00b7, B:35:0x00c4, B:34:0x00bd, B:39:0x00cc, B:40:0x00ce, B:42:0x00e8, B:43:0x00e9, B:45:0x00f0, B:46:0x00f1, B:47:0x00f2, B:49:0x00fa, B:50:0x00fd, B:52:0x010b, B:54:0x0118, B:53:0x0111, B:59:0x0124, B:60:0x0125, B:24:0x0055, B:28:0x00a6, B:27:0x005f, B:41:0x00cf), top: B:95:0x004f, outer: #1, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa A[Catch: all -> 0x00c7, TryCatch #6 {all -> 0x00c7, blocks: (B:22:0x004f, B:23:0x0054, B:29:0x00ac, B:31:0x00af, B:33:0x00b7, B:35:0x00c4, B:34:0x00bd, B:39:0x00cc, B:40:0x00ce, B:42:0x00e8, B:43:0x00e9, B:45:0x00f0, B:46:0x00f1, B:47:0x00f2, B:49:0x00fa, B:50:0x00fd, B:52:0x010b, B:54:0x0118, B:53:0x0111, B:59:0x0124, B:60:0x0125, B:24:0x0055, B:28:0x00a6, B:27:0x005f, B:41:0x00cf), top: B:95:0x004f, outer: #1, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010b A[Catch: all -> 0x00c7, TryCatch #6 {all -> 0x00c7, blocks: (B:22:0x004f, B:23:0x0054, B:29:0x00ac, B:31:0x00af, B:33:0x00b7, B:35:0x00c4, B:34:0x00bd, B:39:0x00cc, B:40:0x00ce, B:42:0x00e8, B:43:0x00e9, B:45:0x00f0, B:46:0x00f1, B:47:0x00f2, B:49:0x00fa, B:50:0x00fd, B:52:0x010b, B:54:0x0118, B:53:0x0111, B:59:0x0124, B:60:0x0125, B:24:0x0055, B:28:0x00a6, B:27:0x005f, B:41:0x00cf), top: B:95:0x004f, outer: #1, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0111 A[Catch: all -> 0x00c7, TryCatch #6 {all -> 0x00c7, blocks: (B:22:0x004f, B:23:0x0054, B:29:0x00ac, B:31:0x00af, B:33:0x00b7, B:35:0x00c4, B:34:0x00bd, B:39:0x00cc, B:40:0x00ce, B:42:0x00e8, B:43:0x00e9, B:45:0x00f0, B:46:0x00f1, B:47:0x00f2, B:49:0x00fa, B:50:0x00fd, B:52:0x010b, B:54:0x0118, B:53:0x0111, B:59:0x0124, B:60:0x0125, B:24:0x0055, B:28:0x00a6, B:27:0x005f, B:41:0x00cf), top: B:95:0x004f, outer: #1, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0139 A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {, blocks: (B:68:0x0135, B:70:0x0139), top: B:84:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object a(s51 s51Var) {
        zq8 zq8Var;
        ea6 ea6Var;
        ea6 ea6Var2;
        ux0 ux0Var;
        AutoCloseable autoCloseable;
        ti0 ti0Var;
        ne6 ne6Var;
        ux0 ux0Var2;
        if (s51Var instanceof zq8) {
            zq8Var = (zq8) s51Var;
            int i = zq8Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                zq8Var.i0 = i - Integer.MIN_VALUE;
            } else {
                zq8Var = new zq8(this, s51Var);
            }
        } else {
            zq8Var = new zq8(this, s51Var);
        }
        Object obj = zq8Var.g0;
        c71 c71Var = c71.X;
        int i2 = zq8Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            ea6 ea6Var3 = new ea6();
            try {
                qi0 qi0VarA = this.a.a();
                zq8Var.f0 = ea6Var3;
                zq8Var.i0 = 1;
                Object objK = qi0VarA.k(zq8Var);
                if (objK == c71Var) {
                    return c71Var;
                }
                ea6Var2 = ea6Var3;
                obj = objK;
                autoCloseable = (AutoCloseable) obj;
                ti0Var = (ti0) autoCloseable;
                synchronized (this.c) {
                    if (this.j.isEmpty()) {
                        ne6Var = null;
                    } else {
                        we6 we6Var = this.l;
                        List listY0 = wv0.Y0(this.j);
                        LinkedHashMap linkedHashMapL = zp4.L(this.b.e(this.l), zp4.Q(this.h));
                        LinkedHashMap linkedHashMapS = zp4.S(this.i);
                        xu4 xu4Var = e18.b;
                        qv qvVar = this.e;
                        qvVar.getClass();
                        linkedHashMapS.put(xu4Var, new Integer(qv.b.incrementAndGet(qvVar)));
                        ArrayList arrayListZ0 = wv0.Z0(this.k);
                        arrayListZ0.add(this.p);
                        ne6Var = new ne6(listY0, linkedHashMapL, linkedHashMapS, arrayListZ0, we6Var, 32);
                    }
                    ux0Var2 = this.d;
                    this.g = false;
                    this.d = null;
                    if (ne6Var == null) {
                        if (ti0Var.X.a()) {
                            om0.l("Cannot call stopRepeating on ", ti0Var, " after close.");
                        } else {
                            ti0Var.Y.c(null);
                        }
                        ea6Var2.X = ux0Var2;
                    } else {
                        if (ux0Var2 != null) {
                            synchronized (this.c) {
                                this.f.addLast(new yq8(this.e.a, ux0Var2));
                                qv qvVar2 = this.q;
                                qvVar2.getClass();
                                new Integer(qv.b.incrementAndGet(qvVar2));
                            }
                        }
                        if (hi5.i0("CXCP")) {
                            Objects.toString(ne6Var);
                        }
                        ti0Var.getClass();
                        ne6Var.getClass();
                        if (ti0Var.X.a()) {
                            om0.l("Cannot call startRepeating on ", ti0Var, " after close.");
                        } else {
                            ti0Var.Y.c(ne6Var);
                        }
                        b(ti0Var, ne6Var.b);
                    }
                    u15.h(autoCloseable, null);
                }
            } catch (CancellationException unused) {
                ea6Var = ea6Var3;
                hi5.i0("CXCP");
                synchronized (this.c) {
                    if (this.g) {
                        this.g = false;
                        ea6Var.X = this.d;
                        this.d = null;
                    }
                    ea6Var2 = ea6Var;
                    ux0Var = (ux0) ea6Var2.X;
                    if (ux0Var != null) {
                        ux0Var.V(dn8.a);
                    }
                    return dn8.a;
                }
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6Var = zq8Var.f0;
            try {
                w39.n0(obj);
                ea6Var2 = ea6Var;
                try {
                    autoCloseable = (AutoCloseable) obj;
                    try {
                        ti0Var = (ti0) autoCloseable;
                        synchronized (this.c) {
                            if (this.j.isEmpty()) {
                                ne6Var = null;
                            } else {
                                we6 we6Var2 = this.l;
                                List listY1 = wv0.Y0(this.j);
                                LinkedHashMap linkedHashMapL2 = zp4.L(this.b.e(this.l), zp4.Q(this.h));
                                LinkedHashMap linkedHashMapS2 = zp4.S(this.i);
                                xu4 xu4Var2 = e18.b;
                                qv qvVar3 = this.e;
                                qvVar3.getClass();
                                linkedHashMapS2.put(xu4Var2, new Integer(qv.b.incrementAndGet(qvVar3)));
                                ArrayList arrayListZ1 = wv0.Z0(this.k);
                                arrayListZ1.add(this.p);
                                ne6Var = new ne6(listY1, linkedHashMapL2, linkedHashMapS2, arrayListZ1, we6Var2, 32);
                            }
                            ux0Var2 = this.d;
                            this.g = false;
                            this.d = null;
                        }
                        if (ne6Var == null) {
                            if (ti0Var.X.a()) {
                                ti0Var.Y.c(null);
                            } else {
                                om0.l("Cannot call stopRepeating on ", ti0Var, " after close.");
                            }
                            ea6Var2.X = ux0Var2;
                        } else {
                            if (ux0Var2 != null) {
                                synchronized (this.c) {
                                    this.f.addLast(new yq8(this.e.a, ux0Var2));
                                    qv qvVar4 = this.q;
                                    qvVar4.getClass();
                                }
                                new Integer(qv.b.incrementAndGet(qvVar4));
                            }
                            if (hi5.i0("CXCP")) {
                                Objects.toString(ne6Var);
                            }
                            ti0Var.getClass();
                            ne6Var.getClass();
                            if (ti0Var.X.a()) {
                                ti0Var.Y.c(ne6Var);
                            } else {
                                om0.l("Cannot call startRepeating on ", ti0Var, " after close.");
                            }
                            b(ti0Var, ne6Var.b);
                        }
                        u15.h(autoCloseable, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u15.h(autoCloseable, th);
                            throw th2;
                        }
                    }
                } catch (CancellationException unused2) {
                    ea6Var = ea6Var2;
                    hi5.i0("CXCP");
                    synchronized (this.c) {
                        if (this.g) {
                            this.g = false;
                            ea6Var.X = this.d;
                            this.d = null;
                        }
                    }
                    ea6Var2 = ea6Var;
                }
            } catch (CancellationException unused3) {
                hi5.i0("CXCP");
                synchronized (this.c) {
                    if (this.g) {
                        this.g = false;
                        ea6Var.X = this.d;
                        this.d = null;
                    }
                    ea6Var2 = ea6Var;
                    ux0Var = (ux0) ea6Var2.X;
                    if (ux0Var != null) {
                        ux0Var.V(dn8.a);
                    }
                    return dn8.a;
                }
            }
        }
        ux0Var = (ux0) ea6Var2.X;
        if (ux0Var != null) {
            ux0Var.V(dn8.a);
        }
        return dn8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ti0 ti0Var, Map map) {
        s7 s7VarZ;
        t7 t7Var;
        Object next;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        key.getClass();
        Object obj = null;
        Object obj2 = map != null ? map.get(key) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            List list = s7.b;
            s7VarZ = i21.z(iIntValue);
        } else {
            s7VarZ = null;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
        key2.getClass();
        Object obj3 = map != null ? map.get(key2) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Iterator it = t7.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((t7) next).a != iIntValue2);
            t7Var = (t7) next;
        } else {
            t7Var = null;
        }
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        key3.getClass();
        Object obj4 = map != null ? map.get(key3) : null;
        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (Object obj5 : i00.b) {
                if (((i00) obj5).a == iIntValue3) {
                    obj = obj5;
                    break;
                }
            }
            obj = (i00) obj;
        }
        i00 i00Var = obj;
        boolean z = false;
        boolean z2 = (s7VarZ == null || s7VarZ.equals(this.m)) ? false : true;
        boolean z3 = (t7Var == null || t7Var.equals(this.n)) ? false : true;
        if (i00Var != 0 && !i00Var.equals(this.o)) {
            z = true;
        }
        if (z2 || z3 || z) {
            if (hi5.i0("CXCP")) {
                Objects.toString(s7VarZ);
                Objects.toString(t7Var);
                Objects.toString(i00Var);
            }
            uh0.g(ti0Var, s7VarZ, t7Var, i00Var, null, null, null, 56);
            if (s7VarZ != null) {
                this.m = s7VarZ;
            }
            if (t7Var != null) {
                this.n = t7Var;
            }
            if (i00Var != 0) {
                this.o = i00Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(LinkedHashMap linkedHashMap, Map map, Set set, we6 we6Var, Set set2, s51 s51Var) {
        ar8 ar8Var;
        ea6 ea6Var;
        if (s51Var instanceof ar8) {
            ar8Var = (ar8) s51Var;
            int i = ar8Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ar8Var.i0 = i - Integer.MIN_VALUE;
            } else {
                ar8Var = new ar8(this, s51Var);
            }
        } else {
            ar8Var = new ar8(this, s51Var);
        }
        Object obj = ar8Var.g0;
        Object obj2 = c71.X;
        int i2 = ar8Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            ea6 ea6Var2 = new ea6();
            synchronized (this.c) {
                try {
                    if (hi5.i0("CXCP")) {
                        Objects.toString(linkedHashMap);
                        Objects.toString(map);
                        Objects.toString(set);
                        Objects.toString(we6Var);
                    }
                    if (linkedHashMap != null) {
                        this.h.clear();
                        this.h.putAll(linkedHashMap);
                    }
                    if (map != null) {
                        this.i.clear();
                        this.i.putAll(map);
                    }
                    if (set != null) {
                        this.j.clear();
                        this.j.addAll(set);
                    }
                    if (we6Var != null) {
                        this.l = we6Var;
                    }
                    if (set2 != null) {
                        this.k.clear();
                        this.k.addAll(set2);
                    }
                    ux0 ux0Var = this.d;
                    if (ux0Var == null) {
                        ux0Var = new ux0();
                        this.d = ux0Var;
                    }
                    if (this.g) {
                        return ux0Var;
                    }
                    this.g = true;
                    ea6Var2.X = ux0Var;
                    ar8Var.f0 = ea6Var2;
                    ar8Var.i0 = 1;
                    if (a(ar8Var) == obj2) {
                        return obj2;
                    }
                    ea6Var = ea6Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6Var = ar8Var.f0;
            w39.n0(obj);
        }
        return ea6Var.X;
    }
}
