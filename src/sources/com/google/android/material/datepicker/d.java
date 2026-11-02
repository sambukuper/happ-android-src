package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.l;
import defpackage.c46;
import defpackage.cw8;
import defpackage.j46;
import defpackage.qv8;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public d(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(c46.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = cw8.a;
        new qv8(j46.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 3).a(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(c46.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
