.class final Lo80;
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
        "Lo80;",
        "Lqx4;",
        "Lr80;",
        "foundation"
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
.field public final X:Lq80;


# direct methods
.method public constructor <init>(Lq80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo80;->X:Lq80;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 1

    .line 1
    new-instance v0, Lr80;

    .line 2
    .line 3
    iget-object p0, p0, Lo80;->X:Lq80;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lr80;-><init>(Lq80;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 1

    .line 1
    check-cast p1, Lr80;

    .line 2
    .line 3
    iget-object v0, p1, Lr80;->q0:Lq80;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lq80;->a:Lc15;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lc15;->j(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lo80;->X:Lq80;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lq80;->a:Lc15;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iput-object p0, p1, Lr80;->q0:Lq80;

    .line 22
    .line 23
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lo80;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lo80;

    .line 8
    .line 9
    iget-object p1, p1, Lo80;->X:Lq80;

    .line 10
    .line 11
    iget-object p0, p0, Lo80;->X:Lq80;

    .line 12
    .line 13
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lo80;->X:Lq80;

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
