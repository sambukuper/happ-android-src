package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zu4 {
    public final zz2 a;
    public final lr b;
    public final HashMap c;

    public zu4(Context context, lr lrVar) {
        zz2 zz2Var = new zz2(context);
        this.c = new HashMap();
        this.a = zz2Var;
        this.b = lrVar;
    }

    public final synchronized se8 a(String str) {
        if (this.c.containsKey(str)) {
            return (se8) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryC0 = this.a.c0(str);
        if (cctBackendFactoryC0 == null) {
            return null;
        }
        lr lrVar = this.b;
        se8 se8VarCreate = cctBackendFactoryC0.create(new ay((Context) lrVar.f0, (f08) lrVar.Y, (f08) lrVar.Z, str));
        this.c.put(str, se8VarCreate);
        return se8VarCreate;
    }
}
