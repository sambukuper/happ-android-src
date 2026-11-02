package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xz3 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ zz3 Y;

    public /* synthetic */ xz3(zz3 zz3Var, byte b) {
        this.X = b;
        this.Y = zz3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        zz3 zz3Var = this.Y;
        switch (b) {
            case 0:
                return Arrays.asList(zz3Var.l().b0(ug7.k), zz3Var.l().b0(ug7.m), zz3Var.l().b0(ug7.n), zz3Var.l().b0(ug7.l));
            default:
                EnumMap enumMap = new EnumMap(du5.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (du5 du5Var : du5.values()) {
                    String strB = du5Var.X.b();
                    if (strB == null) {
                        zz3.a(47);
                        throw null;
                    }
                    aa7 aa7VarX = zz3Var.k(strB).X();
                    if (aa7VarX == null) {
                        zz3.a(48);
                        throw null;
                    }
                    String strB2 = du5Var.Y.b();
                    if (strB2 == null) {
                        zz3.a(47);
                        throw null;
                    }
                    aa7 aa7VarX2 = zz3Var.k(strB2).X();
                    if (aa7VarX2 == null) {
                        zz3.a(48);
                        throw null;
                    }
                    enumMap.put(du5Var, aa7VarX2);
                    map.put(aa7VarX, aa7VarX2);
                    map2.put(aa7VarX2, aa7VarX);
                }
                return new yz3(enumMap, map, map2);
        }
    }
}
