.class final Lokhttp3/internal/dns/RealDnsCache$State;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/dns/RealDnsCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0082\u0008\u0018\u00002\u00020\u0001B+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001e\u001a\u0004\u0008\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010 \u001a\u0004\u0008!\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Lokhttp3/internal/dns/RealDnsCache$State;",
        "",
        "Lqx0;",
        "lastRequestedAt",
        "Lokhttp3/internal/dns/RealDnsCache$InFlightCall;",
        "inFlightCall",
        "Lokhttp3/internal/dns/RealDnsCache$Result;",
        "result",
        "<init>",
        "(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)V",
        "component1",
        "()Lqx0;",
        "component2",
        "()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;",
        "component3",
        "()Lokhttp3/internal/dns/RealDnsCache$Result;",
        "copy",
        "(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)Lokhttp3/internal/dns/RealDnsCache$State;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lqx0;",
        "getLastRequestedAt",
        "Lokhttp3/internal/dns/RealDnsCache$InFlightCall;",
        "getInFlightCall",
        "Lokhttp3/internal/dns/RealDnsCache$Result;",
        "getResult",
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
.field private final inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

.field private final lastRequestedAt:Lqx0;

.field private final result:Lokhttp3/internal/dns/RealDnsCache$Result;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 25
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/dns/RealDnsCache$State;-><init>(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;ILge1;)V

    return-void
.end method

.method public constructor <init>(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache$State;->lastRequestedAt:Lqx0;

    .line 23
    iput-object p2, p0, Lokhttp3/internal/dns/RealDnsCache$State;->inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 24
    iput-object p3, p0, Lokhttp3/internal/dns/RealDnsCache$State;->result:Lokhttp3/internal/dns/RealDnsCache$Result;

    return-void
.end method

.method public synthetic constructor <init>(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;ILge1;)V
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
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    move-object p3, v0

    .line 17
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/dns/RealDnsCache$State;-><init>(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic copy$default(Lokhttp3/internal/dns/RealDnsCache$State;Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;ILjava/lang/Object;)Lokhttp3/internal/dns/RealDnsCache$State;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lokhttp3/internal/dns/RealDnsCache$State;->lastRequestedAt:Lqx0;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lokhttp3/internal/dns/RealDnsCache$State;->inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lokhttp3/internal/dns/RealDnsCache$State;->result:Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lokhttp3/internal/dns/RealDnsCache$State;->copy(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)Lokhttp3/internal/dns/RealDnsCache$State;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->lastRequestedAt:Lqx0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Lokhttp3/internal/dns/RealDnsCache$Result;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->result:Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)Lokhttp3/internal/dns/RealDnsCache$State;
    .locals 0

    .line 1
    new-instance p0, Lokhttp3/internal/dns/RealDnsCache$State;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/dns/RealDnsCache$State;-><init>(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lokhttp3/internal/dns/RealDnsCache$State;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lokhttp3/internal/dns/RealDnsCache$State;

    .line 12
    .line 13
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$State;->lastRequestedAt:Lqx0;

    .line 14
    .line 15
    iget-object v3, p1, Lokhttp3/internal/dns/RealDnsCache$State;->lastRequestedAt:Lqx0;

    .line 16
    .line 17
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$State;->inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 25
    .line 26
    iget-object v3, p1, Lokhttp3/internal/dns/RealDnsCache$State;->inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 27
    .line 28
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->result:Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 36
    .line 37
    iget-object p1, p1, Lokhttp3/internal/dns/RealDnsCache$State;->result:Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 38
    .line 39
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLastRequestedAt()Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->lastRequestedAt:Lqx0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getResult()Lokhttp3/internal/dns/RealDnsCache$Result;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->result:Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->lastRequestedAt:Lqx0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast v0, Lka8;

    .line 9
    .line 10
    iget-wide v2, v0, Lka8;->X:J

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$State;->inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    move v2, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    :goto_1
    add-int/2addr v0, v2

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->result:Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 32
    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    :goto_2
    add-int/2addr v0, v1

    .line 41
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "State(lastRequestedAt="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$State;->lastRequestedAt:Lqx0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", inFlightCall="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$State;->inFlightCall:Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", result="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$State;->result:Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x29

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
