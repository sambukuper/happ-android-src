package defpackage;

import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ g45 Y;

    public /* synthetic */ ss(g45 g45Var, byte b) {
        this.X = b;
        this.Y = g45Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        g45 g45Var = this.Y;
        PrintWriter printWriter = (PrintWriter) obj;
        switch (b) {
            case 0:
                printWriter.println(p61.q(printWriter) + " wrong new domain: " + g45Var.a);
                break;
            default:
                printWriter.println(p61.q(printWriter) + " REMOTE_PUSH wrong new domain: " + g45Var.a);
                break;
        }
        return dn8Var;
    }
}
