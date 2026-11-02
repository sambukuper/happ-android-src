package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n88 {
    public final SpannableStringBuilder a;
    public final ArrayList b;

    public n88(SpannableStringBuilder spannableStringBuilder) {
        this.a = spannableStringBuilder;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new m88(0));
    }

    public final int a(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            return -1;
        }
        return ((m88) arrayList.get(i)).a;
    }

    public final int b(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            if (i >= a(i3)) {
                if (i > a(i3)) {
                    i2 = i3 + 1;
                    if (i < a(i2)) {
                    }
                }
                return i3;
            }
            size = i3;
        }
        return arrayList.size() - 1;
    }
}
