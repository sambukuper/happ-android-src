package defpackage;

import java.io.PrintWriter;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n72 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Throwable Y;

    public /* synthetic */ n72(Throwable th, byte b) {
        this.X = b;
        this.Y = th;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Throwable th = this.Y;
        PrintWriter printWriter = (PrintWriter) obj;
        switch (b) {
            case 0:
                printWriter.println(p61.q(printWriter) + " Fetch provider file error: " + th);
                break;
            default:
                int i = MainActivity.y1;
                printWriter.getClass();
                printWriter.println("Connection error with IOException: " + th.getMessage());
                break;
        }
        return dn8Var;
    }
}
