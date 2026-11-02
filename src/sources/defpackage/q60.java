package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q60 extends no2 implements gn2 {
    public static final q60 X = new q60(1, wl7.class, "retrieveMetaParameter", "retrieveMetaParameter(Ljava/lang/String;)Lkotlin/Pair;", 1);

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        String str = (String) obj;
        str.getClass();
        List listF0 = fm7.F0(str, new String[]{":"}, 2);
        if (listF0.size() != 2) {
            listF0 = null;
        }
        if (listF0 == null) {
            return null;
        }
        return new qg5(fm7.R0(fm7.f0(1, (String) listF0.get(0))).toString(), fm7.R0((String) listF0.get(1)).toString());
    }
}
