package defpackage;

import io.sentry.transport.f;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e86 implements ju8 {
    public long X;
    public long Y;
    public final Object Z;
    public final Object f0;

    public e86(gj4 gj4Var, long j) {
        this.f0 = gj4Var;
        this.Z = new LinkedHashMap(0, 0.75f, true);
        this.X = j;
        if (j > 0) {
            return;
        }
        bt.q("maxSize <= 0");
        throw null;
    }

    @Override // defpackage.ju8
    public boolean a() {
        return true;
    }

    public void b(Object obj, Object obj2, d86 d86Var) {
        d86 d86Var2 = (d86) obj2;
        ((b8) ((gj4) this.f0).Y).r((ht4) obj, d86Var2.a, d86Var2.b, d86Var2.c);
    }

    public long c() {
        long j = this.Y;
        if (j != -1) {
            return j;
        }
        long jG = 0;
        for (Map.Entry entry : ((LinkedHashMap) this.Z).entrySet()) {
            jG += g(entry.getKey(), entry.getValue());
        }
        this.Y = jG;
        return jG;
    }

    @Override // defpackage.ju8
    public long d(wk wkVar, wk wkVar2, wk wkVar3) {
        return Long.MAX_VALUE;
    }

    public long e(long j) {
        long j2 = this.Y;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.X;
        long j5 = j3 / j4;
        return (((be6) this.f0) == be6.X || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public wk f(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        long j2 = this.Y;
        long j3 = j + j2;
        long j4 = this.X;
        return j3 > j4 ? ((lu8) this.Z).m(j4 - j2, wkVar, wkVar3, wkVar2) : wkVar2;
    }

    public long g(Object obj, Object obj2) throws Exception {
        try {
            long j = ((d86) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.Y = -1L;
            throw e;
        }
    }

    public void h(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.Z;
        while (c() > j) {
            if (linkedHashMap.isEmpty()) {
                if (c() == 0) {
                    return;
                }
                bt.i("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) wv0.q0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.Y = c() - g(key, value);
                b(key, value, null);
            }
        }
    }

    @Override // defpackage.ju8
    public wk m(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        return ((lu8) this.Z).m(e(j), wkVar, wkVar2, f(j, wkVar, wkVar3, wkVar2));
    }

    @Override // defpackage.ju8
    public wk z(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        return ((lu8) this.Z).z(e(j), wkVar, wkVar2, f(j, wkVar, wkVar3, wkVar2));
    }

    public e86(f fVar) {
        this.f0 = fVar;
        this.Z = new LinkedHashMap(10);
    }

    public e86(lu8 lu8Var, be6 be6Var) {
        this.Z = lu8Var;
        this.f0 = be6Var;
        this.X = ((long) (lu8Var.x() + lu8Var.v())) * 1000000;
        this.Y = 0L;
    }
}
