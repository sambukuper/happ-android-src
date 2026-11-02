package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz0 implements un2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ bz0(byte b) {
        this.X = b;
    }

    @Override // defpackage.un2
    public final Object N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                t38 t38Var = (t38) obj;
                h38 h38Var = (h38) obj2;
                dn2 dn2Var = (dn2) obj3;
                lp2 lp2Var = (lp2) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? lp2Var.f(t38Var) : lp2Var.h(t38Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? lp2Var.f(h38Var) : lp2Var.h(h38Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= lp2Var.h(dn2Var) ? 256 : 128;
                }
                if (!lp2Var.N(i & 1, (i & 1171) != 1170)) {
                    lp2Var.Q();
                } else {
                    ng1.c((h30) t38Var, h38Var, dn2Var, lp2Var, i & 1022);
                }
                break;
            case 1:
                t38 t38Var2 = (t38) obj;
                h38 h38Var2 = (h38) obj2;
                dn2 dn2Var2 = (dn2) obj3;
                lp2 lp2Var2 = (lp2) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? lp2Var2.f(t38Var2) : lp2Var2.h(t38Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? lp2Var2.f(h38Var2) : lp2Var2.h(h38Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= lp2Var2.h(dn2Var2) ? 256 : 128;
                }
                if (!lp2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
                    lp2Var2.Q();
                } else {
                    ng1.c((h30) t38Var2, h38Var2, dn2Var2, lp2Var2, i2 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((f88) obj5).a;
                String string = ((CharSequence) obj4).subSequence(f88.d(j), f88.c(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return dn8Var;
    }
}
