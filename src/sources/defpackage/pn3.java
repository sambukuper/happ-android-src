package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pn3 implements b85 {
    public final /* synthetic */ byte a;

    @Override // defpackage.u02
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new z02("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                c85 c85Var = (c85) obj2;
                c85Var.a(n06.f, entry.getKey());
                c85Var.a(n06.g, entry.getValue());
                return;
            default:
                throw new z02("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
