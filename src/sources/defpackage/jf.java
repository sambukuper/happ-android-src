package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf implements tn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ jf(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.X;
        Object obj5 = this.Y;
        switch (b) {
            case 0:
                kf kfVar = (kf) obj5;
                rj8 rj8VarB = ((hi2) kfVar.g0).b((gi2) obj, (dj2) obj2, ((bj2) obj3).a, ((cj2) obj4).a);
                if (rj8VarB instanceof rj8) {
                    Object obj6 = rj8VarB.X;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                zv7 zv7Var = new zv7(rj8VarB, kfVar.l0);
                kfVar.l0 = zv7Var;
                Object obj7 = zv7Var.Z;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ym2 ym2Var = new ym2(sQLiteQuery, (byte) 0);
                ex7 ex7Var = (ex7) ((y45) obj5).X;
                int length = ex7Var.f0.length;
                for (int i = 1; i < length; i++) {
                    int i2 = ex7Var.f0[i];
                    if (i2 == 1) {
                        ym2Var.i(i, ex7Var.g0[i]);
                    } else if (i2 == 2) {
                        ym2Var.h(i, ex7Var.h0[i]);
                    } else if (i2 == 3) {
                        String str2 = ex7Var.i0[i];
                        str2.getClass();
                        ym2Var.t(i, str2);
                    } else if (i2 == 4) {
                        byte[] bArr = ex7Var.j0[i];
                        bArr.getClass();
                        ym2Var.j(i, bArr);
                    } else if (i2 == 5) {
                        ym2Var.l(i);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                zy0 zy0Var = (zy0) obj5;
                k44 k44Var = (k44) obj;
                ((Integer) obj2).getClass();
                lp2 lp2Var = (lp2) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(k44Var) ? 4 : 2;
                }
                if (lp2Var.N(iIntValue & 1, (iIntValue & 131) != 130)) {
                    zy0Var.x(k44Var, lp2Var, Integer.valueOf(iIntValue & 14));
                } else {
                    lp2Var.Q();
                }
                return dn8.a;
        }
    }
}
