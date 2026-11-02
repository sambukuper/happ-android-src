package defpackage;

import java.io.PrintWriter;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qj4 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ImportResult Y;

    public /* synthetic */ qj4(ImportResult importResult, byte b) {
        this.X = b;
        this.Y = importResult;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ImportResult importResult = this.Y;
        PrintWriter printWriter = (PrintWriter) obj;
        switch (b) {
            case 0:
                int i = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " Batch config result 1: " + importResult);
                break;
            case 1:
                int i2 = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " Batch config result 2: " + importResult);
                break;
            case 2:
                int i3 = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " Append custom result: " + importResult);
                break;
            case 3:
                printWriter.println(p61.q(printWriter) + " Batch config result 1 (use case): " + importResult);
                break;
            case 4:
                printWriter.println(p61.q(printWriter) + " Batch config result 2 (use case): " + importResult);
                break;
            default:
                printWriter.println(p61.q(printWriter) + " Append custom result (use case): " + importResult);
                break;
        }
        return dn8Var;
    }
}
