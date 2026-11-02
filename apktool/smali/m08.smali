.class final Lm08;
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
        "Lm08;",
        "Lqx4;",
        "Ln08;",
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
.field public final X:Lgn2;


# direct methods
.method public constructor <init>(Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm08;->X:Lgn2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 2

    .line 1
    new-instance v0, Ln08;

    .line 2
    .line 3
    sget-object v1, Lw51;->p:Lwc2;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lne3;-><init>(Lv09;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lm08;->X:Lgn2;

    .line 9
    .line 10
    iput-object p0, v0, Ln08;->t0:Lgn2;

    .line 11
    .line 12
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 1

    .line 1
    check-cast p1, Ln08;

    .line 2
    .line 3
    iget-object v0, p1, Ln08;->t0:Lgn2;

    .line 4
    .line 5
    iget-object p0, p0, Lm08;->X:Lgn2;

    .line 6
    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    iput-object p0, p1, Ln08;->t0:Lgn2;

    .line 10
    .line 11
    iget-object v0, p1, Ln08;->u0:Lc29;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lv09;

    .line 20
    .line 21
    iget-object v0, p1, Lne3;->s0:Lv09;

    .line 22
    .line 23
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iput-object p0, p1, Lne3;->s0:Lv09;

    .line 30
    .line 31
    invoke-virtual {p1}, Lne3;->Z0()V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lm08;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lm08;

    .line 10
    .line 11
    iget-object p1, p1, Lm08;->X:Lgn2;

    .line 12
    .line 13
    iget-object p0, p0, Lm08;->X:Lgn2;

    .line 14
    .line 15
    if-ne p0, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lm08;->X:Lgn2;

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
