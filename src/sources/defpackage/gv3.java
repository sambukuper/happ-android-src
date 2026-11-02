package defpackage;

import android.content.Context;
import android.text.Layout;
import android.util.Xml;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.c;
import androidx.compose.ui.node.LayoutNode;
import io.sentry.c2;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import okhttp3.internal.url._UrlKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gv3 {
    public static final Object a = new Object();
    public static final zy0 b = new zy0(1362424226, false, new l4(15));
    public static final cg c = new cg((byte) 2);

    public static final ld0 A(ld0 ld0Var) {
        ld0Var.getClass();
        if (!ff7.j.contains(ld0Var.getName()) && !ua0.d.contains(el1.i(ld0Var).getName())) {
            return null;
        }
        if ((ld0Var instanceof fx5) || (ld0Var instanceof cx5)) {
            return el1.b(ld0Var, cd5.F0);
        }
        if (ld0Var instanceof q97) {
            return el1.b(ld0Var, cd5.G0);
        }
        return null;
    }

    public static final ld0 B(ld0 ld0Var) {
        ld0Var.getClass();
        ld0 ld0VarA = A(ld0Var);
        if (ld0VarA != null) {
            return ld0VarA;
        }
        int i = ta0.l;
        v15 name = ld0Var.getName();
        name.getClass();
        if (ff7.e.contains(name)) {
            return el1.b(ld0Var, ve7.Y);
        }
        return null;
    }

    public static final x78 C(t07 t07Var) {
        gn2 gn2Var;
        ArrayList arrayList = new ArrayList();
        Object objG = t07Var.X.g(s07.a);
        if (objG == null) {
            objG = null;
        }
        q3 q3Var = (q3) objG;
        if (q3Var == null || (gn2Var = (gn2) q3Var.b) == null || !((Boolean) gn2Var.B(arrayList)).booleanValue()) {
            return null;
        }
        return (x78) arrayList.get(0);
    }

    public static final boolean D(sx4 sx4Var, ld0 ld0Var) {
        sx4Var.getClass();
        ld0Var.getClass();
        ed1 ed1VarP = ld0Var.p();
        ed1VarP.getClass();
        aa7 aa7VarX = ((sx4) ed1VarP).X();
        aa7VarX.getClass();
        for (sx4 sx4VarI = bl1.i(sx4Var); sx4VarI != null; sx4VarI = bl1.i(sx4VarI)) {
            if (!(sx4VarI instanceof p44)) {
                aa7 aa7VarX2 = sx4VarI.X();
                if (aa7VarX2 == null) {
                    kp5.n("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"});
                    return false;
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                mo8 mo8VarG = null;
                arrayDeque.add(new gw7(aa7VarX2, null));
                lh8 lh8VarN0 = aa7VarX.n0();
                while (!arrayDeque.isEmpty()) {
                    gw7 gw7Var = (gw7) arrayDeque.poll();
                    t14 t14VarF = gw7Var.a;
                    lh8 lh8VarN1 = t14VarF.n0();
                    if (lh8VarN1 == null) {
                        ct7.a(3);
                        throw null;
                    }
                    if (lh8VarN0 == null) {
                        ct7.a(4);
                        throw null;
                    }
                    if (lh8VarN1.equals(lh8VarN0)) {
                        boolean zO0 = t14VarF.o0();
                        for (gw7 gw7Var2 = gw7Var.b; gw7Var2 != null; gw7Var2 = gw7Var2.b) {
                            t14 t14Var = gw7Var2.a;
                            List listL0 = t14Var.l0();
                            rt8 rt8Var = rt8.INVARIANT;
                            s18 s18Var = nh8.b;
                            if (listL0 != null && listL0.isEmpty()) {
                                t14VarF = new wi8(s18Var.a(t14Var.n0(), t14Var.l0())).f(t14VarF, rt8Var);
                                break;
                            }
                            Iterator it = listL0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t14VarF = new wi8(s18Var.a(t14Var.n0(), t14Var.l0())).f(t14VarF, rt8Var);
                                    break;
                                }
                                if (((ni8) it.next()).a() != rt8Var) {
                                    t14VarF = (t14) z51.l(new wi8(z91.U(s18Var.a(t14Var.n0(), t14Var.l0()))).f(t14VarF, rt8Var)).b;
                                    break;
                                }
                            }
                            zO0 = zO0 || t14Var.o0();
                        }
                        lh8 lh8VarN2 = t14VarF.n0();
                        if (lh8VarN2 == null) {
                            ct7.a(3);
                            throw null;
                        }
                        if (lh8VarN2.equals(lh8VarN0)) {
                            mo8VarG = cj8.g(t14VarF, zO0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + t08.b(lh8VarN2) + ", \n\nsupertype: " + t08.b(lh8VarN0) + " \n" + lh8VarN2.equals(lh8VarN0));
                    }
                    for (t14 t14Var2 : lh8VarN1.c()) {
                        t14Var2.getClass();
                        arrayDeque.add(new gw7(t14Var2, gw7Var));
                    }
                }
                if (mo8VarG != null) {
                    return !zz3.A(sx4VarI);
                }
            }
        }
        return false;
    }

    public static final boolean E(b71 b71Var) {
        bm3 bm3Var = (bm3) b71Var.getCoroutineContext().H0(oy1.E0);
        if (bm3Var != null) {
            return bm3Var.k();
        }
        return true;
    }

    public static boolean F(char c2) {
        if (c2 < 'A' || c2 > 'Z') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    public static boolean G(char c2) {
        if (F(c2)) {
            return true;
        }
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean H(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!G(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean I(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!F(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean J(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float K(do5 do5Var, boolean z, w03[] w03VarArr, float f) {
        float f2 = Float.NaN;
        for (w03 w03Var : w03VarArr) {
            float fA = do5Var.a(w03Var);
            if (Float.isNaN(f2)) {
                f2 = fA;
            } else if (z == (fA > f2)) {
                f2 = fA;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final kx4 L(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new ra5(gn2Var));
    }

    public static void M(Context context, String str) {
        synchronized (a) {
            if (str.equals(_UrlKt.FRAGMENT_ENCODE_SET)) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Exception unused2) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    public static kx4 N(kx4 kx4Var, sf sfVar) {
        return kx4Var.y(new dq5(sfVar));
    }

    public static final byte[] O(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static String P(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = _UrlKt.FRAGMENT_ENCODE_SET;
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | XmlPullParserException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    } catch (Throwable th) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (FileNotFoundException unused4) {
                    return _UrlKt.FRAGMENT_ENCODE_SET;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return attributeValue;
    }

    public static final Object Q(Object obj) {
        return obj instanceof xx0 ? w39.t(((xx0) obj).a) : obj;
    }

    public static final void R(vt vtVar, gn2 gn2Var) {
        vt vtVar2 = new vt(999);
        int i = vtVar.Z;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            vtVar2.put(vtVar.g(i2), vtVar.j(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                gn2Var.B(vtVar2);
                vtVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            gn2Var.B(vtVar2);
        }
    }

    public static final void S(bc7 bc7Var, int i, Object obj) {
        int iG = bc7Var.g(i);
        Object[] objArr = bc7Var.c;
        Object obj2 = objArr[iG];
        objArr[iG] = zz0.a;
        if (obj == obj2) {
            return;
        }
        d01.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final void T(int i, int i2, List list) {
        int iP = p(i, list);
        if (iP < 0) {
            iP = -(iP + 1);
        }
        while (iP < list.size() && ((ci3) list.get(iP)).b < i2) {
        }
    }

    public static final kx4 U(boolean z, c cVar, boolean z2, kl6 kl6Var, dn2 dn2Var) {
        if (cVar != null) {
            return new wz6(z, null, cVar, z2, kl6Var, dn2Var);
        }
        if (cVar == null) {
            return new wz6(z, null, null, z2, kl6Var, dn2Var);
        }
        return w45.x(hx4.X, new xz6(cVar, z, z2, kl6Var, dn2Var));
    }

    public static final void V(gi giVar, int i) {
        Object next;
        Iterator<T> it = giVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LayoutNode) ((Map.Entry) next).getKey()).Y != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        c2.m();
    }

    public static String W(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final String X(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static char Y(char c2) {
        return (c2 < 'A' || c2 > 'Z') ? c2 : (char) (c2 + ' ');
    }

    public static String Z(String str) {
        char cCharAt;
        int i = 0;
        while (i < str.length() && ((cCharAt = str.charAt(i)) < 'A' || cCharAt > 'Z')) {
            i++;
        }
        if (i == str.length()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        while (i < str.length()) {
            sb.append(Y(str.charAt(i)));
            i++;
        }
        return sb.toString();
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static String a0(String str) {
        int i;
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            if (cCharAt < 'a' || cCharAt > 'z') {
                i = 1;
                while (i < str.length() && (cCharAt < 'A' || cCharAt > 'Z')) {
                    i++;
                }
            } else {
                i = 0;
            }
            if (i != str.length()) {
                StringBuilder sb = new StringBuilder(str.substring(0, i));
                if (i == 0) {
                    sb.append(b0(str.charAt(i)));
                    i++;
                }
                while (i < str.length()) {
                    sb.append(Y(str.charAt(i)));
                    i++;
                }
                return sb.toString();
            }
        }
        return str;
    }

    public static x90 b(int i, l90 l90Var, gn2 gn2Var, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        l90 l90Var2 = l90.X;
        if (i3 != 0) {
            l90Var = l90Var2;
        }
        if ((i2 & 4) != 0) {
            gn2Var = null;
        }
        if (i == -2) {
            if (l90Var != l90Var2) {
                return new p11(1, l90Var, gn2Var);
            }
            jp0.i.getClass();
            return new x90(ip0.b, gn2Var);
        }
        if (i == -1) {
            if (l90Var == l90Var2) {
                return new p11(1, l90.Y, gn2Var);
            }
            bt.q("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return l90Var == l90Var2 ? new x90(0, gn2Var) : new p11(1, l90Var, gn2Var);
        }
        if (i != Integer.MAX_VALUE) {
            return l90Var == l90Var2 ? new x90(i, gn2Var) : new p11(i, l90Var, gn2Var);
        }
        return new x90(Integer.MAX_VALUE, gn2Var);
    }

    public static char b0(char c2) {
        return (c2 < 'a' || c2 > 'z') ? c2 : (char) (c2 - ' ');
    }

    public static final m51 c(s61 s61Var) {
        if (s61Var.H0(oy1.E0) == null) {
            s61Var = s61Var.B0(u70.g());
        }
        return new m51(s61Var);
    }

    public static String c0(String str) {
        char cCharAt;
        int i = 0;
        while (i < str.length() && ((cCharAt = str.charAt(i)) < 'a' || cCharAt > 'z')) {
            i++;
        }
        if (i == str.length()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        while (i < str.length()) {
            sb.append(b0(str.charAt(i)));
            i++;
        }
        return sb.toString();
    }

    public static final ji1 d(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        xi2 xi2VarA = yi2.a(f);
        if (xi2VarA == null) {
            xi2VarA = new da4(f);
        }
        return new ji1(f2, f, xi2VarA);
    }

    public static final void e(kx4 kx4Var, dn2 dn2Var, lp2 lp2Var, int i) {
        dn2Var.getClass();
        lp2Var.X(373460831);
        int i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i | (lp2Var.h(dn2Var) ? 32 : 16);
        byte b2 = 0;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            ox1 ox1Var = ep.z;
            long j = ((dp) lp2Var.j(ox1Var)).i.a;
            x03 x03Var = u70.e;
            hx4 hx4Var = hx4.X;
            kx4 kx4VarY = os4.z(vj8.x(u15.f(hx4Var, j, x03Var), false, null, null, null, dn2Var, lp2Var, 31), 0.0f, 12.0f, 1).y(kx4Var);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarY);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            os4.a(u28.p(q36.ic_delete_24dp, lp2Var), l80.a(b.g(hx4Var, 30.0f), pz2.i0), vj8.j0(y46.routing_settings_delete, lp2Var), ((dp) lp2Var.j(ox1Var)).h.c, lp2Var, 0, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new lw2(kx4Var, dn2Var, i, b2);
        }
    }

    public static void f(z95 z95Var, d94 d94Var, gn2 gn2Var) {
        z95Var.getClass();
        z95Var.a(d94Var, new l00(gn2Var));
    }

    public static void g(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = bj3.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = to5.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final Object h(xb4 xb4Var, uy7 uy7Var) throws Throwable {
        try {
            if (xb4Var.isDone()) {
                return u2.g(xb4Var);
            }
            mm0 mm0Var = new mm0(1, mb6.H(uy7Var));
            mm0Var.s();
            xb4Var.a(new eb8(xb4Var, mm0Var, (byte) 1), bp1.X);
            mm0Var.u(new wi(xb4Var, (byte) 6));
            return mm0Var.q();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static final void i(b71 b71Var, CancellationException cancellationException) {
        bm3 bm3Var = (bm3) b71Var.getCoroutineContext().H0(oy1.E0);
        if (bm3Var != null) {
            bm3Var.m(cancellationException);
        } else {
            b61.o(b71Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static int j(String str, String str2) {
        int i = ns8.a;
        if (str == str2) {
            return 0;
        }
        return Z(str).compareTo(Z(str2));
    }

    public static boolean k(String str, String str2) {
        int i = ns8.a;
        if (str == str2) {
            return true;
        }
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            char cCharAt2 = str2.charAt(i2);
            if (cCharAt != cCharAt2 && Y(cCharAt) != Y(cCharAt2)) {
                break;
            }
            i2++;
        }
        return i2 == length;
    }

    public static final void l(xb7 xb7Var, ArrayList arrayList, int i) {
        boolean zL = xb7Var.l(i);
        int[] iArr = xb7Var.b;
        if (zL) {
            arrayList.add(xb7Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            l(xb7Var, arrayList, i3);
        }
    }

    public static void m(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static final Object n(rn2 rn2Var, q51 q51Var) {
        fx6 fx6Var = new fx6(q51Var, q51Var.w());
        return z38.d(fx6Var, true, fx6Var, rn2Var);
    }

    public static final int o(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final int p(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iK = dh3.k(((ci3) list.get(i3)).b, i);
            if (iK < 0) {
                i2 = i3 + 1;
            } else {
                if (iK <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object q(xe2 xe2Var, s51 s51Var) {
        ig2 ig2Var;
        ea6 ea6Var;
        h e;
        fg2 fg2Var;
        if (s51Var instanceof ig2) {
            ig2Var = (ig2) s51Var;
            int i = ig2Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ig2Var.i0 = i - Integer.MIN_VALUE;
            } else {
                ig2Var = new ig2(s51Var);
            }
        } else {
            ig2Var = new ig2(s51Var);
        }
        Object obj = ig2Var.h0;
        int i2 = ig2Var.i0;
        z31 z31Var = d75.a;
        if (i2 == 0) {
            w39.n0(obj);
            ea6Var = new ea6();
            ea6Var.X = z31Var;
            fg2 fg2Var2 = new fg2(ea6Var, (byte) 0);
            try {
                ig2Var.f0 = ea6Var;
                ig2Var.g0 = fg2Var2;
                ig2Var.i0 = 1;
                Object objA = xe2Var.a(fg2Var2, ig2Var);
                Object obj2 = c71.X;
                if (objA == obj2) {
                    return obj2;
                }
            } catch (h e2) {
                e = e2;
                fg2Var = fg2Var2;
                if (e.X == fg2Var) {
                    throw e;
                }
                s61 s61Var = ig2Var.Y;
                s61Var.getClass();
                u70.I(s61Var);
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg2Var = ig2Var.g0;
            ea6Var = ig2Var.f0;
            try {
                w39.n0(obj);
            } catch (h e3) {
                e = e3;
                if (e.X == fg2Var) {
                    throw e;
                }
                s61 s61Var2 = ig2Var.Y;
                s61Var2.getClass();
                u70.I(s61Var2);
            }
        }
        Object obj3 = ea6Var.X;
        if (obj3 != z31Var) {
            return obj3;
        }
        em7.g("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(xe2 xe2Var, rn2 rn2Var, s51 s51Var) {
        jg2 jg2Var;
        ea6 ea6Var;
        h e;
        hg2 hg2Var;
        if (s51Var instanceof jg2) {
            jg2Var = (jg2) s51Var;
            int i = jg2Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg2Var.i0 = i - Integer.MIN_VALUE;
            } else {
                jg2Var = new jg2(s51Var);
            }
        } else {
            jg2Var = new jg2(s51Var);
        }
        Object obj = jg2Var.h0;
        int i2 = jg2Var.i0;
        z31 z31Var = d75.a;
        if (i2 == 0) {
            w39.n0(obj);
            ea6 ea6Var2 = new ea6();
            ea6Var2.X = z31Var;
            hg2 hg2Var2 = new hg2(rn2Var, ea6Var2, (byte) 0);
            try {
                jg2Var.f0 = ea6Var2;
                jg2Var.g0 = hg2Var2;
                jg2Var.i0 = 1;
                Object objA = xe2Var.a(hg2Var2, jg2Var);
                Object obj2 = c71.X;
                if (objA == obj2) {
                    return obj2;
                }
                ea6Var = ea6Var2;
            } catch (h e2) {
                ea6Var = ea6Var2;
                e = e2;
                hg2Var = hg2Var2;
                if (e.X == hg2Var) {
                    throw e;
                }
                s61 s61Var = jg2Var.Y;
                s61Var.getClass();
                u70.I(s61Var);
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hg2Var = jg2Var.g0;
            ea6Var = jg2Var.f0;
            try {
                w39.n0(obj);
            } catch (h e3) {
                e = e3;
                if (e.X == hg2Var) {
                    throw e;
                }
                s61 s61Var2 = jg2Var.Y;
                s61Var2.getClass();
                u70.I(s61Var2);
            }
        }
        Object obj3 = ea6Var.X;
        if (obj3 != z31Var) {
            return obj3;
        }
        em7.g("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s(xe2 xe2Var, q5 q5Var, s51 s51Var) {
        mg2 mg2Var;
        ea6 ea6Var;
        h e;
        hg2 hg2Var;
        if (s51Var instanceof mg2) {
            mg2Var = (mg2) s51Var;
            int i = mg2Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                mg2Var.i0 = i - Integer.MIN_VALUE;
            } else {
                mg2Var = new mg2(s51Var);
            }
        } else {
            mg2Var = new mg2(s51Var);
        }
        Object obj = mg2Var.h0;
        int i2 = mg2Var.i0;
        byte b2 = 1;
        if (i2 == 0) {
            w39.n0(obj);
            ea6 ea6Var2 = new ea6();
            hg2 hg2Var2 = new hg2(q5Var, ea6Var2, b2);
            try {
                mg2Var.f0 = ea6Var2;
                mg2Var.g0 = hg2Var2;
                mg2Var.i0 = 1;
                Object objA = xe2Var.a(hg2Var2, mg2Var);
                Object obj2 = c71.X;
                if (objA == obj2) {
                    return obj2;
                }
                ea6Var = ea6Var2;
            } catch (h e2) {
                ea6Var = ea6Var2;
                e = e2;
                hg2Var = hg2Var2;
                if (e.X == hg2Var) {
                    throw e;
                }
                s61 s61Var = mg2Var.Y;
                s61Var.getClass();
                u70.I(s61Var);
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hg2Var = mg2Var.g0;
            ea6Var = mg2Var.f0;
            try {
                w39.n0(obj);
            } catch (h e3) {
                e = e3;
                if (e.X == hg2Var) {
                    throw e;
                }
                s61 s61Var2 = mg2Var.Y;
                s61Var2.getClass();
                u70.I(s61Var2);
            }
        }
        return ea6Var.X;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object t(xe2 xe2Var, s51 s51Var) {
        lg2 lg2Var;
        ea6 ea6Var;
        h e;
        fg2 fg2Var;
        if (s51Var instanceof lg2) {
            lg2Var = (lg2) s51Var;
            int i = lg2Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                lg2Var.i0 = i - Integer.MIN_VALUE;
            } else {
                lg2Var = new lg2(s51Var);
            }
        } else {
            lg2Var = new lg2(s51Var);
        }
        Object obj = lg2Var.h0;
        int i2 = lg2Var.i0;
        byte b2 = 1;
        if (i2 == 0) {
            w39.n0(obj);
            ea6Var = new ea6();
            fg2 fg2Var2 = new fg2(ea6Var, b2);
            try {
                lg2Var.f0 = ea6Var;
                lg2Var.g0 = fg2Var2;
                lg2Var.i0 = 1;
                Object objA = xe2Var.a(fg2Var2, lg2Var);
                Object obj2 = c71.X;
                if (objA == obj2) {
                    return obj2;
                }
            } catch (h e2) {
                e = e2;
                fg2Var = fg2Var2;
                if (e.X == fg2Var) {
                    throw e;
                }
                s61 s61Var = lg2Var.Y;
                s61Var.getClass();
                u70.I(s61Var);
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg2Var = lg2Var.g0;
            ea6Var = lg2Var.f0;
            try {
                w39.n0(obj);
            } catch (h e3) {
                e = e3;
                if (e.X == fg2Var) {
                    throw e;
                }
                s61 s61Var2 = lg2Var.Y;
                s61Var2.getClass();
                u70.I(s61Var2);
            }
        }
        return ea6Var.X;
    }

    public static gt4 u(vr3 vr3Var) {
        if (vr3Var instanceof lt3) {
            lt3 lt3Var = (lt3) vr3Var;
            String str = lt3Var.l;
            String str2 = lt3Var.m;
            str.getClass();
            str2.getClass();
            return new gt4(str.concat(str2));
        }
        if (!(vr3Var instanceof kt3)) {
            b61.c();
            return null;
        }
        kt3 kt3Var = (kt3) vr3Var;
        String str3 = kt3Var.l;
        String str4 = kt3Var.m;
        str3.getClass();
        str4.getClass();
        return new gt4(str3 + '#' + str4);
    }

    public static p06 v(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return p06.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return p06.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return p06.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return p06.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return p06.SPDY_3;
        }
        if (str.equals("quic")) {
            return p06.QUIC;
        }
        u52.s("Unexpected protocol: ".concat(str));
        return null;
    }

    public static final List w(ev3 ev3Var) {
        ev3Var.getClass();
        Class cls = ev3Var.Y;
        if (ev3Var.i0() != null) {
            xw3.z(ev3Var, "Should be called only for Java classes: ");
            return null;
        }
        if (cls.isAnnotation()) {
            return d02.X;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            vk3 vk3Var = (Modifier.isStatic(method.getModifiers()) || method.isSynthetic()) ? null : new vk3(ev3Var, method, nd0.NO_RECEIVER, yu3.k);
            if (vk3Var != null) {
                arrayList.add(vk3Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    public static final List x(ev3 ev3Var, et4 et4Var, ss4 ss4Var) {
        ej1 ej1Var;
        fv3 fv3Var = new fv3(ev3Var, (byte) 0);
        Collection<ed1> collectionB0 = hi5.b0(et4Var, null, 3);
        ArrayList arrayList = new ArrayList();
        for (ed1 ed1Var : collectionB0) {
            if (ed1Var instanceof ld0) {
                ld0 ld0Var = (ld0) ed1Var;
                if (dh3.f(ld0Var.e(), gl1.h)) {
                    ej1Var = null;
                } else if ((ld0Var.r() != 2) == (ss4Var == ss4.X)) {
                    ej1Var = (ej1) ed1Var.J(fv3Var, dn8.a);
                } else {
                    ej1Var = null;
                }
            } else {
                ej1Var = null;
            }
            if (ej1Var != null) {
                arrayList.add(ej1Var);
            }
        }
        return wv0.Y0(arrayList);
    }

    public static final String y(ho2 ho2Var) {
        v15 v15Var;
        ld0 ld0VarA = zz3.A(ho2Var) ? A(ho2Var) : null;
        if (ld0VarA != null) {
            ld0 ld0VarI = el1.i(ld0VarA);
            if (ld0VarI instanceof fx5) {
                zz3.A(ld0VarI);
                ld0 ld0VarB = el1.b(el1.i(ld0VarI), ag.s0);
                if (ld0VarB != null && (v15Var = (v15) ua0.a.get(el1.g(ld0VarB))) != null) {
                    return v15Var.b();
                }
            } else if (ld0VarI instanceof q97) {
                int i = sa0.l;
                LinkedHashMap linkedHashMap = ff7.i;
                String strZ = w45.z((q97) ld0VarI);
                v15 v15Var2 = strZ == null ? null : (v15) linkedHashMap.get(strZ);
                if (v15Var2 != null) {
                    return v15Var2.b();
                }
            }
        }
        return null;
    }

    public static final int z(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
