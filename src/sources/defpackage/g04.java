package defpackage;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g04 extends z91 {
    public g04(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        strArrD1 = strArrD1.length == 0 ? null : strArrD1;
        if (strArrD1 != null) {
            qg5 qg5VarG = mu3.g(strArrD1, metadata.d2());
            qt3 qt3Var = (qt3) qg5VarG.X;
            vy5 vy5Var = (vy5) qg5VarG.Y;
            boolean z = new ot3(metadata.mv()).compareTo(new ot3(1, 4, 0)) < 0;
            vy5Var.getClass();
            qt3Var.getClass();
            tz5 tz5Var = vy5Var.s0;
            tz5Var.getClass();
            vj8.p0(vy5Var, new rm1(qt3Var, new ux4(tz5Var), dv8.b, z, (List) null, 48));
        }
        new ot3(metadata.mv());
        metadata.xi();
    }
}
