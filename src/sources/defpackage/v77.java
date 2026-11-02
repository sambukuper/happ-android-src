package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v77 {
    public static final z31 a = new z31("NO_VALUE", 3);

    public static final u77 a(int i, int i2, l90 l90Var) {
        if (i < 0) {
            em7.c(pc6.j(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            em7.c(pc6.j(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && l90Var != l90.X) {
            xw3.z(l90Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new u77(i, i3, l90Var);
    }

    public static /* synthetic */ u77 b(int i, int i2, l90 l90Var) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            l90Var = l90.X;
        }
        return a(i3, i, l90Var);
    }

    public static final xe2 c(r77 r77Var, s61 s61Var, int i, l90 l90Var) {
        return ((i == 0 || i == -3) && l90Var == l90.X) ? r77Var : new np0(i, l90Var, s61Var, r77Var);
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
