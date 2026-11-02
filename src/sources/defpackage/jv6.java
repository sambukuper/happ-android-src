package defpackage;

import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jv6 implements iv6 {
    public static final xd6 g0 = new xd6(new nw2(29), new zw5((byte) 20), 6);
    public final Map X;
    public final s05 Y;
    public kv6 Z;
    public final t16 f0;

    public jv6(Map map) {
        this.X = map;
        long[] jArr = uw6.a;
        this.Y = new s05();
        this.f0 = new t16((Object) this, (byte) 8);
    }

    @Override // defpackage.iv6
    public final void b(Object obj, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(533563200);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            lp2Var.Y(obj);
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                t16 t16Var = this.f0;
                if (!((Boolean) t16Var.B(obj)).booleanValue()) {
                    em7.h("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.X.get(obj);
                ox1 ox1Var = mv6.a;
                nv6 nv6Var = new nv6(new lv6(map, t16Var));
                lp2Var.g0(nv6Var);
                objK = nv6Var;
            }
            nv6 nv6Var2 = (nv6) objK;
            mb6.b(new t06[]{mv6.a.a(nv6Var2), vd4.a.a(nv6Var2)}, zy0Var, lp2Var, (i2 & 112) | 8);
            boolean zH = lp2Var.h(this) | lp2Var.h(obj) | lp2Var.h(nv6Var2);
            Object objK2 = lp2Var.K();
            if (zH || objK2 == beVar) {
                objK2 = new sn((Object) this, obj, (Object) nv6Var2, (byte) 24);
                lp2Var.g0(objK2);
            }
            u70.a(dn8.a, (gn2) objK2, lp2Var);
            if (lp2Var.y && lp2Var.G.i == lp2Var.z) {
                lp2Var.z = -1;
                lp2Var.y = false;
            }
            lp2Var.p(false);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) this, obj, (Object) zy0Var, i, (byte) 15);
        }
    }
}
