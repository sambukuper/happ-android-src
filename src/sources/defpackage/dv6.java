package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dv6 extends ContextWrapper {
    public final /* synthetic */ fv6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv6(fv6 fv6Var, Context context) {
        super(context);
        this.a = fv6Var;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        return new ev6(this.a, (WindowManager) getBaseContext().getSystemService(str));
    }
}
