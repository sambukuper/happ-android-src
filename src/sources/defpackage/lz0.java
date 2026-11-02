package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Llz0;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class lz0 extends RuntimeException {
    public final j05 X;
    public final j05 Y;
    public final uz4 Z;
    public final int f0;

    public lz0(j05 j05Var, j05 j05Var2, uz4 uz4Var, int i, Exception exc) {
        super(exc);
        this.X = j05Var;
        this.Y = j05Var2;
        this.Z = uz4Var;
        this.f0 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() throws IOException {
        List listK;
        v27 v27VarP = jm4.P(new kz0(this, null));
        if (v27VarP.hasNext()) {
            Object next = v27VarP.next();
            if (v27VarP.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (v27VarP.hasNext()) {
                    arrayList.add(v27VarP.next());
                }
                listK = arrayList;
            } else {
                listK = i21.K(next);
            }
        } else {
            listK = d02.X;
        }
        return gm7.O("\n            |Failed to execute op number " + this.f0 + ":\n            |" + wv0.y0(wv0.V0(50, listK), "\n", null, null, null, 62) + "\n            ");
    }
}
