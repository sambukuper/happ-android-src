package defpackage;

import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q77 {
    public static final ox1 a = new ox1(new r47((byte) 6), (byte) 1);

    public static final x67 a(p77 p77Var, d77 d77Var) {
        switch (d77Var.ordinal()) {
            case 0:
                return p77Var.h;
            case 1:
                return p77Var.e;
            case 2:
                return p77Var.g;
            case 3:
                return c(p77Var.e);
            case 4:
                return p77Var.a;
            case 5:
                return c(p77Var.a);
            case 6:
                return km6.a;
            case 7:
                return p77Var.d;
            case 8:
                jm6 jm6Var = p77Var.d;
                lt1 lt1Var = c77.i;
                return jm6.b(jm6Var, lt1Var, null, null, lt1Var, 6);
            case 9:
                return p77Var.f;
            case 10:
                jm6 jm6Var2 = p77Var.d;
                lt1 lt1Var2 = c77.i;
                return jm6.b(jm6Var2, null, lt1Var2, lt1Var2, null, 9);
            case 11:
                return c(p77Var.d);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return p77Var.c;
            case 13:
                return u70.e;
            case 14:
                return p77Var.b;
            default:
                b61.c();
                return null;
        }
    }

    public static final x67 b(d77 d77Var, lp2 lp2Var) {
        return a((p77) lp2Var.j(a), d77Var);
    }

    public static jm6 c(jm6 jm6Var) {
        lt1 lt1Var = c77.i;
        return jm6.b(jm6Var, null, null, lt1Var, lt1Var, 3);
    }
}
