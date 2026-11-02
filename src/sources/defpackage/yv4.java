package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yv4 extends jx4 implements s01, g34 {
    public LinkedHashMap q0;

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        float f = ((kt1) hi5.W(this, yf3.c)).X;
        if (f < 0.0f) {
            f = 0.0f;
        }
        eo5 eo5VarO = tr4Var.o(j);
        boolean z = this.p0 && !Float.isNaN(f) && kt1.a(f, 0.0f) > 0;
        int iX0 = !Float.isNaN(f) ? zr4Var.x0(f) : 0;
        int iMax = eo5VarO.X;
        if (z) {
            iMax = Math.max(iMax, iX0);
        }
        int iMax2 = eo5VarO.Y;
        if (z) {
            iMax2 = Math.max(iMax2, iX0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.q0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.q0 = linkedHashMap;
            }
            iv8 iv8Var = yf3.b;
            int iRound = Math.round((iX0 - eo5VarO.X) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(iv8Var, Integer.valueOf(iRound));
            t03 t03Var = yf3.a;
            int iRound2 = Math.round((iX0 - eo5VarO.Y) / 2.0f);
            linkedHashMap.put(t03Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.q0;
        if (map == null) {
            map = e02.X;
        }
        return zr4Var.g0(iMax, iMax2, map, new me3(iMax, eo5VarO, iMax2));
    }
}
