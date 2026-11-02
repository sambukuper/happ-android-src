.class public final Lokhttp3/internal/dns/RealDnsCache$Result$Failure;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/dns/RealDnsCache$Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/dns/RealDnsCache$Result;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Failure"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\t\u001a\u0004\u0008\u000c\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lokhttp3/internal/dns/RealDnsCache$Result$Failure;",
        "Lokhttp3/internal/dns/RealDnsCache$Result;",
        "Lqx0;",
        "revalidateAt",
        "expireAt",
        "Ljava/io/IOException;",
        "exception",
        "<init>",
        "(Lqx0;Lqx0;Ljava/io/IOException;)V",
        "Lqx0;",
        "getRevalidateAt",
        "()Lqx0;",
        "getExpireAt",
        "Ljava/io/IOException;",
        "getException",
        "()Ljava/io/IOException;",
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


# instance fields
.field private final exception:Ljava/io/IOException;

.field private final expireAt:Lqx0;

.field private final revalidateAt:Lqx0;


# direct methods
.method public constructor <init>(Lqx0;Lqx0;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;->revalidateAt:Lqx0;

    .line 14
    .line 15
    iput-object p2, p0, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;->expireAt:Lqx0;

    .line 16
    .line 17
    iput-object p3, p0, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;->exception:Ljava/io/IOException;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final getException()Ljava/io/IOException;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;->exception:Ljava/io/IOException;

    .line 2
    .line 3
    return-object p0
.end method

.method public getExpireAt()Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;->expireAt:Lqx0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRevalidateAt()Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;->revalidateAt:Lqx0;

    .line 2
    .line 3
    return-object p0
.end method
