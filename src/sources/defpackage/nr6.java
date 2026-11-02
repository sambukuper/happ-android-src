package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nr6 implements cn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String[] Y;
    public final /* synthetic */ y45 Z;

    public /* synthetic */ nr6(y45 y45Var, String[] strArr, byte b) {
        this.X = b;
        this.Z = y45Var;
        this.Y = strArr;
    }

    @Override // defpackage.cn2
    public final Object a(Object obj) {
        q85 ow6Var;
        Object objC;
        q85 q85VarC;
        byte b = this.X;
        os8 os8Var = os8.X;
        String[] strArr = this.Y;
        y45 y45Var = this.Z;
        byte b2 = 1;
        byte b3 = 0;
        switch (b) {
            case 0:
                hd5 hd5Var = jm4.g0;
                q85 q85Var = (q85) obj;
                if (strArr.length == 0) {
                    bt.q("RxPermissions.request/requestEach requires at least one input permission");
                    return null;
                }
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        ow6Var = new ow6(null);
                    } else if (((or6) y45Var.X).X.containsKey(strArr[i])) {
                        i++;
                    } else {
                        ow6Var = g02.X;
                    }
                }
                if (q85Var == null) {
                    objC = new ow6(null);
                } else {
                    q85 q85VarC2 = q85.c(new va5(new q85[]{q85Var, ow6Var}, (byte) 1));
                    objC = q85VarC2.getClass() == ow6.class ? q85.c(new ya5((ow6) q85VarC2, os8Var)) : q85.c(new ya5(q85VarC2.X, hd5Var, b3));
                }
                nr6 nr6Var = new nr6(y45Var, strArr, b2);
                if (objC.getClass() == ow6.class) {
                    q85VarC = q85.c(new ya5((ow6) objC, nr6Var));
                } else {
                    q85 q85VarC3 = q85.c(new ya5(objC, nr6Var, b2));
                    q85VarC = q85VarC3.getClass() == ow6.class ? q85.c(new ya5((ow6) q85VarC3, os8Var)) : q85.c(new ya5(q85VarC3.X, hd5Var, b3));
                }
                int length2 = strArr.length;
                q85 q85VarC4 = q85.c(new ya5(q85VarC.X, new bd5(length2, length2), b3));
                we5 we5Var = new we5((byte) 17);
                if (q85VarC4.getClass() == ow6.class) {
                    return q85.c(new ya5((ow6) q85VarC4, we5Var));
                }
                q85 q85VarC5 = q85.c(new ya5(q85VarC4, we5Var, b2));
                return q85VarC5.getClass() == ow6.class ? q85.c(new ya5((ow6) q85VarC5, os8Var)) : q85.c(new ya5(q85VarC5.X, hd5Var, b3));
            default:
                or6 or6Var = (or6) y45Var.X;
                ArrayList arrayList = new ArrayList(strArr.length);
                ArrayList arrayList2 = new ArrayList();
                for (String str : strArr) {
                    HashMap map = or6Var.X;
                    if (or6Var.getActivity().checkSelfPermission(str) == 0) {
                        arrayList.add(new ow6(new gl5(str, true, false)));
                    } else if (or6Var.getActivity().getPackageManager().isPermissionRevokedByPolicy(str, or6Var.getActivity().getPackageName())) {
                        arrayList.add(new ow6(new gl5(str, false, false)));
                    } else {
                        x16 x16Var = (x16) map.get(str);
                        if (x16Var == null) {
                            arrayList2.add(str);
                            w16 w16Var = new w16();
                            w16Var.lazySet(w16.Y);
                            x16Var = new x16(w16Var);
                        }
                        arrayList.add(x16Var);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    TextUtils.join(", ", strArr2);
                    or6Var.requestPermissions(strArr2, 42);
                }
                q85 q85VarC6 = q85.c(new va5(arrayList, (byte) 2));
                return q85VarC6 instanceof ow6 ? q85.c(new ya5((ow6) q85VarC6, os8Var)) : q85.c(new va5(q85VarC6, (byte) 0));
        }
    }
}
