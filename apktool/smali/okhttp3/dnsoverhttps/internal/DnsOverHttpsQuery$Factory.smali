.class public final Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/dns/DnsQuery$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "taskRunner",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "resolvePrivateAddresses",
        "",
        "resolvePublicAddresses",
        "client",
        "Lokhttp3/OkHttpClient;",
        "dnsUrl",
        "Lokhttp3/HttpUrl;",
        "post",
        "<init>",
        "(Lokhttp3/internal/concurrent/TaskRunner;ZZLokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Z)V",
        "newQuery",
        "Lokhttp3/internal/dns/DnsQuery;",
        "question",
        "Lokhttp3/internal/dns/Question;",
        "overrideQuery",
        "ResolveUnsupportedQuery",
        "okhttp-dnsoverhttps"
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
.field private final client:Lokhttp3/OkHttpClient;

.field private final dnsUrl:Lokhttp3/HttpUrl;

.field private final post:Z

.field private final resolvePrivateAddresses:Z

.field private final resolvePublicAddresses:Z

.field private final taskRunner:Lokhttp3/internal/concurrent/TaskRunner;


# direct methods
.method public constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;ZZLokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 14
    .line 15
    iput-boolean p2, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->resolvePrivateAddresses:Z

    .line 16
    .line 17
    iput-boolean p3, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->resolvePublicAddresses:Z

    .line 18
    .line 19
    iput-object p4, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->client:Lokhttp3/OkHttpClient;

    .line 20
    .line 21
    iput-object p5, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->dnsUrl:Lokhttp3/HttpUrl;

    .line 22
    .line 23
    iput-boolean p6, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->post:Z

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic access$getTaskRunner$p(Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;)Lokhttp3/internal/concurrent/TaskRunner;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 2
    .line 3
    return-object p0
.end method

.method private final overrideQuery(Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->resolvePrivateAddresses:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->resolvePublicAddresses:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    sget-object v0, Lokhttp3/dnsoverhttps/DnsOverHttps;->Companion:Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;

    .line 12
    .line 13
    invoke-virtual {p1}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v2}, Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;->isPrivateHost$okhttp_dnsoverhttps(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-boolean v2, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->resolvePrivateAddresses:Z

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    const-string v0, "private hosts not resolved"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-boolean v0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->resolvePublicAddresses:Z

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    const-string v0, "public hosts not resolved"

    .line 37
    .line 38
    :goto_0
    new-instance v1, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;

    .line 39
    .line 40
    invoke-virtual {p1}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v1, p0, p1, v0}, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;-><init>(Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object v1
.end method


# virtual methods
.method public newQuery(Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->overrideQuery(Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    sget-object v0, Lokhttp3/internal/dns/DnsMessage;->Companion:Lokhttp3/internal/dns/DnsMessage$Companion;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lokhttp3/internal/dns/DnsMessage$Companion;->query(Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsMessage;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->client:Lokhttp3/OkHttpClient;

    .line 18
    .line 19
    new-instance v2, Lokhttp3/Request$Builder;

    .line 20
    .line 21
    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v3, Lokhttp3/dnsoverhttps/DnsOverHttps;->Companion:Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;

    .line 25
    .line 26
    invoke-virtual {v3}, Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;->getDNS_MESSAGE()Lokhttp3/MediaType;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Lokhttp3/MediaType;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "Accept"

    .line 35
    .line 36
    invoke-virtual {v2, v4, v3}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-boolean v3, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->post:Z

    .line 41
    .line 42
    iget-object v4, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->dnsUrl:Lokhttp3/HttpUrl;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2, v4}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->dnsUrl:Lokhttp3/HttpUrl;

    .line 50
    .line 51
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v3, "hostname"

    .line 56
    .line 57
    invoke-virtual {p1}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {p0, v3, v4}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p1}, Lokhttp3/internal/dns/Question;->getType()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v3, "type"

    .line 74
    .line 75
    invoke-virtual {p0, v3, p1}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v2, p0}, Lokhttp3/Request$Builder;->cacheUrlOverride(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lokhttp3/dnsoverhttps/internal/_DnsOverHttpsQueryKt;->toRequestBody(Lokhttp3/internal/dns/DnsMessage;)Lokhttp3/RequestBody;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {v2, p0}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {v4}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-string p1, "dns"

    .line 99
    .line 100
    invoke-static {v0}, Lokhttp3/dnsoverhttps/internal/_DnsOverHttpsQueryKt;->asQueryParameter(Lokhttp3/internal/dns/DnsMessage;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p0, p1, v0}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {v2, p0}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-virtual {v2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {v1, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    new-instance p1, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;

    .line 124
    .line 125
    invoke-direct {p1, p0}, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;-><init>(Lokhttp3/Call;)V

    .line 126
    .line 127
    .line 128
    return-object p1
.end method
