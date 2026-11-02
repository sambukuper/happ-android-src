package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u7 implements wh0 {
    public final ArrayList a;

    public u7(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.wh0
    public final r75 a(SessionConfiguration sessionConfiguration) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            r75 r75VarA = ((wh0) it.next()).a(sessionConfiguration);
            if (r75VarA.Y != 0) {
                return r75VarA;
            }
        }
        return new r75((byte) 2, 0);
    }
}
