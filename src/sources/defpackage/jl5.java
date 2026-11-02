package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jl5 extends g2 {
    public k32 X = new k32();
    public jf8 Y;
    public Object Z;
    public int f0;
    public int g0;
    public kl5 h0;

    public jl5(kl5 kl5Var) {
        this.Y = kl5Var.X;
        this.g0 = kl5Var.Y;
        this.h0 = kl5Var;
    }

    @Override // defpackage.g2
    public final Set a() {
        return new sl5(this, (byte) 0);
    }

    @Override // defpackage.g2
    public final Set b() {
        return new sl5(this, (byte) 1);
    }

    @Override // defpackage.g2
    public final int c() {
        return this.g0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.Y = jf8.e;
        j(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof q06) {
            return g((q06) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof jt8) {
            return super.containsValue((jt8) obj);
        }
        return false;
    }

    public final kl5 f() {
        jf8 jf8Var = this.Y;
        kl5 kl5Var = this.h0;
        if (jf8Var != kl5Var.X) {
            this.X = new k32();
            kl5Var = new kl5(this.Y, c());
        }
        this.h0 = kl5Var;
        return kl5Var;
    }

    public final boolean g(Object obj) {
        return this.Y.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof q06) {
            return (jt8) h((q06) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof q06) ? obj2 : (jt8) super.getOrDefault((q06) obj, (jt8) obj2);
    }

    public final Object h(Object obj) {
        return this.Y.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object i(Object obj) {
        this.Z = null;
        jf8 jf8VarN = this.Y.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (jf8VarN == null) {
            jf8VarN = jf8.e;
        }
        this.Y = jf8VarN;
        return this.Z;
    }

    public final void j(int i) {
        this.g0 = i;
        this.f0++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.Z = null;
        this.Y = this.Y.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.Z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        ml5 ml5VarF = null;
        ml5 ml5Var = map instanceof ml5 ? (ml5) map : null;
        if (ml5Var == null) {
            jl5 jl5Var = map instanceof jl5 ? (jl5) map : null;
            if (jl5Var != null) {
                ml5VarF = jl5Var.f();
            }
        } else {
            ml5VarF = ml5Var;
        }
        if (ml5VarF == null) {
            super.putAll(map);
            return;
        }
        ei1 ei1Var = new ei1();
        ei1Var.a = 0;
        int i = this.g0;
        jf8 jf8Var = this.Y;
        jf8 jf8Var2 = ml5VarF.X;
        jf8Var2.getClass();
        this.Y = jf8Var.m(jf8Var2, 0, ei1Var, this);
        int i2 = (ml5VarF.Y + i) - ei1Var.a;
        if (i != i2) {
            j(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        jf8 jf8VarO = this.Y.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (jf8VarO == null) {
            jf8VarO = jf8.e;
        }
        this.Y = jf8VarO;
        return iC != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof q06) {
            return (jt8) i((q06) obj);
        }
        return null;
    }
}
