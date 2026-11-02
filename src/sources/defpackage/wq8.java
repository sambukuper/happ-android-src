package defpackage;

import android.hardware.camera2.CaptureRequest;
import io.sentry.c2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wq8 implements qq8 {
    public static final ux0 l = vr3.a(new tj6(4, null));
    public static final ux0 m;
    public final v06 a;
    public final v06 b;
    public final jr8 c;
    public final v06 d;
    public final pr8 e;
    public final bm0 f;
    public volatile boolean g;
    public final vz7 h;
    public final vz7 i;
    public final vz7 j;
    public final LinkedHashMap k;

    static {
        ux0 ux0Var = new ux0();
        ux0Var.m(null);
        m = ux0Var;
    }

    public wq8(v06 v06Var, v06 v06Var2, jr8 jr8Var, v06 v06Var3, pr8 pr8Var, bm0 bm0Var) {
        v06Var.getClass();
        v06Var2.getClass();
        jr8Var.getClass();
        v06Var3.getClass();
        pr8Var.getClass();
        this.a = v06Var;
        this.b = v06Var2;
        this.c = jr8Var;
        this.d = v06Var3;
        this.e = pr8Var;
        this.f = bm0Var;
        hi5.i0("CXCP");
        final byte b = 0;
        this.h = new vz7(new dn2(this) { // from class: rq8
            public final /* synthetic */ wq8 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                wq8 wq8Var = this.Y;
                switch (b2) {
                    case 0:
                        return (en0) wq8Var.a.get();
                    case 1:
                        return (or8) wq8Var.d.get();
                    default:
                        return (br8) wq8Var.b.get();
                }
            }
        });
        final byte b2 = 1;
        this.i = new vz7(new dn2(this) { // from class: rq8
            public final /* synthetic */ wq8 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                wq8 wq8Var = this.Y;
                switch (b3) {
                    case 0:
                        return (en0) wq8Var.a.get();
                    case 1:
                        return (or8) wq8Var.d.get();
                    default:
                        return (br8) wq8Var.b.get();
                }
            }
        });
        final byte b3 = 2;
        this.j = new vz7(new dn2(this) { // from class: rq8
            public final /* synthetic */ wq8 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b4 = b3;
                wq8 wq8Var = this.Y;
                switch (b4) {
                    case 0:
                        return (en0) wq8Var.a.get();
                    case 1:
                        return (or8) wq8Var.d.get();
                    default:
                        return (br8) wq8Var.b.get();
                }
            }
        });
        this.k = new LinkedHashMap();
    }

    public static sq8 j(LinkedHashMap linkedHashMap) {
        sq8 sq8Var = new sq8((fg0) null, (LinkedHashMap) null, new we6(1), 7);
        n22 n22Var = pq8.g0;
        n22Var.getClass();
        w1 w1Var = new w1(n22Var, (byte) 0);
        while (w1Var.hasNext()) {
            sq8 sq8Var2 = (sq8) linkedHashMap.get((pq8) w1Var.next());
            if (sq8Var2 != null) {
                sq8Var.a.c(sq8Var2.a.Y);
                sq8Var.b.putAll(sq8Var2.b);
                sq8Var.c.addAll(sq8Var2.c);
                we6 we6Var = sq8Var2.d;
                if (we6Var != null) {
                    sq8Var.d = we6Var;
                }
            }
        }
        return sq8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qq8
    public final xg1 a() {
        ux0 ux0VarK = null;
        Object[] objArr = 0;
        if (!this.g) {
            ux0VarK = k(new rf0(this, objArr == true ? 1 : 0, (byte) 4));
        }
        return ux0VarK == null ? l : ux0VarK;
    }

    @Override // defpackage.qq8
    public final Object b(uy7 uy7Var) {
        or8 or8Var = (or8) this.i.getValue();
        or8Var.getClass();
        return or8.a(or8Var, uy7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qq8
    public final xg1 c(gg0 gg0Var, Map map) {
        ux0 ux0VarK = null;
        Object[] objArr = 0;
        if (!this.g) {
            ux0VarK = k(new ga(this, gg0Var, map, objArr == true ? 1 : 0, (byte) 3));
        }
        return ux0VarK == null ? m : ux0VarK;
    }

    @Override // defpackage.qq8
    public final void close() {
        this.g = true;
        hi5.i0("CXCP");
        br8 br8Var = (br8) this.j.getValue();
        synchronized (br8Var.c) {
            try {
                if (br8Var.g) {
                    br8Var.g = false;
                    ux0 ux0Var = br8Var.d;
                    if (ux0Var != null) {
                        ux0Var.l0(new CancellationException("UseCaseCameraState closed"));
                    }
                    br8Var.d = null;
                }
                while (!br8Var.f.isEmpty()) {
                    ((yq8) br8Var.f.removeFirst()).b.l0(new CancellationException("UseCaseCameraState closed"));
                    br8Var.q.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qq8
    public final xg1 d(int i) {
        ux0 ux0VarK = this.g ? null : k(new tq8(this, i, null));
        return ux0VarK == null ? l : ux0VarK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qq8
    public final xg1 e(List list) {
        ux0 ux0VarK = null;
        Object[] objArr = 0;
        if (!this.g) {
            ux0VarK = k(new da(this, list, objArr == true ? 1 : 0, (byte) 5));
        }
        return ux0VarK == null ? m : ux0VarK;
    }

    @Override // defpackage.qq8
    public final xg1 f(LinkedHashSet linkedHashSet, boolean z) {
        ux0 ux0VarK = this.g ? null : k(new vq8(linkedHashSet, z, this, null));
        return ux0VarK == null ? m : ux0VarK;
    }

    @Override // defpackage.qq8
    public final xg1 g(Map map, pq8 pq8Var, k11 k11Var) {
        pq8Var.getClass();
        k11Var.getClass();
        if (this.g) {
            return m;
        }
        if (dh3.f(this.e.d.get(), Boolean.TRUE)) {
            return w51.j(this.e.f, null, new wu1(this, pq8Var, map, k11Var, null, (byte) 12), 1);
        }
        xw3.s(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qq8
    public final xg1 h(Map map, k11 k11Var) {
        k11Var.getClass();
        ux0 ux0VarK = null;
        Object[] objArr = 0;
        if (!this.g) {
            ux0VarK = k(new ga(this, map, k11Var, objArr == true ? 1 : 0, (byte) 2));
        }
        return ux0VarK == null ? m : ux0VarK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qq8
    public final xg1 i() {
        ux0 ux0VarK = null;
        Object[] objArr = 0;
        if (!this.g) {
            ux0VarK = k(new cb1(this, objArr == true ? 1 : 0, (byte) 2));
        }
        return ux0VarK == null ? l : ux0VarK;
    }

    public final ux0 k(gn2 gn2Var) {
        pr8 pr8Var = this.e;
        pr8Var.getClass();
        e71 e71Var = dh3.f(pr8Var.d.get(), Boolean.TRUE) ? e71.f0 : e71.X;
        ux0 ux0Var = new ux0();
        w51.G(pr8Var.f, null, e71Var, new t17(gn2Var, ux0Var, null, (byte) 19), 1);
        return ux0Var;
    }

    public final Object l(pq8 pq8Var, Map map, k11 k11Var, uy7 uy7Var) {
        if (hi5.i0("CXCP")) {
            Objects.toString(pq8Var);
            Objects.toString(map);
            Objects.toString(k11Var);
        }
        LinkedHashMap linkedHashMap = this.k;
        Object sq8Var = linkedHashMap.get(pq8Var);
        if (sq8Var == null) {
            sq8Var = new sq8((fg0) null, (LinkedHashMap) null, (we6) null, 15);
            linkedHashMap.put(pq8Var, sq8Var);
        }
        sq8 sq8Var2 = (sq8) sq8Var;
        fg0 fg0Var = new fg0((byte) 0);
        fg0Var.c(sq8Var2.a.Y);
        k11Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            Object value = entry.getValue();
            fg0Var.Y.l(w45.B(key), k11Var, value);
        }
        linkedHashMap.put(pq8Var, new sq8(fg0Var, zp4.S(sq8Var2.b), wv0.b1(sq8Var2.c), sq8Var2.d));
        return m(j(linkedHashMap), null, uy7Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object m(sq8 sq8Var, LinkedHashSet linkedHashSet, s51 s51Var) {
        uq8 uq8Var;
        int i;
        if (s51Var instanceof uq8) {
            uq8Var = (uq8) s51Var;
            int i2 = uq8Var.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uq8Var.h0 = i2 - Integer.MIN_VALUE;
            } else {
                uq8Var = new uq8(this, s51Var);
            }
        } else {
            uq8Var = new uq8(this, s51Var);
        }
        uq8 uq8Var2 = uq8Var;
        Object objC = uq8Var2.f0;
        c71 c71Var = c71.X;
        int i3 = uq8Var2.h0;
        xg1 xg1Var = null;
        if (i3 == 0) {
            w39.n0(objC);
            if (!this.g) {
                bm0 bm0Var = this.f;
                zx zxVar = pf0.a;
                if (bm0Var.X.a(pf0.a, null) != null) {
                    c2.m();
                    return null;
                }
                en0 en0Var = (en0) this.h.getValue();
                we6 we6Var = sq8Var.d;
                we6Var.getClass();
                if (we6Var.a != -1) {
                    we6 we6Var2 = sq8Var.d;
                    we6Var2.getClass();
                    i = we6Var2.a;
                } else {
                    i = 1;
                }
                en0Var.a(i);
                br8 br8Var = (br8) this.j.getValue();
                LinkedHashMap linkedHashMapV = w45.V(sq8Var.a.a());
                xu4 xu4Var = e18.a;
                a15 a15VarA = a15.a();
                for (Map.Entry entry : sq8Var.b.entrySet()) {
                    a15VarA.a.put((String) entry.getKey(), entry.getValue());
                }
                Map mapSingletonMap = Collections.singletonMap(xu4Var, a15VarA);
                mapSingletonMap.getClass();
                we6 we6Var3 = sq8Var.d;
                Set set = sq8Var.c;
                uq8Var2.h0 = 1;
                objC = br8Var.c(linkedHashMapV, mapSingletonMap, linkedHashSet, we6Var3, set, uq8Var2);
                if (objC == c71Var) {
                    return c71Var;
                }
            }
            if (xg1Var == null) {
                return m;
            }
            return xg1Var;
        }
        if (i3 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(objC);
        xg1Var = (xg1) objC;
        if (xg1Var == null) {
            return m;
        }
        return xg1Var;
    }
}
