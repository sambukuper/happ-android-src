package defpackage;

import android.view.View;
import com.google.gson.a;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qu7 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ wu7 Y;

    public /* synthetic */ qu7(wu7 wu7Var, byte b) {
        this.X = b;
        this.Y = wu7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.X;
        q51 q51Var = null;
        wu7 wu7Var = this.Y;
        switch (b) {
            case 0:
                a aVar = wu7.y1;
                pu7 pu7Var = (pu7) wu7Var.v1.getValue();
                jm4.Q(zw8.a(pu7Var), null, new t17(pu7Var, new y45(wu7Var), q51Var, (byte) 12), 3);
                break;
            case 1:
                a aVar2 = wu7.y1;
                wu7Var.Y();
                break;
            default:
                a aVar3 = wu7.y1;
                pu7 pu7Var2 = (pu7) wu7Var.v1.getValue();
                jm4.Q(zw8.a(pu7Var2), null, new t17(pu7Var2, new lr5((Object) wu7Var, (byte) 18), q51Var, (byte) 11), 3);
                break;
        }
    }
}
