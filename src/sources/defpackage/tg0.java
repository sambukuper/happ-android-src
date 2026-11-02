package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ tg0(xg0 xg0Var, wg0 wg0Var, te6 te6Var, int i) {
        this.X = (byte) 0;
        this.Z = xg0Var;
        this.f0 = te6Var;
        this.Y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Object obj = this.f0;
        int i = this.Y;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                ((xg0) obj2).d(wg0.c((te6) obj), i);
                break;
            case 1:
                ly0 ly0Var = (ly0) obj2;
                Object obj3 = ((g4) obj).a;
                String str = (String) ly0Var.a.get(Integer.valueOf(i));
                if (str != null) {
                    p6 p6Var = (p6) ly0Var.e.get(str);
                    if ((p6Var != null ? p6Var.a : null) != null) {
                        j6 j6Var = p6Var.a;
                        if (ly0Var.d.remove(str)) {
                            j6Var.c(obj3);
                        }
                    } else {
                        ly0Var.g.remove(str);
                        ly0Var.f.put(str, obj3);
                    }
                    break;
                }
                break;
            default:
                ((ly0) obj2).a(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
        }
    }

    public /* synthetic */ tg0(ly0 ly0Var, int i, Object obj, byte b) {
        this.X = b;
        this.Z = ly0Var;
        this.Y = i;
        this.f0 = obj;
    }
}
