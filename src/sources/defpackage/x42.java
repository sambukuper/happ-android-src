package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import androidx.appcompat.widget.SearchView;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;
import su.happ.proxyutility.feature.report.ReportActivity;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditActivity;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditSearchActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x42 implements TextWatcher {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ x42(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Object value;
        k52 k52Var;
        Object value2;
        ke6 ke6Var;
        byte b = this.X;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (editable != null) {
                    oh7 oh7Var = ((ExcludedRoutesActivity) obj).B().c;
                    oh7Var.getClass();
                    do {
                        value = oh7Var.getValue();
                        k52Var = (k52) value;
                        k52Var.getClass();
                    } while (!oh7Var.k(value, k52.a(k52Var, editable.toString(), null, 2)));
                    return;
                }
                return;
            case 1:
                gn2 gn2Var = (gn2) obj;
                String string = editable != null ? editable.toString() : null;
                if (string != null) {
                    str = string;
                }
                gn2Var.B(str);
                return;
            case 2:
                TextProcessor textProcessor = (TextProcessor) ((LineNumbersEditText) obj);
                if (!textProcessor.D0) {
                    int selectionStart = textProcessor.getSelectionStart();
                    int i = textProcessor.C0;
                    for (xz7 xz7Var : textProcessor.y0) {
                        int i2 = xz7Var.b;
                        if (i2 >= selectionStart) {
                            xz7Var.b = i2 + i;
                        }
                        int i3 = xz7Var.c;
                        if (i3 >= selectionStart) {
                            xz7Var.c = i3 + i;
                        }
                    }
                    Iterator it = textProcessor.z0.iterator();
                    if (it.hasNext()) {
                        throw p61.k(it);
                    }
                    if (textProcessor.E0) {
                        Editable text = textProcessor.getText();
                        text.getClass();
                        for (p32 p32Var : (p32[]) text.getSpans(0, textProcessor.getText().length(), p32.class)) {
                            textProcessor.getText().removeSpan(p32Var);
                        }
                        textProcessor.E0 = false;
                    }
                }
                textProcessor.C0 = 0;
                textProcessor.b();
                Iterator it2 = textProcessor.G0.iterator();
                if (it2.hasNext()) {
                    throw p61.k(it2);
                }
                return;
            case 3:
                ((PingSettingsActivity) obj).A().q("pref_delay_test_url", String.valueOf(editable));
                return;
            case 4:
                ReportActivity reportActivity = (ReportActivity) obj;
                g6 g6Var = reportActivity.Q0;
                if (g6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                Editable text2 = g6Var.o0.getText();
                String string2 = text2 != null ? text2.toString() : null;
                if (string2 != null) {
                    str = string2;
                }
                g6 g6Var2 = reportActivity.Q0;
                if (g6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                g6Var2.q0.setText(str.length() + " / 1024");
                oh7 oh7Var2 = ((le6) reportActivity.R0.getValue()).b;
                oh7Var2.getClass();
                do {
                    value2 = oh7Var2.getValue();
                    ke6Var = (ke6) value2;
                    ke6Var.getClass();
                } while (!oh7Var2.k(value2, ke6.a(ke6Var, false, str, 1)));
                return;
            case 5:
                int i4 = RoutingSettingsEditActivity.U0;
                ((RoutingSettingsEditActivity) obj).B(true);
                return;
            case 6:
                int i5 = RoutingSettingsEditSearchActivity.U0;
                ((RoutingSettingsEditSearchActivity) obj).A().j.k(String.valueOf(editable));
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.X) {
            case 0:
            case 1:
                return;
            case 2:
                TextProcessor textProcessor = (TextProcessor) ((LineNumbersEditText) this.Y);
                textProcessor.C0 -= i2;
                yr6 yr6Var = textProcessor.B0;
                if (yr6Var != null) {
                    ((ExecutorService) yr6Var.g0).shutdown();
                }
                c38 c38Var = null;
                textProcessor.B0 = null;
                if (!textProcessor.D0) {
                    textProcessor.o0 = i;
                    int i4 = i + i2;
                    textProcessor.p0 = i4;
                    if (i2 < Integer.MAX_VALUE) {
                        String strValueOf = String.valueOf(charSequence != null ? charSequence.subSequence(i, i4) : null);
                        c38 c38Var2 = new c38();
                        c38Var2.a = _UrlKt.FRAGMENT_ENCODE_SET;
                        c38Var2.b = strValueOf;
                        c38Var2.c = i;
                        c38Var = c38Var2;
                    } else {
                        textProcessor.undoStack.a();
                        textProcessor.redoStack.a();
                    }
                    textProcessor.t0 = c38Var;
                }
                OverScroller overScroller = textProcessor.f0;
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                }
                VelocityTracker velocityTracker = textProcessor.i0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                Iterator it = textProcessor.G0.iterator();
                if (it.hasNext()) {
                    throw p61.k(it);
                }
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0223  */
    /* JADX WARN: Code duplicated, block: B:120:0x022b  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d1 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:153:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x0304  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x0149  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:78:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0152  */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:84:0x0173  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        c38 c38Var;
        String str;
        String str2;
        dm8 dm8Var;
        c38 c38Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int length;
        CharSequence charSequenceSubSequence;
        Object value;
        lk5 lk5Var;
        byte b = this.X;
        CharSequence charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        int i4 = 0;
        Object obj = this.Y;
        switch (b) {
            case 0:
            case 1:
                return;
            case 2:
                TextProcessor textProcessor = (TextProcessor) ((LineNumbersEditText) obj);
                HashSet hashSet = textProcessor.G0;
                textProcessor.C0 += i3;
                if (!textProcessor.D0) {
                    n88 n88Var = textProcessor.structure;
                    if (charSequence != null && (charSequenceSubSequence = charSequence.subSequence(i, i + i3)) != null) {
                        charSequence2 = charSequenceSubSequence;
                    }
                    textProcessor.q0 = charSequence2;
                    textProcessor.a(textProcessor.o0, textProcessor.p0, charSequence2);
                    int iB = n88Var.b(textProcessor.o0);
                    int iB2 = n88Var.b(textProcessor.q0.length() + textProcessor.o0);
                    boolean z = true;
                    if (iB <= iB2) {
                        while (true) {
                            if (n88Var.a(iB) <= (iB == n88Var.b.size() - 1 ? n88Var.a.length() : n88Var.a(iB + 1) - 1)) {
                                Iterator it = hashSet.iterator();
                                if (it.hasNext()) {
                                    throw p61.k(it);
                                }
                            }
                            if (iB != iB2) {
                                iB++;
                            }
                        }
                    }
                    c38 c38Var3 = textProcessor.t0;
                    if (c38Var3 != null) {
                        if (i3 < Integer.MAX_VALUE) {
                            c38Var3.a = String.valueOf(charSequence != null ? charSequence.subSequence(i, i3 + i) : null);
                            c38 c38Var4 = textProcessor.t0;
                            if (c38Var4 != null && i == c38Var4.c) {
                                if (Boolean.valueOf(c38Var4.b.length() > 0).booleanValue()) {
                                    c38Var = textProcessor.t0;
                                    if (c38Var != null) {
                                        str = c38Var.b;
                                    } else {
                                        str = null;
                                    }
                                    if (c38Var != null) {
                                        str2 = c38Var.a;
                                    } else {
                                        str2 = null;
                                    }
                                    if (!dh3.f(str, str2)) {
                                        dm8Var = textProcessor.undoStack;
                                        c38Var2 = textProcessor.t0;
                                        c38Var2.getClass();
                                        arrayList = dm8Var.a;
                                        arrayList2 = dm8Var.a;
                                        length = c38Var2.b.length() + c38Var2.a.length();
                                        if (length < Integer.MAX_VALUE) {
                                            if (arrayList2.size() > 0) {
                                                c38 c38Var5 = (c38) arrayList.get(arrayList2.size() - 1);
                                                if (c38Var2.b.length() != 0 && c38Var2.a.length() == 1 && c38Var5.b.length() == 0) {
                                                    if (c38Var5.a.length() + c38Var5.c != c38Var2.c) {
                                                        arrayList.add(c38Var2);
                                                    } else if (km4.a0(c38Var2.a.charAt(0))) {
                                                        char[] charArray = c38Var5.a.toCharArray();
                                                        charArray.getClass();
                                                        for (char c : charArray) {
                                                            if (!km4.a0(c)) {
                                                                z = false;
                                                            }
                                                        }
                                                        if (z) {
                                                            c38Var5.a = c38Var5.a.concat(c38Var2.a);
                                                        } else {
                                                            arrayList.add(c38Var2);
                                                        }
                                                    } else if (Character.isLetterOrDigit(c38Var2.a.charAt(0))) {
                                                        char[] charArray2 = c38Var5.a.toCharArray();
                                                        charArray2.getClass();
                                                        for (char c2 : charArray2) {
                                                            if (!Character.isLetterOrDigit(c2)) {
                                                                z = false;
                                                            }
                                                        }
                                                        if (z) {
                                                            c38Var5.a = c38Var5.a.concat(c38Var2.a);
                                                        } else {
                                                            arrayList.add(c38Var2);
                                                        }
                                                    } else {
                                                        arrayList.add(c38Var2);
                                                    }
                                                } else if (c38Var2.b.length() == 1 || c38Var2.a.length() > 0 || c38Var5.a.length() > 0 || c38Var5.c - 1 != c38Var2.c) {
                                                    arrayList.add(c38Var2);
                                                } else if (km4.a0(c38Var2.b.charAt(0))) {
                                                    char[] charArray3 = c38Var5.b.toCharArray();
                                                    charArray3.getClass();
                                                    for (char c3 : charArray3) {
                                                        if (!km4.a0(c3)) {
                                                            z = false;
                                                        }
                                                    }
                                                    if (z) {
                                                        c38Var5.b = c38Var2.b.concat(c38Var5.b);
                                                        c38Var5.c -= c38Var2.b.length();
                                                    } else {
                                                        arrayList.add(c38Var2);
                                                    }
                                                } else if (Character.isLetterOrDigit(c38Var2.b.charAt(0))) {
                                                    char[] charArray4 = c38Var5.b.toCharArray();
                                                    charArray4.getClass();
                                                    for (char c4 : charArray4) {
                                                        if (!Character.isLetterOrDigit(c4)) {
                                                            z = false;
                                                        }
                                                    }
                                                    if (z) {
                                                        c38Var5.b = c38Var2.b.concat(c38Var5.b);
                                                        c38Var5.c -= c38Var2.b.length();
                                                    } else {
                                                        arrayList.add(c38Var2);
                                                    }
                                                } else {
                                                    arrayList.add(c38Var2);
                                                }
                                            } else {
                                                arrayList.add(c38Var2);
                                            }
                                            dm8Var.b += length;
                                            while (dm8Var.b > Integer.MAX_VALUE && arrayList2.size() > 0) {
                                                c38 c38Var6 = (c38) arrayList.get(0);
                                                arrayList.remove(0);
                                                dm8Var.b -= c38Var6.b.length() + c38Var6.a.length();
                                            }
                                        } else {
                                            dm8Var.a();
                                        }
                                        textProcessor.redoStack.a();
                                    }
                                } else {
                                    c38 c38Var7 = textProcessor.t0;
                                    Boolean boolValueOf = c38Var7 != null ? Boolean.valueOf(c38Var7.a.length() > 0) : null;
                                    boolValueOf.getClass();
                                    if (boolValueOf.booleanValue()) {
                                        c38Var = textProcessor.t0;
                                        if (c38Var != null) {
                                            str = c38Var.b;
                                        } else {
                                            str = null;
                                        }
                                        if (c38Var != null) {
                                            str2 = c38Var.a;
                                        } else {
                                            str2 = null;
                                        }
                                        if (!dh3.f(str, str2)) {
                                            dm8Var = textProcessor.undoStack;
                                            c38Var2 = textProcessor.t0;
                                            c38Var2.getClass();
                                            arrayList = dm8Var.a;
                                            arrayList2 = dm8Var.a;
                                            length = c38Var2.b.length() + c38Var2.a.length();
                                            if (length < Integer.MAX_VALUE) {
                                                if (arrayList2.size() > 0) {
                                                    c38 c38Var8 = (c38) arrayList.get(arrayList2.size() - 1);
                                                    if (c38Var2.b.length() != 0) {
                                                        if (c38Var2.b.length() == 1) {
                                                            arrayList.add(c38Var2);
                                                        } else {
                                                            arrayList.add(c38Var2);
                                                        }
                                                    } else if (c38Var2.b.length() == 1) {
                                                        arrayList.add(c38Var2);
                                                    } else {
                                                        arrayList.add(c38Var2);
                                                    }
                                                } else {
                                                    arrayList.add(c38Var2);
                                                }
                                                dm8Var.b += length;
                                                while (dm8Var.b > Integer.MAX_VALUE) {
                                                    c38 c38Var9 = (c38) arrayList.get(0);
                                                    arrayList.remove(0);
                                                    dm8Var.b -= c38Var9.b.length() + c38Var9.a.length();
                                                }
                                            } else {
                                                dm8Var.a();
                                            }
                                            textProcessor.redoStack.a();
                                        }
                                    }
                                }
                            }
                        } else {
                            textProcessor.undoStack.a();
                            textProcessor.redoStack.a();
                        }
                        textProcessor.t0 = null;
                    }
                }
                Iterator it2 = hashSet.iterator();
                if (it2.hasNext()) {
                    throw p61.k(it2);
                }
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            default:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.u0.getText();
                searchView.c1 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                if (searchView.a1 && !searchView.T0 && zIsEmpty) {
                    searchView.z0.setVisibility(8);
                } else {
                    i4 = 8;
                }
                searchView.B0.setVisibility(i4);
                searchView.r();
                searchView.u();
                if (searchView.P0 != null && !TextUtils.equals(charSequence, searchView.b1)) {
                    fz6 fz6Var = searchView.P0;
                    String string = charSequence.toString();
                    cl5 cl5VarB = ((PerAppProxyActivity) ((y45) fz6Var).X).B();
                    String str3 = string == null ? _UrlKt.FRAGMENT_ENCODE_SET : string;
                    oh7 oh7Var = cl5VarB.f;
                    oh7Var.getClass();
                    do {
                        value = oh7Var.getValue();
                        lk5Var = (lk5) value;
                        lk5Var.getClass();
                    } while (!oh7Var.k(value, lk5.a(lk5Var, null, str3, null, null, null, false, 61)));
                }
                searchView.b1 = charSequence.toString();
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }
}
