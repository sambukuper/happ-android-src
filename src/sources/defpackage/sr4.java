package defpackage;

import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sr4 {
    public final ExtraCroppingQuirk a;

    public sr4(byte b) {
        switch (b) {
            case 1:
                i26 i26Var = um1.a;
                this.a = (ExtraCroppingQuirk) um1.a().b(ExtraCroppingQuirk.class);
                break;
            default:
                this.a = (ExtraCroppingQuirk) um1.a().b(ExtraCroppingQuirk.class);
                break;
        }
    }
}
