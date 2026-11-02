package defpackage;

import android.app.Fragment;
import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class or6 extends Fragment {
    public final HashMap X = new HashMap();

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
        }
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr[i3];
            HashMap map = this.X;
            x16 x16Var = (x16) map.get(str);
            if (x16Var == null) {
                return;
            }
            map.remove(strArr[i3]);
            x16Var.onNext(new gl5(strArr[i3], iArr[i3] == 0, zArr[i3]));
            x16Var.b();
        }
    }
}
