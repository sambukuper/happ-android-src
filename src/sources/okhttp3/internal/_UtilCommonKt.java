package okhttp3.internal;

import defpackage.aa0;
import defpackage.ba0;
import defpackage.ci8;
import defpackage.d02;
import defpackage.dh3;
import defpackage.dn2;
import defpackage.fm7;
import defpackage.gb4;
import defpackage.gn2;
import defpackage.gv3;
import defpackage.hi5;
import defpackage.i21;
import defpackage.i90;
import defpackage.kb0;
import defpackage.od5;
import defpackage.oi5;
import defpackage.pc6;
import defpackage.ra;
import defpackage.s92;
import defpackage.sa7;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0001H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\f*\u00020\u001bH\u0000¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010'\u001a\u00020\f*\u00020%2\u0006\u0010&\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\f*\u00020)2\u0006\u0010&\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b'\u0010*\u001a\u001c\u0010'\u001a\u00020+*\u00020\f2\u0006\u0010&\u001a\u00020+H\u0080\u0004¢\u0006\u0004\b'\u0010,\u001a\u001b\u00100\u001a\u00020/*\u00020-2\u0006\u0010.\u001a\u00020\fH\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\f*\u000202H\u0000¢\u0006\u0004\b3\u00104\u001a!\u00107\u001a\u00020/2\f\u00106\u001a\b\u0012\u0004\u0012\u00020/05H\u0080\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001b\u0010;\u001a\u00020\f*\u0002092\u0006\u0010:\u001a\u00020%H\u0000¢\u0006\u0004\b;\u0010<\u001a\u001d\u0010=\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b=\u0010>\u001a\u0019\u0010@\u001a\u00020+*\u00020\u00012\u0006\u0010?\u001a\u00020+¢\u0006\u0004\b@\u0010A\u001a\u001d\u0010B\u001a\u00020\f*\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020\fH\u0000¢\u0006\u0004\bB\u0010>\u001a\u0015\u0010E\u001a\u00020/*\u00060Cj\u0002`D¢\u0006\u0004\bE\u0010F\u001a\u001b\u0010J\u001a\u00020\b*\u00020G2\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001b\u0010M\u001a\u00020/*\u00020G2\u0006\u0010L\u001a\u00020HH\u0000¢\u0006\u0004\bM\u0010N\u001a\u001b\u0010P\u001a\u00020/*\u00020G2\u0006\u0010O\u001a\u00020HH\u0000¢\u0006\u0004\bP\u0010N\u001a'\u0010T\u001a\u00020/\"\u0004\b\u0000\u0010Q*\b\u0012\u0004\u0012\u00028\u00000R2\u0006\u0010S\u001a\u00028\u0000H\u0000¢\u0006\u0004\bT\u0010U\u001a)\u0010[\u001a\u00020Z*\u00060Vj\u0002`W2\u0010\u0010Y\u001a\f\u0012\b\u0012\u00060Vj\u0002`W0XH\u0000¢\u0006\u0004\b[\u0010\\\u001aB\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010]*\b\u0012\u0004\u0012\u00028\u00000^2\u0017\u0010a\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0_¢\u0006\u0002\b`H\u0080\bø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a'\u0010g\u001a\u00020/2\u0006\u0010d\u001a\u00020+2\u0006\u0010e\u001a\u00020+2\u0006\u0010f\u001a\u00020+H\u0000¢\u0006\u0004\bg\u0010h\u001a7\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010]2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000^2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000^H\u0000¢\u0006\u0004\bj\u0010k\"\u0014\u0010m\u001a\u00020l8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bm\u0010n\"\u001a\u0010p\u001a\u00020o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0014\u0010t\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\bt\u0010u\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006v"}, d2 = {_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "other", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "value", _UrlKt.FRAGMENT_ENCODE_SET, "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "delimiterOffset", "(Ljava/lang/String;Ljava/lang/String;II)I", _UrlKt.FRAGMENT_ENCODE_SET, "delimiter", "(Ljava/lang/String;CII)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "name", "isSensitiveHeader", "(Ljava/lang/String;)Z", "parseHexDigit", "(C)I", _UrlKt.FRAGMENT_ENCODE_SET, "mask", "and", "(BI)I", _UrlKt.FRAGMENT_ENCODE_SET, "(SI)I", _UrlKt.FRAGMENT_ENCODE_SET, "(IJ)J", "Laa0;", "medium", "Ldn8;", "writeMedium", "(Laa0;I)V", "Lba0;", "readMedium", "(Lba0;)I", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(Ldn2;)V", "Li90;", "b", "skipAll", "(Li90;B)I", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "Ljava/io/Closeable;", "Lokio/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "Ls92;", "Loi5;", "file", "isCivilized", "(Ls92;Loi5;)Z", "path", "deleteIfExists", "(Ls92;Loi5;)V", "directory", "deleteContents", "E", _UrlKt.FRAGMENT_ENCODE_SET, "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", _UrlKt.FRAGMENT_ENCODE_SET, "suppressed", _UrlKt.FRAGMENT_ENCODE_SET, "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "T", _UrlKt.FRAGMENT_ENCODE_SET, "Lkotlin/Function1;", "Ln62;", "predicate", "filterList", "(Ljava/lang/Iterable;Lgn2;)Ljava/util/List;", "arrayLength", "offset", "count", "checkOffsetAndCount", "(JJJ)V", "a", "interleave", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "EMPTY_BYTE_ARRAY", "[B", "Lod5;", "UNICODE_BOMS", "Lod5;", "getUNICODE_BOMS", "()Lod5;", "USER_AGENT", "Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _UtilCommonKt {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final od5 UNICODE_BOMS;
    public static final String USER_AGENT = "okhttp/5.5.0";

    static {
        kb0 kb0Var = kb0.f0;
        UNICODE_BOMS = hi5.q0(ra.f("efbbbf"), ra.f("feff"), ra.f("fffe0000"), ra.f("fffe"), ra.f("0000feff"));
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        list.getClass();
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbS = pc6.s(j, "length=", ", offset=");
            sbS.append(j2);
            sbS.append(", count=");
            sbS.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbS.toString());
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        strArr.getClass();
        str.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final void deleteContents(s92 s92Var, oi5 oi5Var) {
        s92Var.getClass();
        oi5Var.getClass();
        try {
            IOException iOException = null;
            for (oi5 oi5Var2 : s92Var.list(oi5Var)) {
                try {
                    if (s92Var.metadata(oi5Var2).b) {
                        deleteContents(s92Var, oi5Var2);
                    }
                    s92Var.delete(oi5Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void deleteIfExists(s92 s92Var, oi5 oi5Var) {
        s92Var.getClass();
        oi5Var.getClass();
        try {
            s92Var.delete(oi5Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        while (i < i2) {
            if (fm7.e0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, gn2 gn2Var) {
        iterable.getClass();
        gn2Var.getClass();
        ArrayList arrayList = d02.X;
        for (T t : iterable) {
            if (((Boolean) gn2Var.B(t)).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                ci8.e(arrayList).add(t);
            }
        }
        return arrayList;
    }

    public static final od5 getUNICODE_BOMS() {
        return UNICODE_BOMS;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void ignoreIoExceptions(dn2 dn2Var) {
        dn2Var.getClass();
        try {
            dn2Var.invoke();
        } catch (IOException unused) {
        }
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        strArr.getClass();
        str.getClass();
        comparator.getClass();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (dh3.k(cCharAt, 31) <= 0 || dh3.k(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        str.getClass();
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final <T> List<T> interleave(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends T> it2 = iterable2.iterator();
        gb4 gb4VarR = i21.r();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return i21.j(gb4VarR);
            }
            if (it.hasNext()) {
                gb4VarR.add(it.next());
            }
            if (it2.hasNext()) {
                gb4VarR.add(it2.next());
            }
        }
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0032  */
    public static final boolean isCivilized(s92 s92Var, oi5 oi5Var) throws Throwable {
        s92Var.getClass();
        oi5Var.getClass();
        sa7 sa7VarSink = s92Var.sink(oi5Var);
        try {
            s92Var.delete(oi5Var);
            if (sa7VarSink != null) {
                try {
                    sa7VarSink.close();
                } catch (Throwable unused) {
                }
            }
            return true;
        } catch (IOException unused2) {
            if (sa7VarSink != null) {
                try {
                    sa7VarSink.close();
                } catch (Throwable th) {
                    th = th;
                    th = th;
                    if (th != null) {
                        throw th;
                    }
                    s92Var.delete(oi5Var);
                    return false;
                }
            }
            th = null;
            th = th;
            if (th != null) {
                throw th;
            }
            s92Var.delete(oi5Var);
            return false;
        } catch (Throwable th2) {
            th = th2;
            if (sa7VarSink != null) {
                try {
                    sa7VarSink.close();
                } catch (Throwable th3) {
                    gv3.g(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            s92Var.delete(oi5Var);
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int readMedium(ba0 ba0Var) throws IOException {
        ba0Var.getClass();
        return and(ba0Var.readByte(), 255) | (and(ba0Var.readByte(), 255) << 16) | (and(ba0Var.readByte(), 255) << 8);
    }

    public static final int skipAll(i90 i90Var, byte b) {
        i90Var.getClass();
        int i = 0;
        while (!i90Var.F() && i90Var.u(0L) == b) {
            i++;
            i90Var.readByte();
        }
        return i;
    }

    public static final long toLongOrDefault(String str, long j) {
        str.getClass();
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        str.getClass();
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        return str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i2));
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        exc.getClass();
        list.getClass();
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            gv3.g(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(aa0 aa0Var, int i) throws IOException {
        aa0Var.getClass();
        aa0Var.writeByte((i >>> 16) & 255);
        aa0Var.writeByte((i >>> 8) & 255);
        aa0Var.writeByte(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
