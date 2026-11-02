.class public final Lokhttp3/JavaNetCookieJar;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/CookieJar;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0096\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lokhttp3/JavaNetCookieJar;",
        "Lokhttp3/CookieJar;",
        "Lokhttp3/java/net/cookiejar/JavaNetCookieJar;",
        "delegate",
        "<init>",
        "(Lokhttp3/java/net/cookiejar/JavaNetCookieJar;)V",
        "Ljava/net/CookieHandler;",
        "cookieHandler",
        "(Ljava/net/CookieHandler;)V",
        "Lokhttp3/HttpUrl;",
        "url",
        "",
        "Lokhttp3/Cookie;",
        "cookies",
        "Ldn8;",
        "saveFromResponse",
        "(Lokhttp3/HttpUrl;Ljava/util/List;)V",
        "loadForRequest",
        "(Lokhttp3/HttpUrl;)Ljava/util/List;",
        "okhttp-urlconnection"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final synthetic $$delegate_0:Lokhttp3/java/net/cookiejar/JavaNetCookieJar;


# direct methods
.method public constructor <init>(Ljava/net/CookieHandler;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokhttp3/java/net/cookiejar/JavaNetCookieJar;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lokhttp3/java/net/cookiejar/JavaNetCookieJar;-><init>(Ljava/net/CookieHandler;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lokhttp3/JavaNetCookieJar;-><init>(Lokhttp3/java/net/cookiejar/JavaNetCookieJar;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>(Lokhttp3/java/net/cookiejar/JavaNetCookieJar;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lokhttp3/JavaNetCookieJar;->$$delegate_0:Lokhttp3/java/net/cookiejar/JavaNetCookieJar;

    return-void
.end method


# virtual methods
.method public loadForRequest(Lokhttp3/HttpUrl;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/HttpUrl;",
            ")",
            "Ljava/util/List<",
            "Lokhttp3/Cookie;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lokhttp3/JavaNetCookieJar;->$$delegate_0:Lokhttp3/java/net/cookiejar/JavaNetCookieJar;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lokhttp3/java/net/cookiejar/JavaNetCookieJar;->loadForRequest(Lokhttp3/HttpUrl;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public saveFromResponse(Lokhttp3/HttpUrl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/HttpUrl;",
            "Ljava/util/List<",
            "Lokhttp3/Cookie;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lokhttp3/JavaNetCookieJar;->$$delegate_0:Lokhttp3/java/net/cookiejar/JavaNetCookieJar;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lokhttp3/java/net/cookiejar/JavaNetCookieJar;->saveFromResponse(Lokhttp3/HttpUrl;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
