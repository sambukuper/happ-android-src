package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface xr4 {
    yr4 c(zr4 zr4Var, List list, long j);

    default int d(i55 i55Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new xe1((tr4) list.get(i2), vg3.Y, zg3.Y, (byte) 0));
        }
        return c(new lh3(i55Var, i55Var.w0.B0), arrayList, s31.b(0, i, 0, 0, 13)).a();
    }

    default int f(i55 i55Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new xe1((tr4) list.get(i2), vg3.X, zg3.X, (byte) 0));
        }
        return c(new lh3(i55Var, i55Var.w0.B0), arrayList, s31.b(0, 0, 0, i, 7)).b();
    }

    default int g(i55 i55Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new xe1((tr4) list.get(i2), vg3.X, zg3.Y, (byte) 0));
        }
        return c(new lh3(i55Var, i55Var.w0.B0), arrayList, s31.b(0, i, 0, 0, 13)).a();
    }

    default int i(i55 i55Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new xe1((tr4) list.get(i2), vg3.Y, zg3.X, (byte) 0));
        }
        return c(new lh3(i55Var, i55Var.w0.B0), arrayList, s31.b(0, 0, 0, i, 7)).b();
    }
}
