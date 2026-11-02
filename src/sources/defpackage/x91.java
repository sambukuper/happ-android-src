package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x91 {
    public static final DataBinderMapperImpl a;

    static {
        DataBinderMapperImpl dataBinderMapperImpl = new DataBinderMapperImpl();
        dataBinderMapperImpl.a = new HashSet();
        dataBinderMapperImpl.b = new CopyOnWriteArrayList();
        dataBinderMapperImpl.c = new CopyOnWriteArrayList();
        dataBinderMapperImpl.d(new su.happ.proxyutility.DataBinderMapperImpl());
        a = dataBinderMapperImpl;
    }

    public static kw8 a(ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        DataBinderMapperImpl dataBinderMapperImpl = a;
        if (i3 == 1) {
            return dataBinderMapperImpl.b(viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return dataBinderMapperImpl.c(viewArr, i2);
    }
}
