.class public final Lokhttp3/internal/url/_UrlKt;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0019\n\u0002\u0008\u0011\u001a]\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008#\u0010\"\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008$\u0010\"\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008%\u0010\"\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008&\u0010\"\"\u0014\u0010\'\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\"\"\u0014\u0010(\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008(\u0010\"\"\u0014\u0010)\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008)\u0010\"\"\u0014\u0010*\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008*\u0010\"\"\u0014\u0010+\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008+\u0010\"\"\u0014\u0010,\u001a\u00020\u00018\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008,\u0010\"\u00a8\u0006-"
    }
    d2 = {
        "Li90;",
        "",
        "input",
        "",
        "pos",
        "limit",
        "encodeSet",
        "",
        "alreadyEncoded",
        "strict",
        "plusIsSpace",
        "unicodeAllowed",
        "Ljava/nio/charset/Charset;",
        "charset",
        "Ldn8;",
        "writeCanonicalized",
        "(Li90;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V",
        "canonicalizeWithCharset",
        "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;",
        "encoded",
        "writePercentDecoded",
        "(Li90;Ljava/lang/String;IIZ)V",
        "canonicalize",
        "(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;",
        "percentDecode",
        "(Ljava/lang/String;IIZ)Ljava/lang/String;",
        "isPercentEncoded",
        "(Ljava/lang/String;II)Z",
        "",
        "HEX_DIGITS",
        "[C",
        "getHEX_DIGITS",
        "()[C",
        "USERNAME_ENCODE_SET",
        "Ljava/lang/String;",
        "PASSWORD_ENCODE_SET",
        "PATH_SEGMENT_ENCODE_SET",
        "PATH_SEGMENT_ENCODE_SET_URI",
        "QUERY_ENCODE_SET",
        "QUERY_COMPONENT_REENCODE_SET",
        "QUERY_COMPONENT_ENCODE_SET",
        "QUERY_COMPONENT_ENCODE_SET_URI",
        "FORM_ENCODE_SET",
        "FRAGMENT_ENCODE_SET",
        "FRAGMENT_ENCODE_SET_URI",
        "okhttp"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final FORM_ENCODE_SET:Ljava/lang/String; = " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

.field public static final FRAGMENT_ENCODE_SET:Ljava/lang/String; = ""

.field public static final FRAGMENT_ENCODE_SET_URI:Ljava/lang/String; = " \"#<>\\^`{|}"

.field private static final HEX_DIGITS:[C

.field public static final PASSWORD_ENCODE_SET:Ljava/lang/String; = " \"\':;<=>@[]^`{}|/\\?#"

.field public static final PATH_SEGMENT_ENCODE_SET:Ljava/lang/String; = " \"<>^`{}|/\\?#"

.field public static final PATH_SEGMENT_ENCODE_SET_URI:Ljava/lang/String; = "[]"

.field public static final QUERY_COMPONENT_ENCODE_SET:Ljava/lang/String; = " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

.field public static final QUERY_COMPONENT_ENCODE_SET_URI:Ljava/lang/String; = "\\^`{|}"

.field public static final QUERY_COMPONENT_REENCODE_SET:Ljava/lang/String; = " \"\'<>#&="

.field public static final QUERY_ENCODE_SET:Ljava/lang/String; = " \"\'<>#"

.field public static final USERNAME_ENCODE_SET:Ljava/lang/String; = " \"\':;<=>@[]^`{}|/\\?#"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lokhttp3/internal/url/_UrlKt;->HEX_DIGITS:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static final canonicalize(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/16 v9, 0x80

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    move-object v0, p0

    .line 12
    move v1, p1

    .line 13
    move v2, p2

    .line 14
    move-object v3, p3

    .line 15
    move v4, p4

    .line 16
    move/from16 v5, p5

    .line 17
    .line 18
    move/from16 v6, p6

    .line 19
    .line 20
    move/from16 v7, p7

    .line 21
    .line 22
    invoke-static/range {v0 .. v10}, Lokhttp3/internal/url/_UrlKt;->canonicalizeWithCharset$default(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static synthetic canonicalize$default(Ljava/lang/String;IILjava/lang/String;ZZZZILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    and-int/lit8 p9, p8, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p9, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 8
    .line 9
    if-eqz p9, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    :cond_1
    and-int/lit8 p9, p8, 0x8

    .line 16
    .line 17
    if-eqz p9, :cond_2

    .line 18
    .line 19
    move p4, v0

    .line 20
    :cond_2
    and-int/lit8 p9, p8, 0x10

    .line 21
    .line 22
    if-eqz p9, :cond_3

    .line 23
    .line 24
    move p5, v0

    .line 25
    :cond_3
    and-int/lit8 p9, p8, 0x20

    .line 26
    .line 27
    if-eqz p9, :cond_4

    .line 28
    .line 29
    move p6, v0

    .line 30
    :cond_4
    and-int/lit8 p8, p8, 0x40

    .line 31
    .line 32
    if-eqz p8, :cond_5

    .line 33
    .line 34
    move p7, v0

    .line 35
    :cond_5
    invoke-static/range {p0 .. p7}, Lokhttp3/internal/url/_UrlKt;->canonicalize(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static final canonicalizeWithCharset(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move v2, p1

    .line 8
    :goto_0
    if-ge v2, p2, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    if-lt v0, v1, :cond_3

    .line 17
    .line 18
    const/16 v1, 0x7f

    .line 19
    .line 20
    if-eq v0, v1, :cond_3

    .line 21
    .line 22
    const/16 v1, 0x80

    .line 23
    .line 24
    if-lt v0, v1, :cond_0

    .line 25
    .line 26
    if-eqz p7, :cond_3

    .line 27
    .line 28
    :cond_0
    int-to-char v1, v0

    .line 29
    invoke-static {p3, v1}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    const/16 v1, 0x25

    .line 36
    .line 37
    if-ne v0, v1, :cond_1

    .line 38
    .line 39
    if-eqz p4, :cond_3

    .line 40
    .line 41
    if-eqz p5, :cond_1

    .line 42
    .line 43
    invoke-static {p0, v2, p2}, Lokhttp3/internal/url/_UrlKt;->isPercentEncoded(Ljava/lang/String;II)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    :cond_1
    const/16 v1, 0x2b

    .line 50
    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    if-eqz p6, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v2, v0

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    :goto_1
    new-instance v0, Li90;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1, v2, p0}, Li90;->c1(IILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v1, p0

    .line 71
    move v3, p2

    .line 72
    move-object v4, p3

    .line 73
    move v5, p4

    .line 74
    move v6, p5

    .line 75
    move/from16 v7, p6

    .line 76
    .line 77
    move/from16 v8, p7

    .line 78
    .line 79
    move-object/from16 v9, p8

    .line 80
    .line 81
    invoke-static/range {v0 .. v9}, Lokhttp3/internal/url/_UrlKt;->writeCanonicalized(Li90;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Li90;->Y()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_4
    invoke-virtual/range {p0 .. p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public static synthetic canonicalizeWithCharset$default(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    and-int/lit8 p10, p9, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p10, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p10, p9, 0x2

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    :cond_1
    and-int/lit8 p10, p9, 0x8

    .line 16
    .line 17
    if-eqz p10, :cond_2

    .line 18
    .line 19
    move p4, v0

    .line 20
    :cond_2
    and-int/lit8 p10, p9, 0x10

    .line 21
    .line 22
    if-eqz p10, :cond_3

    .line 23
    .line 24
    move p5, v0

    .line 25
    :cond_3
    and-int/lit8 p10, p9, 0x20

    .line 26
    .line 27
    if-eqz p10, :cond_4

    .line 28
    .line 29
    move p6, v0

    .line 30
    :cond_4
    and-int/lit8 p10, p9, 0x40

    .line 31
    .line 32
    if-eqz p10, :cond_5

    .line 33
    .line 34
    move p7, v0

    .line 35
    :cond_5
    and-int/lit16 p9, p9, 0x80

    .line 36
    .line 37
    if-eqz p9, :cond_6

    .line 38
    .line 39
    const/4 p8, 0x0

    .line 40
    :cond_6
    invoke-static/range {p0 .. p8}, Lokhttp3/internal/url/_UrlKt;->canonicalizeWithCharset(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static final getHEX_DIGITS()[C
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/internal/url/_UrlKt;->HEX_DIGITS:[C

    .line 2
    .line 3
    return-object v0
.end method

.method public static final isPercentEncoded(Ljava/lang/String;II)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    add-int/lit8 v0, p1, 0x2

    .line 5
    .line 6
    if-ge v0, p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/16 v1, 0x25

    .line 13
    .line 14
    if-ne p2, v1, :cond_0

    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    add-int/2addr p1, p2

    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Lokhttp3/internal/_UtilCommonKt;->parseHexDigit(C)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v1, -0x1

    .line 27
    if-eq p1, v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p0}, Lokhttp3/internal/_UtilCommonKt;->parseHexDigit(C)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eq p0, v1, :cond_0

    .line 38
    .line 39
    return p2

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static final percentDecode(Ljava/lang/String;IIZ)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move v0, p1

    .line 5
    :goto_0
    if-ge v0, p2, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x25

    .line 12
    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const/16 v2, 0x2b

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    :goto_1
    new-instance v1, Li90;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1, v0, p0}, Li90;->c1(IILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, p0, v0, p2, p3}, Lokhttp3/internal/url/_UrlKt;->writePercentDecoded(Li90;Ljava/lang/String;IIZ)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Li90;->Y()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static synthetic percentDecode$default(Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 16
    .line 17
    if-eqz p4, :cond_2

    .line 18
    .line 19
    move p3, v0

    .line 20
    :cond_2
    invoke-static {p0, p1, p2, p3}, Lokhttp3/internal/url/_UrlKt;->percentDecode(Ljava/lang/String;IIZ)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static final writeCanonicalized(Li90;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-ge p2, p3, :cond_b

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz p5, :cond_0

    .line 18
    .line 19
    const/16 v2, 0x9

    .line 20
    .line 21
    if-eq v1, v2, :cond_a

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    if-eq v1, v2, :cond_a

    .line 26
    .line 27
    const/16 v2, 0xc

    .line 28
    .line 29
    if-eq v1, v2, :cond_a

    .line 30
    .line 31
    const/16 v2, 0xd

    .line 32
    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_0
    const-string v2, "+"

    .line 38
    .line 39
    const/16 v3, 0x20

    .line 40
    .line 41
    if-ne v1, v3, :cond_1

    .line 42
    .line 43
    const-string v4, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 44
    .line 45
    if-ne p4, v4, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Li90;->d1(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    const/16 v4, 0x2b

    .line 53
    .line 54
    if-ne v1, v4, :cond_3

    .line 55
    .line 56
    if-eqz p7, :cond_3

    .line 57
    .line 58
    if-eqz p5, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string v2, "%2B"

    .line 62
    .line 63
    :goto_1
    invoke-virtual {p0, v2}, Li90;->d1(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_3
    const/16 v2, 0x25

    .line 69
    .line 70
    if-lt v1, v3, :cond_6

    .line 71
    .line 72
    const/16 v3, 0x7f

    .line 73
    .line 74
    if-eq v1, v3, :cond_6

    .line 75
    .line 76
    const/16 v3, 0x80

    .line 77
    .line 78
    if-lt v1, v3, :cond_4

    .line 79
    .line 80
    if-eqz p8, :cond_6

    .line 81
    .line 82
    :cond_4
    int-to-char v3, v1

    .line 83
    invoke-static {p4, v3}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_6

    .line 88
    .line 89
    if-ne v1, v2, :cond_5

    .line 90
    .line 91
    if-eqz p5, :cond_6

    .line 92
    .line 93
    if-eqz p6, :cond_5

    .line 94
    .line 95
    invoke-static {p1, p2, p3}, Lokhttp3/internal/url/_UrlKt;->isPercentEncoded(Ljava/lang/String;II)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_5

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    invoke-virtual {p0, v1}, Li90;->e1(I)V

    .line 103
    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    :goto_2
    if-nez v0, :cond_7

    .line 107
    .line 108
    new-instance v0, Li90;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    :cond_7
    if-eqz p9, :cond_9

    .line 114
    .line 115
    sget-object v3, Liq0;->a:Ljava/nio/charset/Charset;

    .line 116
    .line 117
    invoke-virtual {p9, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_8

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_8
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    add-int/2addr v3, p2

    .line 129
    invoke-virtual {v0, p1, p2, v3, p9}, Li90;->b1(Ljava/lang/String;IILjava/nio/charset/Charset;)V

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_9
    :goto_3
    invoke-virtual {v0, v1}, Li90;->e1(I)V

    .line 134
    .line 135
    .line 136
    :goto_4
    invoke-virtual {v0}, Li90;->F()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_a

    .line 141
    .line 142
    invoke-virtual {v0}, Li90;->readByte()B

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    and-int/lit16 v4, v3, 0xff

    .line 147
    .line 148
    invoke-virtual {p0, v2}, Li90;->H0(I)V

    .line 149
    .line 150
    .line 151
    sget-object v5, Lokhttp3/internal/url/_UrlKt;->HEX_DIGITS:[C

    .line 152
    .line 153
    shr-int/lit8 v4, v4, 0x4

    .line 154
    .line 155
    and-int/lit8 v4, v4, 0xf

    .line 156
    .line 157
    aget-char v4, v5, v4

    .line 158
    .line 159
    invoke-virtual {p0, v4}, Li90;->H0(I)V

    .line 160
    .line 161
    .line 162
    and-int/lit8 v3, v3, 0xf

    .line 163
    .line 164
    aget-char v3, v5, v3

    .line 165
    .line 166
    invoke-virtual {p0, v3}, Li90;->H0(I)V

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_a
    :goto_5
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    add-int/2addr p2, v1

    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_b
    return-void
.end method

.method public static final writePercentDecoded(Li90;Ljava/lang/String;IIZ)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :goto_0
    if-ge p2, p3, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x25

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v1, p2, 0x2

    .line 18
    .line 19
    if-ge v1, p3, :cond_0

    .line 20
    .line 21
    add-int/lit8 v2, p2, 0x1

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, Lokhttp3/internal/_UtilCommonKt;->parseHexDigit(C)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {v3}, Lokhttp3/internal/_UtilCommonKt;->parseHexDigit(C)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, -0x1

    .line 40
    if-eq v2, v4, :cond_1

    .line 41
    .line 42
    if-eq v3, v4, :cond_1

    .line 43
    .line 44
    shl-int/lit8 p2, v2, 0x4

    .line 45
    .line 46
    add-int/2addr p2, v3

    .line 47
    invoke-virtual {p0, p2}, Li90;->H0(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    add-int/2addr p2, v1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/16 v1, 0x2b

    .line 57
    .line 58
    if-ne v0, v1, :cond_1

    .line 59
    .line 60
    if-eqz p4, :cond_1

    .line 61
    .line 62
    const/16 v0, 0x20

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Li90;->H0(I)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 p2, p2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {p0, v0}, Li90;->e1(I)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    add-int/2addr p2, v0

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    return-void
.end method
