package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 extends ys0 {
    public final /* synthetic */ byte w0;
    public final /* synthetic */ ly0 x0;
    public final /* synthetic */ String y0;
    public final /* synthetic */ yn0 z0;

    public /* synthetic */ r6(ly0 ly0Var, String str, yn0 yn0Var, byte b) {
        this.w0 = b;
        this.x0 = ly0Var;
        this.y0 = str;
        this.z0 = yn0Var;
    }

    public final void h0(Object obj) {
        byte b = this.w0;
        yn0 yn0Var = this.z0;
        String str = this.y0;
        ly0 ly0Var = this.x0;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = ly0Var.b;
                ArrayList arrayList = ly0Var.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    xw3.u("Attempting to launch an unregistered ActivityResultLauncher with contract ", yn0Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    ly0Var.b(iIntValue, yn0Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = ly0Var.d;
                Object obj3 = ly0Var.b.get(str);
                if (obj3 == null) {
                    xw3.u("Attempting to launch an unregistered ActivityResultLauncher with contract ", yn0Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    ly0Var.b(iIntValue2, yn0Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void i0() {
        this.x0.e(this.y0);
    }
}
