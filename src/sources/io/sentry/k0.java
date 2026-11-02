package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public Boolean B;
    public Boolean C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public String G;
    public List H;
    public List I;
    public Boolean J;
    public Boolean K;
    public q L;
    public Boolean M;
    public Boolean N;
    public Boolean O;
    public Boolean P;
    public Boolean Q;
    public Boolean R;
    public Boolean S;
    public Double T;
    public String U;
    public y3 V;
    public Boolean W;
    public String X;
    public i6 Y;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Double i;
    public Double j;
    public Double k;
    public q6 l;
    public p6 n;
    public String s;
    public Long t;
    public Long u;
    public Long v;
    public List x;
    public Boolean y;
    public Boolean z;
    public final ConcurrentHashMap m = new ConcurrentHashMap();
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();
    public CopyOnWriteArrayList q = null;
    public final CopyOnWriteArrayList r = new CopyOnWriteArrayList();
    public final CopyOnWriteArraySet w = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A = new CopyOnWriteArraySet();

    public static q2 a(io.sentry.config.b bVar, String str) {
        String property = bVar.getProperty(str.concat(".mode"));
        List listB = bVar.b(str.concat(".terms"));
        if (property == null && listB == null) {
            return null;
        }
        q2 q2Var = new q2();
        if (property != null) {
            q2Var.a = p2.valueOf(property.toUpperCase(Locale.ROOT));
        }
        if (listB != null) {
            q2Var.b = Collections.unmodifiableList(new ArrayList(listB));
        }
        return q2Var;
    }
}
