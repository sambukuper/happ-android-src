.class public final Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/platform/android/ConscryptSocketAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;",
        "",
        "<init>",
        "()V",
        "factory",
        "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;",
        "getFactory",
        "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;",
        "isSupported",
        "",
        "()Z",
        "atLeastVersion",
        "major",
        "",
        "minor",
        "patch",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lge1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic atLeastVersion$default(Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;IIIILjava/lang/Object;)Z
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move p3, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;->atLeastVersion(III)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method


# virtual methods
.method public final atLeastVersion(III)Z
    .locals 3

    .line 1
    invoke-static {}, Lorg/conscrypt/Conscrypt;->version()Lorg/conscrypt/Conscrypt$Version;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->major()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v1, p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->major()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-le p0, p1, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    return v0

    .line 24
    :cond_2
    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->minor()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eq p1, p2, :cond_4

    .line 29
    .line 30
    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->minor()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-le p0, p2, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    return v0

    .line 38
    :cond_4
    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->patch()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-lt p0, p3, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    return v0
.end method

.method public final getFactory()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;
    .locals 0

    .line 1
    invoke-static {}, Lokhttp3/internal/platform/android/ConscryptSocketAdapter;->access$getFactory$cp()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final isSupported()Z
    .locals 0

    .line 1
    invoke-static {}, Lokhttp3/internal/platform/android/ConscryptSocketAdapter;->access$isSupported$cp()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
