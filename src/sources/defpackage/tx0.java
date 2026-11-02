package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;
import java.util.Comparator;
import su.happ.proxyutility.dto.AppInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx0 implements Comparator {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ tx0(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.X;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                for (gn2 gn2Var : (gn2[]) obj3) {
                    int iM = dh3.m((Comparable) gn2Var.B(obj), (Comparable) gn2Var.B(obj2));
                    if (iM != 0) {
                        return iM;
                    }
                }
                return 0;
            case 1:
                MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int i = MaterialButtonGroup.q0;
                int iCompareTo = Boolean.valueOf(materialButton.A0).compareTo(Boolean.valueOf(materialButton2.A0));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
            default:
                cl5 cl5Var = (cl5) obj3;
                AppInfo appInfo = (AppInfo) obj;
                AppInfo appInfo2 = (AppInfo) obj2;
                if (appInfo.getIsSelected() > appInfo2.getIsSelected()) {
                    return -1;
                }
                if (appInfo.getIsSelected() == appInfo2.getIsSelected()) {
                    return cl5Var.d.compare(appInfo.getAppName(), appInfo2.getAppName());
                }
                return 1;
        }
    }
}
