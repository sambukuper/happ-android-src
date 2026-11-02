package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class br6 {
    public k09 a;
    public ArrayList b;

    public static long a(si1 si1Var, long j) {
        k09 k09Var = si1Var.d;
        ArrayList arrayList = si1Var.k;
        if (k09Var instanceof wz2) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            mi1 mi1Var = (mi1) arrayList.get(i);
            if (mi1Var instanceof si1) {
                si1 si1Var2 = (si1) mi1Var;
                if (si1Var2.d != k09Var) {
                    jMin = Math.min(jMin, a(si1Var2, ((long) si1Var2.f) + j));
                }
            }
        }
        si1 si1Var3 = k09Var.i;
        si1 si1Var4 = k09Var.h;
        if (si1Var != si1Var3) {
            return jMin;
        }
        long j2 = j - k09Var.j();
        return Math.min(Math.min(jMin, a(si1Var4, j2)), j2 - ((long) si1Var4.f));
    }

    public static long b(si1 si1Var, long j) {
        k09 k09Var = si1Var.d;
        ArrayList arrayList = si1Var.k;
        if (k09Var instanceof wz2) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            mi1 mi1Var = (mi1) arrayList.get(i);
            if (mi1Var instanceof si1) {
                si1 si1Var2 = (si1) mi1Var;
                if (si1Var2.d != k09Var) {
                    jMax = Math.max(jMax, b(si1Var2, ((long) si1Var2.f) + j));
                }
            }
        }
        si1 si1Var3 = k09Var.h;
        si1 si1Var4 = k09Var.i;
        if (si1Var != si1Var3) {
            return jMax;
        }
        long j2 = k09Var.j() + j;
        return Math.max(Math.max(jMax, b(si1Var4, j2)), j2 - ((long) si1Var4.f));
    }
}
