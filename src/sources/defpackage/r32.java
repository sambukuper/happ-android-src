package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r32 implements lh8 {
    public final s32 X;
    public final String[] Y;
    public final String Z;

    public r32(s32 s32Var, String... strArr) {
        s32Var.getClass();
        this.X = s32Var;
        this.Y = strArr;
        String str = s32Var.X;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.Z = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // defpackage.lh8
    public final boolean B() {
        return false;
    }

    @Override // defpackage.lh8
    public final Collection c() {
        return d02.X;
    }

    @Override // defpackage.lh8
    public final zz3 f() {
        return (ee1) ee1.f.getValue();
    }

    @Override // defpackage.lh8
    public final List g() {
        return d02.X;
    }

    public final String toString() {
        return this.Z;
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        u32.a.getClass();
        return u32.c;
    }
}
