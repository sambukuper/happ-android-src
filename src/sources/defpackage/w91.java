package defpackage;

import android.view.View;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w91 {
    public List a() {
        return Collections.EMPTY_LIST;
    }

    public kw8 b(View view, int i) {
        if (DataBinderMapperImpl.a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        kp5.t("view must have a tag");
        return null;
    }

    public kw8 c(View[] viewArr, int i) {
        if (viewArr.length != 0 && DataBinderMapperImpl.a.get(i) > 0 && viewArr[0].getTag() == null) {
            kp5.t("view must have a tag");
        }
        return null;
    }
}
