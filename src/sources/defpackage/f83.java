package defpackage;

import su.happ.proxyutility.dto.ImportResult;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f83 {
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, s51 s51Var) {
        e83 e83Var;
        ImportResult importResult;
        String str3;
        String str4;
        if (s51Var instanceof e83) {
            e83Var = (e83) s51Var;
            int i = e83Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                e83Var.j0 = i - Integer.MIN_VALUE;
            } else {
                e83Var = new e83(this, s51Var);
            }
        } else {
            e83Var = new e83(this, s51Var);
        }
        Object objE = e83Var.h0;
        int i2 = e83Var.j0;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objE);
            kw2 kw2Var = kw2.a;
            e83Var.f0 = str;
            e83Var.g0 = str2;
            e83Var.j0 = 1;
            objE = kw2.e(str, str2, e83Var, 4);
            if (objE != c71Var) {
            }
            return c71Var;
        }
        if (i2 == 1) {
            str2 = e83Var.g0;
            str = e83Var.f0;
            w39.n0(objE);
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = e83Var.g0;
            str3 = e83Var.f0;
            w39.n0(objE);
        }
        importResult = (ImportResult) objE;
        String str5 = str3;
        str2 = str4;
        str = str5;
        if (importResult.getCount() <= 0) {
            return importResult;
        }
        kw2 kw2Var2 = kw2.a;
        return kw2.b(str, 4, str2);
        importResult = (ImportResult) objE;
        if (importResult.getCount() <= 0) {
            kw2 kw2Var3 = kw2.a;
            ss8 ss8Var = ss8.a;
            String strA = ss8.a(str);
            e83Var.f0 = str;
            e83Var.g0 = str2;
            e83Var.j0 = 2;
            objE = kw2.e(strA, str2, e83Var, 4);
            if (objE != c71Var) {
                String str6 = str2;
                str3 = str;
                str4 = str6;
                importResult = (ImportResult) objE;
                String str7 = str3;
                str2 = str4;
                str = str7;
            }
            return c71Var;
        }
        if (importResult.getCount() <= 0) {
            return importResult;
        }
        kw2 kw2Var4 = kw2.a;
        return kw2.b(str, 4, str2);
    }
}
