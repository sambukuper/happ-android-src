package defpackage;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw4;", "Lm37;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class cw4 extends m37 {
    public final List X;
    public final String Y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cw4(String str, String str2) {
        this(pc6.q("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, i21.K(str), str2);
        str2.getClass();
    }

    public cw4(String str, cw4 cw4Var, List list, String str2) {
        super(str, cw4Var);
        this.X = list;
        this.Y = str2;
    }
}
