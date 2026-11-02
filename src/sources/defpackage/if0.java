package defpackage;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class if0 implements ei0 {
    public final String X;
    public final int Y;
    public final CameraExtensionCharacteristics Z;
    public final g44 f0;

    public if0(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        str.getClass();
        this.X = str;
        this.Y = i;
        this.Z = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        hf0 hf0Var = new hf0(this, (byte) 0);
        w74 w74Var = w74.X;
        x97.P(w74Var, hf0Var);
        x97.P(w74Var, new hf0(this, (byte) 1));
        this.f0 = x97.P(w74Var, new hf0(this, (byte) 2));
        x97.P(w74Var, new hf0(this, (byte) 3));
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (zu3Var.equals(yb6.a.b(CameraExtensionCharacteristics.class))) {
            return this.Z;
        }
        return null;
    }
}
