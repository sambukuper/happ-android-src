package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k07 {
    public static final kp5 a = lh4.B0;

    public static final boolean a(aq5 aq5Var) {
        MotionEvent motionEventA;
        List list = aq5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((hq5) list.get(i)).i != 2) {
                MotionEvent motionEventA2 = aq5Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = aq5Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
