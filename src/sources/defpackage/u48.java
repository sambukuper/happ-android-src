package defpackage;

import android.content.ClipData;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u48 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y48 Y;

    public /* synthetic */ u48(y48 y48Var, byte b) {
        this.X = b;
        this.Y = y48Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        String string;
        switch (this.X) {
            case 0:
                y48 y48Var = this.Y;
                y48Var.d1();
                y48Var.u0.b();
                ClipData clipData = ((gu0) obj).a;
                int itemCount = clipData.getItemCount();
                boolean z = false;
                for (int i = 0; i < itemCount; i++) {
                    z = z || clipData.getItemAt(i).getText() != null;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    int itemCount2 = clipData.getItemCount();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < itemCount2; i2++) {
                        CharSequence text = clipData.getItemAt(i2).getText();
                        if (text != null) {
                            if (z2) {
                                sb.append("\n");
                            }
                            sb.append(text);
                            z2 = true;
                        }
                    }
                    string = sb.toString();
                } else {
                    string = null;
                }
                pu.w(y48Var);
                if (string != null) {
                    kd8.h(y48Var.s0, string, false, false, 30);
                }
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                y48 y48Var2 = this.Y;
                w51.G(y48Var2.M0(), null, e71.f0, new qq1((bx3) obj, y48Var2, zBooleanValue, null, (byte) 2), 1);
                return dn8.a;
        }
    }
}
