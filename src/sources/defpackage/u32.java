package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u32 {
    public static final u32 a = new u32();
    public static final i32 b = i32.X;
    public static final e32 c = new e32(v15.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final q32 d = c(s32.CYCLIC_SUPERTYPES, new String[0]);
    public static final q32 e = c(s32.ERROR_PROPERTY_TYPE, new String[0]);
    public static final Set f = w45.U(new j32());

    public static final n32 a(o32 o32Var, boolean z, String... strArr) {
        if (!z) {
            return new n32(o32Var, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new x98(o32Var, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final n32 b(o32 o32Var, String... strArr) {
        return a(o32Var, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final q32 c(s32 s32Var, String... strArr) {
        s32Var.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return e(s32Var, d02.X, d(s32Var, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static r32 d(s32 s32Var, String... strArr) {
        s32Var.getClass();
        return new r32(s32Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static q32 e(s32 s32Var, List list, lh8 lh8Var, String... strArr) {
        s32Var.getClass();
        return new q32(lh8Var, b(o32.ERROR_TYPE_SCOPE, lh8Var.toString()), s32Var, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(ed1 ed1Var) {
        if (ed1Var != null) {
            return (ed1Var instanceof e32) || (ed1Var.p() instanceof e32) || ed1Var == b;
        }
        return false;
    }
}
