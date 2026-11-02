package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q32 extends aa7 {
    public final lh8 Y;
    public final n32 Z;
    public final s32 f0;
    public final List g0;
    public final boolean h0;
    public final String[] i0;
    public final String j0;

    public q32(lh8 lh8Var, n32 n32Var, s32 s32Var, List list, boolean z, String... strArr) {
        s32Var.getClass();
        list.getClass();
        this.Y = lh8Var;
        this.Z = n32Var;
        this.f0 = s32Var;
        this.g0 = list;
        this.h0 = z;
        this.i0 = strArr;
        String str = s32Var.X;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.j0 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.t14
    public final et4 K() {
        return this.Z;
    }

    @Override // defpackage.t14
    public final List l0() {
        return this.g0;
    }

    @Override // defpackage.t14
    public final lh8 n0() {
        return this.Y;
    }

    @Override // defpackage.t14
    public final boolean o0() {
        return this.h0;
    }

    @Override // defpackage.aa7, defpackage.mo8
    /* JADX INFO: renamed from: u0 */
    public final aa7 r0(boolean z) {
        String[] strArr = this.i0;
        return new q32(this.Y, this.Z, this.f0, this.g0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
