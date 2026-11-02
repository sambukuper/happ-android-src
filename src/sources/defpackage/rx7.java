package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rx7 {
    public static final jl7 e = jl7.DEFAULT;
    public static final ox7[] f = {ox7.S720P_16_9, ox7.S1080P_4_3, ox7.S1080P_16_9, ox7.S1440P_16_9, ox7.UHD, ox7.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;
    public final qx7 a;
    public final ox7 b;
    public final jl7 c;
    public final int d;

    static {
        Map mapJ = zp4.J(new qg5(qx7.Y, 35), new qg5(qx7.Z, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES)), new qg5(qx7.f0, 4101), new qg5(qx7.g0, 32), new qg5(qx7.X, 34));
        g = mapJ;
        Set<Map.Entry> setEntrySet = mapJ.entrySet();
        int iG = aq4.G(xv0.Z(setEntrySet, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (qx7) entry.getKey());
        }
        h = linkedHashMap;
    }

    public rx7(qx7 qx7Var, ox7 ox7Var, jl7 jl7Var) {
        ox7Var.getClass();
        jl7Var.getClass();
        this.a = qx7Var;
        this.b = ox7Var;
        this.c = jl7Var;
        Integer num = (Integer) g.get(qx7Var);
        this.d = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx7)) {
            return false;
        }
        rx7 rx7Var = (rx7) obj;
        return this.a == rx7Var.a && this.b == rx7Var.b && this.c == rx7Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.a + ", configSize=" + this.b + ", streamUseCase=" + this.c + ')';
    }
}
