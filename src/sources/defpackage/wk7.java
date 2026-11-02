package defpackage;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wk7 extends y45 {
    public static boolean P() {
        return um1.a().b(PixelJpegRSupportedQuirk.class) != null;
    }

    @Override // defpackage.y45
    public final Integer[] E() {
        Integer[] numArrE = super.E();
        if (!P()) {
            return numArrE;
        }
        if (numArrE == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArrE) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // defpackage.y45
    public final long F(int i, Size size) {
        size.getClass();
        if (i == 4101 && P()) {
            return 0L;
        }
        return super.F(i, size);
    }

    @Override // defpackage.y45
    public final Size[] G(int i) {
        if (i == 4101 && P()) {
            return null;
        }
        return super.G(i);
    }
}
