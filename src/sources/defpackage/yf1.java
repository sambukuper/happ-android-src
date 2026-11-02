package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ fg1 Y;
    public final /* synthetic */ xe7 Z;

    public /* synthetic */ yf1(fg1 fg1Var, xe7 xe7Var, byte b) {
        this.X = b;
        this.Y = fg1Var;
        this.Z = xe7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        xe7 xe7Var = this.Z;
        fg1 fg1Var = this.Y;
        switch (b) {
            case 0:
                fg1Var.a(xe7Var);
                break;
            case 1:
                if (fg1Var.b.contains(xe7Var)) {
                    ze7 ze7Var = xe7Var.a;
                    View view = xe7Var.c.J0;
                    view.getClass();
                    ze7Var.a(view, fg1Var.a);
                }
                break;
            default:
                fg1Var.b.remove(xe7Var);
                fg1Var.c.remove(xe7Var);
                break;
        }
    }
}
