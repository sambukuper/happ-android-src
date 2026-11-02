package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c11 implements rj2 {
    public final /* synthetic */ byte a;
    public final Object b;

    public c11(String str) {
        this.a = (byte) 2;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.rj2
    public final void a(Object obj, StringBuilder sb, boolean z) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    ((rj2) it.next()).a(obj, sb, z);
                }
                break;
            case 1:
                for (qg5 qg5Var : (List) obj2) {
                    gn2 gn2Var = (gn2) qg5Var.X;
                    rj2 rj2Var = (rj2) qg5Var.Y;
                    if (((Boolean) gn2Var.B(obj)).booleanValue()) {
                        rj2Var.a(obj, sb, z);
                        break;
                    }
                }
                break;
            case 2:
                sb.append((CharSequence) obj2);
                break;
            default:
                int iIntValue = ((Number) ((al5) obj2).B(obj)).intValue();
                int i = yn0.d[2];
                int i2 = iIntValue - 2000;
                if (i2 < 0 || i2 >= i) {
                    if (iIntValue >= 0) {
                        sb.append("+");
                    }
                    sb.append(String.valueOf(iIntValue));
                } else {
                    String strValueOf = String.valueOf(iIntValue % i);
                    CharSequence[] charSequenceArr = {mm7.V(Math.max(0, 2 - strValueOf.length()), "0"), strValueOf};
                    for (int i3 = 0; i3 < 2; i3++) {
                        sb.append(charSequenceArr[i3]);
                    }
                }
                break;
        }
    }

    public /* synthetic */ c11(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
