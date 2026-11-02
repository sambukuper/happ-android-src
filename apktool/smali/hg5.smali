.class final Lhg5;
.super Lqx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lqx4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lhg5;",
        "Lqx4;",
        "Ljg5;",
        "foundation-layout"
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
.field public final X:Lgg5;


# direct methods
.method public constructor <init>(Lgg5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhg5;->X:Lgg5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 1

    .line 1
    new-instance v0, Ljg5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljx4;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lhg5;->X:Lgg5;

    .line 7
    .line 8
    iput-object p0, v0, Ljg5;->q0:Lgg5;

    .line 9
    .line 10
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 0

    .line 1
    check-cast p1, Ljg5;

    .line 2
    .line 3
    iget-object p0, p0, Lhg5;->X:Lgg5;

    .line 4
    .line 5
    iput-object p0, p1, Ljg5;->q0:Lgg5;

    .line 6
    .line 7
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lhg5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lhg5;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_1
    iget-object p0, p0, Lhg5;->X:Lgg5;

    .line 14
    .line 15
    iget-object p1, p1, Lhg5;->X:Lgg5;

    .line 16
    .line 17
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lhg5;->X:Lgg5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
