package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 implements sx1 {
    public static final vk1 a = new vk1((Object) new ux1(), (byte) 5);
    public static final Set b = w45.U(px1.d);

    @Override // defpackage.sx1
    public final Set a() {
        return b;
    }

    @Override // defpackage.sx1
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // defpackage.sx1
    public final Set c(px1 px1Var) {
        px1Var.getClass();
        mb6.o(px1.d.equals(px1Var), "DynamicRange is not supported: " + px1Var);
        return b;
    }
}
